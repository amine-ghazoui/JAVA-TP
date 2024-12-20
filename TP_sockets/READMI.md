# INTRODUCTION :

This practical exercise explores network programming in Java using sockets. The first exercise involves creating a game where a server generates a magic number that players must guess. The second exercise focuses on developing a file server that allows multiple clients to connect and receive requested files.

--- 

## Exercice 1: Magic Number Game with Sockets in Java

## Description
This project implements a game in Java where a server generates a magic number (between 0 and 100), and the players must guess the number. After each attempt, the server tells the player whether the guessed number is too high or too low. The player continues guessing until they find the secret number.

The server uses **sockets** to communicate with the clients, and each player’s attempt is sent to the server. The server responds to each guess by indicating if the number is too large, too small, or correct.

---

## Key Features

1. **Game Server**:  
   The server generates a random magic number between 0 and 100. It waits for client connections and processes their guesses.
   
2. **Interactive Game**:  
   The player sends their guesses to the server. The server responds by telling the player if the guessed number is too large, too small, or correct.

3. **End Message**:  
   When a player correctly guesses the number, the server congratulates them and announces that they have won.

---

## Code Structure

### 1. `Client` Class
This class represents the client that connects to the server to play the magic number game.

#### Features:
- Connects to the server.
- Sends guesses to the server.
- Displays the server’s response indicating whether the guessed number is too high, too low, or correct.

#### Code:
```java
package exercice_1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbre;

        try {
            Socket s = new Socket("localhost", 1234);
            System.out.println("Connected to the game server.");

            // Creating streams for communication with the server

            // For reading responses from the server
            InputStream is = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            // For sending data to the server
            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            // Reading the server’s response
            String rep = br.readLine(); // Reading a line of text from the server
            System.out.println(rep);

            // Loop to send attempts and receive responses
            boolean gameOver = false;
            while (!gameOver) {
                System.out.print("Enter a number: ");
                int nb = scanner.nextInt(); // Read the user's guess
                pw.println(nb); // Send the guess to the server

                String response = br.readLine(); // Read the server’s response
                System.out.println(response);

                // Check if the game is over
                if (response.startsWith("Bravo")) {
                    gameOver = true;
                }
            }

            s.close();

        }
        catch (Exception e) {
            e.getMessage();
        }
    }
}
```

### 2. `Server` Class
This class represents the server that generates a magic number and manages the players' attempts.

#### Features:
- Generates a random magic number between 0 and 100.
- Waits for client connections.
- Verifies the clients' attempts and sends responses.

#### Code:
```java
package exercice_1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Serveur {

    public static void main(String[] args) {
        Random random = new Random();
        int numbreMagic = random.nextInt(0, 101);

        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Waiting for client connection!");

            while (true){
                Socket s = ss.accept();
                System.out.println("Client connected: " + s.getInetAddress());

                try {
                    // Creating input streams to read data sent by the client
                    InputStream is = s.getInputStream();
                    InputStreamReader isr = new InputStreamReader(is);
                    BufferedReader br = new BufferedReader(isr);

                    // Creating output streams to send messages to the client
                    OutputStream os = s.getOutputStream();
                    PrintWriter pw = new PrintWriter(os, true);

                    // Sending a welcome message to the client
                    pw.println("Welcome to the Magic Number Game! Try to guess a number between 0 and 100.");

                    boolean gameEnded = false;

                    // Loop to handle the client's attempts
                    while (!gameEnded){
                        String attempt = br.readLine(); // Read the client's attempt

                        try {
                            int guess = Integer.parseInt(attempt); // Convert the attempt to an integer

                            // Compare the attempt with the magic number and respond to the client
                            if (guess < numbreMagic){
                                pw.println("It's higher!");
                            }
                            else if (guess > numbreMagic) {
                                pw.println("It's lower!");
                            }
                            else {
                                pw.println("Congratulations! You found the magic number: " + numbreMagic);
                                gameEnded = true;
                            }
                        }
                        catch (Exception e) {
                            pw.println("Please enter a valid number!");
                        }
                    }
                }
                catch (Exception e) {
                    System.out.println("Error with the client: " + e.getMessage());
                }
            }
        }
        catch (Exception e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
```
---

# Exercise 2: Multi-Client File Server in Java

## Description
This project implements a file server capable of handling multiple clients simultaneously in Java. Clients can request files from the server, which checks their availability and sends their content if available.

The project uses **sockets** for network communication and **threads** to handle multiple client connections in parallel.

---

## Main Features

1. **Multi-client Server**:  
   The server listens on a specific port (23456) and creates a new thread for each client that connects.
   
2. **File Request**:  
   Clients send the name of a file they wish to retrieve.
   
3. **File Transmission**:  
   If the requested file exists, the server sends its content to the client; otherwise, an error message is sent.

---

## Code Structure

### 1. `ServeurMT` Class
This class represents the main server. It listens for client connections and creates a new thread for each connected client.

#### Features:
- Listens on port `23456`.
- Accepts incoming connections.
- Creates an instance of the `Conversation` class for each connected client.

#### Main Code:
```java
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurMT {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(23456);
            int nbClient = 0;
            while (true) {
                Socket s = ss.accept();  // Accepts the client's connection
                ++nbClient;
                new Conversation(s, nbClient).start();  // Starts a new thread for each client
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### 2. `Conversation` Class
This class handles communication between the server and each connected client. Each client is managed in a separate thread.

#### Features:
- Sends a welcome message to the client.
- Waits for the client's file request.
- Checks if the file exists and then sends it or returns an error message.

#### Code:
```java
import java.io.*;
import java.net.Socket;

public class Conversation extends Thread {
    private Socket socket;
    private int numClien;

    public Conversation(Socket socket, int numClien) {
        this.socket = socket;
        this.numClien = numClien;
    }

    @Override
    public void run() {
        try {
            // Creating streams for communication with the client
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            // Sending a welcome message to the client
            pw.println("Welcome Client: " + numClien);

            // Reading the requested file name
            String fileName = br.readLine();
            System.out.println("Client: " + numClien + " requested the file: " + fileName);

            // Checking if the file exists
            File file = new File(fileName);
            if (file.exists() && file.isFile()) {
                pw.println("File found. Sending...");

                // Reading and sending the content of the file to the client
                BufferedReader fileReader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = fileReader.readLine()) != null) {
                    pw.println(line);
                }
                System.out.println("The file has been sent to client: " + numClien);
            } else {
                // Sending an error message if the file is not found
                pw.println("File not found!");
            }

            // Closing the connection
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### 3. `Client` Class
This class represents the client that connects to the server to request a file. The client connects to the server, sends the file request, and receives the content or an error message.

#### Features:
- Connects to the server.
- Sends the name of the requested file.
- Displays the file content or the error message received from the server.

#### Code:
```java
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Connecting to the server
            Socket socket = new Socket("localhost", 23456);
            
            // Creating streams for communication with the server
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Displaying the welcome message
            String message = br.readLine();
            System.out.println(message);

            // Asking the user to enter the file name
            System.out.print("Enter the file name: ");
            String fileName = scanner.nextLine();
            
            // Sending the file name to the server
            pw.println(fileName);
            
            // Reading and displaying the content of the file or an error message
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            // Closing the connection
            socket.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
```

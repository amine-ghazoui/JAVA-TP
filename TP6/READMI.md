# INTRODUCTION:

This project is a collection of various Java exercises unified under a single entry point. It consists of a main class that orchestrates the execution of exercises from different packages.

## Exercise 1:  

## Simulate `ls` Command in Java

This project implements a Java application that simulates the `ls` command used in Unix systems to list files and directories of a given path.

## Main Features

1. **Request a Path**:  
   - The user enters the path of a directory via the console.

2. **List Files and Directories**:  
   - It traverses the files and directories in the given path, displaying:
     - The full path.
     - The type (`<DIR>` for directories, `<FILE>` for files).
     - Permissions (`r`, `w`, and `h` for read, write, and hidden).

3. **Recursive Exploration**:  
   - If a directory is encountered, its contents are explored recursively.

## Code Structure

### 1. **`LsSimulator` Class**
- **`main` Method**:  
  - Manages user input.
  - Checks if the path is valid and if it's a directory.
  - Calls the listing method.

- **`listFilesAndDirectories` Method**:  
  - Lists the files and directories of the given path.
  - Displays detailed information for each item.
  - Recursively explores subdirectories.

   ```java
   // Méthode pour lister les fichiers et répertoires
    public static void listFilesAndDirectories(File dir) {
        // Lister les fichiers et répertoires dans le répertoire actuel
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                // Afficher les informations pour chaque fichier ou répertoire
                String type = file.isDirectory() ? "<DIR>" : "<FILE>";
                String permissions = getPermissions(file);

                // Affichage du chemin relatif et des informations
                System.out.println(file.getPath() + " " + type + " " + permissions);

                // Si c'est un répertoire, appeler la méthode récursive pour explorer ce répertoire
                if (file.isDirectory()) {
                    listFilesAndDirectories(file);
                }
            }
        }
    }

   ```

- **`getPermissions` Method**:  
  - Returns a string indicating the permissions of a file or directory:
    - **`r`**: Read allowed.
    - **`w`**: Write allowed.
    - **`h`**: Hidden.
    - **`-`**: No permission.
    
    ```java
     // Méthode pour obtenir les permissions d'un fichier ou répertoire
    public static String getPermissions(File file) {
        String permissions = "";

        // Vérifier les permissions
        permissions += file.canRead() ? "r" : "-";
        permissions += file.canWrite() ? "w" : "-";
        permissions += file.isHidden() ? "h" : "-";

        return permissions;
    }
    ``

## Exercise 2:  

## Contact Manager in Java

This application implements a contact manager in Java, allowing users to store, modify, search, and delete contacts in individual files within a folder.

## Main Features

1. **Load Contacts**:  
   - Reads files from the `contacts` folder to retrieve the associated names and phone numbers.

2. **Save Contacts**:  
   - Each contact is stored in a file named after the contact.  
   - The phone number is saved inside the file.

3. **Manage Contacts**:  
   - Add a new contact with duplicate checks.
   - Delete a contact by its name.
   - Search for a contact by its name.
   - Modify the phone number of an existing contact.

4. **Input Validation**:  
   - Ensures that names and numbers are not empty.
   - Prevents adding duplicate contacts.

## Code Structure

### 1. **`DossierContact` Class**

#### Attributes:
- **`names`**: List of contact names.
- **`numbers`**: List of phone numbers associated with the names.

#### Main Methods:
- **`loadContacts()`**:  
  - Loads existing contacts from the `contacts` folder (automatically created if it doesn't exist).

   ```java
   //Charge les contacts depuis les fichiers du dossier 'contacts'.
    private void chargerContacts() {
        File dossier = new File("contacts");
        if (!dossier.exists()) {
            dossier.mkdir(); // Créer le dossier s'il n'existe pas
        }

        File[] fichiers = dossier.listFiles();
        if (fichiers != null) {
            for (File fichier : fichiers) {
                BufferedReader reader = null;
                try {
                    reader = new BufferedReader(new FileReader(fichier));
                    String numero = reader.readLine();
                    noms.add(fichier.getName());
                    numeros.add(numero);
                }
                catch (IOException e) {
                    System.out.println("Erreur lors du chargement du fichier : " + fichier.getName());
                }
            }
        }
    }
   ```

- **`saveContacts()`**:  
  - Saves contacts in individual files.

   ```java
    //Sauvegarde tous les contacts dans des fichiers individuels.
    private void sauvegarderContacts() {
        File dossier = new File("contacts");
        if (!dossier.exists()) {
            dossier.mkdir();
        }

        for (int i = 0; i < noms.size(); i++) {
            File fichier = new File(dossier, noms.get(i));
            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(new FileWriter(fichier));
                writer.write(numeros.get(i));
            }
            catch (IOException e) {
                System.out.println("Erreur lors de l'écriture du fichier : " + fichier.getName());
            }
        }
    }
   ```

- **`addContact(String name, String number)`**:  
  - Adds a new contact after validation.

   ```java
   //Ajoute un contact avec validation et vérification de doublons.
    public void ajouterContact(String nom, String numero) {
        if (nom == null || nom.isEmpty() || numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("Le nom et le numéro ne peuvent pas être vides.");
        }
        if (noms.contains(nom)) {
            System.out.println("Le contact existe déjà.");
            return;
        }
        noms.add(nom);
        numeros.add(numero);
        sauvegarderContacts();
    }
   ```

- **`deleteContact(String name)`**:  
  - Deletes a contact, including removing its file.

   ```java
   //Supprime un contact par son nom.
    public void supprimerContact(String nom) {
        int index = noms.indexOf(nom);
        if (index != -1) {
            noms.remove(index);
            numeros.remove(index);
            File fichier = new File("contacts", nom);
            if (fichier.exists()) {
                fichier.delete();
            }
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
   ```

- **`searchContact(String name)`**:  
  - Returns the phone number of the contact or a message if not found.

   ```java
   //Recherche un contact par son nom.
    public String rechercherContact(String nom) {
        int index = noms.indexOf(nom);
        return (index != -1) ? numeros.get(index) : "Contact non trouvé.";
    }
   ```

- **`changeNumber(String name, String newNumber)`**:  
  - Updates the phone number of an existing contact.

  ```java
   //Change le numéro d'un contact existant.
    public void changerNumero(String nom, String nouveauNumero) {
        int index = noms.indexOf(nom);
        if (index != -1) {
            numeros.set(index, nouveauNumero);
            sauvegarderContacts();
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
  ```

## Exercise 3:  

## Product and Client Management in Java

This project is a Java application that allows managing products and clients via a console interface. The data for products and clients is saved in text files for persistent management.

## Features

### Product Management
- Display the list of registered products.

```java
 //Charge tous les produits depuis le fichier et les ajoute à la liste.
    @Override
    public List<Produit> getAll() {
        try {
            File file = new File(fichierProduit);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parti = line.split(";");

                // Vérifie que tous les attributs nécessaires sont présents
                if (parti.length == 5) {
                    String nom = parti[0];
                    String marque = parti[1];
                    double prix = Double.parseDouble(parti[2]);
                    String description = parti[3];
                    int nombreStock = Integer.parseInt(parti[4]);

                    // Crée un produit à partir des données lues
                    Produit produit = new Produit(nom, marque, prix, description, nombreStock);
                    listProduits.add(produit);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProduits;
    }
``
- Search for a product by name.

```java
/Recherche un produit par son nom.
    @Override
    public Produit findByNom(String nom) {
        Produit produitR = null;
        for (Produit prod : listProduits) {

            if (prod.getNom().equalsIgnoreCase(nom) && produitR == null) {
                produitR = new Produit(prod.getNom(), prod.getMarque(), prod.getPrix(), prod.getDescription(), prod.getNombreStock());
            }
        }
        return produitR;
    }
```
- Add a new product.

```java
 //Ajoute un produit à la liste en mémoire.
    @Override
    public Produit add(Produit prod) {
        listProduits.add(prod);
        return prod;
    }
``
- Delete an existing product.

```java
 //Supprime un produit de la liste en mémoire en fonction de son nom.
    @Override
    public void delete(String nom) {
        for (int i = 0; i < listProduits.size(); i++) {
            Produit produit = listProduits.get(i);

            if (produit.getNom().equalsIgnoreCase(nom)) {
                listProduits.remove(i);
                System.out.println("Le produit '" + nom + "' a été supprimé avec succès.");
                i--;
            }
        }
    }
```
- Save products in a text file.

```java
//Sauvegarde tous les produits de la liste dans le fichier.
    @Override
    public void saveAll() {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(fichierProduit));
            for (Produit produit : listProduits) {
                String lineProd = String.format("%s;%s;%.2f;%s;%d", produit.getNom(), produit.getMarque(), produit.getPrix(), produit.getDescription(), produit.getNombreStock());
                br.write(lineProd);
                br.newLine();
            }
            br.close();
            System.out.println("Les produits ont été sauvegardés avec succès.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

### Client Management
- Display the list of registered clients.

```java
//Charge tous les clients depuis le fichier et les ajoute à la liste.
    @Override
    public List<Client> getAll() {
        try {
            File file = new File(fichierClient); // Ouvre le fichier contenant les clients
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            while ((line = br.readLine()) != null) { // Parcourt chaque ligne du fichier
                String[] parti = line.split(";"); // Sépare les attributs du client

                // Vérifie que tous les attributs nécessaires sont présents
                if (parti.length == 5) {
                    String nom = parti[0];
                    String prenom = parti[1];
                    String adresse = parti[2];
                    String tele = parti[3];
                    String email = parti[4];


                    Client client = new Client(nom, prenom, adresse, tele, email);
                    listClients.add(client);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listClients;
    }
``
- Search for a client by name.

```java
//Recherche un client par son nom.
    @Override
    public Client findByNom(String nom) {
        Client clientR = null;
        for (Client client : listClients) {
            // Si un client avec le nom correspondant est trouvé, le retourner
            if (client.getNom().equalsIgnoreCase(nom) && clientR == null) {
                clientR = new Client(client.getNom(), client.getPrenom(), client.getAdresse(), client.getTele(), client.getEmail());
            }
        }
        return clientR;
    }
```
- Add a new client.

```java
// Ajoute un client à la liste en mémoire.
    @Override
    public Client add(Client clt) {
        listClients.add(clt); // Ajout du client à la liste
        return clt; // Retourne le client ajouté
    }
```
- Delete an existing client.

```java
 //Supprime un client de la liste en mémoire en fonction de son nom.
    @Override
    public void delete(String nom) {
        for (int i = 0; i < listClients.size(); i++) {
            Client client = listClients.get(i);
            // Si un client avec le nom correspondant est trouvé, le supprimer
            if (client.getNom().equalsIgnoreCase(nom)) {
                listClients.remove(i); // Suppression du client
                System.out.println("Le client '" + nom + "' a été supprimé avec succès.");
                i--;
            }
        }
    }
```
- Save clients in a text file.

```java
 //Sauvegarde tous les clients de la liste dans le fichier.
    @Override
    public void saveAll() {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(fichierClient));
            for (Client client : listClients) {
                // Format des données du client à écrire dans le fichier
                String lineClient = String.format("%s;%s;%s;%s;%s", client.getNom(), client.getPrenom(), client.getAdresse(), client.getTele(), client.getEmail());
                br.write(lineClient);
                br.newLine(); // Passage à la ligne suivante
            }
            br.close();
            System.out.println("Les clients ont été sauvegardés avec succès.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

## Code Structure

### Main Classes
- **`Product`**: Represents products with attributes like name, brand, price, description, and stock.
- **`Client`**: Represents clients with information like name, surname, address, phone number, and email.
- **`ProductBusinessImpl`**: Implements CRUD operations for managing products.
- **`ClientBusinessImpl`**: Implements CRUD operations for managing clients.
- **`IBusiness`**: A generic interface defining basic methods for entity management.

### Files
- Products are saved in `products.txt`.
- Clients are saved in `clients.txt`.


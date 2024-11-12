# **INTRODUCTION :**
   This tutorial focuses on learning and implementing exception handling in Java, an essential mechanism for guaranteeing the stability and robustness of applications. The exercises proposed aim to create custom exceptions and handle them through specific methods, thus reinforcing the ability of programs to handle errors without abrupt interruption.

## Exercice 1 :
1. __Objective__ :

This exercise involves creating a Java application to handle a custom exception called TropViteException, thrown when a speed exceeds 90 km/h.

2. __class description__ :

<img width="591" alt="exceptionEX1" src="https://github.com/user-attachments/assets/98eba4c4-746e-4924-a7a7-20b6a064d5ac">

* Inherits from Exception and takes an integer parameter to display a message specifying the speed in question.

* The constructor calls the parent constructor super() with the message: "This is an exception of type TropViteException. Speed in question: " + integer.

![image](https://github.com/user-attachments/assets/acc443e9-2fc9-4675-ab13-dd914ab72dc1)

* Method testVitesse: Throws a TropViteException if the speed exceeds 90.
* This method checks if the speed is greater than 90; if so, it throws a custom exception indicating that the speed is too high.

<img width="499" alt="try1EX1" src="https://github.com/user-attachments/assets/8531fa22-5db8-4c22-a396-57624e012238">

* __Test with a speed less than 90:__ This try-catch block tests the testVitesse() method with a value of 70, which is below the limit of 90. No exception is thrown, and the program displays the message indicating that the speed has been successfully tested. If, for any unexpected reason, a TropViteException is thrown, the stack trace is displayed.

<img width="514" alt="try2EX1" src="https://github.com/user-attachments/assets/df4ef7f7-a31f-4c6b-a19e-5dc5eb97b897">

* __Test with a speed greater than 90:__ This try-catch block tests the testVitesse() method with a value of 100, which exceeds the limit of 90 and triggers the throwing of the TropViteException. The stack trace is displayed for debugging purposes, and the custom exception message is printed to indicate the cause of the error.

<img width="716" alt="execut1" src="https://github.com/user-attachments/assets/c51f4008-8c1b-40c5-8c32-6ee5ce088003">

* __For the test with 70:__ The testVitesse() method does not throw an exception. The program displays the message indicating that the speed has been successfully validated: "The speed 70 has been successfully tested."
* __For the test with 100:__ The TropViteException is thrown. The stack trace is displayed, and the custom exception message is printed: "This is an exception of type TropViteException. Speed in question: 100."



## Exercice 2 :

1. __Objective__ :

   Cet exercice a pour objectif de créer un programme en Java qui gère une exception personnalisée appelée RacineCarreeException, levée lorsqu'un nombre négatif est passé pour le calcul de la racine carrée.

2. __class description__ :

<img width="599" alt="except2" src="https://github.com/user-attachments/assets/779b2022-0ac9-4a15-8291-129cb8f40fdd">

* __Custom Exception Class:__ This class, RacineCarreeException, is designed to manage errors related to negative values in square root calculations.
* __Constructor:__ It takes an integer parameter and invokes the parent class constructor with a specific error message: "This is a RacineCarreeException. Negative number: " + the integer provided. This message is displayed when the exception is thrown, indicating that the input was invalid.

<img width="563" alt="1" src="https://github.com/user-attachments/assets/bd516156-fe45-4726-be00-5603fd5bd76b">

* __Method testRacineCarree(int test):__ This method checks if the integer is negative and throws a RacineCarreeException if that is the case. This mechanism ensures that only valid (non-negative) integers are processed for square root calculations.

<img width="577" alt="2try" src="https://github.com/user-attachments/assets/30bd8937-ad07-48ee-9f24-6f00957efb2d">

* __Test with a negative number (-5):__ This try-catch block calls the testRacineCarree() method with -5, a negative number, triggering the custom RacineCarreeException. The call stack is displayed for debugging, along with the exception message indicating the error's cause (negative number).

<img width="581" alt="3try" src="https://github.com/user-attachments/assets/6cf47cf9-84fe-4396-b4c4-afec939c6bad">

* __Test with a positive number (25):__ This try-catch block tests the testRacineCarree() method with 25, a positive and valid value. No issues are detected, and the program confirms successful validation. If an unexpected exception occurred, the call stack and custom message would be displayed.

![image](https://github.com/user-attachments/assets/fc2ccf93-9edf-4188-8e44-a5de0d10dbfa)

* For the test with -5: The RacineCarreeException is thrown. The call stack is displayed, along with the message: "This is an exception of type RacineCarreeException. Negative number: -5."
* For the test with 25: The program confirms successful validation with the message: "The value 25 has been validated successfully."


## Exercice 3 :

1. __Objective__ :

   This exercise involves creating a Java application that raises a custom exception called NoteInvalideException when a grade is outside the valid range (0 to 20).
2. __class description__ :

<img width="549" alt="excep3" src="https://github.com/user-attachments/assets/b66c94b5-b38d-4266-a3bc-90308d466997">

* The NoteInvalideException class inherits from Exception and does not have any attributes. Its constructor accepts an integer parameter and calls the superclass constructor with the message: "Exception of type NoteInvalideException. Invalid grade: " + the integer.

<img width="459" alt="verifierNote" src="https://github.com/user-attachments/assets/df8b2b80-f12b-4bd3-9cc1-f4aedc810fe6">

* The verifierNote(int note) method checks if the grade is outside the valid range (less than 0 or greater than 20) and throws a NoteInvalideException accordingly.

<img width="581" alt="trycatch1" src="https://github.com/user-attachments/assets/a0105def-6150-4551-bce9-385f13adf56d">

* __Test with the grade 15:__ The try block calls the verifierNote() method with the value 15, which is valid since it falls between 0 and 20. The program then displays the message: "The grade 15 is accepted." The catch block is not executed in this case because no exception is thrown.

<img width="571" alt="trycatch2" src="https://github.com/user-attachments/assets/92637e66-2cf6-48cc-ab63-058fb6057ced">

* __Test with grade 25:__ The method verifierNote() is called with the value 25, which exceeds the valid limit. This triggers the NoteInvalideException, which is caught, displaying the call stack and the message: "Exception of type NoteInvalideException. Invalid grade: 25."

![image](https://github.com/user-attachments/assets/3aaa9336-e5b3-4538-a91a-af33de3b31fa)

* For the test with 15: The verifierNote() method does not raise an exception. The program displays the message confirming that the grade is successfully validated: "The grade 15 is accepted."
* For the test with 25: The NoteInvalideException is raised. The call stack is displayed, and the exception's custom message is printed: "Exception of type NoteInvalideException. Invalid grade: 25."

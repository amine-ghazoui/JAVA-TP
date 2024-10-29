# JAVA-TP

## Exercise 1:

Write a Java program that manages students' grades. This program should provide the following functionalities:

1. __Input Grades:__ The program prompts the user to enter the number of students, followed by the grade for each student. The grades are stored in a float array.

2. __Sorting and Displaying Grades:__ Once the grades are entered, the program uses Arrays.sort() to sort the grades in ascending order and displays them along with each student's identifier.

3. __Calculating the Average:__ The program calculates the average grade by summing all the grades and dividing by the number of students. The average is then displayed.

4. __Determining Maximum and Minimum Grades:__ The program iterates through the grade array to find the maximum and minimum grades, which are then displayed to the user.

5. __Searching for Specific Grades:__ Finally, the program asks the user to enter a specific grade and counts how many students received that grade. The result is displayed to the user.

This program efficiently manages a class's grades while offering practical features for analyzing the results.

## Exercise 2:

Write a Java program that conjugates first-group verbs (ending in "er") in the present tense, while handling some specific cases. The program should:

1. Conjugate regular verbs ending in __"er"__, excluding __"aller"__ (which is irregular).
2. Handle verbs ending in __"yer"__ by using __"ie"__ for singular forms and __"ient"__ for plural.
3. Conjugate verbs ending in __"ger"__ by adding __"eons"__ for the first-person plural __("nous")__.
4. Conjugate verbs ending in __"cer"__ by adding __"çons"__ for the first-person plural __("nous")__.
If the verb belongs to the third group or doesn't follow these rules, the program should display a message indicating that the verb belongs to another group.

## Exercise 3:

Write a Java program that performs a set of operations on a user-input string. This program includes an interactive menu allowing the user to choose from the following operations:

1. __Input a String:__ The user can enter a string of characters, which will be stored in a variable.

2. __Display the String:__ The program displays the entered string. If no string has been entered, a message indicating that no string is available is shown.

3. __Reverse the String:__ The user can request to reverse the entered string. The program displays the reversed string or an error message if no string has been entered.

4. __Count Words:__ The program counts the number of words in the string by considering spaces as separators. If no string has been entered, an error message is displayed.

The program continues to operate until the user chooses to exit the menu. This program allows for exploring various string manipulations in an interactive manner.


## Exercise 4:

Write a Java program that reads a string of characters provided by the user and counts the occurrences of the letters in the alphabet, ignoring the distinction between uppercase and lowercase letters. The program uses an array of 26 integers to store the count of occurrences for each letter.

The program follows these steps:

1. __Read the String:__ The input string is read and converted to uppercase to standardize the comparison of letters.

2. __Count Occurrences:__ For each character in the string, if the character is a letter (between __'A'__ and __'Z'__), the program increments the corresponding counter in the occurrences array.

3. __Display Results:__ After counting, the program displays only the letters that appear at least once in the string, along with the number of times they appear.

This program allows users to visualize the distribution of letters in a given string, providing insights into the frequency of letters in the entered text.





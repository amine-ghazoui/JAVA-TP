# **INTRODUCTION :**

  Ce travail pratique vise à explorer l'utilisation des collections et des streams en Java. Dans les exercices, nous manipulerons des listes (ArrayList), des maps (HashMap) et des sets (HashSet) pour effectuer diverses opérations telles que l'ajout, la suppression, la recherche et la modification d'éléments. Nous travaillerons également avec les Streams pour effectuer des filtrages, des transformations et des calculs sur des données, afin de mieux comprendre leur utilité et leur efficacité dans le traitement de grandes quantités de données.


## Exercice 1 : (Collection)

**1. Objective:**

  L'objectif de cet exercice est de créer une application Java pour manipuler une liste d'objets Produit, en permettant l'ajout, la suppression, la modification, la recherche et l'affichage des produits dans une ArrayList.


**2. Description :**

1. Creating Products:

<img width="454" alt="CreerProd" src="https://github.com/user-attachments/assets/8ff002e8-0cd3-4d11-9bb1-4d2d9c89a4da">

* Three Produit objects are created with specific details: ID, name, and price (e.g., Computer, Printer, Phone).

2. Adding Products to the List:

<img width="491" alt="ajouterProduit" src="https://github.com/user-attachments/assets/6abcc6a2-4548-4813-a553-6b0f9239cf40">

* The created products are added to an ArrayList of type Produit.

3. Removing Products:

<img width="439" alt="supprimerP" src="https://github.com/user-attachments/assets/148b4fa2-25fd-4db8-9f92-6af594aaf1f9">

* Two products are removed from the list using their indices (the first two products).

4. Displaying Products:

<img width="397" alt="afficherListProduit" src="https://github.com/user-attachments/assets/5914890e-8c51-486a-a810-0c89727e549c">

* The remaining list of products is looped through, and each product is printed to the console using the toString() method of the Produit class.

5. Modifying a Product:

<img width="397" alt="modifierPro" src="https://github.com/user-attachments/assets/f59552da-524d-446b-8665-be0e80b9b835">

* If the list contains products, the first product is modified. Its ID, name, and price are updated (e.g., ID 17, name "USB", price 100).

6. Searching for a Product by Name:

<img width="397" alt="RechercherProdui" src="https://github.com/user-attachments/assets/37a05077-930a-4e5c-b685-ce603f9a0d6a">

* The user is prompted to input a product name. If a product with that name exists in the list, its details are displayed. Otherwise, a message indicating that the product does not exist is shown.



## Exercice 2 : (Collection)

**1. Objective:**

  The goal of this exercise is to learn how to use HashMaps in Java to store, modify, and manipulate data, such as student grades, while practicing common operations like adding, removing, calculating averages, and displaying with lambda expressions.


**2. Description :**

1. Creating a HashMap to Store Student Grades:

<img width="409" alt="Création" src="https://github.com/user-attachments/assets/1596274c-cfd7-4089-95be-c091b9286141">

* A HashMap is created to associate each student's name with their respective grade.

2. Inserting Student Grades:

<img width="378" alt="insertionNot" src="https://github.com/user-attachments/assets/e113ab06-92c3-4121-9783-b5d5af14b12e">

* Grades for three students are inserted into the HashMap (e.g., Amine has a grade of 17.5, Soufiane has 16.0, and Ibtissame has 19.0).

3. Increasing a Student’s Grade:

<img width="567" alt="augmenterNote" src="https://github.com/user-attachments/assets/fc71b1b8-0375-4c53-bae0-35bafdbbc100">

* A specific student's grade (Amine) is increased by 1.5, and the new grade is updated in the HashMap.

4. Removing a Student’s Grade:

<img width="556" alt="supprimerNo" src="https://github.com/user-attachments/assets/3187f9ad-0a88-4f14-b940-742f2f54a429">

* The grade for the student Ibtissame is removed from the HashMap.

5. Displaying the Size of the HashMap:

<img width="495" alt="afficherTailleMap" src="https://github.com/user-attachments/assets/495869de-e84f-4631-b109-471bf061368e">

* The size of the HashMap, i.e., the number of students registered, is displayed.

6. Calculating the Average, Maximum, and Minimum Grades:

<img width="451" alt="affichageNoteMoyy" src="https://github.com/user-attachments/assets/a83500fb-137f-4578-bd82-fdaab6d61b71">

* The total sum of grades, the maximum grade, and the minimum grade are calculated. Then, the average grade is displayed.

7. Checking for a Grade Equal to 20:

<img width="558" alt="verifierNote20" src="https://github.com/user-attachments/assets/dd42c2b4-e22e-4e06-aacf-a6397af07a83">

* The program checks if a grade of 20 exists in the HashMap and displays a message accordingly.

8. Displaying the List of Student Grades:

<img width="524" alt="afficherListNote" src="https://github.com/user-attachments/assets/ee5f9eca-690a-42de-bb9f-3e1abe1793f8">

* All student grades are displayed along with their names by iterating over the HashMap.











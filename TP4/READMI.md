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



### Output:

```
Produit:
ID      : 14
Nom     : Telephone
Prix    : 2500.0

Produit modifier avec succé
Saisissez le nom du produit souhaité : 
USB
Produit:
ID      : 17
Nom     : USB
Prix    : 100.0
```



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



### Output:

```
La note de l'étudiant Amine a été augmentée avec succès.
La note de l'étudiant Ibtissame a été supprimée avec succès.
La taille du map est : 2
Moyenne : 17,50
Note max : 19,00
Note min : 16,00
Y a-t-il une note de 20 ? Non
Liste des notes : 
Amine : 19.0
Soufiane : 16.0
```


## Exercice 3 : (Collection)

**1. Objective:**

  The objective of this exercise is to manipulate HashSet collections in Java to perform set operations such as intersection and union. It aims to familiarize learners with the fundamental concepts of managing collections and sets in the Java programming language.


**2. Description :**

1. Creation of student groups:

<img width="385" alt="11" src="https://github.com/user-attachments/assets/c750f327-9e1c-4beb-910a-c0f193535fcf">

* Two distinct sets (HashSet) are created to represent groups A and B, each containing a list of student names.

2. Adding names to the sets:

<img width="474" alt="1" src="https://github.com/user-attachments/assets/c44548f8-a737-4fd4-a31b-7ffb6e983515">

* Student names are added to groups A and B using the add method.

3. Intersection of the sets:

<img width="484" alt="2" src="https://github.com/user-attachments/assets/0587b9c2-9380-409f-b5b0-3f5489da8fc4">

* The intersection of groups A and B is calculated using the retainAll method, which retains only the elements common to both sets. The results are displayed.

4. Union of the sets:

<img width="418" alt="3" src="https://github.com/user-attachments/assets/ac1d56bf-35b2-45bb-bb89-30d987d9edb2">

* The union of groups A and B is calculated using the addAll method, which combines all elements from both sets without duplicates. The results are displayed.



### Output:

```
Intersection des deux HashSet : [Ait bahadou, Ghazoui]
Union des deux Hashset : [boulmani, abdelhadi, Ait bahadou, Elmoktari, Ghazoui, Essalhi]
```


## Exercice 1 : (Streams)

**1. Objective:**

  The objective of this exercise is to explore the functionalities of streams in Java by applying various transformations and filters to a list of words. It aims to introduce the concepts of functional data manipulation using operations such as filter, map, and flatMap.


**2. Description :**

1. Filter words containing the letter "a":

```
//Filtrer les mots qui contiennent la lettre "a".
        List<String> motsAvecA = mots.stream()
                            .filter(mot -> mot.contains("a"))
                            .collect(Collectors.toList());

        System.out.println("Mots contenant 'a' : " + motsAvecA);
```

* Only words containing the letter "a" are selected using the filter method. The matching words are collected into a new list.

2. Filter words longer than 3 characters and reverse each word:

```
// Filtrer les mots qui ont une longueur supérieure à 3 et transformer chaque mot en son inverse.
        List<String> inverseMot = mots.stream()
                                .filter(mot -> mot.length() > 3) // Filtrer les mots dont la longueur > 3
                                .map(mot -> new StringBuilder(mot).reverse().toString()) // Inverser chaque mot
                                .collect(Collectors.toList());

        System.out.println("Mots inversés : " + inverseMot);
```

* Words longer than 3 characters are selected, and each word is reversed using the map method and StringBuilder.

3. Filter words containing "e" and flatten each word into a list of characters:

```
//Filtrer les chaînes qui contiennent la lettre "e" et aplatir chaque chaîne en une liste de ses caractères.
        List<Character> caracteres = mots.stream()
                .filter(mot -> mot.contains("e"))  // Filtrer les mots contenant "e"
                .flatMap(mot -> mot.chars().mapToObj(c -> (char) c))// Convertir chaque mot en un flux d'entiers (ASCII), puis en un flux de caractères
                .collect(Collectors.toList());

        System.out.println("Caractères des mots contenant 'e' : " + caracteres);
```

* Words containing the letter "e" are filtered, and each word is transformed into a list of its characters using flatMap.

4. Transform each word to uppercase: 

```
// Transformer chaque chaîne en sa version en majuscules.
        List<String> motMajusule = mots.stream()
                                .map(mot ->mot.toUpperCase())
                                .collect(Collectors.toList());

        System.out.println("Mots en majuscules : " + motMajusule);
```

* Each word in the list is converted to uppercase using the map method and toUpperCase.

5. Convert each word to its length:

```
 //Convertir chaque chaîne en sa longueur.
        List<Integer> longeurChaine = mots.stream()
                                    .map(mot ->mot.length()) // Transformer chaque mot en sa longueur
                                    .collect(Collectors.toList());

        System.out.println("Longueur des mots : " + longeurChaine);
```

* The length of each word is calculated and collected into a list using map.

6. Flatten all words into a single list of characters: 

```
// Transformer chaque chaîne en une liste de ses caractères, puis aplatir toutes les listes en une seule liste de caractères.
        List<Character> listeCaracteres = mots.stream()
                                        .flatMap(mot ->mot.chars() // Convertir chaque mot en un flux d'entiers (ASCII)
                                                .mapToObj(c -> (char) c)) // Convertir chaque entier en un caractère
                                        .collect(Collectors.toList());

        System.out.println("Tous les caractères aplatis : " + listeCaracteres);
```

* Each word is transformed into a list of its characters, and all lists are flattened into a single list using flatMap.

7. Transform each word into a string containing its index:

```
// À partir d'une liste de mots, transformer chaque nom en une chaîne de la forme "Nom - Index" où l'index représente la position du nom dans la liste.
        List<String> motsIndex = mots.stream()
                                .map(mot -> mot + " - " + mots.indexOf(mot))  // Ajouter l'index à chaque mot
                                .collect(Collectors.toList());

        System.out.println("Mots avec index : " + motsIndex);
```

* Each word is associated with its position in the original list, forming strings in the format "Word - Index" using map.



### Output:

```
Mots contenant 'a' : [chat, arbre, maison, chambre]
Mots inversés : [tahc, neihc, erbra, nosiam, erutiov, erbmahc, emmop]
Caractères des mots contenant 'e' : [c, h, i, e, n, a, r, b, r, e, v, o, i, t, u, r, e, c, h, a, m, b, r, e, p, o, m, m, e]
Mots en majuscules : [CHAT, CHIEN, ARBRE, MAISON, VOITURE, CHAMBRE, POMME]
Longueur des mots : [4, 5, 5, 6, 7, 7, 5]
Tous les caractères aplatis : [c, h, a, t, c, h, i, e, n, a, r, b, r, e, m, a, i, s, o, n, v, o, i, t, u, r, e, c, h, a, m, b, r, e, p, o, m, m, e]
Mots avec index : [chat - 0, chien - 1, arbre - 2, maison - 3, voiture - 4, chambre - 5, pomme - 6]

```


## Exercice 2 : (Streams)

**1. Objective:**

   The objective of this exercise is to explore the functionalities of streams in Java by applying various operations on a list of employees. It aims to introduce the concepts of functional data manipulation using operations such as mapToDouble, filter, sorted, and reduce, enabling the calculation, sorting, filtering, and combination of data.


**2. Description :**

1. Calculating the total sum of salaries:

```
// Somme des salaires
        double totalSalire = employes.stream()
                            .mapToDouble(emp -> emp.getSalaire())  // Extraire les salaires des employés
                            .sum(); // Calculer la somme des salaires
        System.out.println("Somme totale des salaires : " + totalSalire);

        /*
        double totalSalaire = employes.stream().reduce(0.0, (acc, employe) -> acc + employe.getSalaire());
        double totalSalaire = employes.stream().mapToDouble(Employe::getSalaire).sum();
         */
```

* Use mapToDouble and sum to extract employees' salaries and calculate their total sum.

2. Sorting employees alphabetically:

```
// trier la liste des employés par ordre alphabétique du nom.
        List<Employe> employeTrie = employes.stream()
                                    .sorted(Comparator.comparing(Employe :: getNom )) // Tri par ordre alphabétique du nom
                                    .collect(Collectors.toList());

        employeTrie.forEach(emp -> System.out.println(emp.toString()));
```

* Use sorted to arrange employees based on their names in alphabetical order.

3. Finding the employee with the lowest salary:

```
// Trouver l'employé avec le salaire le plus bas
        Employe employeSalaireBas = employes.stream()
                                .min(Comparator.comparingDouble(Employe :: getSalaire))
                                .orElse(null); // Si la liste est vide, renvoyer null

        if (employeSalaireBas != null) {
            System.out.println("Employé avec salaire le plus bas : " + employeSalaireBas.getNom());
        } else {
            System.out.println("Aucun employé trouvé.");
        }
```

* Use min to identify the employee with the smallest salary.

4. Filtering employees with a salary above a given value:

```
// Liste des employés avec un salaire supérieur à 50000
        List<Employe> listEmploye = employes.stream()
                                .filter(map -> map.getSalaire() > 40000)
                                .collect(Collectors.toList());

        listEmploye.forEach(emp -> System.out.println("Employé avec salaire > 40000 est : " + emp.getNom()));

```

* Use filter to select only employees whose salaries exceed a certain threshold.

5. Finding the employee with the highest salary:

```
 // Trouver l'employé avec le salaire le plus élevé
        Employe empSalaireEleve = employes.stream()
                                .reduce((emp1, emp2) -> emp1.getSalaire() > emp2.getSalaire() ? emp1 : emp2) // comparer les salires des employés deux par deux
                                .orElse(null); // Si la liste est vide , renvoie null

        if (empSalaireEleve != null) {
            System.out.println("Employé avec le salaire le plus élevé : " + empSalaireEleve.getNom());
        } else {
            System.out.println("Aucun employé trouvé.");
        }
```

* Use reduce to compare employees' salaries and find the one with the highest remuneration.

6. Concatenating employee names:

```
// Concaténer les noms de tous les employés
        String nomEmpConcat = employes.stream()
                            .map(Employe :: getNom) // Transforme chaque employé en son nom (chaîne de caractères)
                            .reduce("", (noms, nom) -> noms + nom + " " ); // Réduit le stream en une seule chaîne en concaténant chaque nom avec un espace

        System.out.println("Noms concaténés : " + nomEmpConcat);
```

* Use reduce to combine the names of all employees into a single string.



### Output:

```
Somme totale des salaires : 125000.0
Amine - Informatique - 50000.0
ibtissame - Informatique - 45000.0
soufiane - Marketing - 30000.0
Employé avec salaire le plus bas : soufiane
Employé avec salaire > 40000 est : Amine
Employé avec salaire > 40000 est : ibtissame
Employé avec le salaire le plus élevé : Amine
Noms concaténés : Amine ibtissame soufiane 
```










# Unified Java Exercises

This project is a collection of various Java exercises unified under a single entry point. It consists of a main Main class that orchestrates the execution of exercises from different packages.

## Exercice 1 :

# Simulateur de Commande `ls` en Java

Ce projet implémente une application Java qui simule la commande `ls` utilisée dans les systèmes Unix pour lister les fichiers et répertoires d'un chemin donné.

## Fonctionnalités Principales

1. **Demander un chemin** :  
   - L'utilisateur saisit le chemin d'un répertoire via la console.

2. **Lister les fichiers et répertoires** :  
   - Parcours des fichiers et répertoires dans le chemin spécifié, en affichant :
     - Le chemin complet.
     - Le type (`<DIR>` pour les répertoires, `<FILE>` pour les fichiers).
     - Les permissions (`r`, `w`, et `h` pour lecture, écriture, et caché).

3. **Exploration récursive** :  
   - Si un répertoire est rencontré, son contenu est exploré récursivement.

## Structure du Code

### 1. Classe **`LsSimulator`**
- **Méthode `main`** :
  - Gère la saisie utilisateur.
  - Vérifie si le chemin est valide et s'il s'agit d'un répertoire.
  - Appelle la méthode de listage.

- **Méthode `listFilesAndDirectories`** :
  - Liste les fichiers et répertoires du chemin donné.
  - Affiche les informations détaillées pour chaque élément.
  - Explore les sous-répertoires récursivement.

- **Méthode `getPermissions`** :
  - Retourne une chaîne indiquant les permissions du fichier ou répertoire :
    - **`r`** : Lecture autorisée.
    - **`w`** : Écriture autorisée.
    - **`h`** : Caché (hidden).
    - **`-`** : Permission non disponible.


## Exercice 2 :

# Gestionnaire de Contacts en Java

Cette application implémente un gestionnaire de contacts en Java, permettant de stocker, modifier, rechercher et supprimer des contacts dans des fichiers individuels au sein d'un dossier.

## Fonctionnalités Principales

1. **Chargement des contacts** :  
   - Lit les fichiers du dossier `contacts` pour récupérer les noms et numéros associés.

2. **Sauvegarde des contacts** :  
   - Chaque contact est stocké dans un fichier portant le nom du contact.  
   - Le numéro de téléphone est sauvegardé à l'intérieur du fichier.

3. **Gestion des contacts** :  
   - Ajouter un nouveau contact avec vérification des doublons.
   - Supprimer un contact par son nom.
   - Rechercher un contact par son nom.
   - Modifier le numéro d'un contact existant.

4. **Validation des entrées** :  
   - Assure que les noms et numéros ne sont pas vides.
   - Empêche l'ajout de contacts déjà existants.

## Structure du Code

### 1. Classe **`DossierContact`**

#### Attributs :
- **`noms`** : Liste des noms des contacts.
- **`numeros`** : Liste des numéros associés aux noms.

#### Méthodes Principales :
- **`chargerContacts()`** :  
  - Charge les contacts existants depuis le dossier `contacts` (créé automatiquement s'il n'existe pas).  

- **`sauvegarderContacts()`** :  
  - Sauvegarde les contacts dans des fichiers individuels.

- **`ajouterContact(String nom, String numero)`** :  
  - Ajoute un nouveau contact après validation.

- **`supprimerContact(String nom)`** :  
  - Supprime un contact en supprimant également son fichier.

- **`rechercherContact(String nom)`** :  
  - Retourne le numéro du contact correspondant ou un message si le contact n'est pas trouvé.

- **`changerNumero(String nom, String nouveauNumero)`** :  
  - Met à jour le numéro de téléphone d'un contact existant.


## Exercice 3 :

# Gestion de Produits et Clients en Java

Ce projet est une application Java qui permet de gérer les produits et les clients via une interface console. Les données des produits et des clients sont sauvegardées dans des fichiers texte pour une gestion persistante.

## Fonctionnalités

### Gestion des Produits
- Afficher la liste des produits enregistrés.
- Rechercher un produit par son nom.
- Ajouter un nouveau produit.
- Supprimer un produit existant.
- Sauvegarder les produits dans un fichier texte.

### Gestion des Clients
- Afficher la liste des clients enregistrés.
- Rechercher un client par son nom.
- Ajouter un nouveau client.
- Supprimer un client existant.
- Sauvegarder les clients dans un fichier texte.

## Structure du Code

### Principales Classes
- **`Produit`** : Représente les produits avec des attributs comme le nom, la marque, le prix, la description et le stock.
- **`Client`** : Représente les clients avec des informations comme le nom, le prénom, l'adresse, le téléphone et l'email.
- **`MetierProduitImpl`** : Implémente les opérations CRUD pour la gestion des produits.
- **`MetierClientImpl`** : Implémente les opérations CRUD pour la gestion des clients.
- **`IMetier`** : Interface générique définissant les méthodes de base pour la gestion des entités.

### Fichiers
- Les produits sont enregistrés dans `produits.txt`.
- Les clients sont enregistrés dans `clients.txt`.






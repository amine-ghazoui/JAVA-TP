# TP5 Project Documentation

JavaFX Application for Managing Professors and Departments This JavaFX application is designed to manage professors and departments within an educational institution. It provides functionalities for adding, editing, viewing, and deleting records of professors and departments.

![Capture d'écran 2024-12-01 175821](https://github.com/user-attachments/assets/0394fa1f-d33d-4281-8cd1-f523d8f4c944)

![Capture d'écran 2024-12-01 175759](https://github.com/user-attachments/assets/a32b9e90-5d0d-4ee5-ba94-2b38a72c893f)

![Capture d'écran 2024-12-01 175849](https://github.com/user-attachments/assets/137faf16-6655-4324-9a2e-f868ea19fa94)

# Project structure:

## Models:

### Professeur

The Professeur class represents a professor with various attributes:

id: Unique identifier for the professor.
nom: Last name of the professor.
prenom: First name of the professor.
cin: National identity card number.
adresse: Address of the professor.
email: Email address.
telephone: Phone number.
dateRecrutement: Date when the professor was recruited.
departementId: Identifier for the department to which the professor belongs.

### Departement

The Departement class represents a department within the institution:

id: Unique identifier for the department.
nom: Name of the department.

## Business Logic

### IMetier Interface

The IMetier interface defines the operations related to the business logic for managing professors and departments:

#### Professeur Operations:
* void ajouterProfesseur(Professeur prof);
* void modifierProfesseur(Professeur prof);
* void supprimerProfesseur(int idProf);
* Professeur chercherProfesseurParMotCle(int idProf);
* List<Professeur> listerProfesseurs();
* void affecterProfesseurADepartement(int idProf, int idDepart);

#### Departement Operations:
* void ajouterDepartement(Departement depart);
* void modifierDepartement(Departement depart);
* void supprimerDepartement(int idDepart);
* Departement chercherDepartementParId(int idDepart);
* List<Departement> listerDepartements();
* List<Professeur> listerProfesseursParDepartement(int idDepart);

### MetierImpl Class

The MetierImpl class is an implementation of the IMetier interface. It uses a database connection to perform CRUD operations.

* Uses SingletonConnexionDB for database connections.
* Implements all methods defined in the IMetier interface for managing professors and departments.
* Includes helper methods to extract entities from ResultSet.

## Database Connection

### SingletonConnexionDB Class

The SingletonConnection class is used to establish a connection with the database. It ensures that only one instance of the database connection exists throughout the application. public class SingletonConnection { private static Connection connection;

```
static {
                  try {
                      Class.forName("com.mysql.cj.jdbc.Driver");
                      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/etablissement", "root", "");
                  }catch (Exception e){
                      e.printStackTrace();
                  }
              }
              public static Connection getConnection(){
                  return connection;
              }
          }
```

## Controllers

* **AffecterProfesseurController:** Manages assigning professors to departments.
* **DepartementController:** Handles actions related to department management.
* **ProfesseurController:** Manages interactions for adding, editing, and deleting professors.
* **HelloController:** Serves as a demonstration or handles a simple application view.

## Application

### JavaFxApplication: 

##### HelloApplication

The JavaFxApplication class is the main entry point for the JavaFX application. It extends the Application class from the JavaFX framework and overrides the start method to set up the primary stage and scene.

* **Rôle :** Point d'entrée principal de l'application JavaFX.
* **Description :**
  - Elle hérite de la classe Application et initialise la fenêtre principale (Stage) de l'application.
  - La méthode start charge l'interface utilisateur définie dans le fichier hello-view.fxml à l'aide de FXMLLoader.
  - Elle définit le titre de la fenêtre ("Stage 1") et affiche la scène principale.
  - La méthode main lance le cycle de vie JavaFX en appelant la méthode launch().
 

## Class Diagramme

![Capture d'écran 2024-12-01 231354](https://github.com/user-attachments/assets/48e821a7-b033-4d2c-962a-de60fb455ecd)







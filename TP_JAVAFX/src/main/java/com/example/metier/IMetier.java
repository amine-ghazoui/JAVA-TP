package com.example.metier;

import com.example.entite.Departement;
import com.example.entite.Professeur;

import java.util.List;

public interface IMetier {

    // Gestion des professeurs
    void ajouterProfesseur(Professeur prof);
    void modifierProfesseur(Professeur prof);
    void supprimerProfesseur(int idProf);
    Professeur chercherProfesseurParMotCle(int idProf);

    List<Professeur> listerProfesseurs();
    void affecterProfesseurADepartement(int idProf, int idDepart);


    // Gestion des départements
    void ajouterDepartement(Departement depart);
    void modifierDepartement(Departement depart);
    void supprimerDepartement(int idDepart);
    Departement chercherDepartementParId(int idDepart);
    List<Departement> listerDepartements();
    List<Professeur> listerProfesseursParDepartement(int idDepart);
}

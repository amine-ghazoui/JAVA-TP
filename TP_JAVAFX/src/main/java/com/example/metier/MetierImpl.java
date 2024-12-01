package com.example.metier;

import com.example.dao.DepartementDao;
import com.example.dao.ProfesseurDao;
import com.example.entite.Departement;
import com.example.entite.Professeur;

import java.util.List;

public class MetierImpl implements IMetier {

    // DAO pour gérer les entités Professeur et Departement
    private ProfesseurDao professeurDao = new ProfesseurDao();
    private DepartementDao departementDao = new DepartementDao();

    // Méthodes pour la gestion des professeurs

    /**
     * Ajoute un nouveau professeur.
     */
    @Override
    public void ajouterProfesseur(Professeur prof) {
        professeurDao.add(prof);
    }

    /**
     * Modifie un professeur existant.
     */
    @Override
    public void modifierProfesseur(Professeur prof) {
        professeurDao.update(prof);
    }

    /**
     * Supprime un professeur par son ID.
     */
    @Override
    public void supprimerProfesseur(int idProf) {
        professeurDao.delete(idProf);
    }

    /**
     * Recherche un professeur par son ID.
     */
    @Override
    public Professeur chercherProfesseurParMotCle(int idProf) {
        return professeurDao.findById(idProf);
    }

    /**
     * Retourne la liste de tous les professeurs.
     */
    @Override
    public List<Professeur> listerProfesseurs() {
        return professeurDao.findAll();
    }

    /**
     * Affecte un professeur à un département.
     */
    @Override
    public void affecterProfesseurADepartement(int idProf, int idDepart) {
        professeurDao.assignToDepartment(idProf, idDepart);
    }

    // Méthodes pour la gestion des départements

    /**
     * Ajoute un nouveau département.
     */
    @Override
    public void ajouterDepartement(Departement depart) {
        departementDao.add(depart);
    }

    /**
     * Modifie un département existant.
     */
    @Override
    public void modifierDepartement(Departement depart) {
        departementDao.update(depart);
    }

    /**
     * Supprime un département par son ID.
     */
    @Override
    public void supprimerDepartement(int idDepart) {
        departementDao.delete(idDepart);
    }

    /**
     * Recherche un département par son ID.
     */
    @Override
    public Departement chercherDepartementParId(int idDepart) {
        return departementDao.findById(idDepart);
    }

    /**
     * Retourne la liste de tous les départements.
     */
    @Override
    public List<Departement> listerDepartements() {
        return departementDao.findAll();
    }

    /**
     * Retourne la liste des professeurs dans un département spécifique.
     */
    @Override
    public List<Professeur> listerProfesseursParDepartement(int idDepart) {
        return professeurDao.findByDepartement(idDepart);
    }
}

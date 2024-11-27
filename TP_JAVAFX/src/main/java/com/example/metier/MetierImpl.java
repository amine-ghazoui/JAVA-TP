package com.example.metier;

import com.example.dao.DepartementDao;
import com.example.dao.ProfesseurDao;
import com.example.entite.Departement;
import com.example.entite.Professeur;

import java.util.List;

public class MetierImpl implements IMetier {

    private ProfesseurDao professeurDao = new ProfesseurDao();
    private DepartementDao departementDao = new DepartementDao();

    // Gestion des professeurs
    @Override
    public void ajouterProfesseur(Professeur prof) {

        professeurDao.add(prof);
    }

    @Override
    public void modifierProfesseur(Professeur prof) {

        professeurDao.update(prof);
    }

    @Override
    public void supprimerProfesseur(int idProf) {

        professeurDao.delete(idProf);
    }

    @Override
    public Professeur chercherProfesseurParMotCle(int idProf) {

        return professeurDao.findById(idProf);
    }


    @Override
    public List<Professeur> listerProfesseurs() {

        return professeurDao.findAll();
    }

    @Override
    public void affecterProfesseurADepartement(int idProf, int idDepart) {
        professeurDao.assignToDepartment(idProf, idDepart);
    }

    // Gestion des départements
    @Override
    public void ajouterDepartement(Departement depart) {

        departementDao.add(depart);
    }

    @Override
    public void modifierDepartement(Departement depart) {

        departementDao.update(depart);
    }

    @Override
    public void supprimerDepartement(int idDepart) {

        departementDao.delete(idDepart);
    }

    @Override
    public Departement chercherDepartementParId(int idDepart) {

        return departementDao.findById(idDepart);
    }

    @Override
    public List<Departement> listerDepartements() {

        return departementDao.findAll();
    }

    @Override
    public List<Professeur> listerProfesseursParDepartement(int idDepart) {
        return professeurDao.findByDepartement(idDepart);
    }
}

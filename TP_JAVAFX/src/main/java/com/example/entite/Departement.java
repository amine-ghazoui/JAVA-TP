package com.example.entite;

import java.util.ArrayList;

public class Departement {
    private int id_dept;
    private String nom;
    private ArrayList<Professeur> professeurs;

    public Departement(int id, String nom) {
        this.id_dept = id;
        this.nom = nom;
        this.professeurs = new ArrayList<>();
    }

    public int getId_dept() {
        return id_dept;
    }

    public void setId_dept(int id_dept) {
        this.id_dept = id_dept;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Professeur> getProfesseurs() {
        return professeurs;
    }

    public void setProfesseurs(ArrayList<Professeur> professeurs) {
        this.professeurs = professeurs;
    }

    public String toString() {

        return "Departement\n" +
                "  id_dept=" + id_dept + ",\n" +
                "  nom='" + nom + "',\n";
    }
}

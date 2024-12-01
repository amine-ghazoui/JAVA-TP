package com.example.entite;

import java.util.Date;

public class Professeur {
    private int id_prof;
    private String nom;
    private String prenom;
    private String cin;
    private String adresse;
    private String telephone;
    private String email;
    private String dete_recrutement;
    private int id_depart;

    public Professeur(int id_prof ,String nom, String prenom, String cin, String adresse, String telephone, String email, String dete_recrutement, int id_depart) {
        this.id_prof = id_prof;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.dete_recrutement = dete_recrutement;
        this.id_depart = id_depart;
    }

    public int getId_prof() {
        return id_prof;
    }

    public void setId_prof(int id_prof) {
        this.id_prof = id_prof;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDete_recrutement() {
        return dete_recrutement;
    }

    public void setDete_recrutement(String dete_recrutement) {

        this.dete_recrutement = dete_recrutement;
    }

    public int getId_depart() {
        return id_depart;
    }

    public void setId_depart(int id_depart) {
        this.id_depart = id_depart;
    }

    public String toString() {
        return "Professeur:\n" +
                "  id_prof=" + id_prof + ",\n" +
                "  nom='" + nom + "',\n" +
                "  prenom='" + prenom + "',\n" +
                "  cin='" + cin + "',\n" +
                "  adresse='" + adresse + "',\n" +
                "  telephone='" + telephone + "',\n" +
                "  email='" + email + "',\n" +
                "  date_recrutement='" + dete_recrutement + "',\n" +
                "  id_dept=" + id_depart + "\n";
    }
}

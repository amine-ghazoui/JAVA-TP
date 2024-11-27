package com.example.dao;

import com.example.entite.Professeur;
import com.example.utils.SingletonConnexionDB;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class ProfesseurDao implements IDao<Professeur>{

    private Connection connection = SingletonConnexionDB.getConnection();
    @Override
    public List<Professeur> findAll() {
        List<Professeur> professeurs = new ArrayList<>();
        String query = "SELECT * FROM professeur";
        Statement st = null;
        ResultSet rs = null;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                Professeur prof = new Professeur(
                        rs.getInt("id_prof"),
                        rs.getString("nom"),
                        rs.getString("prenom"),
                        rs.getString("cin"),
                        rs.getString("adresse"),
                        rs.getString("telephone"),
                        rs.getString("email"),
                        rs.getString("date_recrutement"),
                        rs.getInt("id_depart"));
                professeurs.add(prof);
                System.out.printf(prof.toString());
                System.out.printf("*********************");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return professeurs;
    }

    @Override
    public Professeur findById(int id) {
        Professeur prof = null;

        String query = "SELECT * FROM professeur WHERE id_prof = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                prof = new Professeur(
                        rs.getInt("id_prof"),
                        rs.getString("nom"),
                        rs.getString("prenom"),
                        rs.getString("cin"),
                        rs.getString("adresse"),
                        rs.getString("telephone"),
                        rs.getString("email"),
                        rs.getString("date_recrutement"),
                        rs.getInt("id_depart")
                );
                System.out.printf(prof.toString());
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return prof;
    }

    @Override
    public void add(Professeur prof) {

        String query = "INSERT INTO professeur (id_prof, nom, prenom, cin, adresse, telephone, email, date_recrutement, id_depart) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, prof.getId_prof());
            ps.setString(2, prof.getNom());
            ps.setString(3, prof.getPrenom());
            ps.setString(4, prof.getCin());
            ps.setString(5, prof.getAdresse());
            ps.setString(6, prof.getTelephone());
            ps.setString(7, prof.getEmail());
            ps.setString(8, prof.getDete_recrutement());
            ps.setInt(9, prof.getId_depart());
            ps.executeUpdate();
            System.out.printf("Le professeur a été inséré dans la table avec succès.`\n");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(Professeur prof) {
        String query = "UPDATE professeur SET nom = ?, prenom = ?, cin = ?, adresse = ?, telephone = ?, email = ?, date_recrutement = ?, id_depart = ? WHERE id_prof = ?";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, prof.getNom());
            ps.setString(2, prof.getPrenom());
            ps.setString(3, prof.getCin());
            ps.setString(4, prof.getAdresse());
            ps.setString(5, prof.getTelephone());
            ps.setString(6, prof.getEmail());
            ps.setString(7, prof.getDete_recrutement());
            ps.setInt(8, prof.getId_depart());
            ps.setInt(9, prof.getId_prof());
            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.printf("Le professeur avec l'ID %d a été mis à jour avec succès.%n", prof.getId_prof());
            } else {
                System.out.printf("Aucun professeur trouvé avec l'ID %d. Mise à jour non effectuée.%n", prof.getId_prof());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM professeur WHERE id_prof = ?";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            int rowsDeleted = ps.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.printf("Le professeur avec l'ID %d a été supprimé avec succès.%n", id);
            } else {
                System.out.printf("Aucun professeur trouvé avec l'ID %d. Suppression non effectuée.%n", id);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }



    // Affecter un professeur à un département.
    public void assignToDepartment(int idProf, int idDepart){

        String query = "UPDATE professeur SET id_depart = ? WHERE id_prof = ?";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, idDepart);
            ps.setInt(2, idProf);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    // Affiche la liste des professeurs d’un département spécifique.
    public List<Professeur> findByDepartement(int idDepart){
        List<Professeur> professeurs = new ArrayList<>();
        String query = "SELECT * FROM professeur WHERE id_depart = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, idDepart);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                Professeur prof = new Professeur(
                        rs.getInt("id_prof"),
                        rs.getString("nom"),
                        rs.getString("prenom"),
                        rs.getString("cin"),
                        rs.getString("adresse"),
                        rs.getString("telephone"),
                        rs.getString("email"),
                        rs.getString("date_recrutement"),
                        rs.getInt("id_depart"));
                System.out.printf(prof.toString());
                System.out.printf("**********************");
                professeurs.add(prof);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return professeurs;
    }
}

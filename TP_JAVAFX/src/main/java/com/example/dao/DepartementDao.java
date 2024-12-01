package com.example.dao;

import com.example.entite.Departement;
import com.example.utils.SingletonConnexionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartementDao implements IDao<Departement> {

    // Connexion unique à la base de données via SingletonConnexionDB
    private Connection connection = SingletonConnexionDB.getConnection();

    /**
     * Récupère tous les départements depuis la base de données.
     * @return Liste de tous les objets Departement.
     */
    @Override
    public List<Departement> findAll() {
        List<Departement> departements = new ArrayList<>();
        String query = "SELECT * FROM departement";
        Statement st = null;
        ResultSet rs = null;

        try {
            // Création d'un Statement pour exécuter la requête SQL
            st = connection.createStatement();
            rs = st.executeQuery(query);

            // Parcourt chaque ligne du résultat pour créer des objets Departement
            while (rs.next()) {
                Departement dept = new Departement(rs.getInt("id_depart"), rs.getString("nom"));
                departements.add(dept);
                // Affiche les détails du département récupéré
                System.out.printf(dept.toString());
                System.out.printf("**********************");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return departements;
    }

    /**
     * Recherche un département par son ID.
     * @param id ID du département.
     * @return Objet Departement correspondant à l'ID.
     */
    @Override
    public Departement findById(int id) {
        Departement depart = null;
        String query = "SELECT * FROM departement WHERE id_depart = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Préparation de la requête avec un paramètre
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            // Si un résultat est trouvé, création d'un objet Departement
            if (rs.next()) {
                depart = new Departement(rs.getInt("id_depart"), rs.getString("nom"));
                System.out.printf(depart.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return depart;
    }

    /**
     * Ajoute un nouveau département dans la base de données.
     * @param dept Objet Departement à insérer.
     */
    @Override
    public void add(Departement dept) {
        String query = "INSERT INTO departement (id_depart, nom) VALUES (?, ?)";
        PreparedStatement ps = null;

        try {
            // Préparation de la requête pour insérer un département
            ps = connection.prepareStatement(query);
            ps.setInt(1, dept.getId_dept());
            ps.setString(2, dept.getNom());
            ps.executeUpdate();
            System.out.printf("Le département a été inséré dans la table avec succès.\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Met à jour les informations d'un département existant.
     * @param dept Objet Departement avec les nouvelles données.
     */
    @Override
    public void update(Departement dept) {
        String query = "UPDATE departement SET nom = ? WHERE id_depart = ?";

        try {
            // Préparation de la requête pour mettre à jour un département
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, dept.getNom());
            ps.setInt(2, dept.getId_dept());
            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.printf("Le département avec l'ID %d a été mis à jour avec succès.%n", dept.getId_dept());
            } else {
                System.out.printf("Aucun département trouvé avec l'ID %d. Mise à jour non effectuée.%n", dept.getId_dept());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Supprime un département de la base de données.
     * @param id ID du département à supprimer.
     */
    @Override
    public void delete(int id) {
        String query = "DELETE FROM departement WHERE id_depart = ?";
        PreparedStatement ps = null;

        try {
            // Préparation de la requête pour supprimer un département
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            int rowsDeleted = ps.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.printf("Le département avec l'ID %d a été supprimé avec succès.%n", id);
            } else {
                System.out.printf("Aucun département trouvé avec l'ID %d. Suppression non effectuée.%n", id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.example.dao;

import com.example.entite.Departement;
import com.example.entite.Professeur;
import com.example.utils.SingletonConnexionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartementDao implements IDao<Departement>{

    private Connection connection = SingletonConnexionDB.getConnection();
    @Override
    public List<Departement> findAll() {
        List<Departement> departements = new ArrayList<>();

        String query = "SELECT * FROM departement";
        Statement st = null;
        ResultSet rs = null;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()){
                Departement dept = new Departement(rs.getInt("id_depart"), rs.getString("nom"));
                departements.add(dept);
                System.out.printf(dept.toString());
                System.out.printf("**********************");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return departements;
    }

    @Override
    public Departement findById(int id) {

        Departement depart = null;
        String query = "SELECT * FROM departement WHERE id_depart = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()){
                depart = new Departement(rs.getInt("id_depart"), rs.getString("nom"));
                System.out.printf(depart.toString());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return depart;
    }

    @Override
    public void add(Departement dept) {
        String query = "INSERT INTO departement (id_depart, nom) VALUES (?, ?)";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, dept.getId_dept());
            ps.setString(2, dept.getNom());
            ps.executeUpdate();
            System.out.printf("Le département a été inséré dans la table avec succès.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Departement dept) {

        String query = "UPDATE departement SET nom = ? WHERE id_depart = ?";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, dept.getNom());
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Le département a été mis à jour avec succès : ");
            } else {
                System.out.println("Aucun département trouvé avec l'ID : " + dept.getId_dept());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM departement WHERE id_depart = ?";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Le département avec l'ID " + id + " a été supprimé avec succès.");
            } else {
                System.out.println("Aucun département trouvé avec l'ID : " + id);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


}

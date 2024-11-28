package com.example.utils;

import java.sql.*;

public class SingletonConnexionDB {

    private static Connection connection;

    static {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_prof", "root", "");
        }

        catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static Connection getConnection(){
        return connection;
    }
}

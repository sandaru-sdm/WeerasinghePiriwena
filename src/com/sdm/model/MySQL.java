package com.sdm.model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

public class MySQL {

    private static Connection connection;
    private static final String DATABASE;
    private static final String USERNAME;
    private static final String PASSWORD;
    private static final String PORT;

    static {
        // Read database connection details
        Map<String, String> variableMap = VariableReader.readFromNotepad(getVariablesFilePath());
        DATABASE = variableMap.get("DATABASE");
        USERNAME = variableMap.get("USERNAME");
        PASSWORD = variableMap.get("PASSWORD");
        PORT = variableMap.get("PORT");
    }

    private static String getVariablesFilePath() {
        // Use the user's home directory as the base path
        String baseDirectory = System.getProperty("user.home") + File.separator + "WeerasinghaPiriwena";

        // Create the base directory if it doesn't exist
        try {
            Files.createDirectories(Paths.get(baseDirectory));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return baseDirectory + File.separator + "variables.txt";
    }

    private static Statement createConnection() throws Exception {
        if (connection == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:" + PORT + "/" + DATABASE, USERNAME, PASSWORD);
        }
        return connection.createStatement();
    }

    public static void iud(String query) {
        try {
            createConnection().executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet search(String query) throws Exception {
        return createConnection().executeQuery(query);
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:" + PORT + "/" + DATABASE, USERNAME, PASSWORD);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static boolean testConnection() {
        try (Connection testConnection = DriverManager.getConnection("jdbc:mysql://localhost:" + PORT + "/" + DATABASE, USERNAME, PASSWORD)) {
            System.out.println("Database connection successful.");
            return true;
        } catch (Exception e) {
            System.err.println("Failed to connect to the database: " + e.getMessage());
            return false;
        }
    }
}

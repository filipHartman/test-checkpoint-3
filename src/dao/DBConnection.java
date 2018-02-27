package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection instance = null;
    private static Connection connection = null;
    private final String DBNAME = "jdbc:sqlite:lib/librarydb.db";

    private DBConnection() {
        getConnectionToDataBase();
    }

    private void getConnectionToDataBase() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(DBNAME);
        } catch (SQLException | NullPointerException e) {
            System.out.println("DB connection problem");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
    public  Connection getConnection(){
        return connection;
    }
}

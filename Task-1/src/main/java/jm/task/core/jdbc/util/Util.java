package jm.task.core.jdbc.util;

import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String USER = "postgres";
    public static final String PASSWORD = "postgres";

    private Util() {
    }
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } return connection;
    }

}


package pa_scholarhunt;

import java.sql.*;

public class Database {
    public static Connection connection = null;

    private static final String DB_HOST = "localhost";
    private static final String DB_NAME = "scholarhunt";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";

    public static Connection connect() {
        try {
            if (connection == null || connection.isClosed()) {
                String url = "jdbc:mysql://" + DB_HOST + ":3306/" + DB_NAME + "?useSSL=false&serverTimezone=UTC";
                connection = DriverManager.getConnection(url, DB_USERNAME, DB_PASSWORD);
            }
        } catch (SQLException e) {
            System.err.println("Gagal terhubung ke database: " + e.getMessage());
        }
        return connection;
    }

    public static void disconnect() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                System.err.println("Gagal memutuskan koneksi database: " + e.getMessage());
            }
        }
    }

    public static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

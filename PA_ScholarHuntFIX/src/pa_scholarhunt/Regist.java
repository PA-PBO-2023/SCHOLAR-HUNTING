package pa_scholarhunt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Regist {

    // Fungsi untuk mengecek apakah username sudah ada di database
    private static boolean isUsernameExist(String username) {
        Connection conn = Database.connect();
        String sql = "SELECT COUNT(*) FROM user WHERE username = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return rs.getInt(1) > 0; // Jika lebih dari 0 berarti username sudah ada
            }
        } catch (SQLException e) {
            System.err.println("Error saat memeriksa username: " + e.getMessage());
        }
        return false; // username belum ada
    }

    // Fungsi register yang sudah diperbarui
    public static boolean registerUser(String username, String password, String role) {
        if (isUsernameExist(username)) {
            System.out.println("Username sudah terdaftar! Silakan pilih username lain.");
            return false; // Jika username sudah ada, hentikan proses registrasi
        }

        // Lanjutkan dengan proses pendaftaran jika username belum terdaftar
        Connection conn = Database.connect();
        String sql = "INSERT INTO user (username, password, user_type) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, role);

            int rowsInserted = pstmt.executeUpdate();
            return rowsInserted > 0; // Jika berhasil memasukkan data
        } catch (SQLException e) {
            System.err.println("Gagal registrasi pengguna: " + e.getMessage());
            return false;
        }
    }
}
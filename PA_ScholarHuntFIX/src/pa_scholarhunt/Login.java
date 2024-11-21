package pa_scholarhunt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends User {

    public Login(int id, String username, String password, String role) {
        super(id, username, password, role);
    }

    public static boolean validateLogin(String username, String password, String role) {
        boolean isValid = false;

        try (Connection conn = Database.connect()) {
            PreparedStatement stmt;

            if (role.equalsIgnoreCase("Admin")) {
                stmt = conn.prepareStatement("SELECT * FROM admin WHERE username = ? AND password = ?");
            } else if (role.equalsIgnoreCase("Mahasiswa") || role.equalsIgnoreCase("Siswa")) {
                stmt = conn.prepareStatement("SELECT * FROM user WHERE username = ? AND password = ?");
            } else {
                return false;
            }

            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                isValid = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isValid;
    }

    @Override
    public boolean save() {
        return false;
    }
}
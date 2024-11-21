package pa_scholarhunt;

import java.sql.*;
import javax.swing.JOptionPane;

public class Beasiswa {
    private final int id;
    private final String nama;
    private final String kategori;
    private final String jenis;
    private final String deadline;
    private final String status;

    public Beasiswa(int id, String nama, String kategori, String jenis, String deadline, String status) {
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.jenis = jenis;
        this.deadline = deadline;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public String getJenis() {
        return jenis;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getStatus() {
        return status;
    }

    public void createBeasiswa() {
    try (Connection conn = Database.connect()) {
        String query = "INSERT INTO beasiswa (nama_beasiswa, kategori, jenis, deadline, status) " +
                       "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, getNama());
            preparedStatement.setString(2, getKategori());
            preparedStatement.setString(3, getJenis());
            preparedStatement.setString(4, getDeadline());
            preparedStatement.setString(5, getStatus());
            preparedStatement.executeUpdate();
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, 
            "Gagal menambah data! " + e.getMessage(), 
            "Error", 
            JOptionPane.ERROR_MESSAGE
        );
    }
}


    public void deleteBeasiswa() {
        try (Connection conn = Database.connect()) {
            String query = "DELETE FROM beasiswa WHERE id_beasiswa = ?";
            try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
                preparedStatement.setInt(1, getId());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            System.err.println("Gagal menghapus data! " + e.getMessage());
        }
    }

    public boolean updateBeasiswa() {
        try (Connection conn = Database.connect()) {
            String query = "UPDATE beasiswa SET nama_beasiswa = ?, kategori = ?, jenis = ?, deadline = ?, status = ? WHERE id_beasiswa = ?";
            try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
                preparedStatement.setString(1, getNama());
                preparedStatement.setString(2, getKategori());
                preparedStatement.setString(3, getJenis());
                preparedStatement.setString(4, getDeadline());
                preparedStatement.setString(5, getStatus());
                preparedStatement.setInt(6, getId());
                int rowsAffected = preparedStatement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            System.err.println("Gagal mengedit data! " + e.getMessage());
            return false;
        }
    }
}

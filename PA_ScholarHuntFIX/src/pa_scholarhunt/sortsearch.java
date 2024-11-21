/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa_scholarhunt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class sortsearch {
public DefaultTableModel getSortedData(String sortBy) {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("Nama Beasiswa");
    model.addColumn("Kategori");
    model.addColumn("Jenis");
    model.addColumn("Deadline");
    model.addColumn("Status");

    try (Connection conn = Database.connect()) {
        String query = "SELECT * FROM beasiswa ORDER BY " + sortBy;
        System.out.println("Query: " + query);
        try (var statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                model.addRow(new Object[]{
                    resultSet.getInt("id_beasiswa"),
                    resultSet.getString("nama_beasiswa"),
                    resultSet.getString("kategori"),
                    resultSet.getString("jenis"),
                    resultSet.getDate("deadline"),
                    resultSet.getString("status")
                });
            }
        }
    } catch (SQLException e) {
        System.err.println("Error during sorting: " + e.getMessage());
    }

    return model;
}

    
public DefaultTableModel getStatusData(String status) {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("Nama Beasiswa");
    model.addColumn("Kategori");
    model.addColumn("Jenis");
    model.addColumn("Deadline");
    model.addColumn("Status");

    try (Connection conn = Database.connect()) {
        String query = "SELECT * FROM beasiswa WHERE LOWER(status) = LOWER(?)";
        System.out.println("Executing query for status: " + status);
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, status);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    model.addRow(new Object[]{
                        resultSet.getInt("id_beasiswa"),
                        resultSet.getString("nama_beasiswa"),
                        resultSet.getString("kategori"),
                        resultSet.getString("jenis"),
                        resultSet.getDate("deadline"),
                        resultSet.getString("status")
                    });
                }
            }
        }
    } catch (SQLException e) {
        System.err.println("Error during status filtering: " + e.getMessage());
    }

    return model;

}

    public DefaultTableModel getSearchData(String keyword) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama Beasiswa");
        model.addColumn("Kategori");
        model.addColumn("Jenis");
        model.addColumn("Deadline");
        model.addColumn("Status");

        try (Connection conn = Database.connect()) {
            String query = "SELECT id_beasiswa, nama_beasiswa, kategori, jenis, deadline, status " +
                           "FROM beasiswa WHERE nama_beasiswa LIKE ? OR kategori LIKE ? OR jenis LIKE ? OR Status LIKE?";
            try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
                preparedStatement.setString(1, "%" + keyword + "%");
                preparedStatement.setString(2, "%" + keyword + "%");
                preparedStatement.setString(3, "%" + keyword + "%");
                preparedStatement.setString(4, "%" + keyword + "%");

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        model.addRow(new Object[]{
                            resultSet.getInt("id_beasiswa"),
                            resultSet.getString("nama_beasiswa"),
                            resultSet.getString("kategori"),
                            resultSet.getString("jenis"),
                            resultSet.getDate("deadline"),
                            resultSet.getString("status")
                        });
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error during searching: " + e.getMessage());
        }

        return model;
    }
}
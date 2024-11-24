package aplikasikontak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static final String URL = "jdbc:mysql://localhost:3306/kontak"; // Ganti nama database sesuai konfigurasi Anda
    private static final String USER = "root"; // Ganti dengan username database Anda
    private static final String PASSWORD = ""; // Ganti dengan password database Anda

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Pastikan driver JDBC sudah ditambahkan ke proyek
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver JDBC tidak ditemukan", e);
        }
    }

    // Metode main untuk testing koneksi
    public static void main(String[] args) {
        try {
            Connection connection = getConnection();
            if (connection != null) {
                System.out.println("Koneksi berhasil!");
            } else {
                System.out.println("Koneksi gagal!");
            }
        } catch (SQLException e) {
            System.out.println("Error saat koneksi ke database: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

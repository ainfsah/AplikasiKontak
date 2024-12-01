/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasikontak;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author ASUS
 */
public class Latihan3 extends javax.swing.JFrame {
    private DefaultTableModel model;
    /**
     * Creates new form Latihan3
     */
    public Latihan3() {
        initComponents();
         jTable1.setModel(new javax.swing.table.DefaultTableModel(
           new Object[][]{},
        new String[]{
          "Nama", "Nomor Telepon", "Kategori"
    }
));
         
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtNoTelp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtCari = new javax.swing.JTextField();
        btnMuatData = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnTambahKontak = new javax.swing.JButton();
        btnUbahKontak = new javax.swing.JButton();
        btnHapusKontak = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        cmbKategori = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("Nama      :");

        jLabel2.setText("No telp    :");

        jLabel3.setText("Kategori    :");

        txtNoTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoTelpActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnMuatData.setText("Muat Data");
        btnMuatData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuatDataActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambahKontak.setText("Tambah Kontak");
        btnTambahKontak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahKontakActionPerformed(evt);
            }
        });

        btnUbahKontak.setText("Ubah Kontak");
        btnUbahKontak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahKontakActionPerformed(evt);
            }
        });

        btnHapusKontak.setText("Hapus kontak");
        btnHapusKontak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusKontakActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        btnImport.setText("import ");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel4.setText("Aplikasi Kontak");

        btnReset.setText("reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "semua", "keluarga", "teman", "kerja" }));
        cmbKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKategoriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cmbKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReset)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnTambahKontak)
                                    .addGap(10, 10, 10)
                                    .addComponent(btnUbahKontak)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnHapusKontak, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCari)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnImport)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMuatData)
                        .addGap(77, 77, 77)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambahKontak)
                            .addComponent(btnUbahKontak)
                            .addComponent(btnHapusKontak)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMuatData)
                            .addComponent(btnSimpan)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnKeluar)))
                .addGap(18, 18, 18)
                .addComponent(btnImport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void muatDataKeTabel() {
    // Ambil model JTable
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    // Bersihkan data lama dari JTable
    model.setRowCount(0);
    
    try (java.sql.Connection connection = koneksi.getConnection()) {
        // Query untuk mengambil semua data dari tabel kontak
        String query = "SELECT nama, nomor_telepon, kategori FROM kontak"; // Tidak mengambil 'id' karena tidak diperlukan
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        
        // Iterasi melalui hasil query dan tambahkan ke JTable
        while (resultSet.next()) {
            Object[] row = {
                resultSet.getString("nama"),           // Kolom nama
                resultSet.getString("nomor_telepon"),  // Kolom nomor telepon
                resultSet.getString("kategori")        // Kolom kategori
            };
            model.addRow(row); // Tambahkan baris ke JTable
        }
        JOptionPane.showMessageDialog(this, "Data berhasil dimuat!");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Gagal memuat data: " + e.getMessage());
    }
}
    
    private void saveTableToCSV() {
    System.out.println("Memulai metode saveTableToCSV"); // Debug awal
    
    // Membuka dialog untuk memilih lokasi penyimpanan file CSV
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Pilih lokasi untuk menyimpan file CSV");
    fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("CSV Files", "csv"));

    int userSelection = fileChooser.showSaveDialog(null); // Ganti 'this' dengan 'null' agar dialog muncul
    System.out.println("Dialog file chooser muncul");

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToSave = fileChooser.getSelectedFile();
        System.out.println("User memilih file: " + fileToSave.getAbsolutePath());

        // Tambahkan ekstensi .csv jika tidak ada
        if (!fileToSave.getName().endsWith(".csv")) {
            fileToSave = new File(fileToSave.getAbsolutePath() + ".csv");
            System.out.println("Ekstensi .csv ditambahkan: " + fileToSave.getAbsolutePath());
        }

        try (PrintWriter writer = new PrintWriter(fileToSave)) {
            javax.swing.table.TableModel model = jTable1.getModel();
            int rowCount = model.getRowCount();
            int colCount = model.getColumnCount();

            System.out.println("Jumlah baris: " + rowCount + ", Jumlah kolom: " + colCount);

            // Tulis header tabel
            for (int col = 0; col < colCount; col++) {
                writer.print(model.getColumnName(col)); // Menulis nama kolom
                if (col < colCount - 1) {
                    writer.print(","); // Tambahkan koma jika bukan kolom terakhir
                }
            }
            writer.println(); // Pindah ke baris baru setelah header

            // Tulis data tabel
            for (int row = 0; row < rowCount; row++) {
                for (int col = 0; col < colCount; col++) {
                    Object value = model.getValueAt(row, col);
                    writer.print(value != null ? value.toString() : ""); // Null-safe
                    if (col < colCount - 1) {
                        writer.print(","); // Tambahkan koma jika bukan kolom terakhir
                    }
                }
                writer.println(); // Pindah ke baris baru setelah setiap baris data
            }

            System.out.println("Data tabel berhasil ditulis ke file CSV");
            javax.swing.JOptionPane.showMessageDialog(
                null,
                "File CSV berhasil disimpan ke " + fileToSave.getAbsolutePath()
            );
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(
                null,
                "Gagal menyimpan file CSV: " + e.getMessage()
            );
        }
    } else {
        System.out.println("User membatalkan penyimpanan");
    }
}
    
    private void btnHapusKontakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusKontakActionPerformed
        // Mendapatkan model dari JTable
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    // Mendapatkan indeks baris yang dipilih
    int selectedRow = jTable1.getSelectedRow();
    
    // Validasi jika tidak ada baris yang dipilih
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Konfirmasi penghapusan
    int confirm = JOptionPane.showConfirmDialog(this, 
        "Apakah Anda yakin ingin menghapus baris ini?", 
        "Konfirmasi Hapus", 
        JOptionPane.YES_NO_OPTION);
    
    if (confirm == JOptionPane.YES_OPTION) {
        // Hapus baris dari tabel
        model.removeRow(selectedRow);
        JOptionPane.showMessageDialog(this, "Baris berhasil dihapus.");
    }
    }//GEN-LAST:event_btnHapusKontakActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        saveTableToCSV();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambahKontakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahKontakActionPerformed
        // Ambil data dari input field
    String nama = txtNama.getText().trim();
    String nomorTelepon = txtNoTelp.getText().trim();
    String kategori = cmbKategori.getSelectedItem().toString().trim();

    // Validasi input
    if (nama.isEmpty() || nomorTelepon.isEmpty() || kategori.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Tambahkan data ke JTable
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
   
    model.addRow(new Object[]{ nama, nomorTelepon, kategori});

    // Bersihkan input field setelah menambahkan data
    txtNama.setText("");
    txtNoTelp.setText("");
    cmbKategori.setSelectedItem("");

    // Berikan notifikasi ke pengguna
    JOptionPane.showMessageDialog(this, "Kontak berhasil ditambahkan ke tabel.");

    }//GEN-LAST:event_btnTambahKontakActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
    JFileChooser fileChooser = new JFileChooser();
fileChooser.setDialogTitle("Pilih file CSV untuk diimpor");
fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("CSV Files", "csv"));
int result = fileChooser.showOpenDialog(this); // 'this' mengacu pada JFrame
if (result == JFileChooser.APPROVE_OPTION) {
    File csvFile = fileChooser.getSelectedFile(); // File yang dipilih oleh pengguna
    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        String line;
        boolean isHeader = true;

        // Query SQL untuk memasukkan data ke tabel kontak
        String sql = "INSERT INTO kontak (nama, nomor_telepon, kategori) VALUES (?, ?, ?)";

        try (Connection connection = koneksi.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false; // Lewati header
                    continue;
                }

                String[] values = line.split(","); // Asumsikan nilai dipisahkan koma
                if (values.length != 3) continue; // Lewati baris jika format salah

                // Set parameter untuk query
                preparedStatement.setString(1, values[0].trim()); // Nama
                preparedStatement.setString(2, values[1].trim()); // Nomor Telepon
                preparedStatement.setString(3, values[2].trim()); // Kategori

                preparedStatement.addBatch();
            }

            preparedStatement.executeBatch(); // Eksekusi batch untuk menyimpan data
            JOptionPane.showMessageDialog(this, "Impor CSV berhasil!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal mengimpor CSV: " + e.getMessage());
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Gagal membaca file CSV: " + e.getMessage());
    }
} else {
    JOptionPane.showMessageDialog(this, "Operasi dibatalkan.");
}
    }//GEN-LAST:event_btnImportActionPerformed

    private void btnUbahKontakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahKontakActionPerformed
       // Pastikan ada baris yang dipilih di tabel
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih kontak yang ingin diubah.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Ambil data dari input field
    String nama = txtNama.getText().trim();
    String nomorTelepon = txtNoTelp.getText().trim();
    String kategori = cmbKategori.getSelectedItem().toString().trim();

    // Validasi input
    if (nama.isEmpty() || nomorTelepon.isEmpty() || kategori.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Semua field harus diisi.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Ambil model dari tabel
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    // Update data di baris yang dipilih
    model.setValueAt(nama, selectedRow, 1); // Kolom "Nama"
    model.setValueAt(nomorTelepon, selectedRow, 2); // Kolom "Nomor Telepon"
    model.setValueAt(kategori, selectedRow, 3); // Kolom "Kategori"

    // Tampilkan pesan berhasil
    JOptionPane.showMessageDialog(this, "Data pada tabel berhasil diperbarui.");

    }//GEN-LAST:event_btnUbahKontakActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
          int response = JOptionPane.showConfirmDialog(this, "Yakin lah pian handak keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
        System.exit(0); // Keluar dari aplikasi
    }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnMuatDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuatDataActionPerformed
        muatDataKeTabel();
    }//GEN-LAST:event_btnMuatDataActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        
    String keyword = txtCari.getText().trim();
    String selectedCategory = (String) cmbKategori.getSelectedItem(); // Ambil kategori dari JComboBox

    if (keyword.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Masukkan kata kunci untuk mencari!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Ambil model JTable
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    // Bersihkan data lama dari JTable
    model.setRowCount(0);

    try (java.sql.Connection connection = koneksi.getConnection()) {
        // Query untuk mencari data berdasarkan nama, nomor telepon, atau kategori
        String query = "SELECT nama, nomor_telepon, kategori FROM kontak WHERE (nama LIKE ? OR nomor_telepon LIKE ?)";
        
        // Jika kategori dipilih, tambahkan filter kategori ke query
        if (selectedCategory != null && !selectedCategory.equals("Semua")) {
            query += " AND kategori = ?";
        }

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, "%" + keyword + "%");
        preparedStatement.setString(2, "%" + keyword + "%");

        // Jika kategori dipilih selain "Semua", tambahkan parameter kategori
        if (selectedCategory != null && !selectedCategory.equals("Semua")) {
            preparedStatement.setString(3, selectedCategory);
        }

        ResultSet resultSet = preparedStatement.executeQuery();

        // Iterasi hasil pencarian dan tambahkan ke JTable
        while (resultSet.next()) {
            Object[] row = {
                resultSet.getString("nama"),
                resultSet.getString("nomor_telepon"),
                resultSet.getString("kategori")
            };
            model.addRow(row);
        }

        // Tampilkan pesan jika tidak ada hasil
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Tidak ditemukan data dengan kata kunci: " + keyword, "Hasil Pencarian", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat mencari data: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
    }


    }//GEN-LAST:event_btnCariActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // Ambil model dari JTable
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    // Konfirmasi dari pengguna sebelum menghapus semua data
    int confirm = JOptionPane.showConfirmDialog(
        this, 
        "Apakah Anda yakin ingin menghapus semua data dari tabel?", 
        "Konfirmasi Reset", 
        JOptionPane.YES_NO_OPTION
    );

    // Jika pengguna memilih "YES", hapus semua data
    if (confirm == JOptionPane.YES_OPTION) {
        model.setRowCount(0); // Mengatur ulang jumlah baris menjadi 0, menghapus semua data dari tabel
        JOptionPane.showMessageDialog(this, "Semua data di tabel berhasil dihapus.");
    } else {
        JOptionPane.showMessageDialog(this, "Operasi dibatalkan.");
    }
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtNoTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoTelpActionPerformed
          txtNoTelp.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                String text = txtNoTelp.getText();

                // Hanya menerima angka
                if (!Character.isDigit(c)) {
                    e.consume();  // Hapus karakter non-digit
                    JOptionPane.showMessageDialog(null, "Masukkan hanya angka!", "Input Salah", JOptionPane.ERROR_MESSAGE);
                }

                // Batasi panjang input (misalnya 13 digit)
                int maxDigits = 13;  // Sesuaikan jumlah digit
                if (text.length() >= maxDigits) {
                    e.consume();  // Hentikan input jika sudah mencapai panjang maksimal
                    JOptionPane.showMessageDialog(null, "Nomor telepon tidak boleh lebih dari " + maxDigits + " digit!", "Input Salah", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    
    }//GEN-LAST:event_txtNoTelpActionPerformed

    private void cmbKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKategoriActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapusKontak;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnMuatData;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahKontak;
    private javax.swing.JButton btnUbahKontak;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoTelp;
    // End of variables declaration//GEN-END:variables

    private static class DriverManager {

        private static Connection getConnection(String jdbcmysqllocalhost3306nama_database, String username, String password) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public DriverManager() {
        }
    }

   
}

    

    

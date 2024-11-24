# Aplikasi Kontak  
Latihan 3 - **Siti Aisyah Nor Fitriani (2210010043)**  

## **Deskripsi Aplikasi**  
**Aplikasi Kontak** adalah aplikasi berbasis Java yang digunakan untuk mengelola kontak secara sederhana. Pengguna dapat menambahkan, mengedit, menghapus, mencari, dan menyimpan data kontak ke dalam file CSV atau database.  

---

## **Fitur Utama**  

1. **Tambah Kontak**  
   - Pengguna dapat menambahkan data kontak berupa **Nama**, **Nomor Telepon**, dan **Kategori**.  

2. **Ubah Kontak**  
   - Memungkinkan pengguna untuk memperbarui informasi kontak yang sudah ada di tabel.  

3. **Hapus Kontak**  
   - Pengguna dapat menghapus baris kontak tertentu dari tabel dengan konfirmasi terlebih dahulu.  

4. **Cari Kontak**  
   - Fitur pencarian untuk menemukan kontak berdasarkan **Nama** atau **Nomor Telepon**.  

5. **Muat Data**  
   - Memuat data kontak dari database ke tabel aplikasi.  

6. **Simpan ke CSV**  
   - Menyimpan data kontak dari tabel ke file CSV.  

7. **Impor CSV**  
   - Memungkinkan pengguna untuk mengimpor data kontak dari file CSV ke dalam database.  

8. **Hapus Semua Data**  
   - Menghapus seluruh data yang ada di tabel dengan konfirmasi pengguna.  

9. **Validasi Input**  
   - Nomor telepon hanya menerima input berupa angka.  
   - Semua field wajib diisi sebelum data disimpan ke tabel.  

10. **Antarmuka Sederhana**  
    - Menggunakan Java Swing dengan tampilan yang ramah pengguna.  

---

## **Cara Menggunakan Aplikasi**  

1. **Tambah Kontak**  
   - Masukkan data ke dalam input field **Nama**, **Nomor Telepon**, dan **Kategori**.  
   - Klik tombol **Tambah Kontak** untuk menambahkan data ke tabel.  

2. **Ubah Kontak**  
   - Pilih baris di tabel yang ingin diubah.  
   - Masukkan data baru di input field, lalu klik tombol **Ubah Kontak**.  

3. **Hapus Kontak**  
   - Pilih baris di tabel yang ingin dihapus.  
   - Klik tombol **Hapus Kontak**, lalu konfirmasi penghapusan.  

4. **Cari Kontak**  
   - Masukkan kata kunci di input field **Cari**.  
   - Klik tombol **Cari** untuk menampilkan hasil pencarian.  

5. **Muat Data**  
   - Klik tombol **Muat Data** untuk memuat data dari database ke tabel.  

6. **Simpan ke CSV**  
   - Klik tombol **Simpan** untuk menyimpan data tabel ke file CSV.  

7. **Impor CSV**  
   - Klik tombol **Impor**, pilih file CSV, lalu impor data ke database.  

8. **Hapus Semua Data**  
   - Klik tombol **Reset** untuk menghapus semua data dari tabel.  

9. **Keluar Aplikasi**  
   - Klik tombol **Keluar** untuk menutup aplikasi.  

---

## **Struktur Database**  

### **Tabel `kontak`**
| Kolom          | Tipe Data     | Deskripsi                |
|----------------|---------------|--------------------------|
| `id`           | INT           | Primary key, auto increment |
| `nama`         | VARCHAR(100)  | Nama kontak              |
| `nomor_telepon`| VARCHAR(20)   | Nomor telepon kontak     |
| `kategori`     | VARCHAR(50)   | Kategori kontak          |

---

## **Demo Aplikasi**
![Demo Aplikasi](img/aplikasikontak.gif)

---

## **Pembuat Aplikasi**  
- **Nama**: Siti Aisyah Nor Fitriani  
- **NIM**: 2210010043  
- **Latihan**: Tugas 3  

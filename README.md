# 📚✨APLIKASI INFORMASI BEASISWA *(SCHOLAR HUNT)*

## 👥Nama Anggota: 
- 👤Tri Rahayu Septiani (2309116004)
- 👤Athira Fahmi (2309116010)
- 👤Irene Miraj Nur Sari (2309116015)
- 👤Nazwa Tri Ananda (2309116018)
- 👤Muhammad Khairu Fadilah (2309116025)

## 📌DAFTAR ISI
+ [Activity Diagram](https://github.com/PA-PBO-2023/Beasiswa_Hunt/blob/main/README.md#activity-diagram)
+ [Diagram User](https://github.com/PA-PBO-2023/Beasiswa_Hunt/blob/main/README.md#usecase-diagram)
+ [Flowchart](https://github.com/PA-PBO-2023/Beasiswa_Hunt/blob/main/README.md#flowchart)
+ [ERD](https://github.com/PA-PBO-2023/Beasiswa_Hunt/blob/main/README.md#erd)
+ [TAMPILAN APLIKASI](https://github.com/PA-PBO-2023/Beasiswa_Hunt/blob/main/README.md#tampilan-aplikasi-beasiswa)


### 📋USECASE DIAGRAM
![image](https://github.com/user-attachments/assets/4fa5a422-f7bc-46df-8370-0943d64c008a)

Sebagai User:
* Melihat Beasiswa
* Akses daftar beasiswa lengkap dengan detail seperti nama, penyedia, dll.
* Mencari Beasiswa
* Temukan beasiswa berdasarkan kriteria spesifik seperti nama atau penyedia.
* Mengurutkan Beasiswa
* Login/Logout
* Registrasi


Sebagai Admin:
* Mengelola Data Beasiswa
* Tambahkan, perbarui, atau hapus data beasiswa dengan mudah.
* Pencarian dan Pengurutan Data
* Cari atau urutkan daftar beasiswa untuk mempermudah pengelolaan.
* Status Beasiswa
* Aktifkan atau nonaktifkan beasiswa sesuai kebutuhan.



---
### 🔄ACTIVITY DIAGRAM
#### *Diagram Admin*
![WhatsApp Image 2024-11-05 at 00 02 32 (2)](https://github.com/user-attachments/assets/5257d201-1354-4b7c-9467-436ad0deceaf)

Untuk Admin
- Login Admin: Admin dapat login untuk mengakses sistem.
- Melihat Data Beasiswa: Menampilkan informasi data beasiswa yang tersedia.
- Mencari Data Beasiswa: Mencari data beasiswa berdasarkan kriteria tertentu.
- Menambah Data Beasiswa: Menambahkan informasi beasiswa baru ke sistem.
- Memperbarui Data Beasiswa: Mengubah informasi beasiswa yang sudah ada.
- Menghapus Data Beasiswa: Menghapus data beasiswa tertentu.
- Mengubah Status Beasiswa: Mengaktifkan atau menonaktifkan status beasiswa.



#### *Diagram User*
![WhatsApp Image 2024-11-05 at 00 02 32 (3)](https://github.com/user-attachments/assets/8f99c7f0-0557-4a75-9799-0d386fb45274)

Untuk User
- Pendaftaran Akun: User dapat mendaftarkan akun baru dengan data yang valid.
- Login User: Mengakses sistem menggunakan akun yang telah terdaftar.
- Melihat Informasi Beasiswa: Menampilkan daftar beasiswa yang tersedia.
- Mencari Beasiswa: Menemukan beasiswa berdasarkan kebutuhan.
- Mengurutkan Beasiswa: Mengurutkan daftar beasiswa berdasarkan jenjang pendidikan.




---
### 📉FLOWCHART
#### *Login*
<img width="309" alt="image" src="https://github.com/user-attachments/assets/f005ef59-4724-440b-a3fc-e792437240d1">

- Login: Pengguna memasukkan username dan password untuk mengakses sistem.
- Sign Up: Pengguna dapat membuat akun baru jika belum terdaftar. Sistem memastikan username unik sebelum menyimpan data.


#### *Menu Admin*
<img width="305" alt="image" src="https://github.com/user-attachments/assets/006b2353-413a-4140-b807-5f99bdc5d285">

Admin memiliki akses penuh untuk mengelola data beasiswa melalui fitur berikut:
- Create: Menambahkan data beasiswa baru ke database.
- Read: Menampilkan data beasiswa yang tersedia.
- Update: Memperbarui informasi beasiswa yang ada.
- Delete: Menghapus data beasiswa dari sistem.
- Search: Mencari data beasiswa berdasarkan kriteria tertentu.
- Sort: Mengurutkan data beasiswa sesuai kebutuhan.


#### *Menu User*
<img width="324" alt="image" src="https://github.com/user-attachments/assets/b59bb435-1162-4488-90c6-e600251e3b2e">

- Read: Menampilkan daftar beasiswa yang tersedia.
- Search: Mencari beasiswa berdasarkan kriteria tertentu.
- Sort: Mengurutkan beasiswa berdasarkan jenjang pendidikan atau parameter lain.


### 🗂️ERD
#### *ERD Logical*

![Screenshot 2024-11-21 214404](https://github.com/user-attachments/assets/ad2d6f33-f5cf-4758-8d96-787ab2b11172)


### *ERD Relational*

![FIXXX BANGET PEBO_page-0001](https://github.com/user-attachments/assets/d95beee5-fd7a-4533-97d1-9709a23a55b7)

Database aplikasi menggunakan MySQL dan dirancang untuk:
- Menyimpan informasi pengguna (User, Mahasiswa, dan Siswa).
- Mengelola data beasiswa.
- Mendukung relasi antar entitas (Admin, Mahasiswa, Siswa, Profil dan Beasiswa).

Entitas Utama:
- USER: Data umum pengguna (admin, mahasiswa, siswa).
- ADMIN: Admin sebagai pengelola sistem.
- MAHASISWA & SISWA: Data personal masing-masing pengguna.
- BEASISWA: Informasi lengkap terkait beasiswa.
- PROFIL: Menyimpan Profil Siswa/Mahasiswa




### 🖥️Tampilan Aplikasi Beasiswa
#### *Login Sebagai Admin*



##### LOGIN
<img width="316" alt="image" src="https://github.com/user-attachments/assets/1f06c8b9-98a8-4b57-9bf7-8e4ec7ffcd45">

Admin melakukan login ke aplikasi dengan memasukkan username dan password yang telah ditentukan, serta memilih role sebagai Admin. Jika login berhasil, admin akan diarahkan ke menu admin untuk mengelola aplikasi. Namun, jika login gagal karena kesalahan username atau password, aplikasi akan menampilkan notifikasi bahwa login gagal, dan admin diminta untuk mencoba kembali.



##### CREATE
<img width="706" alt="Tangkapan Layar 2024-11-21 pukul 17 58 53" src="https://github.com/user-attachments/assets/57eae10f-ebf8-4681-b603-f25bb5c988ec">

##### UPDATE
<img width="709" alt="Tangkapan Layar 2024-11-21 pukul 18 02 37" src="https://github.com/user-attachments/assets/1a52773b-32ee-478e-beb5-befcf95e8251">

##### DELETE
<img width="700" alt="Tangkapan Layar 2024-11-21 pukul 18 06 21" src="https://github.com/user-attachments/assets/36916c86-9974-495d-9b6a-11ece4a5af25">

##### DASHBOARD ADMIN
![WhatsApp Image 2024-11-21 at 21 12 50_2204e8d6](https://github.com/user-attachments/assets/fe3796d6-8d7f-4240-84a5-7dbf8d2c14f6)

##### DATA USER
![WhatsApp Image 2024-11-21 at 21 13 17_452adb67](https://github.com/user-attachments/assets/b3bf0034-13b1-4cf9-8e9f-f2045b68d5a8)

##### LOG OUT
![button keluar admin](https://github.com/user-attachments/assets/88e33c29-7a44-4240-9836-b0cb69071b21)

Halaman Dashboard Admin dirancang untuk memudahkan pengelolaan data beasiswa. Admin dapat menambahkan dan mengelola informasi beasiswa seperti ID Beasiswa, Nama Beasiswa, Jenis, Kategori, Deadline, dan Status (Buka/Tutup). Semua data beasiswa ditampilkan dalam bentuk tabel yang rapi, lengkap dengan fitur untuk Tambah, Simpan Edit, Hapus data dan Lihat Data User kemudian LogOut.




#### *Login Sebagai User*

##### LOGIN
<img width="800" alt="Tangkapan Layar 2024-11-21 pukul 18 09 46" src="https://github.com/user-attachments/assets/f1de9508-1358-4bcb-925a-10c260b971fe">

Pengguna harus memasukkan username/email dan password yang valid. Sistem akan memverifikasi untuk memberikan akses ke fitur yang sesuai dan masuk kehalaman user.





##### BIODATA USER
<img width="711" alt="Tangkapan Layar 2024-11-21 pukul 18 25 18" src="https://github.com/user-attachments/assets/b05f3cc2-c7c9-422b-87e5-9012fb50a05c">

Halaman profil di aplikasi Scholar Hunt memungkinkan pengguna mengisi atau memperbarui data pribadi, seperti Nama, NIM/NISN, Alamat, Status, No. HP, Email, dan Tanggal Lahir (TTL).


##### ABOUT US
<img width="1190" alt="Tangkapan Layar 2024-11-21 pukul 18 29 25" src="https://github.com/user-attachments/assets/ffea5081-6ab6-41df-ba31-ec25eb9eb01b">


##### INFO BEASISWA
![WhatsApp Image 2024-11-21 at 21 35 37_55959c58](https://github.com/user-attachments/assets/289bf349-b9ff-4002-9a07-3e9d2267b2b4)

Halaman ini menyediakan informasi terkait berbagai program beasiswa yang tersedia, serta dapat melakukan searching dan sorting pada data beasiswa.

##### SORTING
![WhatsApp Image 2024-11-21 at 21 41 28_6bd2544b](https://github.com/user-attachments/assets/ebaa9a93-7fc5-4631-8ed7-a32e6888f7a3)

Pada halaman ini, pengguna bisa mensorting beasiswa menggunakan fitur sorting, dimana sorting bisa dengan nama dan ID.



##### SEARCHING!
![WhatsApp Image 2024-11-21 at 21 43 20_f1a1acbc](https://github.com/user-attachments/assets/07ed1da6-235f-484c-844e-2eba7ad5cfd4)

Pada halaman ini, pengguna bisa mencari beasiswa menggunakan fitur searching, dimana searching bisa dengan nama dll.



##### LOG OUT
![button log out user](https://github.com/user-attachments/assets/92134b59-f949-47f7-bfda-490358f51545)

Fitur Logout pada halaman ini dirancang untuk memastikan pengguna benar-benar ingin keluar dari aplikasi.




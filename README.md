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
![diagram](https://github.com/user-attachments/assets/77d6860d-0450-4ac5-a615-2b79b62bdf16)

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
![acti admin](https://github.com/user-attachments/assets/b5afa898-2550-444b-a97a-63d7dc4611fc)


Untuk Admin
- Login Admin: Admin dapat login untuk mengakses sistem.
- Melihat Data Beasiswa: Menampilkan informasi data beasiswa yang tersedia.
- Mencari Data Beasiswa: Mencari data beasiswa berdasarkan kriteria tertentu.
- Menambah Data Beasiswa: Menambahkan informasi beasiswa baru ke sistem.
- Memperbarui Data Beasiswa: Mengubah informasi beasiswa yang sudah ada.
- Menghapus Data Beasiswa: Menghapus data beasiswa tertentu.
- Mengubah Status Beasiswa: Mengaktifkan atau menonaktifkan status beasiswa.



#### *Diagram User*
![acti user](https://github.com/user-attachments/assets/2d848dd5-1772-40cd-81ca-e686f3b8aec4)



Untuk User
- Pendaftaran Akun: User dapat mendaftarkan akun baru dengan data yang valid.
- Login User: Mengakses sistem menggunakan akun yang telah terdaftar.
- Melihat Informasi Beasiswa: Menampilkan daftar beasiswa yang tersedia.
- Mencari Beasiswa: Menemukan beasiswa berdasarkan kebutuhan.
- Mengurutkan Beasiswa: Mengurutkan daftar beasiswa berdasarkan jenjang pendidikan.




---
### 📉FLOWCHART
#### *Login*
![PADBD-Login_Regist](https://github.com/user-attachments/assets/d3ed25b7-169f-46ce-b93f-a0c97c4d5721)



- Login: Pengguna memasukkan username dan password untuk mengakses sistem.
- Sign Up: Pengguna dapat membuat akun baru jika belum terdaftar. Sistem memastikan username unik sebelum menyimpan data.


#### *Menu Admin*
![PADBD-Menu Admin](https://github.com/user-attachments/assets/c27414a6-018e-46aa-96b6-1b4269dc1ce7)



Admin memiliki akses penuh untuk mengelola data beasiswa melalui fitur berikut:
- Create: Menambahkan data beasiswa baru ke database.
- Read: Menampilkan data beasiswa yang tersedia.
- Update: Memperbarui informasi beasiswa yang ada.
- Delete: Menghapus data beasiswa dari sistem.
- Search: Mencari data beasiswa berdasarkan kriteria tertentu.
- Sort: Mengurutkan data beasiswa sesuai kebutuhan.


#### *Menu User*
![PADBD-Menu Siswa_Mahasiswa](https://github.com/user-attachments/assets/67debd6c-385e-48ac-a520-81ea9c299e56)



- Read: Menampilkan daftar beasiswa yang tersedia.
- Search: Mencari beasiswa berdasarkan kriteria tertentu.
- Sort: Mengurutkan beasiswa berdasarkan jenjang pendidikan atau parameter lain.


### 🗂️ERD
#### *ERD Logical*

![Screenshot 2024-11-21 214404](https://github.com/user-attachments/assets/5d071ee2-2d9b-4327-a544-52b0fdc44469)



### *ERD Relational*

![FIXXX BANGET PEBO_page-0001](https://github.com/user-attachments/assets/4ff7d977-f5bb-477e-9eca-2c8a8f27eb84)


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
![image](https://github.com/user-attachments/assets/0c5b67c0-6d98-42d9-bdf3-1d6369d7694f)


Admin melakukan login ke aplikasi dengan memasukkan username dan password yang telah ditentukan, serta memilih role sebagai Admin. Jika login berhasil, admin akan diarahkan ke menu admin untuk mengelola aplikasi. Namun, jika login gagal karena kesalahan username atau password, aplikasi akan menampilkan notifikasi bahwa login gagal, dan admin diminta untuk mencoba kembali.



##### CREATE
![create admin](https://github.com/user-attachments/assets/9f7dd019-09b5-477e-b453-18292bf9e802)


##### UPDATE
![update](https://github.com/user-attachments/assets/46ce4467-159e-4084-b038-25de82dabbff)


##### DELETE
![delete](https://github.com/user-attachments/assets/25217a95-fc48-40be-9112-f7e6549e0483)


##### DASHBOARD ADMIN
![WhatsApp Image 2024-11-21 at 21 12 50_2204e8d6](https://github.com/user-attachments/assets/5794c0f7-3ad9-4c3e-b144-4c7b7910e35c)


##### DATA USER
![WhatsApp Image 2024-11-21 at 21 13 17_452adb67](https://github.com/user-attachments/assets/41d7f9cf-4868-4177-a836-4d57b67ec858)


##### LOG OUT
![button keluar admin](https://github.com/user-attachments/assets/512c22f4-1b80-483f-a9bc-d07092559fb1)


Halaman Dashboard Admin dirancang untuk memudahkan pengelolaan data beasiswa. Admin dapat menambahkan dan mengelola informasi beasiswa seperti ID Beasiswa, Nama Beasiswa, Jenis, Kategori, Deadline, dan Status (Buka/Tutup). Semua data beasiswa ditampilkan dalam bentuk tabel yang rapi, lengkap dengan fitur untuk Tambah, Simpan Edit, Hapus data dan Lihat Data User kemudian LogOut.




#### *Login Sebagai User*

##### LOGIN
![image](https://github.com/user-attachments/assets/d769250f-2e91-4094-9882-a94f5835db3f)


Pengguna harus memasukkan username/email dan password yang valid. Sistem akan memverifikasi untuk memberikan akses ke fitur yang sesuai dan masuk kehalaman user.





##### BIODATA USER
![WhatsApp Image 2024-11-21 at 21 34 33_acc69c5d](https://github.com/user-attachments/assets/ca1ca84c-e4aa-444a-91ae-a9742c5397fe)


Halaman profil di aplikasi Scholar Hunt memungkinkan pengguna mengisi atau memperbarui data pribadi, seperti Nama, NIM/NISN, Alamat, Status, No. HP, Email, dan Tanggal Lahir (TTL).


##### ABOUT US
![tentang](https://github.com/user-attachments/assets/f30db4a5-f123-40f3-8620-eeb78047f53f)



##### INFO BEASISWA
![WhatsApp Image 2024-11-21 at 21 35 37_55959c58](https://github.com/user-attachments/assets/071a4deb-c2fe-4357-895f-76d43b43f514)


Halaman ini menyediakan informasi terkait berbagai program beasiswa yang tersedia, serta dapat melakukan searching dan sorting pada data beasiswa.

##### SORTING
![WhatsApp Image 2024-11-21 at 21 41 28_6bd2544b](https://github.com/user-attachments/assets/27f5c646-5d81-42e6-9580-7793855633c8)


Pada halaman ini, pengguna bisa mensorting beasiswa menggunakan fitur sorting, dimana sorting bisa dengan nama dan ID.



##### SEARCHING!
![WhatsApp Image 2024-11-21 at 21 43 20_f1a1acbc](https://github.com/user-attachments/assets/751ac6fc-4722-492e-b982-e371fe8908a5)


Pada halaman ini, pengguna bisa mencari beasiswa menggunakan fitur searching, dimana searching bisa dengan nama dll.



##### LOG OUT
![button log out user](https://github.com/user-attachments/assets/aea0b9f5-37e1-48a2-a1e2-22d42a009405)


Fitur Logout pada halaman ini dirancang untuk memastikan pengguna benar-benar ingin keluar dari aplikasi.




-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 21 Nov 2024 pada 14.50
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pa_scholar_hunt`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(8) NOT NULL,
  `id_admin` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`username`, `password`, `id_admin`) VALUES
('BEamin', '0909', 'B001');

-- --------------------------------------------------------

--
-- Struktur dari tabel `beasiswa`
--

CREATE TABLE `beasiswa` (
  `id_beasiswa` int(11) NOT NULL,
  `nama_beasiswa` varchar(100) NOT NULL,
  `kategori` varchar(20) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `deadline` date NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `beasiswa`
--

INSERT INTO `beasiswa` (`id_beasiswa`, `nama_beasiswa`, `kategori`, `jenis`, `deadline`, `status`) VALUES
(1021, 'Beasiswa Kaltim', 'Mahasiswa', 'Akademik', '2025-08-08', 'Buka'),
(1022, 'Beasiswa Keren', 'Mahasiswa', 'Akademik', '2025-09-09', 'Buka'),
(1023, 'Beasiswa Juara', 'Mahasiswa', 'Akademik', '2026-02-02', 'Buka'),
(1024, 'Beasiswa Cemerlang', 'Mahasiswa', 'Prestasi', '2025-01-03', 'Buka'),
(1026, 'Beasiswa Stimulan Siswa', 'Siswa', 'Akademik', '2025-01-01', 'Buka'),
(1027, 'Beasiswa Sejahtera', 'Mahasiswa', 'Akademik', '2024-02-02', 'Tutup'),
(1029, 'Beasiswa BCA', 'Mahasiswa', 'Akademik', '2026-01-02', 'Buka'),
(1030, 'Beasiswa BI', 'Mahasiswa', 'Akademik & Prestasi', '2023-02-05', 'Tutup'),
(1031, 'Beasiswa Pertamina', 'Mahasiswa', 'Akademik', '2025-03-04', 'Buka'),
(1032, 'Beasiswa Kukar', 'Mahasiswa', 'Akademik', '2024-12-12', 'Buka'),
(1033, 'Beasiswa Balikpapan', 'Mahasiswa', 'Akademik', '2025-04-02', 'Buka');

-- --------------------------------------------------------

--
-- Struktur dari tabel `profil`
--

CREATE TABLE `profil` (
  `Nama` varchar(50) NOT NULL,
  `NIM_NISN` varchar(20) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `Status` varchar(10) NOT NULL,
  `No_Hp` varchar(15) NOT NULL,
  `Email` varchar(25) NOT NULL,
  `TTL` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `profil`
--

INSERT INTO `profil` (`Nama`, `NIM_NISN`, `Alamat`, `Status`, `No_Hp`, `Email`, `TTL`) VALUES
('athira', '2309116010', 'perjuangan 1', 'Mahasiswa', '087810423788', 'athirafh@gmail.com', '2004-12-31');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(10) NOT NULL,
  `user_type` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`user_id`, `username`, `password`, `user_type`) VALUES
(1, 'asahi', 'athira', 'Mahasiswa'),
(2, 'haruto', 'athira', 'Siswa'),
(3, 'athira', 'asahi', 'Mahasiswa'),
(4, 'nanda', 'nnda', 'Mahasiswa');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indeks untuk tabel `beasiswa`
--
ALTER TABLE `beasiswa`
  ADD PRIMARY KEY (`id_beasiswa`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `beasiswa`
--
ALTER TABLE `beasiswa`
  MODIFY `id_beasiswa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1034;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.2.1deb3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Waktu pembuatan: 31 Bulan Mei 2026 pada 06.03
-- Versi server: 8.0.45-0ubuntu0.24.04.1
-- Versi PHP: 8.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Perpustakaan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `anggota`
--

CREATE TABLE `anggota` (
  `id_member` varchar(20) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `telepon` varchar(20) DEFAULT NULL,
  `alamat` text,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data untuk tabel `anggota`
--

INSERT INTO `anggota` (`id_member`, `nama`, `email`, `telepon`, `alamat`, `password`) VALUES
('akbaesb', 'akbar', 'akbar@consulting.com', '08764743', 'JAKARTA', 'b04cb420ab9974b2abad1478f986d0854e3771f67932bf270d625cbbb693d5bb'),
('akbar123', 'akbar eko', 'akbar@gmail.com', '087758492', 'Jakarta', 'b04cb420ab9974b2abad1478f986d0854e3771f67932bf270d625cbbb693d5bb'),
('citra123', 'citra oktavia', 'citra@gmail.com', '085748929292', 'Jakarta', 'f53d6c67549567ebeee2405a052036eb8d88d7058290b8bd544afde5c2e39d42'),
('ocong123', 'Ocong', 'ocong@gmail.com', '038844993', 'JAKARTA', '721ef62263294fa9c7a54b9d85ae3bb4a75d3008ec99ca7307a94c3428e3b6c5'),
('rafli123', 'rafli Rahardian', 'rafli@gmail.com', '08674382882', 'Jakarta', 'f5ee164d256bf2e4c4c84ad65302e2f9f9c734bc69ac8164d5a9a4f327d4e523'),
('rendi123', 'rendi', 'rendi@pyki.com', '09374747', 'Jakarta', '30ddd3ae993dcfb78c32973f773e6eafa2cd503340e2f023167647775a828ba4'),
('rendi333', 'rendi', 'rendi@ip.coe', '085155139294', 'Jakarta', '40d6c35da6bdbb7b948fb722527f897e4f83814203e8e97150559a92c3593c70'),
('sasa123', 'sasa', 'sasa@gmail.com', '0938848393', 'Bogor', '5cd38f85f66bc64702320d8cb9cb702914e210fc4756e158660976cc9df664c0'),
('ucok123', 'ucok', 'ucok@gmail.com', '08349299204', 'Jakarta', '839500de870b3641c62d30d8aadfd389408926294ddec3285a4cb4baeb9a43da'),
('yudo', 'yudo polos', 'yudo@gmail.com', '0984737282', 'Bekasi', '665692fda353cf97619a1bdc990b7f6ab7963c76d28a9b49e3d8c78fecdef264');

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `id_buku` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `judul` varchar(255) NOT NULL,
  `penulis` varchar(100) NOT NULL,
  `penerbit` varchar(100) NOT NULL,
  `tahun_terbit` int NOT NULL,
  `stok` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`id_buku`, `judul`, `penulis`, `penerbit`, `tahun_terbit`, `stok`) VALUES
('0073747493', '5CM', 'rasid', 'gramedia', 2002, 10),
('12171', 'To Kill A Mockingbird', 'Harper Lee', 'PT. EPSON', 1999, 29),
('1321', 'The Great Gatsby', 'Rafly', 'EXPLORE WORLD', 1992, 22),
('3927', 'Khafka On The Shore', 'Haruki Murakami', 'Shinchosha', 2023, 12),
('4728', 'Rought It', 'Akbar Eko', 'Rey Media', 2003, 12),
('5623', 'Bising', 'Apriansyah', 'PT. SIDU', 1981, 33),
('7361', 'A Thousand Splendid Suns', 'Khaleed Hosseini', 'Riverhead Books', 2007, 8),
('9023', 'Think And Grow Rich', 'Napoleon Hill', 'The Ralston Society', 1937, 10),
('9238', 'Thousand Cranes', 'Yasunari Kawabata', 'Shinchosha', 1952, 23),
('988392', 'Marmut Merah Jambu', 'Raditya Dika', 'Gramedia', 2018, 20);

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_peminjaman`
--

CREATE TABLE `detail_peminjaman` (
  `id_detail` int NOT NULL,
  `no_transaksi` varchar(50) NOT NULL,
  `id_buku` varchar(30) NOT NULL,
  `tgl_dikembalikan` date DEFAULT NULL,
  `status` enum('pinjam','kembali') NOT NULL DEFAULT 'pinjam',
  `denda` int DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data untuk tabel `detail_peminjaman`
--

INSERT INTO `detail_peminjaman` (`id_detail`, `no_transaksi`, `id_buku`, `tgl_dikembalikan`, `status`, `denda`) VALUES
(1, 'PMJ-260529002002-783', '12171', '2026-05-29', 'kembali', 30000),
(2, 'PMJ-260529033412-029', '5623', NULL, 'pinjam', 0),
(3, 'PMJ-260529033436-093', '9238', '2026-05-29', 'kembali', 0),
(4, 'PMJ-260529033450-541', '5623', '2026-05-29', 'kembali', 20000),
(5, 'PMJ-260530115917-396', '9023', '2026-05-30', 'kembali', 0),
(6, 'PMJ-260530222332-515', '988392', NULL, 'pinjam', 0),
(7, 'PMJ-260530223617-722', '5623', '2026-05-31', 'kembali', 20000),
(8, 'PMJ-260530235344-827', '7361', NULL, 'pinjam', 0),
(9, 'PMJ-260531000734-999', '3927', NULL, 'pinjam', 0),
(10, 'PMJ-260531002623-938', '9023', NULL, 'pinjam', 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjaman`
--

CREATE TABLE `peminjaman` (
  `no_transaksi` varchar(50) NOT NULL,
  `id_member` varchar(20) NOT NULL,
  `tgl_pinjam` date NOT NULL,
  `tgl_kembali` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data untuk tabel `peminjaman`
--

INSERT INTO `peminjaman` (`no_transaksi`, `id_member`, `tgl_pinjam`, `tgl_kembali`) VALUES
('PMJ-260529002002-783', 'rendi123', '2026-05-05', '2026-05-26'),
('PMJ-260529033412-029', 'akbaesb', '2026-05-04', '2026-05-20'),
('PMJ-260529033436-093', 'rendi333', '2026-05-20', '2026-05-30'),
('PMJ-260529033450-541', 'rendi123', '2026-05-20', '2026-05-27'),
('PMJ-260530115917-396', 'rafli123', '2026-05-29', '2026-05-30'),
('PMJ-260530222332-515', 'ocong123', '2026-05-27', '2026-05-28'),
('PMJ-260530223617-722', 'rendi123', '2026-05-13', '2026-05-29'),
('PMJ-260530235344-827', 'rendi123', '2026-05-13', '2026-05-27'),
('PMJ-260531000734-999', 'yudo', '2026-05-27', '2026-05-31'),
('PMJ-260531002623-938', 'rendi123', '2026-05-31', '2026-05-12');

-- --------------------------------------------------------

--
-- Struktur dari tabel `petugas`
--

CREATE TABLE `petugas` (
  `id_petugas` varchar(20) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jabatan` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data untuk tabel `petugas`
--

INSERT INTO `petugas` (`id_petugas`, `nama`, `jabatan`, `password`, `email`) VALUES
('0001', 'admin', 'admin', '888b19a43b151683c87895f6211d9f8640f97bdc8ef32f03dbe057c8f5e56d32', 'administrator@perpusmamat.com'),
('0002', 'rey', 'resepsionis', '4fac6dbe26e823ed6edf999c63fab3507119cf3cbfb56036511aa62e258c35b4', 'rey@perpusmamat.com'),
('0003', 'ucok', 'inventaris', '446e21f212ab200933c4c9a0802e1ff0c410bbd75fca10168746fc49883096db', 'ucok@perpusmamat.com'),
('0004', 'Budi Setiwawan', 'admin', '0591b59c1bdd9acd2847a202ddd02c3f14f9b5a049a5707c3279c1e967745ed4', 'budi@perpusmamat.com');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`id_member`);

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indeks untuk tabel `detail_peminjaman`
--
ALTER TABLE `detail_peminjaman`
  ADD PRIMARY KEY (`id_detail`),
  ADD KEY `fk_detail_peminjaman` (`no_transaksi`),
  ADD KEY `fk_detail_buku` (`id_buku`);

--
-- Indeks untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`no_transaksi`),
  ADD KEY `fk_peminjaman_anggota` (`id_member`);

--
-- Indeks untuk tabel `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id_petugas`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `detail_peminjaman`
--
ALTER TABLE `detail_peminjaman`
  MODIFY `id_detail` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `detail_peminjaman`
--
ALTER TABLE `detail_peminjaman`
  ADD CONSTRAINT `fk_detail_buku` FOREIGN KEY (`id_buku`) REFERENCES `buku` (`id_buku`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_detail_peminjaman` FOREIGN KEY (`no_transaksi`) REFERENCES `peminjaman` (`no_transaksi`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `fk_peminjaman_anggota` FOREIGN KEY (`id_member`) REFERENCES `anggota` (`id_member`) ON DELETE RESTRICT ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

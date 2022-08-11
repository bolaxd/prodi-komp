-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 26 Jul 2022 pada 10.06
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `if4`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `anggota`
--

CREATE TABLE `anggota` (
  `KODE_ANGGOTA` varchar(8) NOT NULL,
  `NAMA_ANGGOTA` varchar(20) NOT NULL,
  `PRODI` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `anggota`
--

INSERT INTO `anggota` (`KODE_ANGGOTA`, `NAMA_ANGGOTA`, `PRODI`) VALUES
('A001', 'FAHRA RAGITA', 'AKUTANSI'),
('A002', 'RUDIANA', 'INFORMATIKA'),
('A003', 'GAGA', 'MANAJEMEN'),
('A004', 'DONI', 'INFORMATIKA'),
('A005', 'REED', 'MANAJEMEN');

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `kodebrg` varchar(6) NOT NULL,
  `namabarang` varchar(25) DEFAULT NULL,
  `harga` int(11) DEFAULT NULL,
  `stok` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`kodebrg`, `namabarang`, `harga`, `stok`) VALUES
('BK-001', 'Processor i7 gen 8', 65000000, 8),
('BK-002', 'Motherboard Asrock B85M P', 385000, 26),
('BK-003', 'Mouse Rexus RXM-X15', 340000, 42),
('BK-004', 'Redaxa Knock 3X', 252000, 50);

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `KODE_BUKU` varchar(8) NOT NULL,
  `KODE_PENERBIT` varchar(8) NOT NULL,
  `KODE_PENGARANG` varchar(8) NOT NULL,
  `JUDUL` varchar(20) NOT NULL,
  `HARGA` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`KODE_BUKU`, `KODE_PENERBIT`, `KODE_PENGARANG`, `JUDUL`, `HARGA`) VALUES
('BK001', 'PN002', 'PNG003', 'PEMROGRAMAN PHP', 150000),
('BK002', 'PN002', 'PNG001', 'PYHTON', 100000),
('BK003', 'PN001', 'PNG002', 'PEMROGRAMAN ANDROID', 175000),
('BK004', 'PN003', 'PNG003', 'VISUAL BASIC', 125000),
('BK005', 'PN003', 'PNG004', 'MICROSOFT EXCEL', 8000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `NIM` varchar(8) NOT NULL,
  `NAMA` varchar(30) DEFAULT NULL,
  `ALAMAT` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `mahasiswa`
--

INSERT INTO `mahasiswa` (`NIM`, `NAMA`, `ALAMAT`) VALUES
('10109001', 'RINA DEWI', 'JL.PAJAJARAN'),
('10109002', 'BUDIMAN', 'JL.KARAPITAN'),
('10109003', 'DEWI', 'JL.NANJUNG'),
('10109004', 'RIDWAN', 'JL.CIBEBER');

-- --------------------------------------------------------

--
-- Struktur dari tabel `matakuliah`
--

CREATE TABLE `matakuliah` (
  `KODEMK` varchar(6) NOT NULL,
  `NAMAMK` varchar(30) DEFAULT NULL,
  `SKS` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `matakuliah`
--

INSERT INTO `matakuliah` (`KODEMK`, `NAMAMK`, `SKS`) VALUES
('IF1001', 'ALGORITMA', '3'),
('IF1002', 'PANCASILA', '2'),
('IF1003', 'KOMPUTER IT-1', '2'),
('IF1004', 'MATEMATIKA', '3');

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjaman`
--

CREATE TABLE `peminjaman` (
  `NO` int(8) NOT NULL,
  `PEMINJAM` varchar(8) NOT NULL,
  `KODE_BUKU` varchar(8) NOT NULL,
  `TGL_PINJAM` varchar(20) NOT NULL,
  `TGL_KEMBALI` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `peminjaman`
--

INSERT INTO `peminjaman` (`NO`, `PEMINJAM`, `KODE_BUKU`, `TGL_PINJAM`, `TGL_KEMBALI`) VALUES
(1, 'A001', 'BK001', '10/07/2022', '12/07/2022'),
(2, 'A002', 'BK002', '11/07/2022', '15/07/2022'),
(3, 'A003', 'BK004', '08/07/2022', '10/07/2022'),
(4, 'A004', 'BK003', '09/07/2022', '10/07/2022'),
(5, 'A005', 'BK001', '12/07/2022', '14/07/2022'),
(6, 'A001', 'BK002', '12/07/2022', '15/07/2022');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penerbit`
--

CREATE TABLE `penerbit` (
  `KODE_PENERBIT` varchar(8) NOT NULL,
  `NAMA_PENERBIT` varchar(20) NOT NULL,
  `KOTA` varchar(20) NOT NULL,
  `TELP` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penerbit`
--

INSERT INTO `penerbit` (`KODE_PENERBIT`, `NAMA_PENERBIT`, `KOTA`, `TELP`) VALUES
('PN001', 'PT.GRAMEDIA', 'JAKARTA', '08121250120'),
('PN002', 'CV.GRAHA ILMU', 'JOGYAKARTA', '08134123456'),
('PN003', 'CV.ANDI OFFSET', 'JOGYAKARTA', '08781232323'),
('PN004', 'PT.INFORMATIKA', 'BANDUNG', '08568723232');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengarang`
--

CREATE TABLE `pengarang` (
  `KODE_PENGARANG` varchar(8) NOT NULL,
  `NAMA_PENGARANG` varchar(20) NOT NULL,
  `ALAMAT` varchar(50) NOT NULL,
  `KOTA` varchar(20) NOT NULL,
  `TELP` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pengarang`
--

INSERT INTO `pengarang` (`KODE_PENGARANG`, `NAMA_PENGARANG`, `ALAMAT`, `KOTA`, `TELP`) VALUES
('PNG001', 'ABDUL KADIR', 'JL.JERUK 78', 'SEMARANG', '081234567832'),
('PNG002', 'JOGIYANTO', 'JL.BUDI UTOMO', 'JOGYAKARTA', '085623232311'),
('PNG003', 'TARYANA SURYANA', 'JL.CIWARUGA', 'BANDUNG', '087832908499'),
('PNG004', 'BUDI PERMANA', 'JL.DAGO', 'BANDUNG', '081823233222');

-- --------------------------------------------------------

--
-- Struktur dari tabel `perwalian`
--

CREATE TABLE `perwalian` (
  `ID` int(11) NOT NULL,
  `NIM` varchar(8) DEFAULT NULL,
  `KODEMK` varchar(6) DEFAULT NULL,
  `TAHUNAKADEMIK` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `perwalian`
--

INSERT INTO `perwalian` (`ID`, `NIM`, `KODEMK`, `TAHUNAKADEMIK`) VALUES
(1, '10109001', 'IF1001', '20181'),
(2, '10109001', 'IF1002', '20181'),
(3, '10109002', 'IF1002', '20181'),
(4, '10109003', 'IF1001', '20181'),
(5, '10109004', 'IF1004', '10181');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`KODE_ANGGOTA`);

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kodebrg`);

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`KODE_BUKU`);

--
-- Indeks untuk tabel `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`NIM`);

--
-- Indeks untuk tabel `matakuliah`
--
ALTER TABLE `matakuliah`
  ADD PRIMARY KEY (`KODEMK`);

--
-- Indeks untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`NO`);

--
-- Indeks untuk tabel `penerbit`
--
ALTER TABLE `penerbit`
  ADD PRIMARY KEY (`KODE_PENERBIT`);

--
-- Indeks untuk tabel `pengarang`
--
ALTER TABLE `pengarang`
  ADD PRIMARY KEY (`KODE_PENGARANG`);

--
-- Indeks untuk tabel `perwalian`
--
ALTER TABLE `perwalian`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  MODIFY `NO` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `perwalian`
--
ALTER TABLE `perwalian`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

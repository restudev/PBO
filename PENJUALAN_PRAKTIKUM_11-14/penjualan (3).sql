-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 01, 2024 at 03:01 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penjualan`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kd_brg` char(10) NOT NULL,
  `nm_brg` char(25) DEFAULT NULL,
  `satuan` char(10) DEFAULT NULL,
  `harga_beli` double NOT NULL,
  `stok` int(5) DEFAULT NULL,
  `stok_min` int(4) NOT NULL,
  `harga_jual` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kd_brg`, `nm_brg`, `satuan`, `harga_beli`, `stok`, `stok_min`, `harga_jual`) VALUES
('0001', 'Mie', 'bungkus', 2000, 100, 10, 3000),
('0002', 'Kaos', 'lembar', 30000, 91, 10, 50000),
('0003', 'Tumbler', 'buah', 120000, 95, 10, 150000),
('0004', 'mainan', 'buah', 10000, 55, 1, 8000),
('0005', 'jeans', 'lembar', 50000, 49, 10, 80000);

-- --------------------------------------------------------

--
-- Table structure for table `beli`
--

CREATE TABLE `beli` (
  `no_beli` int(10) NOT NULL,
  `kd_sup` char(6) NOT NULL,
  `tgl_beli` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `beli`
--

INSERT INTO `beli` (`no_beli`, `kd_sup`, `tgl_beli`) VALUES
(1, 'ks2', '2024-07-02'),
(2, 'ks2', '2024-07-02'),
(3, 'ks1', '2024-07-03'),
(4, 'ks2', '2024-07-03'),
(5, 'ks3', '2024-07-03');

-- --------------------------------------------------------

--
-- Table structure for table `dbeli`
--

CREATE TABLE `dbeli` (
  `no_beli` int(10) NOT NULL,
  `kd_brg` char(6) NOT NULL,
  `harga_beli` float NOT NULL,
  `jml_beli` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dbeli`
--

INSERT INTO `dbeli` (`no_beli`, `kd_brg`, `harga_beli`, `jml_beli`) VALUES
(1, '0001', 2000, 20),
(2, '0002', 30000, 5),
(3, '0004', 10000, 5),
(4, '0003', 120000, 5),
(5, '0005', 50000, 4);

-- --------------------------------------------------------

--
-- Table structure for table `djual`
--

CREATE TABLE `djual` (
  `no_jual` int(10) NOT NULL,
  `kd_brg` char(6) NOT NULL,
  `harga_jual` float DEFAULT NULL,
  `jml_jual` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `djual`
--

INSERT INTO `djual` (`no_jual`, `kd_brg`, `harga_jual`, `jml_jual`) VALUES
(1, '0001', 3000, 7),
(2, '0002', 50000, 2),
(3, '0001', 3000, 3),
(4, '0003', 150000, 6),
(5, '0005', 80000, 5);

-- --------------------------------------------------------

--
-- Table structure for table `jual`
--

CREATE TABLE `jual` (
  `no_jual` int(10) NOT NULL,
  `kd_kons` char(6) DEFAULT NULL,
  `tgl_jual` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jual`
--

INSERT INTO `jual` (`no_jual`, `kd_kons`, `tgl_jual`) VALUES
(1, 'k1', '2024-07-02'),
(2, 'k2', '2024-07-02'),
(3, 'k3', '2024-07-03'),
(4, 'k3', '2024-07-03'),
(5, 'k4', '2024-07-03'),
(6, 'k1', '2024-06-27'),
(7, 'k2', '2024-06-27'),
(8, 'k2', '2024-07-02');

-- --------------------------------------------------------

--
-- Table structure for table `konsumen`
--

CREATE TABLE `konsumen` (
  `kd_kons` varchar(6) NOT NULL,
  `nm_kons` varchar(30) DEFAULT NULL,
  `alm_kons` varchar(50) DEFAULT NULL,
  `kota_kons` varchar(20) DEFAULT NULL,
  `kd_pos` varchar(5) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `konsumen`
--

INSERT INTO `konsumen` (`kd_kons`, `nm_kons`, `alm_kons`, `kota_kons`, `kd_pos`, `phone`, `email`) VALUES
('k1', 'Budi', 'Jl.Pangeran Sukarma', 'Semarang', '1002', '082158783230', 'budi@gmail.com'),
('k2', 'Rasyid', 'Semarang Indah', 'Semarang', '2343', '082189393741', 'rasyid@gmail.com'),
('k3', 'Hemosa', 'Genuk', 'Solo', '2453', '085391409742', 'hermosa@gmail.com'),
('k4', 'andra', 'pocowolo', 'Semarang', '67990', '082279319482', 'andraku76@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(4) NOT NULL,
  `user_id` varchar(10) NOT NULL,
  `name` varchar(30) NOT NULL,
  `password` varchar(254) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `user_id`, `name`, `password`) VALUES
(6, 'A11', 'Restu', '6ad14ba9986e3615423dfca256d04e3f');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kd_brg`);

--
-- Indexes for table `beli`
--
ALTER TABLE `beli`
  ADD PRIMARY KEY (`no_beli`);

--
-- Indexes for table `dbeli`
--
ALTER TABLE `dbeli`
  ADD PRIMARY KEY (`no_beli`,`kd_brg`);

--
-- Indexes for table `djual`
--
ALTER TABLE `djual`
  ADD PRIMARY KEY (`no_jual`,`kd_brg`);

--
-- Indexes for table `jual`
--
ALTER TABLE `jual`
  ADD PRIMARY KEY (`no_jual`);

--
-- Indexes for table `konsumen`
--
ALTER TABLE `konsumen`
  ADD PRIMARY KEY (`kd_kons`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

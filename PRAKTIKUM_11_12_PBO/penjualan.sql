-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 25, 2024 at 01:26 AM
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
  `kd_brg` char(6) NOT NULL,
  `nm_brg` varchar(30) NOT NULL,
  `satuan` varchar(10) DEFAULT NULL,
  `harga_jual` double DEFAULT NULL,
  `harga_beli` double DEFAULT NULL,
  `stok` int(4) DEFAULT NULL,
  `stok_min` int(4) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kd_brg`, `nm_brg`, `satuan`, `harga_jual`, `harga_beli`, `stok`, `stok_min`) VALUES
('B001', 'Baju', 'buah', 300000, 10, 1, 250000);

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

-- --------------------------------------------------------

--
-- Table structure for table `jual`
--

CREATE TABLE `jual` (
  `no_jual` int(10) NOT NULL,
  `kd_kons` char(6) DEFAULT NULL,
  `tgl_jual` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
('P12345', 'Restu Lestari', 'Semarang Barat', 'Semarang', '12345', '085822679076', 'restu@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kd_brg`);

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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

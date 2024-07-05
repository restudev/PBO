-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 05, 2024 at 10:04 AM
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
  `harga_jual` double DEFAULT 0,
  `harga_beli` double DEFAULT 0,
  `stok` int(5) DEFAULT NULL,
  `stok_min` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kd_brg`, `nm_brg`, `satuan`, `harga_jual`, `harga_beli`, `stok`, `stok_min`) VALUES
('B-0001', 'Spidol', 'Buah', 5000, 4000, 6, 5),
('B-0002', 'Buku', 'Buah', 10000, 9000, 2, 1),
('B-0003', 'Penggaris', 'Buah', 4000, 3000, 20, 2);

-- --------------------------------------------------------

--
-- Table structure for table `djual`
--

CREATE TABLE `djual` (
  `no_jual` varchar(10) NOT NULL,
  `kd_brg` char(6) NOT NULL,
  `harga_jual` float DEFAULT NULL,
  `jml_jual` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `djual`
--

INSERT INTO `djual` (`no_jual`, `kd_brg`, `harga_jual`, `jml_jual`) VALUES
('1', 'B-0001', 5000, 1),
('2', 'B-0002', 10000, 3),
('3', 'B-0001', 5000, 3);

-- --------------------------------------------------------

--
-- Table structure for table `jual`
--

CREATE TABLE `jual` (
  `no_jual` varchar(10) NOT NULL,
  `tgl_jual` date DEFAULT NULL,
  `kd_kons` char(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `jual`
--

INSERT INTO `jual` (`no_jual`, `tgl_jual`, `kd_kons`) VALUES
('1', '2024-07-01', '000001'),
('2', '2024-07-05', 'R11101'),
('3', '2024-07-05', 'R11101');

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `konsumen`
--

INSERT INTO `konsumen` (`kd_kons`, `nm_kons`, `alm_kons`, `kota_kons`, `kd_pos`, `phone`, `email`) VALUES
('R11101', 'Restu Lestari', 'Semarang', 'Semarang', '1234', '085822226789', 'restu@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(4) NOT NULL,
  `user_id` varchar(10) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(254) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `user_id`, `name`, `password`) VALUES
(1, 'admin', 'admin', '827ccb0eea8a706c4c34a16891f84e7b'),
(4, 'restu', 'restu', '827ccb0eea8a706c4c34a16891f84e7b');

-- --------------------------------------------------------

--
-- Stand-in structure for view `v_penjualan`
-- (See below for the actual view)
--
CREATE TABLE `v_penjualan` (
`no_jual` varchar(10)
,`tgl_jual` date
,`nm_kons` varchar(30)
,`kd_brg` char(6)
,`nm_brg` varchar(30)
,`harga_jual` float
,`jml_jual` int(4)
,`totjual` double
);

-- --------------------------------------------------------

--
-- Structure for view `v_penjualan`
--
DROP TABLE IF EXISTS `v_penjualan`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_penjualan`  AS   (select `d`.`no_jual` AS `no_jual`,`j`.`tgl_jual` AS `tgl_jual`,`k`.`nm_kons` AS `nm_kons`,`d`.`kd_brg` AS `kd_brg`,`b`.`nm_brg` AS `nm_brg`,`d`.`harga_jual` AS `harga_jual`,`d`.`jml_jual` AS `jml_jual`,`d`.`harga_jual` * `d`.`jml_jual` AS `totjual` from (((`djual` `d` join `jual` `j`) join `barang` `b`) join `konsumen` `k`) where `d`.`no_jual` = `j`.`no_jual` and `d`.`kd_brg` = `b`.`kd_brg` and `j`.`kd_kons` = `k`.`kd_kons`)  ;

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

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

/*
SQLyog Community v13.2.0 (64 bit)
MySQL - 10.4.28-MariaDB : Database - penjualan
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`penjualan` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `penjualan`;

/*Table structure for table `barang` */

DROP TABLE IF EXISTS `barang`;

CREATE TABLE `barang` (
  `kd_brg` char(6) NOT NULL,
  `nm_brg` varchar(30) NOT NULL,
  `satuan` varchar(10) DEFAULT NULL,
  `harga_jual` double DEFAULT 0,
  `harga_beli` double DEFAULT 0,
  `stok` int(5) DEFAULT NULL,
  `stok_min` int(5) DEFAULT NULL,
  PRIMARY KEY (`kd_brg`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `barang` */

insert  into `barang`(`kd_brg`,`nm_brg`,`satuan`,`harga_jual`,`harga_beli`,`stok`,`stok_min`) values 
('B-0001','Spidol','Buah',5000,4000,9,5),
('B-0002','Buku','Buah',10000,9000,5,1);

/*Table structure for table `djual` */

DROP TABLE IF EXISTS `djual`;

CREATE TABLE `djual` (
  `no_jual` varchar(10) NOT NULL,
  `kd_brg` char(6) NOT NULL,
  `harga_jual` float DEFAULT NULL,
  `jml_jual` int(4) DEFAULT NULL,
  PRIMARY KEY (`no_jual`,`kd_brg`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `djual` */

insert  into `djual`(`no_jual`,`kd_brg`,`harga_jual`,`jml_jual`) values 
('1','B-0001',5000,1);

/*Table structure for table `jual` */

DROP TABLE IF EXISTS `jual`;

CREATE TABLE `jual` (
  `no_jual` varchar(10) NOT NULL,
  `tgl_jual` date DEFAULT NULL,
  `kd_kons` char(6) DEFAULT NULL,
  PRIMARY KEY (`no_jual`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `jual` */

insert  into `jual`(`no_jual`,`tgl_jual`,`kd_kons`) values 
('1','2024-07-01','000001');

/*Table structure for table `konsumen` */

DROP TABLE IF EXISTS `konsumen`;

CREATE TABLE `konsumen` (
  `kd_kons` varchar(6) NOT NULL,
  `nm_kons` varchar(30) DEFAULT NULL,
  `alm_kons` varchar(50) DEFAULT NULL,
  `kota_kons` varchar(20) DEFAULT NULL,
  `kd_pos` varchar(5) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`kd_kons`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `konsumen` */

insert  into `konsumen`(`kd_kons`,`nm_kons`,`alm_kons`,`kota_kons`,`kd_pos`,`phone`,`email`) values 
('000001','Ghiyatsi','Sandan','Demak','50040','0888','ghiyatsi@gmail.com');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(10) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `users` */

insert  into `users`(`id`,`user_id`,`name`,`password`) values 
(1,'admin','admin','827ccb0eea8a706c4c34a16891f84e7b'),
(2,'yayas','yayas','61c965b0758b6d9316e0bb041570ba7f'),
(3,'aku','aku','26c42cfa0f21a1a2c069fdd645e78979');

/*Table structure for table `v_penjualan` */

DROP TABLE IF EXISTS `v_penjualan`;

/*!50001 DROP VIEW IF EXISTS `v_penjualan` */;
/*!50001 DROP TABLE IF EXISTS `v_penjualan` */;

/*!50001 CREATE TABLE  `v_penjualan`(
 `no_jual` varchar(10) ,
 `tgl_jual` date ,
 `nm_kons` varchar(30) ,
 `kd_brg` char(6) ,
 `nm_brg` varchar(30) ,
 `harga_jual` float ,
 `jml_jual` int(4) ,
 `totjual` double 
)*/;

/*View structure for view v_penjualan */

/*!50001 DROP TABLE IF EXISTS `v_penjualan` */;
/*!50001 DROP VIEW IF EXISTS `v_penjualan` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_penjualan` AS (select `d`.`no_jual` AS `no_jual`,`j`.`tgl_jual` AS `tgl_jual`,`k`.`nm_kons` AS `nm_kons`,`d`.`kd_brg` AS `kd_brg`,`b`.`nm_brg` AS `nm_brg`,`d`.`harga_jual` AS `harga_jual`,`d`.`jml_jual` AS `jml_jual`,`d`.`harga_jual` * `d`.`jml_jual` AS `totjual` from (((`djual` `d` join `jual` `j`) join `barang` `b`) join `konsumen` `k`) where `d`.`no_jual` = `j`.`no_jual` and `d`.`kd_brg` = `b`.`kd_brg` and `j`.`kd_kons` = `k`.`kd_kons`) */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

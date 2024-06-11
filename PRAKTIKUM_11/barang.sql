DROP TABLE IF EXISTS `barang`;

CREATE TABLE `barang` (
  `kd_brg` CHAR(6) NOT NULL,
  `nm_brg` VARCHAR(30) NOT NULL,
  `satuan` VARCHAR(10) DEFAULT NULL,
  `harga_jual` DOUBLE DEFAULT NULL,
  `harga_beli` DOUBLE DEFAULT NULL,
  `stok` INT(4) DEFAULT NULL,
  `stok_min` INT(4) DEFAULT NULL,
  PRIMARY KEY (`kd_brg`)
) ENGINE=MYISAM DEFAULT CHARSET=utf8;
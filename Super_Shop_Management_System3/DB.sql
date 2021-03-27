-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.73-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema supershop_management_system
--

CREATE DATABASE IF NOT EXISTS supershop_management_system;
USE supershop_management_system;

--
-- Definition of table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ad_user` varchar(45) DEFAULT NULL,
  `ad_password` varchar(45) DEFAULT NULL,
  `sa_name` varchar(45) DEFAULT NULL,
  `sa_branch` varchar(45) DEFAULT NULL,
  `sa_code` varchar(45) DEFAULT NULL,
  `sa_date` varchar(45) DEFAULT NULL,
  `sa_user` varchar(45) NOT NULL,
  `sa_password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=98 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` (`id`,`ad_user`,`ad_password`,`sa_name`,`sa_branch`,`sa_code`,`sa_date`,`sa_user`,`sa_password`) VALUES 
 (1,'admin','1234','Hossain','Narayanganj','H','21-03-21','hossain','1234'),
 (2,NULL,NULL,'','Dhaka','','','',''),
 (3,NULL,NULL,'Bashir','Narayanganj','BH','12-12-21','bashir','123'),
 (4,NULL,NULL,'','Dhaka','','','',''),
 (5,NULL,NULL,'','Dhaka','','','',''),
 (6,NULL,NULL,'','Dhaka','','','',''),
 (7,NULL,NULL,'hrth','Dhaka','hrh','hrh','ratul','123'),
 (8,NULL,NULL,'','Dhaka','','','',''),
 (9,NULL,NULL,'Habu','Dhaka','','','',''),
 (10,NULL,NULL,'Habu','Dhaka','hb','30-30-20','',''),
 (11,NULL,NULL,'Habu','Dhaka','hb','30-30-20','bbbbbb','123'),
 (12,NULL,NULL,'dbfdb','Dhaka','bfdb','34545','Af','234235'),
 (13,NULL,NULL,'','Dhaka','','','',''),
 (14,NULL,NULL,'','Dhaka','','','A',''),
 (15,NULL,NULL,'','Dhaka','','','a',''),
 (16,NULL,NULL,'','Dhaka','','','11',''),
 (17,NULL,NULL,'','Dhaka','','','',''),
 (18,NULL,NULL,'','Dhaka','','','A',''),
 (19,NULL,NULL,'','Dhaka','','','a',''),
 (20,NULL,NULL,'','Dhaka','','','',''),
 (21,NULL,NULL,'','Dhaka','','','',''),
 (22,NULL,NULL,'','Dhaka','','','A',''),
 (23,NULL,NULL,'','Dhaka','','','a',''),
 (24,NULL,NULL,'','Dhaka','','','',''),
 (25,NULL,NULL,'','Dhaka','','','A',''),
 (26,NULL,NULL,'','Dhaka','','','a',''),
 (27,NULL,NULL,'','Dhaka','','','',''),
 (28,NULL,NULL,'','Dhaka','','','a',''),
 (29,NULL,NULL,'','Dhaka','','','',''),
 (30,NULL,NULL,'','Dhaka','','','AADSAD',''),
 (31,NULL,NULL,'','Dhaka','','','aaaaa',''),
 (32,NULL,NULL,'dffd','Dhaka','fdg','dffd','aaaaadsfgvsd','vdfdf'),
 (33,NULL,NULL,'','Dhaka','','','',''),
 (34,NULL,NULL,'','Dhaka','','','',''),
 (35,NULL,NULL,'','Dhaka','','','a',''),
 (36,NULL,NULL,'','Dhaka','','','A',''),
 (37,NULL,NULL,'','Dhaka','','','',''),
 (38,NULL,NULL,'','Dhaka','','','',''),
 (39,NULL,NULL,'','Dhaka','','','A',''),
 (40,NULL,NULL,'','Dhaka','','','a',''),
 (41,NULL,NULL,'','Dhaka','','','',''),
 (42,NULL,NULL,'','Dhaka','','','D',''),
 (43,NULL,NULL,'','Dhaka','','','a a',''),
 (44,NULL,NULL,'','Dhaka','','','aa',''),
 (45,NULL,NULL,'','Dhaka','','','aa',''),
 (46,NULL,NULL,'','Dhaka','','','a',''),
 (47,NULL,NULL,'','Dhaka','','','asvfgvsd',''),
 (48,NULL,NULL,'','Dhaka','','','',''),
 (49,NULL,NULL,'','Dhaka','','','A',''),
 (50,NULL,NULL,'','Dhaka','','','a a',''),
 (51,NULL,NULL,'','Dhaka','','','aaa',''),
 (52,NULL,NULL,'','Dhaka','','','aaaaaa',''),
 (53,NULL,NULL,'','Dhaka','','','aaaaaacsac',''),
 (54,NULL,NULL,'','Dhaka','','','',''),
 (55,NULL,NULL,'','Dhaka','','','A',''),
 (56,NULL,NULL,'','Dhaka','','','b',''),
 (57,NULL,NULL,'','Dhaka','','','abc',''),
 (58,NULL,NULL,'','Dhaka','','','',''),
 (59,NULL,NULL,'','Dhaka','','','bcd',''),
 (60,NULL,NULL,'','Dhaka','','','zz',''),
 (61,NULL,NULL,'','Dhaka','','','A',''),
 (62,NULL,NULL,'','Dhaka','','','',''),
 (63,NULL,NULL,'','Dhaka','','','SSS',''),
 (64,NULL,NULL,'','Dhaka','','','gfsdsd',''),
 (65,NULL,NULL,'','Dhaka','','','aa',''),
 (66,NULL,NULL,'','Dhaka','','','r',''),
 (67,NULL,NULL,'','Dhaka','','','',''),
 (68,NULL,NULL,'','Dhaka','','','dsfdf',''),
 (69,NULL,NULL,'','Dhaka','','','dsfdffdsf',''),
 (70,NULL,NULL,'','Dhaka','','','dsfdffdsf','sdfds'),
 (71,NULL,NULL,'','Dhaka','','sdf','dsfdffdsf','sdfds'),
 (72,NULL,NULL,'','Dhaka','','','',''),
 (73,NULL,NULL,'','Dhaka','','','afcasdfvsda',''),
 (74,NULL,NULL,'','Dhaka','','','k',''),
 (75,NULL,NULL,'','Dhaka','','','t',''),
 (76,NULL,NULL,'','Dhaka','','','a',''),
 (77,NULL,NULL,'','Dhaka','','','ADSADSW',''),
 (78,NULL,NULL,'','Dhaka','','','A',''),
 (79,NULL,NULL,'','Dhaka','','','',''),
 (80,NULL,NULL,'','Dhaka','','','',''),
 (81,NULL,NULL,'','Dhaka','','','aswfwe',''),
 (82,NULL,NULL,'','Dhaka','','','===',''),
 (83,NULL,NULL,'','Dhaka','','','Bashir',''),
 (84,NULL,NULL,'','Dhaka','','','',''),
 (85,NULL,NULL,'','Dhaka','','','df',''),
 (86,NULL,NULL,'','Dhaka','','','dfx',''),
 (87,NULL,NULL,'','Dhaka','','','',''),
 (88,NULL,NULL,'','Dhaka','','','',''),
 (89,NULL,NULL,'','Dhaka','','','dgA',''),
 (90,NULL,NULL,'','Dhaka','','','asa',''),
 (91,NULL,NULL,'','Dhaka','','','asas',''),
 (92,NULL,NULL,'','Dhaka','','','',''),
 (93,NULL,NULL,'','Dhaka','','','',''),
 (94,NULL,NULL,'','Dhaka','','','sdfgsdsdv df',''),
 (95,NULL,NULL,'','Dhaka','','','sdfgsdsdvdf',''),
 (96,NULL,NULL,'','Dhaka','','','',''),
 (97,NULL,NULL,'','Dhaka','','','gdfgf  gvedger','');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;


--
-- Definition of table `product_entry`
--

DROP TABLE IF EXISTS `product_entry`;
CREATE TABLE `product_entry` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `barcode` varchar(45) NOT NULL,
  `product_name` varchar(45) DEFAULT NULL,
  `branch` varchar(45) DEFAULT NULL,
  `quantity` int(10) unsigned DEFAULT NULL,
  `unit_price` double DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `catagories` varchar(45) DEFAULT NULL,
  `inputer_name` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`,`barcode`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product_entry`
--

/*!40000 ALTER TABLE `product_entry` DISABLE KEYS */;
INSERT INTO `product_entry` (`id`,`barcode`,`product_name`,`branch`,`quantity`,`unit_price`,`discount`,`catagories`,`inputer_name`,`phone`,`date`) VALUES 
 (1,'123','Teer Oil','Dhaka',5,250,10,'Grocery','Bashir ','01748957005','2026-03-21');
/*!40000 ALTER TABLE `product_entry` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

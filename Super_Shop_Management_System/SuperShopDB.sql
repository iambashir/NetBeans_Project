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
  `sa_user` varchar(45) DEFAULT NULL,
  `sa_password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` (`id`,`ad_user`,`ad_password`,`sa_name`,`sa_branch`,`sa_user`,`sa_password`) VALUES 
 (1,'admin','123','Tushar','Dhaka','tushar','1234'),
 (2,NULL,NULL,'Ratul','Dhaka','ratul','123');
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
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product_entry`
--

/*!40000 ALTER TABLE `product_entry` DISABLE KEYS */;
INSERT INTO `product_entry` (`id`,`barcode`,`product_name`,`branch`,`quantity`,`unit_price`,`discount`,`catagories`,`inputer_name`,`phone`,`date`) VALUES 
 (2,'66','Ata','Dhaka',2,40,5,'Grocery','Bashir H.','683893','2021-03-27'),
 (3,'55','Chips','Narayanganj',2,30,5,'Grocery','Ahmed','767856','2021-03-27'),
 (5,'331','Moyda','Barishal',2,50,5,'Grocery','Bashir','01745635','2021-03-27'),
 (6,'145','Alu','Dhaka',34,10,2,'Grocery','Bashir','01745365363','2021-03-30'),
 (7,'23','Teer Oil','Dhaka',50,100,5,'Grocery','Bashir','01935692811','2021-03-30'),
 (8,'11','Spoon','Dhaka',500,20,0,'Machinary','Bashir','01748957005','2021-03-30'),
 (9,'111','Sweet corn','Dhaka',200,20,0,'Grocery','Bashir','01748957005','2021-03-30'),
 (10,'457','Sweet ','Dhaka',100,20,0,'Grocery','Bashir','01748957005','2021-03-30'),
 (11,'412','corn','Dhaka',100,20,0,'Grocery','Bashir','01748957005','2021-03-30'),
 (12,'713214','Date','Dhaka',234,32,3,'Grocery','Hossain','01746461','2021-03-30'),
 (13,'71','Grap','Dhaka',219,32,3,'Grocery','Hossain','01746461','2021-03-30'),
 (14,'71','Mango','Dhaka',215,32,3,'Grocery','Hossain','01746461','2021-03-30');
/*!40000 ALTER TABLE `product_entry` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_type` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`,`user_type`) VALUES 
 (1,'Admin'),
 (2,'Salesman'),
 (3,'Employee'),
 (4,'Other'),
 (5,'Employee');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

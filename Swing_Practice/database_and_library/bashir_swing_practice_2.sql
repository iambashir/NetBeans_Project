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
-- Create schema bashir_swing_practice
--

CREATE DATABASE IF NOT EXISTS bashir_swing_practice;
USE bashir_swing_practice;

--
-- Definition of table `home_login`
--

DROP TABLE IF EXISTS `home_login`;
CREATE TABLE `home_login` (
  `user_name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `age` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `home_login`
--

/*!40000 ALTER TABLE `home_login` DISABLE KEYS */;
INSERT INTO `home_login` (`user_name`,`password`,`name`,`age`) VALUES 
 ('admin','1234',NULL,NULL),
 ('bashir','123',NULL,NULL),
 ('Hasan','30','hasan','1234'),
 ('sajib','123','Sajib','27'),
 ('tamimAhmed','456','Tamim','26'),
 ('topu','1234','Topu','25');
/*!40000 ALTER TABLE `home_login` ENABLE KEYS */;


--
-- Definition of table `saving_data`
--

DROP TABLE IF EXISTS `saving_data`;
CREATE TABLE `saving_data` (
  `roll_no` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`roll_no`)
) ENGINE=InnoDB AUTO_INCREMENT=1259856 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `saving_data`
--

/*!40000 ALTER TABLE `saving_data` DISABLE KEYS */;
INSERT INTO `saving_data` (`roll_no`,`name`) VALUES 
 (1,'RAHAT'),
 (5,'Bacchu'),
 (6,''),
 (8,'Habu Mia'),
 (9,'Akkas'),
 (97,'Bakku miya'),
 (161,'Clinton'),
 (1234,'Bashir'),
 (1561,'Ratul'),
 (116156,'Hossain'),
 (1259855,'Bashir');
/*!40000 ALTER TABLE `saving_data` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

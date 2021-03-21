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
-- Create schema swings
--

CREATE DATABASE IF NOT EXISTS swings;
USE swings;

--
-- Definition of table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`id`,`code`,`name`,`salary`,`address`) VALUES 
 (1,'r15','ratul',25111,'Dhaka');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;


--
-- Definition of table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `Id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1261149 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` (`Id`,`Name`) VALUES 
 (12,'Mr. A'),
 (101,'Ratul'),
 (1261148,'Md. Mynuddin');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;


--
-- Definition of table `mobilereg`
--

DROP TABLE IF EXISTS `mobilereg`;
CREATE TABLE `mobilereg` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(45) NOT NULL,
  `model` varchar(45) DEFAULT NULL,
  `ram` int(10) unsigned DEFAULT NULL,
  `processor` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mobilereg`
--

/*!40000 ALTER TABLE `mobilereg` DISABLE KEYS */;
/*!40000 ALTER TABLE `mobilereg` ENABLE KEYS */;


--
-- Definition of table `studentregistration`
--

DROP TABLE IF EXISTS `studentregistration`;
CREATE TABLE `studentregistration` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `course` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentregistration`
--

/*!40000 ALTER TABLE `studentregistration` DISABLE KEYS */;
INSERT INTO `studentregistration` (`id`,`name`,`course`,`mobile`) VALUES 
 (1,'Md.Mynuddin','C#','1834495537'),
 (2,'Md. Sajib','Java Programming','1517835803'),
 (3,'Bashir Hossain','Web Development','01748957005'),
 (6,'Topu','Database','01748117651'),
 (7,'Tahsin','Data Analysis','01624379185'),
 (8,' Tamim',' Network Analysis','01677393661 '),
 (9,' Tuhin','C# ',' 01922023066'),
 (10,' Sulaiman',' Web Development',' 01764458438'),
 (11,' Sujan',' Java Programming',' 01727426898'),
 (12,' Alamin',' Python Programming',' 01926514076'),
 (13,' Ajom',' C#',' 01720150149'),
 (14,' Tania','Database ',' 01738083454'),
 (15,' Rashida',' Database',' 01632982091'),
 (16,' Monia','Web Development',' 01971326501');
/*!40000 ALTER TABLE `studentregistration` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

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
-- Create schema sajib
--

CREATE DATABASE IF NOT EXISTS sajib;
USE sajib;

--
-- Definition of table `employee_table`
--

DROP TABLE IF EXISTS `employee_table`;
CREATE TABLE `employee_table` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `salary` double NOT NULL,
  `address` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee_table`
--

/*!40000 ALTER TABLE `employee_table` DISABLE KEYS */;
INSERT INTO `employee_table` (`id`,`code`,`name`,`salary`,`address`) VALUES 
 (1,'123','sljsaf',1234,'null'),
 (9,'125','askajo',15420,'sadfqe'),
 (10,'2452','yjh',2452,'htg');
/*!40000 ALTER TABLE `employee_table` ENABLE KEYS */;


--
-- Definition of table `password`
--

DROP TABLE IF EXISTS `password`;
CREATE TABLE `password` (
  `Id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `UserName` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `age` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `password`
--

/*!40000 ALTER TABLE `password` DISABLE KEYS */;
INSERT INTO `password` (`Id`,`UserName`,`Password`,`age`) VALUES 
 (1,'sajib','1224758',NULL),
 (2,'sajib','12345',NULL),
 (3,'Abcd','12345',NULL),
 (4,'Ratul','12345',NULL),
 (5,'sajib','12345',NULL),
 (6,'ratul','99999',NULL),
 (7,'Topu','12345',NULL);
/*!40000 ALTER TABLE `password` ENABLE KEYS */;


--
-- Definition of table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`id`,`name`,`email`,`address`,`mobile`) VALUES 
 (1,'sajib','sajibsarif@gmil.com','Dhaka','014782'),
 (2,'Arir','student@mile.com','Dhaka','01245');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;


--
-- Definition of table `studentreg`
--

DROP TABLE IF EXISTS `studentreg`;
CREATE TABLE `studentreg` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `course` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentreg`
--

/*!40000 ALTER TABLE `studentreg` DISABLE KEYS */;
INSERT INTO `studentreg` (`id`,`name`,`course`,`mobile`) VALUES 
 (1,'sfkljoi','weirgkwerg','01235'),
 (2,'2','asdfg','asdf');
/*!40000 ALTER TABLE `studentreg` ENABLE KEYS */;


--
-- Definition of table `test`
--

DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `test`
--

/*!40000 ALTER TABLE `test` DISABLE KEYS */;
INSERT INTO `test` (`id`,`name`,`email`,`address`) VALUES 
 (1,'Md Sajib','sajibsarif@gmail.com','adsghjfguiwe'),
 (2,'sajib ','saibesarif401gmil.com','afoifif');
/*!40000 ALTER TABLE `test` ENABLE KEYS */;


--
-- Definition of table `trainee`
--

DROP TABLE IF EXISTS `trainee`;
CREATE TABLE `trainee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `model` varchar(45) DEFAULT NULL,
  `engine` varchar(45) DEFAULT NULL,
  `cc` double DEFAULT NULL,
  `gear` int(11) DEFAULT NULL,
  `code` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trainee`
--

/*!40000 ALTER TABLE `trainee` DISABLE KEYS */;
INSERT INTO `trainee` (`id`,`name`,`model`,`engine`,`cc`,`gear`,`code`) VALUES 
 (1,'hiro','dsklfj','skjsf',50000.2,154,'101');
/*!40000 ALTER TABLE `trainee` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

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
-- Definition of table `studentregistration`
--

DROP TABLE IF EXISTS `studentregistration`;
CREATE TABLE `studentregistration` (
  `Id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Course` varchar(45) NOT NULL,
  `Mobile` varchar(45) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentregistration`
--

/*!40000 ALTER TABLE `studentregistration` DISABLE KEYS */;
INSERT INTO `studentregistration` (`Id`,`Name`,`Course`,`Mobile`) VALUES 
 (2,' Md. Sajib',' C#',' 01233'),
 (3,' Md. Mynuddin',' Java',' 0182225'),
 (4,' Bashir','Database ',' 01555'),
 (5,' Topu','Java',' 55555'),
 (8,'Tamim','Programming','0145488'),
 (9,' Tuhin',' C++',' 5465465'),
 (10,' Solaiman',' Database',' 34564'),
 (11,'bashir','java','0145465'),
 (12,' Solaiman',' Database','01834495537');
/*!40000 ALTER TABLE `studentregistration` ENABLE KEYS */;


--
-- Definition of table `userregistry`
--

DROP TABLE IF EXISTS `userregistry`;
CREATE TABLE `userregistry` (
  `Id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Age` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userregistry`
--

/*!40000 ALTER TABLE `userregistry` DISABLE KEYS */;
INSERT INTO `userregistry` (`Id`,`Name`,`Password`,`Age`) VALUES 
 (1,'rrr','dffdflkdfa',NULL),
 (2,'eee','eee',NULL);
/*!40000 ALTER TABLE `userregistry` ENABLE KEYS */;


--
-- Definition of table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`,`username`,`password`) VALUES 
 (1,'ratul','12345'),
 (2,'sajib','123'),
 (3,'T0MAL','321'),
 (4,'TOMAL','345');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

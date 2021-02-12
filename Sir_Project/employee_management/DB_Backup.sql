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
-- Create schema coast_mgt
--

CREATE DATABASE IF NOT EXISTS coast_mgt;
USE coast_mgt;

--
-- Definition of table `branches`
--

DROP TABLE IF EXISTS `branches`;
CREATE TABLE `branches` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `branch_code` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `branch_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `branch_location` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_code` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_logo` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_address` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_desc` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `branches`
--

/*!40000 ALTER TABLE `branches` DISABLE KEYS */;
INSERT INTO `branches` (`id`,`created_at`,`updated_at`,`branch_code`,`branch_name`,`branch_location`,`organization_code`,`organization_name`,`organization_logo`,`organization_address`,`organization_desc`,`created_by_code`,`created_by_name`,`created_by_username`,`updated_by_code`,`updated_by_name`,`updated_by_username`) VALUES 
 (21,'2021-02-08 18:07:14','2021-02-08 18:07:14','BRANCH01','Principal Branch','Dhaka','COAST','COAST Trust','coast_trust_logo.jpg','Dhaka, Bangladesh','Start','4','Maruf','mmh3210@gmail.com','','','');
/*!40000 ALTER TABLE `branches` ENABLE KEYS */;


--
-- Definition of table `contacts`
--

DROP TABLE IF EXISTS `contacts`;
CREATE TABLE `contacts` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `first_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `last_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `job_title` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `city` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `country` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `contacts`
--

/*!40000 ALTER TABLE `contacts` DISABLE KEYS */;
INSERT INTO `contacts` (`id`,`created_at`,`updated_at`,`first_name`,`last_name`,`email`,`job_title`,`city`,`country`) VALUES 
 (2,'2020-08-28 20:12:53','2020-08-28 20:12:53','Maruf','Hasan','mmh3210@gmail.com','SE','Dhaka','Bangladesh'),
 (3,'2020-08-28 20:14:19','2020-08-28 20:14:19','Maruf','Hasan','rajputroo@protonmail.com','SE','Dhaka','Bangladesh'),
 (4,'2020-08-28 20:14:39','2020-08-28 20:14:39','Maruf','Hasan','mmh3210@gmail.com','SE','Dhaka','Bangladesh');
/*!40000 ALTER TABLE `contacts` ENABLE KEYS */;


--
-- Definition of table `departments`
--

DROP TABLE IF EXISTS `departments`;
CREATE TABLE `departments` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `department_code` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `department_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_code` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_logo` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_address` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_desc` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `departments`
--

/*!40000 ALTER TABLE `departments` DISABLE KEYS */;
INSERT INTO `departments` (`id`,`created_at`,`updated_at`,`department_code`,`department_name`,`organization_code`,`organization_name`,`organization_logo`,`organization_address`,`organization_desc`,`created_by_code`,`created_by_name`,`created_by_username`,`updated_by_code`,`updated_by_name`,`updated_by_username`) VALUES 
 (21,'2021-02-08 18:14:46','2021-02-08 18:14:46','DEPT01','Finance','COAST','COAST Trust','coast_trust_logo.jpg','Dhaka, Bangladesh','Start','4','Maruf','mmh3210@gmail.com','','','');
/*!40000 ALTER TABLE `departments` ENABLE KEYS */;


--
-- Definition of table `designations`
--

DROP TABLE IF EXISTS `designations`;
CREATE TABLE `designations` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `designation_code` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `designation_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `designation_title` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `designation_desc` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_code` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_logo` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_address` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_desc` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `designations`
--

/*!40000 ALTER TABLE `designations` DISABLE KEYS */;
INSERT INTO `designations` (`id`,`created_at`,`updated_at`,`designation_code`,`designation_name`,`designation_title`,`designation_desc`,`organization_code`,`organization_name`,`organization_logo`,`organization_address`,`organization_desc`,`created_by_code`,`created_by_name`,`created_by_username`,`updated_by_code`,`updated_by_name`,`updated_by_username`) VALUES 
 (21,'2021-02-08 18:23:12','2021-02-08 18:23:12','ED','Executive Director','Executive Director','Executive Director','COAST','COAST Trust','coast_trust_logo.jpg','Dhaka, Bangladesh','Start','4','Maruf','mmh3210@gmail.com','','','');
/*!40000 ALTER TABLE `designations` ENABLE KEYS */;


--
-- Definition of table `employees`
--

DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `employee_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `employee_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `first_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `middle_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `father_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mother_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `joining_date` date DEFAULT NULL,
  `join_date` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `join_month` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `join_year` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `religion` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nationality` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `marital_status` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `dob_date` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dob_month` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dob_year` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `remarks` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `photo_url` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `primary_contact` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `secondary_contact` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gender` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `blood_group` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `present_addr` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `parmanent_addr` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `role_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `role_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `reporting_manager_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `reporting_manager_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `designation_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `designation_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `department_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `department_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `branch_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `branch_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `organization_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `organization_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=133 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `employees`
--

/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` (`id`,`created_at`,`updated_at`,`employee_code`,`employee_name`,`first_name`,`last_name`,`middle_name`,`father_name`,`mother_name`,`joining_date`,`join_date`,`join_month`,`join_year`,`religion`,`nationality`,`marital_status`,`dob`,`dob_date`,`dob_month`,`dob_year`,`remarks`,`photo_url`,`email`,`primary_contact`,`secondary_contact`,`gender`,`blood_group`,`present_addr`,`parmanent_addr`,`role_code`,`role_name`,`reporting_manager_code`,`reporting_manager_name`,`designation_code`,`designation_name`,`department_code`,`department_name`,`branch_code`,`branch_name`,`organization_code`,`organization_name`,`created_by_code`,`created_by_name`,`created_by_username`,`updated_by_code`,`updated_by_name`,`updated_by_username`) VALUES 
 (97,'2021-02-09 06:36:57','2021-02-09 06:36:57','MRF','Muhammad Hasan','Muhammad','Hasan','Maruf',NULL,NULL,NULL,'Day','Month','Year','Islam','Bangladeshi',NULL,NULL,'Day','Month','2021',NULL,'uploads//employee/MRF.jpg','maruf.tcl@gmail.com',NULL,NULL,'Male','A RhD positive (A+)','fasedfads',NULL,'ROLE02','ROLE_TEACHER',NULL,NULL,'ED',NULL,'DEPT01',NULL,'BRANCH01',NULL,'COAST',NULL,'5','Maruf Hasan','mmh@gmail.com','','',''),
 (118,'2021-02-09 07:10:37','2021-02-09 07:10:37','1261148','Md. Mynuddin','Md.','Mynuddin',NULL,NULL,NULL,NULL,'Day','Month','Year','Islam','Bangladeshi',NULL,NULL,'Day','Month','2021',NULL,'uploads//employee/.jpeg','idbcfratul1148@gmail.com',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','MRF',NULL,'ED',NULL,'DEPT01',NULL,'BRANCH01',NULL,'COAST',NULL,'5','Maruf Hasan','mmh@gmail.com','','',''),
 (119,'2021-02-09 07:10:38','2021-02-09 07:10:38','1258749','Md Tahsin Hasan','Md Tahsin','Hasan',NULL,NULL,NULL,NULL,'Day','Month','Year','Islam','Bangladeshi',NULL,NULL,'Day','Month','2021',NULL,'uploads//employee/.jpg','tahsincou@yahoo.com',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','MRF',NULL,'ED',NULL,'DEPT01',NULL,'BRANCH01',NULL,'COAST',NULL,'5','Maruf Hasan','mmh@gmail.com','','',''),
 (121,'2021-02-09 07:11:21','2021-02-09 07:11:21',NULL,'Md. Sulaiman','Md.','Sulaiman',NULL,'Md.Shahidullah','Hazara Begum',NULL,'Day','Month','Year','Islam','Bangladeshi',NULL,NULL,'Day','Month','2021',NULL,'uploads//employee/.jpg','mdsulaiman535@gmail.com','01764458438','01764458438','Male','A RhD positive (A+)','Dhaka','Bhola','ROLE02','ROLE_TEACHER','MRF',NULL,'ED',NULL,'DEPT01',NULL,'BRANCH01',NULL,'COAST',NULL,'5','Maruf Hasan','mmh@gmail.com','','',''),
 (122,'2021-02-09 07:11:24','2021-02-09 07:11:24','1261033','Nadia Monia','Nadia','Monia','Sultana',NULL,NULL,NULL,'Day','Month','Year','Islam','Bangladeshi',NULL,NULL,'Day','Month','2021',NULL,'/employee/','adovenadia2020@gmail.com',NULL,NULL,'Female','A RhD positive (A+)','10/1 No. Nabadip Basak Lane, Luxmibazar,  Thana - Sutrapur, Dhaka - 1100.',NULL,'ROLE02','ROLE_TEACHER','MRF',NULL,'ED',NULL,'DEPT01',NULL,'BRANCH01',NULL,'COAST',NULL,'5','Maruf Hasan','mmh@gmail.com','','',''),
 (123,'2021-02-09 07:11:25','2021-02-09 07:11:25','1258675','Topu Raihan','Topu','Raihan',NULL,NULL,NULL,NULL,'Day','Month','Year','Islam','Bangladeshi',NULL,NULL,'Day','Month','2021',NULL,'uploads//employee/.jpg','topuraihan85@gmail.com',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','MRF',NULL,'ED',NULL,'DEPT01',NULL,'BRANCH01',NULL,'COAST',NULL,'5','Maruf Hasan','mmh@gmail.com','','',''),
 (124,'2021-02-09 07:11:55','2021-02-09 07:11:55','1259781','Md. Al-Amin','Md.','Al-Amin',NULL,NULL,NULL,NULL,'Day','Month','Year','Islam','Bangladeshi',NULL,NULL,'Day','Month','2021',NULL,'uploads//employee/.jpg','alamin.hossainidb@gmail.com',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','MRF',NULL,'ED',NULL,'DEPT01',NULL,'BRANCH01',NULL,'COAST',NULL,'5','Maruf Hasan','mmh@gmail.com','','',''),
 (125,'2021-02-09 07:11:58','2021-02-09 07:11:58',NULL,'Bashir Hossain','Bashir','Hossain',NULL,NULL,NULL,NULL,'Day','Month','Year','Islam','Bangladeshi',NULL,NULL,'Day','Month','2021',NULL,'uploads//employee/.jpg','bashir.rasulpur@gmail.com',NULL,NULL,'Male','A RhD positive (A+)','Rasulpur, Araihazar, Narayanganj','Rasulpur, Araihazar, Narayanganj','ROLE02','ROLE_TEACHER','MRF',NULL,'ED',NULL,'DEPT01',NULL,'BRANCH01',NULL,'COAST',NULL,'5','Maruf Hasan','mmh@gmail.com','','',''),
 (126,'2021-02-09 07:12:11','2021-02-09 07:12:11','1260926','Rasheda Akter','Rasheda','Akter',NULL,NULL,NULL,NULL,'Day','Month','Year','Islam','Bangladeshi',NULL,NULL,'Day','Month','2021',NULL,'/employee/','rashedaidb@gmail.com',NULL,NULL,'Female','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','MRF',NULL,'ED',NULL,'DEPT01',NULL,'BRANCH01',NULL,'COAST',NULL,'5','Maruf Hasan','mmh@gmail.com','','',''),
 (127,'2021-02-09 07:12:17','2021-02-09 07:12:17','1259720','Md. Khan','Md.','Khan','Sujan',NULL,NULL,NULL,'Day','Month','Year','Islam','Bangladeshi',NULL,NULL,'Day','Month','2021',NULL,'uploads//employee/.jpg','kmdsujan@gmail.com',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','MRF',NULL,'ED',NULL,'DEPT01',NULL,'BRANCH01',NULL,'COAST',NULL,'5','Maruf Hasan','mmh@gmail.com','','',''),
 (128,'2021-02-09 07:12:24','2021-02-09 07:12:24','1260183','Golam Azam','Golam','Azam','01720150149','Md.Rafiqul Islam','Mst.Anjuara Begum',NULL,'Day','Month','Year','Islam','Bangladeshi',NULL,NULL,'Day','Month','2021',NULL,'uploads//employee/.jpg','golam49azam@gmail.com','01720150149','01515660507','Male','A RhD positive (A+)','Dhaka, Badda','Rangpur, pirjong','ROLE02','ROLE_TEACHER','MRF',NULL,'ED',NULL,'DEPT01',NULL,'BRANCH01',NULL,'COAST',NULL,'5','Maruf Hasan','mmh@gmail.com','','',''),
 (129,'2021-02-09 07:12:35','2021-02-09 07:12:35','1260295','Tamim Ahmed','Tamim','Ahmed',NULL,NULL,NULL,NULL,'Day','Month','Year','Islam','Bangladeshi',NULL,NULL,'Day','Month','2021',NULL,'uploads//employee/.JPG','tamimahmedidb@gmail.com',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','MRF',NULL,'ED',NULL,'DEPT01',NULL,'BRANCH01',NULL,'COAST',NULL,'5','Maruf Hasan','mmh@gmail.com','','',''),
 (130,'2021-02-09 07:13:11','2021-02-09 07:13:11','1261354','Tania Begum','Tania','Begum',NULL,'Ismail Darzee','Sajeda Begum',NULL,'Day','Month','Year','Islam','Bangladeshi',NULL,NULL,'Day','Month','2021',NULL,'uploads//employee/.jfif','ta1261354@gimail.com','01738083454',NULL,'Female','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','MRF',NULL,'ED',NULL,'DEPT01',NULL,'BRANCH01',NULL,'COAST',NULL,'5','Maruf Hasan','mmh@gmail.com','','',''),
 (131,'2021-02-09 07:14:18','2021-02-09 07:14:18','1258941','Md. Sajib','Md.','Sajib',NULL,NULL,NULL,NULL,'Day','Month','Year','Islam','Bangladeshi',NULL,NULL,'Day','Month','2021',NULL,'uploads//employee/.jpg','sajibsarif401@gmail.com',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','MRF',NULL,'ED',NULL,'DEPT01',NULL,'BRANCH01',NULL,'COAST',NULL,'5','Maruf Hasan','mmh@gmail.com','','',''),
 (132,'2021-02-09 07:14:32','2021-02-09 07:14:32','1260295','Tamim Ahmed','Tamim','Ahmed',NULL,NULL,NULL,NULL,'Day','Month','Year','Islam','Bangladeshi',NULL,NULL,'Day','Month','2021',NULL,'uploads//employee/.JPG','tamimahmedidb@gmail.com',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','MRF',NULL,'ED',NULL,'DEPT01',NULL,'BRANCH01',NULL,'COAST',NULL,'5','Maruf Hasan','mmh@gmail.com','','','');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;


--
-- Definition of table `failed_jobs`
--

DROP TABLE IF EXISTS `failed_jobs`;
CREATE TABLE `failed_jobs` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `connection` text COLLATE utf8_unicode_ci NOT NULL,
  `queue` text COLLATE utf8_unicode_ci NOT NULL,
  `payload` longtext COLLATE utf8_unicode_ci NOT NULL,
  `exception` longtext COLLATE utf8_unicode_ci NOT NULL,
  `failed_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `failed_jobs`
--

/*!40000 ALTER TABLE `failed_jobs` DISABLE KEYS */;
/*!40000 ALTER TABLE `failed_jobs` ENABLE KEYS */;


--
-- Definition of table `locations`
--

DROP TABLE IF EXISTS `locations`;
CREATE TABLE `locations` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `employee_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `employee_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `location_date` date DEFAULT NULL,
  `location_lat` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `location_lng` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `photo_url` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `role_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `role_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `organization_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `organization_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `locations`
--

/*!40000 ALTER TABLE `locations` DISABLE KEYS */;
INSERT INTO `locations` (`id`,`created_at`,`updated_at`,`employee_code`,`employee_name`,`location_date`,`location_lat`,`location_lng`,`photo_url`,`email`,`role_code`,`role_name`,`organization_code`,`organization_name`,`created_by_code`,`created_by_name`,`created_by_username`,`updated_by_code`,`updated_by_name`,`updated_by_username`) VALUES 
 (2,'2021-02-09 07:12:16','2021-02-09 07:12:16','1261148','Md. Mynuddin','2021-02-09','23.6854922','90.3546157','uploads//employee/.jpeg','idbcfratul1148@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (3,'2021-02-09 07:12:17','2021-02-09 07:12:17','MRF','Muhammad Hasan','2021-02-09','23.5199562','90.3711047','uploads//employee/MRF.jpg','maruf.tcl@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (4,'2021-02-09 07:12:29','2021-02-09 07:12:29','1261148','Md. Mynuddin','2021-02-09','23.717832','90.4194833','uploads//employee/.jpeg','idbcfratul1148@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (5,'2021-02-09 07:12:31','2021-02-09 07:12:31','1258675','Topu Raihan','2021-02-09','23.7391736','90.3963131','uploads//employee/.jpg','topuraihan85@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (6,'2021-02-09 07:12:41','2021-02-09 07:12:41','1261148','Md. Mynuddin','2021-02-09','23.6431757','90.4143517','uploads//employee/.jpeg','idbcfratul1148@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (7,'2021-02-09 07:12:46','2021-02-09 07:12:46',NULL,'Md. Sulaiman','2021-02-09','23.7404232','90.4040911','uploads//employee/.jpg','mdsulaiman535@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (8,'2021-02-09 07:12:55','2021-02-09 07:12:55','1261148','Md. Mynuddin','2021-02-09','23.6362646','90.4501656','uploads//employee/.jpeg','idbcfratul1148@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (9,'2021-02-09 07:12:57','2021-02-09 07:12:57','1258675','Topu Raihan','2021-02-09','23.7375558','90.4024862','uploads//employee/.jpg','topuraihan85@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (10,'2021-02-09 07:12:58','2021-02-09 07:12:58','1260926','Rasheda Akter','2021-02-09','23.7382562','90.4048419','/employee/','rashedaidb@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (11,'2021-02-09 07:12:59','2021-02-09 07:12:59','1258749','Md Tahsin Hasan','2021-02-09','23.7227447','90.4117443','uploads//employee/.jpg','tahsincou@yahoo.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (12,'2021-02-09 07:13:11','2021-02-09 07:13:11','1259781','Md. Al-Amin','2021-02-09','23.7382562','90.4048419','uploads//employee/.jpg','alamin.hossainidb@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (13,'2021-02-09 07:13:13','2021-02-09 07:13:13','1261148','Md. Mynuddin','2021-02-09','23.6854922','90.3546157','uploads//employee/.jpeg','idbcfratul1148@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (14,'2021-02-09 07:13:15','2021-02-09 07:13:15',NULL,'Md. Sulaiman','2021-02-09','23.7300823','90.4078674','uploads//employee/.jpg','mdsulaiman535@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (15,'2021-02-09 07:13:39','2021-02-09 07:13:39','1258675','Topu Raihan','2021-02-09','23.7377487','90.3975859','uploads//employee/.jpg','topuraihan85@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (16,'2021-02-09 07:13:44','2021-02-09 07:13:44','MRF','Muhammad Hasan','2021-02-09','23.7392481','90.3812612','uploads//employee/MRF.jpg','maruf.tcl@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (17,'2021-02-09 07:13:45','2021-02-09 07:13:45','1258749','Md Tahsin Hasan','2021-02-09','23.7116185','90.4318625','uploads//employee/.jpg','tahsincou@yahoo.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (18,'2021-02-09 07:14:00','2021-02-09 07:14:00','1261033','Nadia Monia','2021-02-09','23.1564194','90.4646363','/employee/','adovenadia2020@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (19,'2021-02-09 07:14:03','2021-02-09 07:14:03','1258675','Topu Raihan','2021-02-09','23.7381853','90.3943654','uploads//employee/.jpg','topuraihan85@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (20,'2021-02-09 07:14:05','2021-02-09 07:14:05','1259781','Md. Al-Amin','2021-02-09','23.7341901','90.407712','uploads//employee/.jpg','alamin.hossainidb@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (21,'2021-02-09 07:14:15','2021-02-09 07:14:15','1258749','Md Tahsin Hasan','2021-02-09','23.691401','90.4794878','uploads//employee/.jpg','tahsincou@yahoo.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (22,'2021-02-09 07:14:16','2021-02-09 07:14:16',NULL,'Md. Sulaiman','2021-02-09','23.7387375','90.4068482','uploads//employee/.jpg','mdsulaiman535@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (23,'2021-02-09 07:14:35','2021-02-09 07:14:35','1261354','Tania Begum','2021-02-09','23.7712598','90.3643136','uploads//employee/.jfif','ta1261354@gimail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (24,'2021-02-09 07:14:37','2021-02-09 07:14:37','1260183','Golam Azam','2021-02-09','23.7377623,90','4046763,2979','uploads//employee/.jpg','golam49azam@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (25,'2021-02-09 07:14:41','2021-02-09 07:14:41','MRF','Muhammad Hasan','2021-02-09','23.694944','90.4879393','uploads//employee/MRF.jpg','maruf.tcl@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (26,'2021-02-09 07:14:44','2021-02-09 07:14:44','1260926','Rasheda Akter','2021-02-09','23.7608443','90.416791','/employee/','rashedaidb@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (27,'2021-02-09 07:15:05','2021-02-09 07:15:05',NULL,'Md. Sulaiman','2021-02-09','23.735487','90.4095525','uploads//employee/.jpg','mdsulaiman535@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (28,'2021-02-09 07:15:06','2021-02-09 07:15:06','1259781','Md. Al-Amin','2021-02-09','23.7251492','90.4096967','uploads//employee/.jpg','alamin.hossainidb@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (29,'2021-02-09 07:15:11','2021-02-09 07:15:11','1261033','Nadia Monia','2021-02-09','23.532283','89.2031915','/employee/','adovenadia2020@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (30,'2021-02-09 07:15:27','2021-02-09 07:15:27','1260183','Golam Azam','2021-02-09','23.7863235,90','4120027,8183','uploads//employee/.jpg','golam49azam@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (31,'2021-02-09 07:15:33','2021-02-09 07:15:33','1260926','Rasheda Akter','2021-02-09','23.7621418','90.4284171','/employee/','rashedaidb@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (32,'2021-02-09 07:15:48','2021-02-09 07:15:48','1260295','Tamim Ahmed','2021-02-09','23.7366051','90.4117014','uploads//employee/.JPG','tamimahmedidb@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (33,'2021-02-09 07:16:05','2021-02-09 07:16:05','1258675','Topu Raihan','2021-02-09','23.7367894','90.3901017','uploads//employee/.jpg','topuraihan85@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (34,'2021-02-09 07:16:07','2021-02-09 07:16:07','1259781','Md. Al-Amin','2021-02-09','23.7116185','90.4318625','uploads//employee/.jpg','alamin.hossainidb@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (35,'2021-02-09 07:16:08','2021-02-09 07:16:08','1258941','Md. Sajib','2021-02-09','23.7382562','90.4048419','uploads//employee/.jpg','sajibsarif401@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (36,'2021-02-09 07:16:15','2021-02-09 07:16:15','1261354','Tania Begum','2021-02-09','23.7836362','90.3252339','uploads//employee/.jfif','ta1261354@gimail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (37,'2021-02-09 07:16:27','2021-02-09 07:16:27','1261033','Nadia Monia','2021-02-09','23.0342758','88.8638585','/employee/','adovenadia2020@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (38,'2021-02-09 07:16:55','2021-02-09 07:16:55','1259781','Md. Al-Amin','2021-02-09','23.7116283','90.4318625','uploads//employee/.jpg','alamin.hossainidb@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (39,'2021-02-09 07:16:57','2021-02-09 07:16:57','1258941','Md. Sajib','2021-02-09','23.7227447','90.4117443','uploads//employee/.jpg','sajibsarif401@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (40,'2021-02-09 07:17:22','2021-02-09 07:17:22',NULL,'Md. Sulaiman','2021-02-09','23.7437091','90.3654169','uploads//employee/.jpg','mdsulaiman535@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (41,'2021-02-09 07:17:31','2021-02-09 07:17:31',NULL,'Md. Sulaiman','2021-02-09','23.7232898','90.4227611','uploads//employee/.jpg','mdsulaiman535@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (42,'2021-02-09 07:17:39','2021-02-09 07:17:39',NULL,'Md. Sulaiman','2021-02-09','23.7492948','90.3700467','uploads//employee/.jpg','mdsulaiman535@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (43,'2021-02-09 07:17:46','2021-02-09 07:17:46','1261033','Nadia Monia','2021-02-09','23.0569581','92.0159756','/employee/','adovenadia2020@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (44,'2021-02-09 07:17:54','2021-02-09 07:17:54','1258941','Md. Sajib','2021-02-09','23.691401','90.4794878','uploads//employee/.jpg','sajibsarif401@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (45,'2021-02-09 07:18:04','2021-02-09 07:18:04','1260295','Tamim Ahmed','2021-02-09','23.7376492','90.4044502','uploads//employee/.JPG','tamimahmedidb@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (46,'2021-02-09 07:18:46','2021-02-09 07:18:46','1258941','Md. Sajib','2021-02-09','23.6261736','90.4971098','uploads//employee/.jpg','sajibsarif401@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (47,'2021-02-09 07:18:50','2021-02-09 07:18:50','1261354','Tania Begum','2021-02-09','23.7382562','90.4048419','uploads//employee/.jfif','ta1261354@gimail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (48,'2021-02-09 07:18:54','2021-02-09 07:18:54','1260295','Tamim Ahmed','2021-02-09','23.7460217','90.3924703','uploads//employee/.JPG','tamimahmedidb@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (49,'2021-02-09 07:19:02','2021-02-09 07:19:02',NULL,'Md. Sulaiman','2021-02-09','23.7175183','90.4169135','uploads//employee/.jpg','mdsulaiman535@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (50,'2021-02-09 07:19:42','2021-02-09 07:19:42','1258941','Md. Sajib','2021-02-09','23.6291998','90.4743349','uploads//employee/.jpg','sajibsarif401@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','',''),
 (51,'2021-02-09 07:20:02','2021-02-09 07:20:02',NULL,'Md. Sulaiman','2021-02-09','23.7142105','90.4259294','uploads//employee/.jpg','mdsulaiman535@gmail.com',NULL,NULL,'COAST','COAST Trust','5','Maruf Hasan','mmh@gmail.com','','','');
/*!40000 ALTER TABLE `locations` ENABLE KEYS */;


--
-- Definition of table `migrations`
--

DROP TABLE IF EXISTS `migrations`;
CREATE TABLE `migrations` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `migration` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `batch` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `migrations`
--

/*!40000 ALTER TABLE `migrations` DISABLE KEYS */;
INSERT INTO `migrations` (`id`,`migration`,`batch`) VALUES 
 (1,'2014_10_12_000000_create_users_table',1),
 (2,'2014_10_12_100000_create_password_resets_table',1),
 (3,'2019_08_19_000000_create_failed_jobs_table',1),
 (4,'2020_08_28_192757_create_contacts_table',2),
 (5,'2020_08_30_153700_create_portal_settings_table',3),
 (6,'2020_08_30_173349_create_universities_table',4),
 (11,'2020_08_30_203316_create_sub_modules_table',5),
 (12,'2020_08_30_203514_create_pages_table',5),
 (14,'2020_08_30_214936_create_modules_table',6),
 (15,'2021_01_24_164850_create_sections_table',7),
 (16,'2021_01_24_195734_create_pages_table',8),
 (17,'2021_01_24_200445_create_pages_table',9),
 (18,'2021_01_26_042653_create_modules_table',10),
 (19,'2021_01_30_173257_create_attends_table',11);
/*!40000 ALTER TABLE `migrations` ENABLE KEYS */;


--
-- Definition of table `modules`
--

DROP TABLE IF EXISTS `modules`;
CREATE TABLE `modules` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `module_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `module_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `module_icon` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_username` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_username` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `modules`
--

/*!40000 ALTER TABLE `modules` DISABLE KEYS */;
INSERT INTO `modules` (`id`,`module_code`,`module_name`,`module_icon`,`created_by_code`,`created_by_name`,`created_by_username`,`updated_by_code`,`updated_by_name`,`updated_by_username`,`created_at`,`updated_at`) VALUES 
 (11,'MOD_NOTICE','Notice Board','icon-ios-albums','3','Maruf','mmh3210@gmail.com',' ',' ',' ',NULL,NULL),
 (13,'MOD_SELF','Module and Section','icon-desktop','3','Maruf','mmh3210@gmail.com',' ',' ',' ',NULL,NULL),
 (14,'MOD_PAGE','Page','icon-content-left','3','Maruf','mmh3210@gmail.com',' ',' ',' ',NULL,NULL),
 (15,'MOD_USER','User','icon-street-view','3','Maruf','mmh3210@gmail.com',' ',' ',' ',NULL,NULL),
 (16,'MOD_AUDIT','Audit Trail','icon-street-view','3','Maruf','mmh3210@gmail.com',' ',' ',' ',NULL,NULL),
 (21,'MOD_NOTICE','Notice','icon-social-buffer','33','Muhammad Hasan','mmh@gmail.com','','','','2021-02-02 07:04:40','2021-02-02 07:04:40'),
 (23,'MOD_PROFILE','My Profile','icon-user','33','Muhammad Hasan','mmh@gmail.com','','','','2021-02-02 07:37:55','2021-02-02 07:37:55'),
 (24,'MOD_LOCATION','Location','icon-location-arrow','4','Maruf','mmh3210@gmail.com','','','','2021-02-06 10:48:26','2021-02-06 10:48:26'),
 (28,'MOD_DESIGNATION','Designation','icon-id-card','4','Maruf','mmh3210@gmail.com','','','','2021-02-08 08:23:59','2021-02-08 08:23:59'),
 (29,'MOD_DEPARTMENT','Department','icon-home','4','Maruf','mmh3210@gmail.com','','','','2021-02-08 08:25:32','2021-02-08 08:25:32'),
 (30,'MOD_BRANCH','Branch','icon-university2','4','Maruf','mmh3210@gmail.com','','','','2021-02-08 08:25:49','2021-02-08 08:25:49'),
 (31,'MOD_EMPLOYEE','Employee','icon-user-circle','4','Maruf','mmh3210@gmail.com','','','','2021-02-08 08:26:21','2021-02-08 08:26:21'),
 (32,'MOD_ORGANIZATION','Organization','icon-university2','4','Maruf','mmh3210@gmail.com','','','','2021-02-08 17:40:35','2021-02-08 17:40:35');
/*!40000 ALTER TABLE `modules` ENABLE KEYS */;


--
-- Definition of table `notices`
--

DROP TABLE IF EXISTS `notices`;
CREATE TABLE `notices` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `notice_title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `notice_visibility` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `notice_visibility_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `notice_visibility_role_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `notice_visibility_role_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `notice_visibility_user_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `notice_visibility_user_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `posting_date` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `photo_url` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `role_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `role_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `desig` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `university_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `university_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `notice_desc` varchar(5000) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `notices`
--

/*!40000 ALTER TABLE `notices` DISABLE KEYS */;
INSERT INTO `notices` (`id`,`created_at`,`updated_at`,`notice_title`,`notice_visibility`,`notice_visibility_type`,`notice_visibility_role_code`,`notice_visibility_role_name`,`notice_visibility_user_code`,`notice_visibility_user_name`,`user_code`,`user_name`,`posting_date`,`photo_url`,`email`,`role_code`,`role_name`,`desig`,`university_code`,`university_name`,`created_by_code`,`created_by_name`,`created_by_username`,`updated_by_code`,`updated_by_name`,`updated_by_username`,`notice_desc`) VALUES 
 (8,'2021-02-06 09:49:26','2021-02-06 09:49:26','First Notice','ROLE_TEACHER',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'06-02-2021','uploads//teacher/1207557.jpg','maruf.tcl@gmail.com','ROLE02','ROLE_TEACHER','Faculty','IDB','IsDB-BISEW','156','Maruf Hasan','maruf.tcl@gmail.com','','','','Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.'),
 (9,'2021-02-06 09:49:55','2021-02-06 09:49:55','Second Notice','ROLE_TEACHER',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'06-02-2021','uploads//teacher/1207557.jpg','maruf.tcl@gmail.com','ROLE02','ROLE_TEACHER','Faculty','IDB','IsDB-BISEW','156','Maruf Hasan','maruf.tcl@gmail.com','','','','Odio morbi quis commodo odio aenean sed adipiscing. Maecenas accumsan lacus vel facilisis volutpat est velit egestas dui. Id consectetur purus ut faucibus pulvinar elementum. Convallis convallis tellus id interdum. Erat pellentesque adipiscing commodo elit at. Non odio euismod lacinia at quis risus sed vulputate. Suspendisse potenti nullam ac tortor vitae. Id consectetur purus ut faucibus pulvinar elementum. Purus faucibus ornare suspendisse sed nisi lacus sed viverra. Duis at consectetur lorem donec massa sapien. Feugiat nisl pretium fusce id velit ut. Et pharetra pharetra massa massa ultricies mi quis hendrerit. Dui accumsan sit amet nulla.'),
 (10,'2021-02-06 09:50:09','2021-02-06 09:50:09','Third Notice','ROLE_STUDENT',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'06-02-2021','uploads//teacher/1207557.jpg','maruf.tcl@gmail.com','ROLE02','ROLE_TEACHER','Faculty','IDB','IsDB-BISEW','156','Maruf Hasan','maruf.tcl@gmail.com','','','','Magna etiam tempor orci eu lobortis elementum nibh tellus. Nunc scelerisque viverra mauris in aliquam sem. Est sit amet facilisis magna. Venenatis cras sed felis eget velit aliquet sagittis. Feugiat scelerisque varius morbi enim. Congue quisque egestas diam in arcu. Aliquam sem fringilla ut morbi tincidunt augue interdum velit. Porta non pulvinar neque laoreet suspendisse interdum consectetur libero id. Ridiculus mus mauris vitae ultricies leo. Vulputate ut pharetra sit amet aliquam id. Sit amet mattis vulputate enim nulla aliquet porttitor. Posuere morbi leo urna molestie at. Interdum velit laoreet id donec ultrices tincidunt arcu non sodales. Sed enim ut sem viverra aliquet. Arcu dictum varius duis at consectetur lorem donec. Adipiscing enim eu turpis egestas pretium aenean. Sed elementum tempus egestas sed sed risus pretium. Morbi tincidunt ornare massa eget egestas. Malesuada bibendum arcu vitae elementum curabitur vitae. Urna cursus eget nunc scelerisque viverra.');
/*!40000 ALTER TABLE `notices` ENABLE KEYS */;


--
-- Definition of table `organizations`
--

DROP TABLE IF EXISTS `organizations`;
CREATE TABLE `organizations` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `organization_code` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_logo` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_address` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `organization_desc` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `organizations`
--

/*!40000 ALTER TABLE `organizations` DISABLE KEYS */;
INSERT INTO `organizations` (`id`,`created_at`,`updated_at`,`organization_code`,`organization_name`,`organization_logo`,`organization_address`,`organization_desc`,`created_by_code`,`created_by_name`,`created_by_username`,`updated_by_code`,`updated_by_name`,`updated_by_username`) VALUES 
 (20,'2021-02-08 17:55:25','2021-02-08 17:55:25','COAST','COAST Trust','coast_trust_logo.jpg','Dhaka, Bangladesh','Start','4','Maruf','mmh3210@gmail.com','','','');
/*!40000 ALTER TABLE `organizations` ENABLE KEYS */;


--
-- Definition of table `pages`
--

DROP TABLE IF EXISTS `pages`;
CREATE TABLE `pages` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `page_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_icon` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_link` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_status` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_op_role` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_op_mode` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `section_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `section_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `module_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `module_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_super_enabled` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_fav_enabled` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_otp_enabled` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_desc` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `section_icon` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `module_icon` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `pages`
--

/*!40000 ALTER TABLE `pages` DISABLE KEYS */;
INSERT INTO `pages` (`id`,`created_at`,`updated_at`,`page_code`,`page_name`,`page_icon`,`page_type`,`page_link`,`page_status`,`page_op_role`,`page_op_mode`,`section_code`,`section_name`,`module_code`,`module_name`,`page_super_enabled`,`page_fav_enabled`,`page_otp_enabled`,`page_desc`,`created_by_code`,`created_by_name`,`created_by_username`,`updated_by_code`,`updated_by_name`,`updated_by_username`,`section_icon`,`module_icon`) VALUES 
 (10,'2021-01-26 22:18:22','2021-01-26 22:18:22','PageController_CREATE','Create page','icon-plus-square','Entity','page/create','Active','ROLE_ADMIN','CREATE','SEC_PAGE_DB','Page Database','MOD_PAGE','Page','on','on','on',NULL,'3','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-wpforms'),
 (11,'2021-01-26 22:19:25','2021-01-26 22:19:25','ModuleController_CREATE','Create Module','icon-plus-square','Entity','module/create','Active','ROLE_ADMIN','CREATE','SEC_MODULE_DB','Module Database','MOD_SELF','Module','on','on',NULL,NULL,'3','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-desktop'),
 (12,'2021-01-26 22:20:09','2021-01-26 22:20:09','SectionController_CREATE','Create Section','icon-plus-square','Entity','section/create','Active','ROLE_ADMIN','CREATE','SEC_SECTION_DB','Section Database','MOD_SELF','Module','on','on',NULL,NULL,'3','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-th'),
 (38,'2021-02-02 07:28:05','2021-02-02 07:28:05','NoticeController_CREATE','Create Notice','icon-plus-square','Entity','notice/create','Active','ROLE_ADMIN','CREATE','SEC_NOTICE_DB','Notice Database','MOD_NOTICE','Notice','on','on',NULL,NULL,'33','Muhammad Hasan','mmh@gmail.com','','','','icon-database2','icon-ios-albums'),
 (39,'2021-02-02 07:28:52','2021-02-02 07:28:52','NoticeController_MANAGE','Manage Notice','icon-newspaper-o','Entity','notice/manage','Active','ROLE_ADMIN','MANAGE','SEC_NOTICE_DB','Notice Database','MOD_NOTICE','Notice','on','on',NULL,NULL,'33','Muhammad Hasan','mmh@gmail.com','','','','icon-database2','icon-ios-albums'),
 (52,'2021-02-06 10:49:56','2021-02-06 10:49:56','LocationController_MANAGE','Manage Location','icon-plus-square','Entity','location/manage','Active','ROLE_ADMIN','MANAGE','SEC_LOCATION_DB','Location Database','MOD_LOCATION','Location','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-location-arrow'),
 (53,'2021-02-08 08:28:07','2021-02-08 08:28:07','DesignationController_CREATE','Create Designation','icon-plus-square','Entity','designation/create','Active','ROLE_ADMIN','CREATE','SEC_DESIGNATION_DB','Designation Database','MOD_DESIGNATION','Designation','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-book'),
 (54,'2021-02-08 08:28:30','2021-02-08 08:28:30','DepartmentController_CREATE','Create Department','icon-plus-square','Entity','department/create','Active','ROLE_ADMIN','CREATE','SEC_DEPARTMENT_DB','Department Database','MOD_DEPARTMENT','Department','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-home'),
 (55,'2021-02-08 08:28:56','2021-02-08 08:28:56','BranchController_CREATE','Create Branch','icon-plus-square','Entity','branch/create','Active','ROLE_ADMIN','CREATE','SEC_BRANCH_DB','Branch Database','MOD_BRANCH','Branch','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2'),
 (56,'2021-02-08 08:29:16','2021-02-08 08:29:16','EmployeeController_CREATE','Create Employee','icon-plus-square','Entity','employee/create','Active','ROLE_ADMIN','CREATE','SEC_EMPLOYEE_DB','Employee Database','MOD_EMPLOYEE','Employee','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-child'),
 (57,'2021-02-08 17:42:06','2021-02-08 17:42:06','OrganizationController_CREATE','Create Organization','icon-plus-square','Entity','organization/create','Active','ROLE_ADMIN','CREATE','SEC_ORGANIZATION_DB','Organization Database','MOD_ORGANIZATION','Organization','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2'),
 (58,'2021-02-08 19:10:16','2021-02-08 19:10:16','EmployeeController_MANAGE','Manage Employees','icon-university2','Entity','employee/manage','Active','ROLE_ADMIN','MANAGE','SEC_EMPLOYEE_DB','Employee Database','MOD_EMPLOYEE','Employee','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-child'),
 (59,'2021-02-09 06:10:59','2021-02-09 06:10:59','LocationController_CREATE','Create Location','icon-plus-square','Entity','location/create','Active','ROLE_ADMIN','CREATE','SEC_LOCATION_DB','Location Database','MOD_LOCATION','Location','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-location-arrow');
/*!40000 ALTER TABLE `pages` ENABLE KEYS */;


--
-- Definition of table `password_resets`
--

DROP TABLE IF EXISTS `password_resets`;
CREATE TABLE `password_resets` (
  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `token` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  KEY `password_resets_email_index` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `password_resets`
--

/*!40000 ALTER TABLE `password_resets` DISABLE KEYS */;
INSERT INTO `password_resets` (`email`,`token`,`created_at`) VALUES 
 ('mmh3210@gmail.com','$2y$10$J7W0wUKsvoeVJftu1v0jxeg0Cqg/rnbPhVF78E/JEeDLuHH3HQZrm','2020-08-28 21:49:32');
/*!40000 ALTER TABLE `password_resets` ENABLE KEYS */;


--
-- Definition of table `portal_settings`
--

DROP TABLE IF EXISTS `portal_settings`;
CREATE TABLE `portal_settings` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `kickstart` tinyint(1) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `portal_settings`
--

/*!40000 ALTER TABLE `portal_settings` DISABLE KEYS */;
INSERT INTO `portal_settings` (`id`,`kickstart`,`created_at`,`updated_at`) VALUES 
 (11,0,'2020-08-31 17:10:27','2020-08-31 17:10:27'),
 (12,1,'2021-01-12 17:55:48','2021-01-12 17:55:48'),
 (13,1,'2021-01-12 17:59:38','2021-01-12 17:59:38'),
 (14,1,'2021-01-12 18:02:21','2021-01-12 18:02:21'),
 (15,1,'2021-01-12 18:04:19','2021-01-12 18:04:19');
/*!40000 ALTER TABLE `portal_settings` ENABLE KEYS */;


--
-- Definition of table `role_pages`
--

DROP TABLE IF EXISTS `role_pages`;
CREATE TABLE `role_pages` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `page_code` varchar(45) DEFAULT NULL,
  `role_code` varchar(45) DEFAULT NULL,
  `role_name` varchar(45) DEFAULT NULL,
  `created_by_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_username` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_username` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `role_pages`
--

/*!40000 ALTER TABLE `role_pages` DISABLE KEYS */;
INSERT INTO `role_pages` (`id`,`page_code`,`role_code`,`role_name`,`created_by_code`,`created_by_name`,`created_by_username`,`updated_by_code`,`updated_by_name`,`updated_by_username`,`created_at`,`updated_at`) VALUES 
 (1,'AttendanceController_CREATE','ROLE02','ROLE_TEACHER',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (2,'AttendanceController_MANAGE','ROLE02','ROLE_TEACHER',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (3,'AttendanceController_MANAGE','ROLE03','ROLE_STUDENT',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (4,'ResultController_CREATE','ROLE02','ROLE_TEACHER',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (5,'ResultController_MANAGE','ROLE02','ROLE_TEACHER',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (6,'ResultController_MANAGE','ROLE03','ROLE_STUDENT',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (7,'NoticeController_CREATE','ROLE02','ROLE_TEACHER',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (8,'NoticeController_MANAGE','ROLE02','ROLE_TEACHER',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (9,'NoticeController_MANAGE','ROLE03','ROLE_STUDENT',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (10,'ProfileController_MANAGE','ROLE02','ROLE_TEACHER',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (11,'ProfileController_MANAGE','ROLE03','ROLE_STUDENT',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `role_pages` ENABLE KEYS */;


--
-- Definition of table `sections`
--

DROP TABLE IF EXISTS `sections`;
CREATE TABLE `sections` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `section_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `section_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `section_icon` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `module_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `module_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `module_icon` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `module_id` bigint(20) DEFAULT NULL,
  `created_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `sections`
--

/*!40000 ALTER TABLE `sections` DISABLE KEYS */;
INSERT INTO `sections` (`id`,`created_at`,`updated_at`,`section_code`,`section_name`,`section_icon`,`module_code`,`module_name`,`module_icon`,`module_id`,`created_by_name`,`created_by_username`,`created_by_code`,`updated_by_name`,`updated_by_code`,`updated_by_username`) VALUES 
 (9,'2021-01-26 22:11:12','2021-01-26 22:11:12','SEC_MODULE_DB','Module Database','icon-database2','MOD_SELF','Module and Section','icon-desktop',NULL,'Maruf','mmh3210@gmail.com','3','','',''),
 (10,'2021-01-26 22:14:39','2021-01-26 22:14:39','SEC_SECTION_DB','Section Database','icon-database2','MOD_SELF','Module and Section','icon-th',NULL,'Maruf','mmh3210@gmail.com','3','','',''),
 (11,'2021-01-26 22:15:32','2021-01-26 22:15:32','SEC_PAGE_DB','Page Database','icon-database2','MOD_PAGE','Page','icon-wpforms',NULL,'Maruf','mmh3210@gmail.com','3','','',''),
 (22,'2021-02-02 07:04:56','2021-02-02 07:04:56','SEC_NOTICE_DB','Notice Database','icon-database2','MOD_NOTICE','Notice Board','icon-ios-albums',NULL,'Muhammad Hasan','mmh@gmail.com','33','','',''),
 (23,'2021-02-02 07:39:22','2021-02-02 07:39:22','SEC_PROFILE_DB','Profile Database','icon-database2','MOD_PROFILE','My Profile','icon-user',NULL,'Muhammad Hasan','mmh@gmail.com','33','','',''),
 (24,'2021-02-06 10:49:06','2021-02-06 10:49:06','SEC_LOCATION_DB','Location Database','icon-database2','MOD_LOCATION','Location','icon-location-arrow',NULL,'Maruf','mmh3210@gmail.com','4','','',''),
 (25,'2021-02-08 08:26:54','2021-02-08 08:26:54','SEC_DESIGNATION_DB','Designation Database','icon-database2','MOD_DESIGNATION','Designation','icon-id-card',NULL,'Maruf','mmh3210@gmail.com','4','','',''),
 (26,'2021-02-08 08:27:02','2021-02-08 08:27:02','SEC_DEPARTMENT_DB','Department Database','icon-database2','MOD_DEPARTMENT','Department','icon-home',NULL,'Maruf','mmh3210@gmail.com','4','','',''),
 (27,'2021-02-08 08:27:16','2021-02-08 08:27:16','SEC_BRANCH_DB','Branch Database','icon-database2','MOD_BRANCH','Branch','icon-university2',NULL,'Maruf','mmh3210@gmail.com','4','','',''),
 (28,'2021-02-08 08:27:31','2021-02-08 08:27:31','SEC_EMPLOYEE_DB','Employee Database','icon-database2','MOD_EMPLOYEE','Employee','icon-user-circle',NULL,'Maruf','mmh3210@gmail.com','4','','',''),
 (29,'2021-02-08 17:41:12','2021-02-08 17:41:12','SEC_ORGANIZATION_DB','Organization Database','icon-database2','MOD_ORGANIZATION','Organization','icon-university2',NULL,'Maruf','mmh3210@gmail.com','4','','','');
/*!40000 ALTER TABLE `sections` ENABLE KEYS */;


--
-- Definition of table `user_pages`
--

DROP TABLE IF EXISTS `user_pages`;
CREATE TABLE `user_pages` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `page_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_icon` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_link` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_status` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_op_role` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_op_mode` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `section_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `section_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `module_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `module_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_super_enabled` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_fav_enabled` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_otp_enabled` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `page_desc` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `section_icon` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `module_icon` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_id` bigint(20) unsigned DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `first_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `religion` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nationality` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `dob_date` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dob_month` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dob_year` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `photo_url` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `primary_contact` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `secondary_contact` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gender` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `blood_group` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `present_addr` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `parmanent_addr` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `role_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `role_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `university_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `university_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `user_pages`
--

/*!40000 ALTER TABLE `user_pages` DISABLE KEYS */;
INSERT INTO `user_pages` (`id`,`created_at`,`updated_at`,`page_code`,`page_name`,`page_icon`,`page_type`,`page_link`,`page_status`,`page_op_role`,`page_op_mode`,`section_code`,`section_name`,`module_code`,`module_name`,`page_super_enabled`,`page_fav_enabled`,`page_otp_enabled`,`page_desc`,`created_by_code`,`created_by_name`,`created_by_username`,`updated_by_code`,`updated_by_name`,`updated_by_username`,`section_icon`,`module_icon`,`user_id`,`name`,`email`,`user_name`,`user_code`,`first_name`,`last_name`,`religion`,`nationality`,`dob`,`dob_date`,`dob_month`,`dob_year`,`photo_url`,`primary_contact`,`secondary_contact`,`gender`,`blood_group`,`present_addr`,`parmanent_addr`,`role_code`,`role_name`,`university_code`,`university_name`) VALUES 
 (1,'2021-02-03 07:12:15','2021-02-03 07:12:15','AttendanceController_MANAGE','Manage Attendance','icon-dashcube','Entity','attendance/manage','Active','ROLE_ADMIN','MANAGE','SEC_Attendance_DB','Attendance Database','MOD_ATTENDANCE','Attendance Log','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-cart2',NULL,' ',NULL,NULL,NULL,NULL,NULL,'Islam',NULL,NULL,'Day','Month','2021','/student',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE03','ROLE_STUDENT','JU','Jahangirnagar university'),
 (2,'2021-02-03 07:12:15','2021-02-03 07:12:15','ResultController_MANAGE','Manage Result','icon-hdd-o','Entity','result/manage','Active','ROLE_ADMIN','MANAGE','SEC_RESULT_DB','Result Database','MOD_RESULT','Result Processing','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2',NULL,' ',NULL,NULL,NULL,NULL,NULL,'Islam',NULL,NULL,'Day','Month','2021','/student',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE03','ROLE_STUDENT','JU','Jahangirnagar university'),
 (3,'2021-02-03 07:12:15','2021-02-03 07:12:15','ProfileController_Manage','Manage My Profile','icon-user-plus','Entity','profile/manage','Active','ROLE_ADMIN','MANAGE','SEC_PROFILE_DB','Profile Database','MOD_PROFILE','My Profile','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-user',NULL,' ',NULL,NULL,NULL,NULL,NULL,'Islam',NULL,NULL,'Day','Month','2021','/student',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE03','ROLE_STUDENT','JU','Jahangirnagar university'),
 (4,'2021-02-03 07:19:20','2021-02-03 07:19:20','AttendanceController_CREATE','Create Attendance','icon-check-square','Entity','attendance/create','Active','ROLE_ADMIN','CREATE','SEC_Attendance_DB','Attendance Database','MOD_ATTENDANCE','Attendance Log','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-cart2',NULL,'Maruf Hasan','maruf.tcl@gmail.com','maruf.tcl@gmail.com','1207557','Maruf','Hasan','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1207557.jpg',NULL,NULL,'Male','A RhD positive (A+)','Dhaka',NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (5,'2021-02-03 07:19:20','2021-02-03 07:19:20','AttendanceController_MANAGE','Manage Attendance','icon-dashcube','Entity','attendance/manage','Active','ROLE_ADMIN','MANAGE','SEC_Attendance_DB','Attendance Database','MOD_ATTENDANCE','Attendance Log','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-cart2',NULL,'Maruf Hasan','maruf.tcl@gmail.com','maruf.tcl@gmail.com','1207557','Maruf','Hasan','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1207557.jpg',NULL,NULL,'Male','A RhD positive (A+)','Dhaka',NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (6,'2021-02-03 07:19:20','2021-02-03 07:19:20','ResultController_CREATE','Create Result','icon-check-square','Entity','result/create','Active','ROLE_ADMIN','CREATE','SEC_RESULT_DB','Result Database','MOD_RESULT','Result Processing','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2',NULL,'Maruf Hasan','maruf.tcl@gmail.com','maruf.tcl@gmail.com','1207557','Maruf','Hasan','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1207557.jpg',NULL,NULL,'Male','A RhD positive (A+)','Dhaka',NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (7,'2021-02-03 07:19:20','2021-02-03 07:19:20','ResultController_MANAGE','Manage Result','icon-hdd-o','Entity','result/manage','Active','ROLE_ADMIN','MANAGE','SEC_RESULT_DB','Result Database','MOD_RESULT','Result Processing','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2',NULL,'Maruf Hasan','maruf.tcl@gmail.com','maruf.tcl@gmail.com','1207557','Maruf','Hasan','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1207557.jpg',NULL,NULL,'Male','A RhD positive (A+)','Dhaka',NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (8,'2021-02-03 07:19:20','2021-02-03 07:19:20','NoticeController_CREATE','Create Notice','icon-plus-square','Entity','notice/create','Active','ROLE_ADMIN','CREATE','SEC_NOTICE_DB','Notice Database','MOD_NOTICE','Notice','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-ios-albums',NULL,'Maruf Hasan','maruf.tcl@gmail.com','maruf.tcl@gmail.com','1207557','Maruf','Hasan','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1207557.jpg',NULL,NULL,'Male','A RhD positive (A+)','Dhaka',NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (9,'2021-02-03 07:19:20','2021-02-03 07:19:20','ProfileController_Manage','Manage My Profile','icon-user-plus','Entity','profile/manage','Active','ROLE_ADMIN','MANAGE','SEC_PROFILE_DB','Profile Database','MOD_PROFILE','My Profile','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-user',NULL,'Maruf Hasan','maruf.tcl@gmail.com','maruf.tcl@gmail.com','1207557','Maruf','Hasan','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1207557.jpg',NULL,NULL,'Male','A RhD positive (A+)','Dhaka',NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (13,'2021-02-03 17:10:13','2021-02-03 17:10:13','AttendanceController_CREATE','Create Attendance','icon-check-square','Entity','attendance/create','Active','ROLE_ADMIN','CREATE','SEC_Attendance_DB','Attendance Database','MOD_ATTENDANCE','Attendance Log','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-cart2',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (14,'2021-02-03 17:10:13','2021-02-03 17:10:13','AttendanceController_MANAGE','Manage Attendance','icon-dashcube','Entity','attendance/manage','Active','ROLE_ADMIN','MANAGE','SEC_Attendance_DB','Attendance Database','MOD_ATTENDANCE','Attendance Log','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-cart2',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (15,'2021-02-03 17:10:13','2021-02-03 17:10:13','ResultController_CREATE','Create Result','icon-check-square','Entity','result/create','Active','ROLE_ADMIN','CREATE','SEC_RESULT_DB','Result Database','MOD_RESULT','Result Processing','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (16,'2021-02-03 17:10:13','2021-02-03 17:10:13','ResultController_MANAGE','Manage Result','icon-hdd-o','Entity','result/manage','Active','ROLE_ADMIN','MANAGE','SEC_RESULT_DB','Result Database','MOD_RESULT','Result Processing','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (17,'2021-02-03 17:10:14','2021-02-03 17:10:14','NoticeController_CREATE','Create Notice','icon-plus-square','Entity','notice/create','Active','ROLE_ADMIN','CREATE','SEC_NOTICE_DB','Notice Database','MOD_NOTICE','Notice','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-ios-albums',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (18,'2021-02-03 17:10:14','2021-02-03 17:10:14','ProfileController_Manage','Manage My Profile','icon-user-plus','Entity','profile/manage','Active','ROLE_ADMIN','MANAGE','SEC_PROFILE_DB','Profile Database','MOD_PROFILE','My Profile','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-user',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (19,'2021-02-03 17:17:39','2021-02-03 17:17:39','AttendanceController_CREATE','Create Attendance','icon-check-square','Entity','attendance/create','Active','ROLE_ADMIN','CREATE','SEC_Attendance_DB','Attendance Database','MOD_ATTENDANCE','Attendance Log','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-cart2',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (20,'2021-02-03 17:17:39','2021-02-03 17:17:39','AttendanceController_MANAGE','Manage Attendance','icon-dashcube','Entity','attendance/manage','Active','ROLE_ADMIN','MANAGE','SEC_Attendance_DB','Attendance Database','MOD_ATTENDANCE','Attendance Log','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-cart2',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (21,'2021-02-03 17:17:39','2021-02-03 17:17:39','ResultController_CREATE','Create Result','icon-check-square','Entity','result/create','Active','ROLE_ADMIN','CREATE','SEC_RESULT_DB','Result Database','MOD_RESULT','Result Processing','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (22,'2021-02-03 17:17:39','2021-02-03 17:17:39','ResultController_MANAGE','Manage Result','icon-hdd-o','Entity','result/manage','Active','ROLE_ADMIN','MANAGE','SEC_RESULT_DB','Result Database','MOD_RESULT','Result Processing','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (23,'2021-02-03 17:17:39','2021-02-03 17:17:39','NoticeController_CREATE','Create Notice','icon-plus-square','Entity','notice/create','Active','ROLE_ADMIN','CREATE','SEC_NOTICE_DB','Notice Database','MOD_NOTICE','Notice','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-ios-albums',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (24,'2021-02-03 17:17:39','2021-02-03 17:17:39','ProfileController_Manage','Manage My Profile','icon-user-plus','Entity','profile/manage','Active','ROLE_ADMIN','MANAGE','SEC_PROFILE_DB','Profile Database','MOD_PROFILE','My Profile','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-user',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (25,'2021-02-03 17:17:43','2021-02-03 17:17:43','AttendanceController_CREATE','Create Attendance','icon-check-square','Entity','attendance/create','Active','ROLE_ADMIN','CREATE','SEC_Attendance_DB','Attendance Database','MOD_ATTENDANCE','Attendance Log','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-cart2',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (26,'2021-02-03 17:17:43','2021-02-03 17:17:43','AttendanceController_MANAGE','Manage Attendance','icon-dashcube','Entity','attendance/manage','Active','ROLE_ADMIN','MANAGE','SEC_Attendance_DB','Attendance Database','MOD_ATTENDANCE','Attendance Log','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-cart2',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (27,'2021-02-03 17:17:43','2021-02-03 17:17:43','ResultController_CREATE','Create Result','icon-check-square','Entity','result/create','Active','ROLE_ADMIN','CREATE','SEC_RESULT_DB','Result Database','MOD_RESULT','Result Processing','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (28,'2021-02-03 17:17:43','2021-02-03 17:17:43','ResultController_MANAGE','Manage Result','icon-hdd-o','Entity','result/manage','Active','ROLE_ADMIN','MANAGE','SEC_RESULT_DB','Result Database','MOD_RESULT','Result Processing','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (29,'2021-02-03 17:17:43','2021-02-03 17:17:43','NoticeController_CREATE','Create Notice','icon-plus-square','Entity','notice/create','Active','ROLE_ADMIN','CREATE','SEC_NOTICE_DB','Notice Database','MOD_NOTICE','Notice','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-ios-albums',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (30,'2021-02-03 17:17:43','2021-02-03 17:17:43','ProfileController_Manage','Manage My Profile','icon-user-plus','Entity','profile/manage','Active','ROLE_ADMIN','MANAGE','SEC_PROFILE_DB','Profile Database','MOD_PROFILE','My Profile','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-user',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (31,'2021-02-03 17:18:32','2021-02-03 17:18:32','AttendanceController_CREATE','Create Attendance','icon-check-square','Entity','attendance/create','Active','ROLE_ADMIN','CREATE','SEC_Attendance_DB','Attendance Database','MOD_ATTENDANCE','Attendance Log','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-cart2',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (32,'2021-02-03 17:18:32','2021-02-03 17:18:32','AttendanceController_MANAGE','Manage Attendance','icon-dashcube','Entity','attendance/manage','Active','ROLE_ADMIN','MANAGE','SEC_Attendance_DB','Attendance Database','MOD_ATTENDANCE','Attendance Log','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-cart2',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (33,'2021-02-03 17:18:32','2021-02-03 17:18:32','ResultController_CREATE','Create Result','icon-check-square','Entity','result/create','Active','ROLE_ADMIN','CREATE','SEC_RESULT_DB','Result Database','MOD_RESULT','Result Processing','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (34,'2021-02-03 17:18:32','2021-02-03 17:18:32','ResultController_MANAGE','Manage Result','icon-hdd-o','Entity','result/manage','Active','ROLE_ADMIN','MANAGE','SEC_RESULT_DB','Result Database','MOD_RESULT','Result Processing','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (35,'2021-02-03 17:18:32','2021-02-03 17:18:32','NoticeController_CREATE','Create Notice','icon-plus-square','Entity','notice/create','Active','ROLE_ADMIN','CREATE','SEC_NOTICE_DB','Notice Database','MOD_NOTICE','Notice','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-ios-albums',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (36,'2021-02-03 17:18:32','2021-02-03 17:18:32','ProfileController_Manage','Manage My Profile','icon-user-plus','Entity','profile/manage','Active','ROLE_ADMIN','MANAGE','SEC_PROFILE_DB','Profile Database','MOD_PROFILE','My Profile','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-user',NULL,'Syed Ziaul Habib','habib@gmail.com','habib@gmail.com','1016','Syed','Ziaul Habib','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/1016.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','IDB','IsDB-BISEW'),
 (37,'2021-02-06 17:29:21','2021-02-06 17:29:21','AttendanceController_CREATE','Create Attendance','icon-check-square','Entity','attendance/create','Active','ROLE_ADMIN','CREATE','SEC_Attendance_DB','Attendance Database','MOD_ATTENDANCE','Attendance Log','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-cart2',NULL,'Mesbahudding Sarker','msr@gmail.com','msr@gmail.com','MSR','Mesbahudding','Sarker','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/MSR.jpg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university'),
 (38,'2021-02-06 17:29:21','2021-02-06 17:29:21','AttendanceController_MANAGE','Manage Attendance','icon-dashcube','Entity','attendance/manage','Active','ROLE_ADMIN','MANAGE','SEC_Attendance_DB','Attendance Database','MOD_ATTENDANCE','Attendance Log','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-cart2',NULL,'Mesbahudding Sarker','msr@gmail.com','msr@gmail.com','MSR','Mesbahudding','Sarker','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/MSR.jpg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university'),
 (39,'2021-02-06 17:29:21','2021-02-06 17:29:21','ResultController_CREATE','Create Result','icon-check-square','Entity','result/create','Active','ROLE_ADMIN','CREATE','SEC_RESULT_DB','Result Database','MOD_RESULT','Result Processing','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2',NULL,'Mesbahudding Sarker','msr@gmail.com','msr@gmail.com','MSR','Mesbahudding','Sarker','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/MSR.jpg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university'),
 (40,'2021-02-06 17:29:21','2021-02-06 17:29:21','ResultController_MANAGE','Manage Result','icon-hdd-o','Entity','result/manage','Active','ROLE_ADMIN','MANAGE','SEC_RESULT_DB','Result Database','MOD_RESULT','Result Processing','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2',NULL,'Mesbahudding Sarker','msr@gmail.com','msr@gmail.com','MSR','Mesbahudding','Sarker','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/MSR.jpg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university'),
 (41,'2021-02-06 17:29:21','2021-02-06 17:29:21','NoticeController_CREATE','Create Notice','icon-plus-square','Entity','notice/create','Active','ROLE_ADMIN','CREATE','SEC_NOTICE_DB','Notice Database','MOD_NOTICE','Notice','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-ios-albums',NULL,'Mesbahudding Sarker','msr@gmail.com','msr@gmail.com','MSR','Mesbahudding','Sarker','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/MSR.jpg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university'),
 (42,'2021-02-06 17:29:21','2021-02-06 17:29:21','ProfileController_Manage','Manage My Profile','icon-user-plus','Entity','profile/manage','Active','ROLE_ADMIN','MANAGE','SEC_PROFILE_DB','Profile Database','MOD_PROFILE','My Profile','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-user',NULL,'Mesbahudding Sarker','msr@gmail.com','msr@gmail.com','MSR','Mesbahudding','Sarker','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/MSR.jpg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university'),
 (43,'2021-02-06 17:30:59','2021-02-06 17:30:59','AttendanceController_CREATE','Create Attendance','icon-check-square','Entity','attendance/create','Active','ROLE_ADMIN','CREATE','SEC_Attendance_DB','Attendance Database','MOD_ATTENDANCE','Attendance Log','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-cart2',NULL,'K M Akkas Ali','kma@gmail.com','kma@gmail.com','KMA','K M Akkas','Ali','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/KMA.jpeg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university'),
 (44,'2021-02-06 17:30:59','2021-02-06 17:30:59','AttendanceController_MANAGE','Manage Attendance','icon-dashcube','Entity','attendance/manage','Active','ROLE_ADMIN','MANAGE','SEC_Attendance_DB','Attendance Database','MOD_ATTENDANCE','Attendance Log','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-cart2',NULL,'K M Akkas Ali','kma@gmail.com','kma@gmail.com','KMA','K M Akkas','Ali','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/KMA.jpeg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university'),
 (45,'2021-02-06 17:30:59','2021-02-06 17:30:59','ResultController_CREATE','Create Result','icon-check-square','Entity','result/create','Active','ROLE_ADMIN','CREATE','SEC_RESULT_DB','Result Database','MOD_RESULT','Result Processing','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2',NULL,'K M Akkas Ali','kma@gmail.com','kma@gmail.com','KMA','K M Akkas','Ali','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/KMA.jpeg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university'),
 (46,'2021-02-06 17:30:59','2021-02-06 17:30:59','ResultController_MANAGE','Manage Result','icon-hdd-o','Entity','result/manage','Active','ROLE_ADMIN','MANAGE','SEC_RESULT_DB','Result Database','MOD_RESULT','Result Processing','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2',NULL,'K M Akkas Ali','kma@gmail.com','kma@gmail.com','KMA','K M Akkas','Ali','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/KMA.jpeg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university'),
 (47,'2021-02-06 17:30:59','2021-02-06 17:30:59','NoticeController_CREATE','Create Notice','icon-plus-square','Entity','notice/create','Active','ROLE_ADMIN','CREATE','SEC_NOTICE_DB','Notice Database','MOD_NOTICE','Notice','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-ios-albums',NULL,'K M Akkas Ali','kma@gmail.com','kma@gmail.com','KMA','K M Akkas','Ali','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/KMA.jpeg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university'),
 (48,'2021-02-06 17:30:59','2021-02-06 17:30:59','ProfileController_Manage','Manage My Profile','icon-user-plus','Entity','profile/manage','Active','ROLE_ADMIN','MANAGE','SEC_PROFILE_DB','Profile Database','MOD_PROFILE','My Profile','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-user',NULL,'K M Akkas Ali','kma@gmail.com','kma@gmail.com','KMA','K M Akkas','Ali','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/KMA.jpeg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university'),
 (49,'2021-02-07 06:42:07','2021-02-07 06:42:07','AttendanceController_CREATE','Create Attendance','icon-check-square','Entity','attendance/create','Active','ROLE_ADMIN','CREATE','SEC_Attendance_DB','Attendance Database','MOD_ATTENDANCE','Attendance Log','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-cart2',NULL,'Dr. Md. Sazzadur Rahman','sdr@gmail.com','sdr@gmail.com','SDR','Dr. Md. Sazzadur','Rahman','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/SDR.jpg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university'),
 (50,'2021-02-07 06:42:07','2021-02-07 06:42:07','AttendanceController_MANAGE','Manage Attendance','icon-dashcube','Entity','attendance/manage','Active','ROLE_ADMIN','MANAGE','SEC_Attendance_DB','Attendance Database','MOD_ATTENDANCE','Attendance Log','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-cart2',NULL,'Dr. Md. Sazzadur Rahman','sdr@gmail.com','sdr@gmail.com','SDR','Dr. Md. Sazzadur','Rahman','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/SDR.jpg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university'),
 (51,'2021-02-07 06:42:07','2021-02-07 06:42:07','ResultController_CREATE','Create Result','icon-check-square','Entity','result/create','Active','ROLE_ADMIN','CREATE','SEC_RESULT_DB','Result Database','MOD_RESULT','Result Processing','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2',NULL,'Dr. Md. Sazzadur Rahman','sdr@gmail.com','sdr@gmail.com','SDR','Dr. Md. Sazzadur','Rahman','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/SDR.jpg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university'),
 (52,'2021-02-07 06:42:07','2021-02-07 06:42:07','ResultController_MANAGE','Manage Result','icon-hdd-o','Entity','result/manage','Active','ROLE_ADMIN','MANAGE','SEC_RESULT_DB','Result Database','MOD_RESULT','Result Processing','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-university2',NULL,'Dr. Md. Sazzadur Rahman','sdr@gmail.com','sdr@gmail.com','SDR','Dr. Md. Sazzadur','Rahman','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/SDR.jpg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university'),
 (53,'2021-02-07 06:42:07','2021-02-07 06:42:07','NoticeController_CREATE','Create Notice','icon-plus-square','Entity','notice/create','Active','ROLE_ADMIN','CREATE','SEC_NOTICE_DB','Notice Database','MOD_NOTICE','Notice','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-ios-albums',NULL,'Dr. Md. Sazzadur Rahman','sdr@gmail.com','sdr@gmail.com','SDR','Dr. Md. Sazzadur','Rahman','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/SDR.jpg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university'),
 (54,'2021-02-07 06:42:07','2021-02-07 06:42:07','ProfileController_Manage','Manage My Profile','icon-user-plus','Entity','profile/manage','Active','ROLE_ADMIN','MANAGE','SEC_PROFILE_DB','Profile Database','MOD_PROFILE','My Profile','on','on',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','icon-database2','icon-user',NULL,'Dr. Md. Sazzadur Rahman','sdr@gmail.com','sdr@gmail.com','SDR','Dr. Md. Sazzadur','Rahman','Islam',NULL,NULL,'Day','Month','2021','uploads//teacher/SDR.jpg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER','JU','Jahangirnagar university');
/*!40000 ALTER TABLE `user_pages` ENABLE KEYS */;


--
-- Definition of table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email_verified_at` timestamp NULL DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `remember_token` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `first_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `religion` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nationality` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `dob_date` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dob_month` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dob_year` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `photo_url` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `primary_contact` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `secondary_contact` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gender` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `blood_group` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `present_addr` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `parmanent_addr` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `role_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `role_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `organization_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `organization_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updated_by_username` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_code` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password_plain` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `users_email_unique` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `users`
--

/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`,`name`,`email`,`email_verified_at`,`password`,`remember_token`,`created_at`,`updated_at`,`first_name`,`last_name`,`religion`,`nationality`,`dob`,`dob_date`,`dob_month`,`dob_year`,`photo_url`,`primary_contact`,`secondary_contact`,`gender`,`blood_group`,`present_addr`,`parmanent_addr`,`role_code`,`role_name`,`organization_code`,`organization_name`,`created_by_code`,`created_by_name`,`created_by_username`,`updated_by_code`,`updated_by_name`,`updated_by_username`,`user_name`,`user_code`,`password_plain`) VALUES 
 (4,'Maruf','mmh3210@gmail.com',NULL,'$2y$10$4LwacZ0y.6oJYQf03r1O8e5lYkUvqrrtAO1Cp4BDAY846nlN1a9rS','ib3rDzHIbnNaDVweGTgQhVXAYH5sYaZ5LZ4NiX29Au6TYyKIYdEB9DphJUgP',NULL,'2021-01-29 06:50:54',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'/uploads//admin/maruf.jpg',NULL,NULL,NULL,NULL,NULL,NULL,'ROLE01','ROLE_ADMIN',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'mmh3210@gmail.com',NULL,NULL),
 (5,'Maruf Hasan','mmh@gmail.com',NULL,'$2y$10$3RPyFgBZ1BhpyRaR6tThp.UlcvU5oDgDC3Nu1T9kUIcvfHUiYmoCS',NULL,'2021-02-08 19:04:41','2021-02-08 19:04:41','Maruf','Hasan','Islam',NULL,NULL,'Day','Month','2021','uploads//employee/.jpeg',NULL,NULL,'Male','A RhD positive (A+)','ABC',NULL,'ROLE02','ROLE_ADMIN',NULL,NULL,'4','Maruf','mmh3210@gmail.com','','','','mmh@gmail.com','mmh','mmh@gmail.com'),
 (6,'Muhammad Hasan','maruf.tcl@gmail.com',NULL,'$2y$10$oX6SP2cU.5.zgwPbXVb56ewwKTyCmwjnZt36NRu99mQtlvvXxw2Oe',NULL,'2021-02-09 06:36:57','2021-02-09 06:36:57','Muhammad','Hasan','Islam',NULL,NULL,'Day','Month','2021','uploads//employee/MRF.jpg',NULL,NULL,'Male','A RhD positive (A+)','fasedfads',NULL,'ROLE02','ROLE_TEACHER',NULL,NULL,'5','Maruf Hasan','mmh@gmail.com','','','','maruf.tcl@gmail.com',NULL,'maruf.tcl@gmail.com'),
 (11,'Tamim Ahmed','tamimahmedidb@gmail.com',NULL,'$2y$10$xQ7XGkii3tFZzVgSn8LlpO3xJOENtW/M4G3UE8C/WugvMpEKOWxhq',NULL,'2021-02-09 06:38:47','2021-02-09 06:38:47','Tamim','Ahmed','Islam',NULL,NULL,'Day','Month','2021','uploads//employee/.JPG',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER',NULL,NULL,'5','Maruf Hasan','mmh@gmail.com','','','','tamimahmedidb@gmail.com',NULL,'tamimahmedidb@gmail.com'),
 (27,'Md. Mynuddin','idbcfratul1148@gmail.com',NULL,'$2y$10$Q4UpolmNuApzY47ABXO8o.GIan6U1HmcdIScslexzmrYcAX3kz44C',NULL,'2021-02-09 07:10:37','2021-02-09 07:10:37','Md.','Mynuddin','Islam',NULL,NULL,'Day','Month','2021','uploads//employee/.jpeg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER',NULL,NULL,'5','Maruf Hasan','mmh@gmail.com','','','','idbcfratul1148@gmail.com','1261148','idbcfratul1148@gmail.com'),
 (28,'Md Tahsin Hasan','tahsincou@yahoo.com',NULL,'$2y$10$tM1.ykSEeZV9L6UQgCWtQuPootAi1sQNF4hB9dQZNiA.bLKd4ZBjW',NULL,'2021-02-09 07:10:38','2021-02-09 07:10:38','Md Tahsin','Hasan','Islam',NULL,NULL,'Day','Month','2021','uploads//employee/.jpg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER',NULL,NULL,'5','Maruf Hasan','mmh@gmail.com','','','','tahsincou@yahoo.com','1258749','tahsincou@yahoo.com'),
 (30,'Md. Sulaiman','mdsulaiman535@gmail.com',NULL,'$2y$10$Jse2ZX3i0aVkwxOLdjzpuuc6.MnWkSQwoV0qz2By6STEsvGs097Ku',NULL,'2021-02-09 07:11:21','2021-02-09 07:11:21','Md.','Sulaiman','Islam',NULL,NULL,'Day','Month','2021','uploads//employee/.jpg','01764458438','01764458438','Male','A RhD positive (A+)','Dhaka','Bhola','ROLE02','ROLE_TEACHER',NULL,NULL,'5','Maruf Hasan','mmh@gmail.com','','','','mdsulaiman535@gmail.com',NULL,'mdsulaiman535@gmail.com'),
 (31,'Nadia Monia','adovenadia2020@gmail.com',NULL,'$2y$10$Kqbtp7QTY7OHcixtVS73Ae8jDXhRkJ00iTSHh4/jcHBEBcjCrTjZS',NULL,'2021-02-09 07:11:24','2021-02-09 07:11:24','Nadia','Monia','Islam',NULL,NULL,'Day','Month','2021','/employee/',NULL,NULL,'Female','A RhD positive (A+)','10/1 No. Nabadip Basak Lane, Luxmibazar,  Thana - Sutrapur, Dhaka - 1100.',NULL,'ROLE02','ROLE_TEACHER',NULL,NULL,'5','Maruf Hasan','mmh@gmail.com','','','','adovenadia2020@gmail.com','1261033','adovenadia2020@gmail.com'),
 (32,'Topu Raihan','topuraihan85@gmail.com',NULL,'$2y$10$Cx1kIf4aEir5XZUh.fLeKOG1xXL4B.gzpQr8ODjOfUcItQXl9LdLS',NULL,'2021-02-09 07:11:25','2021-02-09 07:11:25','Topu','Raihan','Islam',NULL,NULL,'Day','Month','2021','uploads//employee/.jpg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER',NULL,NULL,'5','Maruf Hasan','mmh@gmail.com','','','','topuraihan85@gmail.com','1258675','topuraihan85@gmail.com'),
 (33,'Md. Al-Amin','alamin.hossainidb@gmail.com',NULL,'$2y$10$F2SgTvRE2TJTBYEtKfJjr.lg4tb9oMstaY5d99LqXorUMhbujPIea',NULL,'2021-02-09 07:11:55','2021-02-09 07:11:55','Md.','Al-Amin','Islam',NULL,NULL,'Day','Month','2021','uploads//employee/.jpg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER',NULL,NULL,'5','Maruf Hasan','mmh@gmail.com','','','','alamin.hossainidb@gmail.com','1259781','alamin.hossainidb@gmail.com'),
 (34,'Bashir Hossain','bashir.rasulpur@gmail.com',NULL,'$2y$10$Gtui0TOxYYUk4MLNv5Q5t.KZcjr50MiXD4iEUtmaV05xgPiwpNKQi',NULL,'2021-02-09 07:11:58','2021-02-09 07:11:58','Bashir','Hossain','Islam',NULL,NULL,'Day','Month','2021','uploads//employee/.jpg',NULL,NULL,'Male','A RhD positive (A+)','Rasulpur, Araihazar, Narayanganj','Rasulpur, Araihazar, Narayanganj','ROLE02','ROLE_TEACHER',NULL,NULL,'5','Maruf Hasan','mmh@gmail.com','','','','bashir.rasulpur@gmail.com',NULL,'bashir.rasulpur@gmail.com'),
 (35,'Rasheda Akter','rashedaidb@gmail.com',NULL,'$2y$10$dh5mQBQp0dWHcUa9SdxNne5mxGSohJqSukPvgtFiZcu13YZALjrva',NULL,'2021-02-09 07:12:11','2021-02-09 07:12:11','Rasheda','Akter','Islam',NULL,NULL,'Day','Month','2021','/employee/',NULL,NULL,'Female','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER',NULL,NULL,'5','Maruf Hasan','mmh@gmail.com','','','','rashedaidb@gmail.com','1260926','rashedaidb@gmail.com'),
 (36,'Md. Khan','kmdsujan@gmail.com',NULL,'$2y$10$SMJ4gbCfau4gpLVq0LG7Ie.NI0RWlxzyZ4jVCpXDm8.oCDGUxHjUi',NULL,'2021-02-09 07:12:17','2021-02-09 07:12:17','Md.','Khan','Islam',NULL,NULL,'Day','Month','2021','uploads//employee/.jpg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER',NULL,NULL,'5','Maruf Hasan','mmh@gmail.com','','','','kmdsujan@gmail.com','1259720','kmdsujan@gmail.com'),
 (37,'Golam Azam','golam49azam@gmail.com',NULL,'$2y$10$BKPiKKd9FNM1E40nin1duOykk2TRaEtzvTuYJm71mnu2V4gE7iNK6',NULL,'2021-02-09 07:12:24','2021-02-09 07:12:24','Golam','Azam','Islam',NULL,NULL,'Day','Month','2021','uploads//employee/.jpg','01720150149','01515660507','Male','A RhD positive (A+)','Dhaka, Badda','Rangpur, pirjong','ROLE02','ROLE_TEACHER',NULL,NULL,'5','Maruf Hasan','mmh@gmail.com','','','','golam49azam@gmail.com','1260183','golam49azam@gmail.com'),
 (39,'Tania Begum','ta1261354@gimail.com',NULL,'$2y$10$fjVU6TI8kANT.b6ROKsMMe2PbzflZunMM7oyJU/AW7ROTFic8hq12',NULL,'2021-02-09 07:13:11','2021-02-09 07:13:11','Tania','Begum','Islam',NULL,NULL,'Day','Month','2021','uploads//employee/.jfif','01738083454',NULL,'Female','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER',NULL,NULL,'5','Maruf Hasan','mmh@gmail.com','','','','ta1261354@gimail.com','1261354','ta1261354@gimail.com'),
 (40,'Md. Sajib','sajibsarif401@gmail.com',NULL,'$2y$10$E7cBekrmfRLt9qryIQakeuTTo2UycZSqe4NuMclycOcvQGbqw3z0S',NULL,'2021-02-09 07:14:18','2021-02-09 07:14:18','Md.','Sajib','Islam',NULL,NULL,'Day','Month','2021','uploads//employee/.jpg',NULL,NULL,'Male','A RhD positive (A+)',NULL,NULL,'ROLE02','ROLE_TEACHER',NULL,NULL,'5','Maruf Hasan','mmh@gmail.com','','','','sajibsarif401@gmail.com','1258941','sajibsarif401@gmail.com');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

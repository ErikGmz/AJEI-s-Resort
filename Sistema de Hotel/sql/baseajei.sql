-- MySQL dump 10.13  Distrib 5.7.34, for Win64 (x86_64)
--
-- Host: localhost    Database: baseajei
-- ------------------------------------------------------
-- Server version	5.7.34-log

CREATE DATABASE baseajei;
USE baseajei;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `galeria`
--

DROP TABLE IF EXISTS `galeria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `galeria` (
  `image_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `description` varchar(50) NOT NULL,
  `image_path` text NOT NULL,
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `galeria`
--

LOCK TABLES `galeria` WRITE;
/*!40000 ALTER TABLE `galeria` DISABLE KEYS */;
INSERT INTO `galeria` VALUES (1,'Habitación Chaac Suite (T1)','src/img/fotos/habitacionsimple1.jpg'),(2,'Habitación Chaac Suite (T2)','src/img/fotos/habitacionsimple2.jpg'),(3,'Habitación Chaac Suite (T3)','src/img/fotos/habitacionsimple3.jpg'),(4,'Habitación Itzamná Suite (T1)','src/img/fotos/habitaciondoble1.jpg'),(5,'Habitación Itzamná Suite (T2)','src/img/fotos/habitaciondoble2.jpg'),(6,'Habitación Itzamná Suite (T3)','src/img/fotos/habitaciondoble3.jpg'),(7,'Habitación Kauil Suite (T1)','src/img/fotos/habitaciontriple1.jpg'),(8,'Habitación Kauil Suite (T2)','src/img/fotos/habitaciontriple2.jpg'),(9,'Habitación Kauil Suite (T3)','src/img/fotos/habitaciontriple3.jpg'),(10,'Bar del Resort','src/img/fotos/bar.jpg'),(11,'SPA de Lujo','src/img/fotos/spa.jpg'),(12,'Gimnasio del Resort','src/img/fotos/gimnasio.jpg'),(13,'Zona de Juegos','src/img/fotos/zonajuegos.jpg'),(14,'Canchas de Tennis','src/img/fotos/tennis.jpg'),(15,'Tiro con Arco','src/img/fotos/tiroconarco.jpg'),(16,'Campo de Golf','src/img/fotos/campogolf.jpg');
/*!40000 ALTER TABLE `galeria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habitaciones`
--

DROP TABLE IF EXISTS `habitaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `habitaciones` (
  `room_type_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `room_type` enum('S','D','T') NOT NULL,
  `rooms_count` tinyint(2) NOT NULL,
  PRIMARY KEY (`room_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habitaciones`
--

LOCK TABLES `habitaciones` WRITE;
/*!40000 ALTER TABLE `habitaciones` DISABLE KEYS */;
INSERT INTO `habitaciones` VALUES (1,'S',9),(2,'D',9),(3,'T',12);
/*!40000 ALTER TABLE `habitaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huespedes`
--

DROP TABLE IF EXISTS `huespedes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huespedes` (
  `guest_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(80) NOT NULL,
  `city` varchar(40) NOT NULL,
  `check_in` date NOT NULL,
  `check_out` date NOT NULL,
  `days` tinyint(4) NOT NULL DEFAULT '1',
  `room_id` varchar(3) NOT NULL,
  `room_type` enum('S','D','T') NOT NULL DEFAULT 'S',
  `floor` tinyint(2) NOT NULL DEFAULT '1',
  `guests` tinyint(5) NOT NULL DEFAULT '1',
  `extras` tinyint(2) NOT NULL DEFAULT '0',
  `active` tinyint(1) NOT NULL DEFAULT '0',
  `expense` double(9,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`guest_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huespedes`
--

LOCK TABLES `huespedes` WRITE;
/*!40000 ALTER TABLE `huespedes` DISABLE KEYS */;
INSERT INTO `huespedes` VALUES (1,'Maricruz Jiménez','Aguascalientes','2021-05-20','2021-05-29',9,'213','S',2,1,0,1,0.00),(2,'Alejandro Montañez','Aguascalientes','2019-05-18','2019-06-04',17,'105','D',1,2,2,1,0.00),(3,'Erik Gómez','Aguascalientes','2021-02-27','2021-03-13',14,'207','T',2,2,0,0,98972.80),(4,'José Ramírez','Guanajuato','2021-05-25','2021-05-29',4,'215','T',2,3,1,0,30844.25),(5,'Emiliano Torres','Florida','2021-05-19','2021-05-28',9,'212','D',2,2,2,1,0.00),(6,'Carmen Guadalupe','Chihuahua','2021-06-30','2021-07-06',6,'209','D',2,2,0,0,34975.58),(7,'Ricardo Sánchez','Nueva York','2021-06-19','2021-06-30',11,'208','S',2,1,1,1,0.00),(8,'Salvador López','Guadalajara','2021-05-25','2021-06-06',12,'207','T',2,3,2,0,102733.23),(9,'Ernesto Galindo','Yucatán','2021-06-26','2021-07-02',6,'103','T',1,3,1,1,0.00),(10,'Mariana Velázquez','Oaxaca','2021-11-13','2021-11-15',2,'211','S',2,1,0,0,10116.84),(11,'Mariano Luna','Monterrey','2021-02-09','2021-02-15',6,'104','S',1,1,1,1,0.00),(12,'Sandra Juárez','Acapulco','2021-06-30','2021-07-11',11,'215','T',2,3,2,1,0.00);
/*!40000 ALTER TABLE `huespedes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `precios`
--

DROP TABLE IF EXISTS `precios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `precios` (
  `price_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `room_type` enum('S','D','T') NOT NULL,
  `price` double(6,2) NOT NULL,
  PRIMARY KEY (`price_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `precios`
--

LOCK TABLES `precios` WRITE;
/*!40000 ALTER TABLE `precios` DISABLE KEYS */;
INSERT INTO `precios` VALUES (1,'S',4321.54),(2,'D',5340.91),(3,'T',6912.13);
/*!40000 ALTER TABLE `precios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicios`
--

DROP TABLE IF EXISTS `servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servicios` (
  `guest_id` int(11) NOT NULL,
  `room_service` tinyint(1) NOT NULL DEFAULT '0',
  `bar_access` tinyint(1) NOT NULL DEFAULT '0',
  `cleaner_service` tinyint(1) NOT NULL DEFAULT '0',
  `SPA_service` tinyint(1) NOT NULL DEFAULT '0',
  `baby_sister_service` tinyint(1) NOT NULL DEFAULT '0',
  `gym_access` tinyint(1) NOT NULL DEFAULT '0',
  `gaming_access` tinyint(1) NOT NULL DEFAULT '0',
  `tennis_access` tinyint(1) NOT NULL DEFAULT '0',
  `bow_shooting` tinyint(1) NOT NULL DEFAULT '0',
  `golf_access` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`guest_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicios`
--

LOCK TABLES `servicios` WRITE;
/*!40000 ALTER TABLE `servicios` DISABLE KEYS */;
INSERT INTO `servicios` VALUES (1,1,1,1,1,1,1,1,1,1,1),(2,0,1,0,1,0,0,1,0,1,1),(3,1,1,0,0,0,1,1,0,0,1),(4,0,0,0,0,0,1,1,0,0,0),(5,0,1,0,0,1,0,1,0,1,0),(6,1,0,0,1,1,0,1,0,0,0),(7,1,0,1,0,1,0,1,0,0,1),(8,1,0,0,1,0,0,1,0,1,1),(9,1,1,1,1,0,1,0,1,0,1),(10,1,0,1,1,0,0,0,0,0,0),(11,0,0,0,0,0,1,0,1,1,1),(12,0,0,1,1,0,1,1,0,0,0);
/*!40000 ALTER TABLE `servicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(60) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Erik Gómez','erikgomez@ajei.com.mx','Ä>ôÞ¹ÑÞŒs€|ì'),(2,'Gabriel Galindo','gabogalindo@ajei.com.mx','kÔhM³·E£ÇiýIû'),(3,'Israel Mora','israel@ajei.com.mx','ZL¡Ý€y”*\'vgo‚²’'),(4,'Emmanuel Rodríguez','emmanuel@ajei.com.mx','Œ¨üÕ×¸ç“ÝŠ=]M');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-10  1:55:23

-- MySQL dump 10.13  Distrib 8.0.28, for macos11 (x86_64)
--
-- Host: 192.168.0.179    Database: prog2122
-- ------------------------------------------------------
-- Server version	8.0.29-0ubuntu0.20.04.3

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alumnado`
--

DROP TABLE IF EXISTS `alumnado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumnado` (
  `codAlumnado` int unsigned NOT NULL,
  `nombreAlumnado` varchar(50) DEFAULT NULL,
  `ape1Alumnado` varchar(20) DEFAULT NULL,
  `ape2Alumnado` varchar(20) DEFAULT NULL,
  `direccion` varchar(60) DEFAULT NULL,
  `codpostal` char(5) DEFAULT NULL,
  `provincia` varchar(10) DEFAULT NULL,
  `alergias` tinyint(1) DEFAULT NULL,
  `desAlergias` varchar(50) DEFAULT NULL,
  `codTutor` int unsigned DEFAULT NULL,
  PRIMARY KEY (`codAlumnado`),
  KEY `fk_alumnado_tutores` (`codTutor`),
  CONSTRAINT `fk_alumnado_tutores` FOREIGN KEY (`codTutor`) REFERENCES `tutores` (`codTutor`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumnado`
--

LOCK TABLES `alumnado` WRITE;
/*!40000 ALTER TABLE `alumnado` DISABLE KEYS */;
INSERT INTO `alumnado` VALUES (1,'Fernando','Martin',NULL,'Sin direccion','29670','Malaga',0,NULL,1),(2,'Antonio','Martinez',NULL,'Sin direccion','11320','Cadiz',0,NULL,1);
/*!40000 ALTER TABLE `alumnado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tutores`
--

DROP TABLE IF EXISTS `tutores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tutores` (
  `codTutor` int unsigned NOT NULL,
  `nomTutor` varchar(50) NOT NULL,
  `ape1Tutor` varchar(50) NOT NULL,
  `ape2Tutor` varchar(50) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `tel` char(12) DEFAULT NULL,
  PRIMARY KEY (`codTutor`),
  UNIQUE KEY `tel` (`tel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tutores`
--

LOCK TABLES `tutores` WRITE;
/*!40000 ALTER TABLE `tutores` DISABLE KEYS */;
INSERT INTO `tutores` VALUES (1,'Fernando','Martinez',NULL,'Sin direccion','email@email.com','617289038'),(2,'Martin','Martinez',NULL,'Calle Linda','martinez@email.com','678009080');
/*!40000 ALTER TABLE `tutores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unidades`
--

DROP TABLE IF EXISTS `unidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `unidades` (
  `codUnidad` int unsigned NOT NULL,
  `numMaxAlum` char(4) DEFAULT NULL,
  `tutoria` varchar(50) DEFAULT NULL,
  `tutores_codTutor` int unsigned NOT NULL,
  PRIMARY KEY (`codUnidad`),
  KEY `fk_unidades_tutores1_idx` (`tutores_codTutor`),
  CONSTRAINT `fk_unidades_tutores1` FOREIGN KEY (`tutores_codTutor`) REFERENCES `tutores` (`codTutor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidades`
--

LOCK TABLES `unidades` WRITE;
/*!40000 ALTER TABLE `unidades` DISABLE KEYS */;
INSERT INTO `unidades` VALUES (1,'30','1ºA',1),(2,'31','4ºA',2);
/*!40000 ALTER TABLE `unidades` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-22 17:25:06

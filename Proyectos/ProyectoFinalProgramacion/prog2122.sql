-- MySQL dump 10.13  Distrib 8.0.29, for Linux (x86_64)
--
-- Host: 192.168.56.3    Database: prog2122
-- ------------------------------------------------------
-- Server version	8.0.27-0ubuntu0.20.04.1

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
  PRIMARY KEY (`codAlumnado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumnado`
--

LOCK TABLES `alumnado` WRITE;
/*!40000 ALTER TABLE `alumnado` DISABLE KEYS */;
INSERT INTO `alumnado` VALUES (100,'David','Manzorro','Rojas','Sin direccion','29660','Málaga',0,NULL),(101,'David','Rios','Guerrero','Sin direccion','29660','Málaga',0,''),(102,'Carlos','Ortega','Perez','Sin direccion','29660','Málaga',0,NULL),(103,'Raúl','Blanco','Del Rio','Sin direccion','29660','Málaga',0,NULL);
/*!40000 ALTER TABLE `alumnado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamentos`
--

DROP TABLE IF EXISTS `departamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `departamentos` (
  `codDept` int unsigned NOT NULL,
  `nomDept` varchar(50) DEFAULT NULL,
  `datosDept` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`codDept`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamentos`
--

LOCK TABLES `departamentos` WRITE;
/*!40000 ALTER TABLE `departamentos` DISABLE KEYS */;
/*!40000 ALTER TABLE `departamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dias`
--

DROP TABLE IF EXISTS `dias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dias` (
  `codDia` int unsigned NOT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`codDia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dias`
--

LOCK TABLES `dias` WRITE;
/*!40000 ALTER TABLE `dias` DISABLE KEYS */;
/*!40000 ALTER TABLE `dias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gravedad`
--

DROP TABLE IF EXISTS `gravedad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gravedad` (
  `codGravedad` int unsigned NOT NULL,
  `desGrav` text,
  PRIMARY KEY (`codGravedad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gravedad`
--

LOCK TABLES `gravedad` WRITE;
/*!40000 ALTER TABLE `gravedad` DISABLE KEYS */;
/*!40000 ALTER TABLE `gravedad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materias`
--

DROP TABLE IF EXISTS `materias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materias` (
  `codMateria` int unsigned NOT NULL,
  `desMateria` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`codMateria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materias`
--

LOCK TABLES `materias` WRITE;
/*!40000 ALTER TABLE `materias` DISABLE KEYS */;
/*!40000 ALTER TABLE `materias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personal`
--

DROP TABLE IF EXISTS `personal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personal` (
  `codPersonal` int unsigned NOT NULL,
  `codDept` int unsigned DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `codPostal` char(5) DEFAULT NULL,
  `provincia` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`codPersonal`),
  UNIQUE KEY `telefono` (`telefono`),
  KEY `fk_personal_departamentos` (`codDept`),
  CONSTRAINT `fk_personal_departamentos` FOREIGN KEY (`codDept`) REFERENCES `departamentos` (`codDept`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personal`
--

LOCK TABLES `personal` WRITE;
/*!40000 ALTER TABLE `personal` DISABLE KEYS */;
/*!40000 ALTER TABLE `personal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesorado`
--

DROP TABLE IF EXISTS `profesorado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesorado` (
  `codProfesorado` int unsigned NOT NULL,
  `codPersonal` int unsigned DEFAULT NULL,
  `nomProf` varchar(50) NOT NULL,
  `ape1Prof` varchar(50) NOT NULL,
  `ape2Prof` varchar(50) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `tel` char(12) DEFAULT NULL,
  PRIMARY KEY (`codProfesorado`),
  UNIQUE KEY `tel` (`tel`),
  KEY `fk_profesorado_personal` (`codPersonal`),
  CONSTRAINT `fk_profesorado_personal` FOREIGN KEY (`codPersonal`) REFERENCES `personal` (`codPersonal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesorado`
--

LOCK TABLES `profesorado` WRITE;
/*!40000 ALTER TABLE `profesorado` DISABLE KEYS */;
/*!40000 ALTER TABLE `profesorado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `representante1`
--

DROP TABLE IF EXISTS `representante1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `representante1` (
  `codRepre1` int NOT NULL,
  `direccion` varchar(60) DEFAULT NULL,
  `telefono` char(9) DEFAULT NULL,
  `codAlumnado` int unsigned DEFAULT NULL,
  PRIMARY KEY (`codRepre1`),
  KEY `fk_repre1_alumnado` (`codAlumnado`),
  CONSTRAINT `fk_repre1_alumnado` FOREIGN KEY (`codAlumnado`) REFERENCES `alumnado` (`codAlumnado`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `representante1`
--

LOCK TABLES `representante1` WRITE;
/*!40000 ALTER TABLE `representante1` DISABLE KEYS */;
/*!40000 ALTER TABLE `representante1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `representante2`
--

DROP TABLE IF EXISTS `representante2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `representante2` (
  `codRepre2` int NOT NULL,
  `direccion` varchar(60) DEFAULT NULL,
  `telefono` char(9) DEFAULT NULL,
  `codAlumnado` int unsigned DEFAULT NULL,
  PRIMARY KEY (`codRepre2`),
  KEY `fk_repre2_alumnado` (`codAlumnado`),
  CONSTRAINT `fk_repre2_alumnado` FOREIGN KEY (`codAlumnado`) REFERENCES `alumnado` (`codAlumnado`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `representante2`
--

LOCK TABLES `representante2` WRITE;
/*!40000 ALTER TABLE `representante2` DISABLE KEYS */;
/*!40000 ALTER TABLE `representante2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanciones`
--

DROP TABLE IF EXISTS `sanciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanciones` (
  `codSancion` int unsigned NOT NULL,
  `fecha` date DEFAULT NULL,
  `descripcion` text,
  PRIMARY KEY (`codSancion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanciones`
--

LOCK TABLES `sanciones` WRITE;
/*!40000 ALTER TABLE `sanciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `sanciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tramos`
--

DROP TABLE IF EXISTS `tramos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tramos` (
  `codTramo` int unsigned NOT NULL,
  `hora` time DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`codTramo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tramos`
--

LOCK TABLES `tramos` WRITE;
/*!40000 ALTER TABLE `tramos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tramos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unidades`
--

DROP TABLE IF EXISTS `unidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `unidades` (
  `codUnidad` int unsigned NOT NULL,
  `codAlumnado` int unsigned DEFAULT NULL,
  `numMaxAlum` char(4) DEFAULT NULL,
  `tutoria` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codUnidad`),
  KEY `fk_unidades_alumnado` (`codAlumnado`),
  CONSTRAINT `fk_unidades_alumnado` FOREIGN KEY (`codAlumnado`) REFERENCES `alumnado` (`codAlumnado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidades`
--

LOCK TABLES `unidades` WRITE;
/*!40000 ALTER TABLE `unidades` DISABLE KEYS */;
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

-- Dump completed on 2022-05-18 14:42:06

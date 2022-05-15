CREATE DATABASE  IF NOT EXISTS `prueba` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `prueba`;
-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: 192.168.1.127    Database: prueba
-- ------------------------------------------------------
-- Server version	5.7.26-0ubuntu0.18.04.1


--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persona` (
  `pk` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `fecha_nac` datetime DEFAULT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping routines for database 'prueba'
--
/*!50003 DROP PROCEDURE IF EXISTS `cambiar_nombres` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`carlos`@`%` PROCEDURE `cambiar_nombres`(in newname varchar(45), in oldname varchar(45))
BEGIN
update persona set nombre=newname where nombre=oldname;
END ;;
DELIMITER ;


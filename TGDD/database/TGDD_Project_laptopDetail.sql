-- MySQL dump 10.13  Distrib 8.0.12, for macos10.13 (x86_64)
--
-- Host: localhost    Database: TGDD_Project
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `laptopDetail`
--

DROP TABLE IF EXISTS `laptopDetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `laptopDetail` (
  `laptopDetailId` int(11) NOT NULL,
  `connector` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `core` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cpu` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cpuMaxSpeed` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cpuSpeed` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `especially` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `graphicCard` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `product_id` int(11) NOT NULL,
  `ram` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `ramSpeed` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `ramType` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `ramUpdate` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `release` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `screen` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `sizeWeight` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `thread` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`laptopDetailId`),
  KEY `laptopProid_idx` (`product_id`),
  CONSTRAINT `laptopProid` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laptopDetail`
--

LOCK TABLES `laptopDetail` WRITE;
/*!40000 ALTER TABLE `laptopDetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `laptopDetail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-29  0:05:06

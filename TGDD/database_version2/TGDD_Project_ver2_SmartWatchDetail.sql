-- MySQL dump 10.13  Distrib 8.0.12, for macos10.13 (x86_64)
--
-- Host: localhost    Database: TGDD_Project_ver2
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
-- Table structure for table `SmartWatchDetail`
--

DROP TABLE IF EXISTS `SmartWatchDetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `SmartWatchDetail` (
  `smart_watch_id` int(11) NOT NULL,
  `charge` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `material_frame` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `material_strap` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `material_surface` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pin` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pin_time` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `product_id` int(11) NOT NULL,
  `release` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `resolution` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `screen` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `size` varchar(45) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`smart_watch_id`),
  KEY `SmartWatchProId_idx` (`product_id`),
  CONSTRAINT `SmartWatchProId` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SmartWatchDetail`
--

LOCK TABLES `SmartWatchDetail` WRITE;
/*!40000 ALTER TABLE `SmartWatchDetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `SmartWatchDetail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-05  2:32:25

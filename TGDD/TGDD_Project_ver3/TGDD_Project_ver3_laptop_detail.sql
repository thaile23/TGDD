-- MySQL dump 10.13  Distrib 8.0.12, for macos10.13 (x86_64)
--
-- Host: localhost    Database: TGDD_Project_ver3
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
-- Table structure for table `laptop_detail`
--

DROP TABLE IF EXISTS `laptop_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `laptop_detail` (
  `laptop_id` int(11) NOT NULL,
  `connector` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `core` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cpu` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cpu_speed` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `design` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `especially` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `graphic_card` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pin` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `product_id` int(11) NOT NULL,
  `ram` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `ram_update` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `release` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `screen` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `size_weight` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `thread` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`laptop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laptop_detail`
--

LOCK TABLES `laptop_detail` WRITE;
/*!40000 ALTER TABLE `laptop_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `laptop_detail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-06 16:51:18

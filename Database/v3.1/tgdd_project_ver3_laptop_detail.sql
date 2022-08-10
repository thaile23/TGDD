-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: tgdd_project_ver3
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `laptop_detail`
--

DROP TABLE IF EXISTS `laptop_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `laptop_detail` (
  `laptop_id` int NOT NULL,
  `connector` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `core` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cpu` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cpu_speed` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `design` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `especially` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `graphic_card` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `product_id` int NOT NULL,
  `ram` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `ram_update` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `release` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `screen` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `size_weight` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `thread` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`laptop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laptop_detail`
--

LOCK TABLES `laptop_detail` WRITE;
/*!40000 ALTER TABLE `laptop_detail` DISABLE KEYS */;
INSERT INTO `laptop_detail` VALUES (19,'2 x USB 3.2HDMIJack tai nghe 3.5 mmLAN (RJ45)USB Type-C','Pentium','N50301.1GHz','1.1GHz','Vỏ nhựa','no','Card tích hợpIntel UHD 605','3-cell Li-ion, 48 Wh',19,'4','no','2021','11.6 inch','Dài 295 mm - Rộng 215 mm - Dày 20.99 mm - Nặng 1.4 kg','no'),(20,'1 x USB 2.02 x USB 3.2HDMIJack tai nghe 3.5 mm','i3','10110U','2.1GHz','Vỏ nhựa','no','Card tích hợpIntel UHD','35 Wh',20,'4','12','2022','15.6 inch','Dài 362.2 mm - Rộng 253.4 mm - Dày 19.9 mm - Nặng 1.7 kg','no'),(21,'2 x Thunderbolt 3 (USB-C)Jack tai nghe 3.5 mm','Apple M1','Apple M1','no','Vỏ kim loại nguyên khối','no','Card tích hợp - 7 nhân GPU','Khoảng 10 tiếng',21,'16','no','2022','13.3 inch','Dài 304.1 mm - Rộng 212.4 mm - Dày 4.1 mm đến 16.1 mm - Nặng 1.29 kg','no'),(22,'2 x Thunderbolt 3 (USB-C)Jack tai nghe 3.5 mm','Apple M1','Apple M1','no','Vỏ kim loại nguyên khối','no','Card tích hợp8 nhân GPU','Khoảng 10 tiếng',22,'8','no','2022','Retina (2560 x 1600)\n','Dài 304.1 mm - Rộng 212.4 mm - Dày 15.6 mm - Nặng 1.4 kg','no'),(23,'3 x USB 3.2HDMIJack tai nghe 3.5 mmLAN (RJ45)USB Type-C','i5','11400H','2.7GHz','Vỏ nhựa','no','Card rờiRTX 3050 4GB','4-cell Li-ion, 48 Wh',23,'8','no','2021','15.6\"Full HD (1920 x 1080)120Hz','Dài 357 mm - Rộng 272 mm - Dày 25 mm - Nặng 2.81 kg','no'),(24,'1x USB 3.1 Gen 1 Type-A ( HP Sleep and Charge)1x USB 3.1 Gen 1 Type-C (support Power Delivery, DisplayPort, HP Sleep and Charge)2 x USB 3.1HDMIJack tai nghe 3.5 mmLAN (RJ45)','Ryzen 7','5800H','3.2GHz','Vỏ nhựa','no','Card rờiRTX 3050 4GB','\r4-cell Li-ion, 70 Wh',24,'8','no','2022','16.1 inch\n','Dài 370 mm - Rộng 260 mm - Dày 23.5 mm - Nặng 2.46 kg','no'),(25,'3 x USB 3.2HDMIJack tai nghe 3.5 mmLAN (RJ45)USB Type-C','i7','11800H','2.30 GHz','Vỏ nhựa','no','Card rờiRTX 3050Ti 4GB','4-cell Li-ion, 57.5 Wh',25,'8','no','2021','15.6\"Full HD (1920 x 1080)120Hz','Dài 363.4 mm - Rộng 255 mm - Dày 23.9 mm - Nặng 2.2 kg','no'),(26,'1x USB 3.1 Gen 1 Type-A ( HP Sleep and Charge)1x USB 3.1 Gen 1 Type-C (support Power Delivery, DisplayPort, HP Sleep and Charge)2 x USB 3.1HDMIJack tai nghe 3.5 mmLAN (RJ45)','Ryzen 7','5800H','3.2GHz','Vỏ nhựa','no','Card rờiRTX 3050 4GB','\r4-cell Li-ion, 70 Wh',26,'8','no','2022','16.1 inch\n','Dài 370 mm - Rộng 260 mm - Dày 23.5 mm - Nặng 2.46 kg','no'),(27,'2 x USB 3.2HDMIJack tai nghe 3.5 mmLAN (RJ45)USB Type-C','Pentium','N50301.1GHz','1.1GHz','Vỏ nhựa','no','Card tích hợpIntel UHD 605','3-cell Li-ion, 48 Wh',27,'4','no','2021','11.6 inch','Dài 295 mm - Rộng 215 mm - Dày 20.99 mm - Nặng 1.4 kg','no'),(28,'1 x USB 2.02 x USB 3.2HDMIJack tai nghe 3.5 mm','i3','10110U','2.1GHz','Vỏ nhựa','no','Card tích hợpIntel UHD','35 Wh',28,'4','12','2022','15.6 inch','Dài 362.2 mm - Rộng 253.4 mm - Dày 19.9 mm - Nặng 1.7 kg','no'),(29,'1x USB 3.1 Gen 1 Type-A ( HP Sleep and Charge)1x USB 3.1 Gen 1 Type-C (support Power Delivery, DisplayPort, HP Sleep and Charge)2 x USB 3.1HDMIJack tai nghe 3.5 mmLAN (RJ45)','Ryzen 7','5800H','3.2GHz','Vỏ nhựa','no','Card rờiRTX 3050 4GB','\r4-cell Li-ion, 70 Wh',29,'8','no','2022','16.1 inch\n','Dài 370 mm - Rộng 260 mm - Dày 23.5 mm - Nặng 2.46 kg','no'),(30,'2 x Thunderbolt 3 (USB-C)Jack tai nghe 3.5 mm','Apple M1','Apple M1','no','Vỏ kim loại nguyên khối','no','Card tích hợp - 7 nhân GPU','Khoảng 10 tiếng',30,'16','no','2022','13.3 inch','Dài 304.1 mm - Rộng 212.4 mm - Dày 4.1 mm đến 16.1 mm - Nặng 1.29 kg','no'),(31,'2 x Thunderbolt 3 (USB-C)Jack tai nghe 3.5 mm','Apple M1','Apple M1','no','Vỏ kim loại nguyên khối','no','Card tích hợp8 nhân GPU','Khoảng 10 tiếng',31,'8','no','2022','Retina (2560 x 1600)\n','Dài 304.1 mm - Rộng 212.4 mm - Dày 15.6 mm - Nặng 1.4 kg','no');
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

-- Dump completed on 2022-08-08  8:44:38

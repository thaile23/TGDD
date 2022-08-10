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
-- Table structure for table `phone_tablet_detail`
--

DROP TABLE IF EXISTS `phone_tablet_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phone_tablet_detail` (
  `phone_tablet_id` int NOT NULL,
  `brightness` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `chip` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `design` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `front_camera` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `product_id` int NOT NULL,
  `ram` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `rear_camera` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `release` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `resolution` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `screen` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `sim` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `size_weight` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`phone_tablet_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phone_tablet_detail`
--

LOCK TABLES `phone_tablet_detail` WRITE;
/*!40000 ALTER TABLE `phone_tablet_detail` DISABLE KEYS */;
INSERT INTO `phone_tablet_detail` VALUES (1,'600 nits','Snapdragon 680 8 nhân','no','32 MP','4500 mAh',1,'8 ','32','no','no','AMOLED','2','no'),(2,'480 nits','MediaTek Helio G35 8 nhân','no','Chính 50 MP & Phụ 2 MP, 2 MP','5000 mAh45 W',2,'4','16','no','no','IPS LCD','2','no'),(3,'no','Snapdragon 8 Gen 1','no','32 MP','5000 mAh80 W',3,'12','Chính 50 MP & Phụ 50 MP, 13 MP','no','no','AMOLED6.7\"Quad HD+ (2K+)','2','no'),(4,'no','Snapdragon 8 Gen 1','no','40 MP','5000 mAh45 W',4,'8','Chính 108 MP & Phụ 12 MP, 10 MP, 10 MP','no','no','Dynamic AMOLED 2X6.8\"Quad HD+ (2K+)','2','no'),(5,'no','Snapdragon 8 Gen 1','no','16 MP','6000 mAh45 W',5,'4','Chính 50 MP & Phụ 20 MP, 13 MP','no','no','LCD','2','no'),(6,'no','Snapdragon 888','no','10 MP & 4 MP','75000 mAh45 W',6,'12','3 camera 12 MP','no','no','Dynamic AMOLED 2XChính 7.6\" & Phụ 6.2\"Full HD+','2','no'),(7,'no','Apple A15 Bionic','no','12 MP','4352 mAh20 W',7,'6','3 camera 12 MP','no','no','OLED6.7\"Super Retina XDR','1','no'),(8,'no','Apple A15 Bionic','no','12 MP','4352 mAh20 W',8,'4','3 camera 12 MP','no','no','OLED6.7\"Super Retina XDR','1','no'),(9,'no','Snapdragon 680','no','13 MP','5000 mAh33 W',9,'6','13 MP','no','no','AMOLED6.43\"Full HD+','2','no'),(10,'no','Exynos 9611','no','5 MP','7040 mAh10 W',10,'4','5 MP','no','no','10.4\"PLS LCD','2','no'),(11,'no','Snapdragon 8 Gen 1','no','32 MP','75000 mAh45 W',11,'8','Chính 108 MP & Phụ 12 MP, 10 MP, 10 MP','no','no','Dynamic AMOLED 2X6.8\"Quad HD+ (2K+)','2','no'),(12,'no','Exynos 9611','no','10 MP & 4 MP','5000 mAh45 W',12,'4','Chính 50 MP & Phụ 50 MP, 13 MP','no','no','AMOLED6.7\"Quad HD+ (2K+)','2','no'),(13,'no','Snapdragon 680','no','13 MP','7040 mAh10 W',13,'6','3 camera 12 MP','no','no','LCD','2','no'),(32,NULL,'Snapdragon 680 8 nhân','no','32 MP','4700 mAh, Sạc 66 W',32,'6','Chính 50 MP & Phụ 50 MP, 13 MP','no','no','AMOLED6.7\"Quad HD+ (2K+)','2','no'),(33,'no','Snapdragon 750G','no','5 MP','10090 mAh',33,'4','8 MP','no','no','TFT LCD','2','no'),(34,NULL,'Snapdragon 680 8 nhân','no','32 MP','4700 mAh, Sạc 66 W',36,'12','13 MP','no','no','LCD','2','no'),(35,NULL,'Snapdragon 680 8 nhân','no','32 MP','4700 mAh, Sạc 66 W',36,'12','13 MP','no','no','14.6\"Super AMOLED','2','no'),(36,NULL,'Snapdragon 680 8 nhân','no','32 MP','4700 mAh, Sạc 66 W',36,'12','13 MP','no','no','LCD','2','no'),(37,NULL,'Apple A15 Bionic','no','12 MP',' 19.3 Wh20 W',37,'4','12 MP','no','no','8.3\"LED-backlit IPS LCD','2','no'),(38,NULL,'Apple A15 Bionic','no','12 MP',' 19.3 Wh20 W',38,'4','12 MP','no','no','8.3\"LED-backlit IPS LCD','2','no'),(40,NULL,'Snapdragon 8 Gen 1','no','10 MP & 4 MP','4700 mAh, Sạc 66 W',40,'8','3 camera 12 MP','no','no','AMOLED6.43\"Full HD+','2','no'),(44,NULL,'Exynos 9611','no','12 MP','4700 mAh, Sạc 66 W',44,'4','Chính 108 MP & Phụ 12 MP, 10 MP, 10 MP','no','no','OLED6.7\"Super Retina XDR','2','no'),(45,NULL,'MediaTek Helio P35','no','Chính 50 MP & Phụ 12 MP, 12 MP','4050 mAh, Sạc 44 W',45,'8','Chính 108 MP & Phụ 12 MP, 10 MP, 10 MP','no','no','Dynamic AMOLED 2X6.8\"Quad HD+ (2K+)','2','no'),(48,NULL,'Snapdragon 680 8 nhân','no','Chính 50 MP & Phụ 12 MP, 12 MP','4050 mAh, Sạc 44 W',48,'6','Chính 108 MP & Phụ 12 MP, 10 MP, 10 MP','no','no','Dynamic AMOLED 2X6.8\"Quad HD+ (2K+)','2','no'),(56,NULL,'MediaTek Helio P35','no','10 MP & 4 MP','4050 mAh, Sạc 44 W',56,'8','5 MP','no','no','Dynamic AMOLED 2X6.8\"Quad HD+ (2K+)','2','no'),(60,NULL,'Snapdragon 8 Gen 1','no',' Chính 64 MP & Phụ 8 MP, 2 MP','4050 mAh, Sạc 44 W',60,'6','5 MP','no','no','AMOLED6.7\"Quad HD+ (2K+)','2','no');
/*!40000 ALTER TABLE `phone_tablet_detail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-08  8:44:39

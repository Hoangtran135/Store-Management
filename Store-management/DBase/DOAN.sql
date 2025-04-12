CREATE DATABASE  IF NOT EXISTS `doan` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `doan`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: doan
-- ------------------------------------------------------
-- Server version	8.2.0

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
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accounts` (
  `idNhanVien` int NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`username`),
  KEY `idnhanvien_idx` (`idNhanVien`),
  CONSTRAINT `idnhanvien` FOREIGN KEY (`idNhanVien`) REFERENCES `nhan_vien` (`idNHANVIEN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounts`
--

LOCK TABLES `accounts` WRITE;
/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
INSERT INTO `accounts` VALUES (4,'Hien','Hien'),(2,'Hoang','Hoang'),(1,'Huy','Huy'),(3,'Lam','Lam'),(5,'Tu','Tu');
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hang_ban`
--

DROP TABLE IF EXISTS `hang_ban`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hang_ban` (
  `IDBAN` int NOT NULL AUTO_INCREMENT,
  `IDHOADON` int NOT NULL,
  `IDSANPHAM` int NOT NULL,
  `TENSANPHAM` varchar(45) NOT NULL,
  `SOLUONG` int NOT NULL,
  PRIMARY KEY (`IDBAN`),
  KEY `index2` (`TENSANPHAM`),
  KEY `GG` (`IDHOADON`),
  KEY `1_idx` (`IDSANPHAM`),
  CONSTRAINT `GG` FOREIGN KEY (`IDHOADON`) REFERENCES `hoa_don` (`IDHOADON`),
  CONSTRAINT `IDSANPHAM` FOREIGN KEY (`IDSANPHAM`) REFERENCES `san_pham` (`idSANPHAM`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hang_ban`
--

LOCK TABLES `hang_ban` WRITE;
/*!40000 ALTER TABLE `hang_ban` DISABLE KEYS */;
INSERT INTO `hang_ban` VALUES (1,1,100,'RUOU',2),(2,2,100,'RUOU',2),(3,3,200,'BIA',1),(4,4,100,'RUOU',3);
/*!40000 ALTER TABLE `hang_ban` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoa_don`
--

DROP TABLE IF EXISTS `hoa_don`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoa_don` (
  `idHOADON` int NOT NULL,
  `TONGTIEN` float NOT NULL,
  `NGAYLAP` date NOT NULL,
  PRIMARY KEY (`idHOADON`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoa_don`
--

LOCK TABLES `hoa_don` WRITE;
/*!40000 ALTER TABLE `hoa_don` DISABLE KEYS */;
INSERT INTO `hoa_don` VALUES (1,246000,'2024-05-23'),(2,246000,'2024-05-23'),(3,10000,'2024-05-23'),(4,369000,'2024-05-23');
/*!40000 ALTER TABLE `hoa_don` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kho_hang1`
--

DROP TABLE IF EXISTS `kho_hang1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kho_hang1` (
  `IDNHAPKHO` int NOT NULL,
  `TENSANPHAM` varchar(45) NOT NULL,
  `SOLUONG` int NOT NULL,
  `DONGIA` int NOT NULL,
  PRIMARY KEY (`IDNHAPKHO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kho_hang1`
--

LOCK TABLES `kho_hang1` WRITE;
/*!40000 ALTER TABLE `kho_hang1` DISABLE KEYS */;
INSERT INTO `kho_hang1` VALUES (1,'RUOU',1000,123000),(2,'BIA',1000,10000),(3,'THUOC LA',1000,32000),(4,'THATLUNG',1000,213000),(5,'MU',1000,100000),(6,'CHOI',1000,24000),(7,'KEM CHUOI',1000,10000),(8,'NUOC',1000,18000),(9,'BUT',1000,4000),(10,'VO',1000,7000),(11,'KINH',1000,300000),(12,'COC',1000,10000),(13,'KHAN MAT',1000,25000),(14,'CHAU',1000,50000),(15,'BAN CHAI',1000,25000),(16,'THUNG XOP',1000,30000),(17,'DAO',1000,100000),(18,'KEP  TOC',1000,2000),(19,'NIT',1000,1000),(20,'LUOC',1000,12000),(21,'BONG DEN',1000,15000),(22,'GIAY AN',1000,5000),(23,'AM NUOC',1000,150000),(24,'TUI RAC',1000,20000),(25,'DAY DIEN',1000,25000),(26,'GIAU GOI',1000,125000),(27,'NUOC MAM',1000,26000),(28,'MUOI',1000,5000),(29,'BIM BIM',1000,10000),(30,'TUI XACH',1000,200000);
/*!40000 ALTER TABLE `kho_hang1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nha_cung_cap`
--

DROP TABLE IF EXISTS `nha_cung_cap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nha_cung_cap` (
  `idNHACUNGCAP` int NOT NULL,
  `TENNHACUNGCAP` varchar(45) NOT NULL,
  `SDT` int NOT NULL,
  PRIMARY KEY (`idNHACUNGCAP`),
  KEY `index2` (`TENNHACUNGCAP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nha_cung_cap`
--

LOCK TABLES `nha_cung_cap` WRITE;
/*!40000 ALTER TABLE `nha_cung_cap` DISABLE KEYS */;
INSERT INTO `nha_cung_cap` VALUES (101,'CONG TI A',12334212),(102,'CONG TI B',31232123),(103,'CONG TI C',32322322),(104,'CONG TI D',93627722);
/*!40000 ALTER TABLE `nha_cung_cap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhan_vien`
--

DROP TABLE IF EXISTS `nhan_vien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhan_vien` (
  `idNHANVIEN` int NOT NULL,
  `TENNHANVIEN` varchar(45) NOT NULL,
  `SDT` int NOT NULL,
  `DIACHI` varchar(45) NOT NULL,
  `GIOITINH` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idNHANVIEN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhan_vien`
--

LOCK TABLES `nhan_vien` WRITE;
/*!40000 ALTER TABLE `nhan_vien` DISABLE KEYS */;
INSERT INTO `nhan_vien` VALUES (1,'Huy',332244032,'TRAN DUY HUNG','NU'),(2,'Hoang',392399904,'GIAI PHONG','NAM'),(3,'Lam',245324432,'THANH XUAN','NU'),(4,'Hien',182232222,'NGUYEN TRAI','NU'),(5,'Tu',932231229,'THANH NHAN','NU');
/*!40000 ALTER TABLE `nhan_vien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `san_pham`
--

DROP TABLE IF EXISTS `san_pham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `san_pham` (
  `idSANPHAM` int NOT NULL,
  `TENSANPHAM` varchar(45) NOT NULL,
  `HANSUDUNG` date NOT NULL,
  `GIANHAP` int NOT NULL,
  `IDNHAPKHO` int NOT NULL,
  `IDNHACUNGCAP` int NOT NULL,
  PRIMARY KEY (`idSANPHAM`),
  KEY `id kho_idx` (`IDNHAPKHO`),
  KEY `index4` (`TENSANPHAM`),
  KEY `ID NHA CC_idx` (`IDNHACUNGCAP`),
  CONSTRAINT `id kho` FOREIGN KEY (`IDNHAPKHO`) REFERENCES `kho_hang1` (`IDNHAPKHO`),
  CONSTRAINT `ID NHA CC` FOREIGN KEY (`IDNHACUNGCAP`) REFERENCES `nha_cung_cap` (`idNHACUNGCAP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `san_pham`
--

LOCK TABLES `san_pham` WRITE;
/*!40000 ALTER TABLE `san_pham` DISABLE KEYS */;
INSERT INTO `san_pham` VALUES (100,'RUOU','2026-03-30',123000,1,101),(200,'BIA','2030-02-26',10000,2,101),(300,'THUOCLA','2026-09-08',32000,3,101),(400,'THATLUNG','2025-12-06',213000,4,102),(500,'MU','2029-04-11',100000,5,102),(600,'CHOI','2030-06-09',24000,6,103),(700,'KEM CHUOI','2034-10-11',10000,7,103),(800,'NUOC','2028-10-18',18000,8,103),(900,'BUT','2027-07-12',4000,9,104),(1000,'VO','2029-08-08',7000,10,104),(1100,'KINH','2040-11-03',300000,11,102),(1200,'COC','2028-02-13',10000,12,102),(1300,'KHAN MAT','2028-11-19',25000,13,102),(1400,'CHAU','2031-05-06',50000,14,102),(1500,'BAN CHAI','2024-11-15',25000,15,101),(1600,'THUNG XOP','2029-03-20',30000,16,101),(1700,'DAO','2030-09-12',100000,17,103),(1800,'KEP TOC','2032-07-08',2000,18,101),(1900,'NIT','2029-10-21',1000,19,101),(2000,'LUOC','2029-01-11',12000,20,101),(2100,'BONG DEN','2029-11-29',15000,21,102),(2200,'GIAY AN','2030-12-03',5000,22,103),(2300,'AM NUOC','2025-11-23',150000,23,104),(2400,'TUI RAC','2028-12-12',20000,24,103),(2500,'DAY DIEN','2030-09-15',25000,25,103),(2600,'GIAU GOI','2035-02-23',125000,26,102),(2700,'NUOC MAM','2025-02-04',26000,27,102),(2800,'MUOI','2035-05-30',5000,28,102),(2900,'BIM BIM','2029-04-27',10000,29,101),(3000,'TUI XACH','2027-05-06',200000,30,101);
/*!40000 ALTER TABLE `san_pham` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-23  1:13:06

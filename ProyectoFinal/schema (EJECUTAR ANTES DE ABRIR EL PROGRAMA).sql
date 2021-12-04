CREATE DATABASE  IF NOT EXISTS `biblioteca` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `biblioteca`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: biblioteca
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `alumnos`
--

DROP TABLE IF EXISTS `alumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumnos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `matricula` int NOT NULL,
  `nombre` varchar(256) NOT NULL,
  `apellidos` varchar(256) NOT NULL,
  `genero` varchar(8) NOT NULL,
  `carrera_id` int NOT NULL,
  `fecha_ingreso` date NOT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `matricula_UNIQUE` (`matricula`),
  KEY `FK_alumnos_carreras_idx` (`carrera_id`),
  CONSTRAINT `FK_alumnos_carreras` FOREIGN KEY (`carrera_id`) REFERENCES `carreras` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumnos`
--

LOCK TABLES `alumnos` WRITE;
/*!40000 ALTER TABLE `alumnos` DISABLE KEYS */;
INSERT INTO `alumnos` VALUES (1,1930337,'Juan','Perez Perez','masc',1,'2021-12-02','2001-02-25'),(2,2020675,'Juan','Perez Perez','masc',1,'2021-12-02','2001-02-25');
/*!40000 ALTER TABLE `alumnos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `alumnos_v`
--

DROP TABLE IF EXISTS `alumnos_v`;
/*!50001 DROP VIEW IF EXISTS `alumnos_v`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `alumnos_v` AS SELECT 
 1 AS `id`,
 1 AS `matricula`,
 1 AS `nombre`,
 1 AS `apellidos`,
 1 AS `carrera_id`,
 1 AS `carrera_nombre`,
 1 AS `carrera_activo`,
 1 AS `fecha_ingreso`,
 1 AS `fecha_nacimiento`,
 1 AS `genero`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `carreras`
--

DROP TABLE IF EXISTS `carreras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carreras` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(256) NOT NULL,
  `activo` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carreras`
--

LOCK TABLES `carreras` WRITE;
/*!40000 ALTER TABLE `carreras` DISABLE KEYS */;
INSERT INTO `carreras` VALUES (1,'Ingeniería en Tecnologías de Información y Comunicaciones',_binary '')
(2,'Ingeniería en Tecnologías de Manofactura',_binary '');
/*!40000 ALTER TABLE `carreras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `editoriales`
--

DROP TABLE IF EXISTS `editoriales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `editoriales` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(256) NOT NULL,
  `pais` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `activo` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `editoriales`
--

LOCK TABLES `editoriales` WRITE;
/*!40000 ALTER TABLE `editoriales` DISABLE KEYS */;
INSERT INTO `editoriales` VALUES (1,'editorial chida','Mexico','echida@gmail.com',_binary '');
/*!40000 ALTER TABLE `editoriales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libros`
--

DROP TABLE IF EXISTS `libros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libros` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titulo` varchar(512) NOT NULL,
  `tipo_recurso_id` int NOT NULL,
  `edicion` varchar(128) DEFAULT NULL,
  `editorial_id` int DEFAULT NULL,
  `autores` varchar(1024) DEFAULT NULL,
  `isbn` varchar(256) DEFAULT NULL,
  `activo` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_recursos_recursos1_idx` (`tipo_recurso_id`),
  KEY `FK_recursos_editoriales_idx` (`editorial_id`),
  CONSTRAINT `FK_recursos_editoriales` FOREIGN KEY (`editorial_id`) REFERENCES `editoriales` (`id`),
  CONSTRAINT `FK_recursos_tipos_recursos` FOREIGN KEY (`tipo_recurso_id`) REFERENCES `tipos_recursos` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libros`
--

LOCK TABLES `libros` WRITE;
/*!40000 ALTER TABLE `libros` DISABLE KEYS */;
INSERT INTO `libros` VALUES (5,'ciencias naturales',1,'4ta Edicion',1,'Benito Juarez','12345',_binary ''),(6,'Historia I',1,'5ta Edicion',1,'Lalo Sierra','54321',_binary ''),(7,'Matematicas',1,'1ra Edicion',1,'Guillermo Sierra','6789',_binary '');
/*!40000 ALTER TABLE `libros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libros_inventario`
--

DROP TABLE IF EXISTS `libros_inventario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libros_inventario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `libro_id` int NOT NULL,
  `estado` varchar(45) NOT NULL,
  `disponible` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_inventario_libros_idx` (`libro_id`),
  CONSTRAINT `FK_inventario_libros` FOREIGN KEY (`libro_id`) REFERENCES `libros` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libros_inventario`
--

LOCK TABLES `libros_inventario` WRITE;
/*!40000 ALTER TABLE `libros_inventario` DISABLE KEYS */;
INSERT INTO `libros_inventario` VALUES (1,5,'Nuevo',_binary '\0'),(2,5,'Nuevo',_binary ''),(3,5,'Nuevo',_binary ''),(4,6,'Nuevo',_binary '\0'),(5,6,'Nuevo',_binary '');
/*!40000 ALTER TABLE `libros_inventario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `libros_inventario_existencia_v`
--

DROP TABLE IF EXISTS `libros_inventario_existencia_v`;
/*!50001 DROP VIEW IF EXISTS `libros_inventario_existencia_v`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `libros_inventario_existencia_v` AS SELECT 
 1 AS `id`,
 1 AS `titulo`,
 1 AS `tipo_recurso_id`,
 1 AS `tipo_recurso_nombre`,
 1 AS `tipo_recurso_activo`,
 1 AS `edicion`,
 1 AS `editorial_id`,
 1 AS `editorial_nombre`,
 1 AS `editorial_pais`,
 1 AS `editorial_emial`,
 1 AS `editorial_activo`,
 1 AS `autores`,
 1 AS `isbn`,
 1 AS `activo`,
 1 AS `cantidad_en_inventario`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `libros_inventario_v`
--

DROP TABLE IF EXISTS `libros_inventario_v`;
/*!50001 DROP VIEW IF EXISTS `libros_inventario_v`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `libros_inventario_v` AS SELECT 
 1 AS `id`,
 1 AS `titulo`,
 1 AS `tipo_recurso_id`,
 1 AS `tipo_recurso_nombre`,
 1 AS `tipo_recurso_activo`,
 1 AS `edicion`,
 1 AS `editorial_id`,
 1 AS `editorial_nombre`,
 1 AS `editorial_pais`,
 1 AS `editorial_emial`,
 1 AS `editorial_activo`,
 1 AS `autores`,
 1 AS `isbn`,
 1 AS `activo`,
 1 AS `inventario_id`,
 1 AS `estado`,
 1 AS `disponible`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `libros_v`
--

DROP TABLE IF EXISTS `libros_v`;
/*!50001 DROP VIEW IF EXISTS `libros_v`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `libros_v` AS SELECT 
 1 AS `id`,
 1 AS `titulo`,
 1 AS `tipo_recurso_id`,
 1 AS `tipo_recurso_nombre`,
 1 AS `tipo_recurso_activo`,
 1 AS `edicion`,
 1 AS `editorial_id`,
 1 AS `editorial_nombre`,
 1 AS `editorial_pais`,
 1 AS `editorial_emial`,
 1 AS `editorial_activo`,
 1 AS `autores`,
 1 AS `isbn`,
 1 AS `activo`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `prestamos`
--

DROP TABLE IF EXISTS `prestamos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `libro_inventario_id` int NOT NULL,
  `alumno_matricula` int NOT NULL,
  `fecha_prestamo` datetime NOT NULL,
  `fecha_devuelto` datetime DEFAULT NULL,
  `fecha_debe_devolver` datetime NOT NULL,
  `disponible` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_libro_inv_id_idx` (`libro_inventario_id`),
  KEY `FK_alumno_matricula_idx` (`alumno_matricula`),
  CONSTRAINT `FK_alumno_matricula` FOREIGN KEY (`alumno_matricula`) REFERENCES `alumnos` (`matricula`),
  CONSTRAINT `FK_libro_inv_id` FOREIGN KEY (`libro_inventario_id`) REFERENCES `libros_inventario` (`libro_id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamos`
--

LOCK TABLES `prestamos` WRITE;
/*!40000 ALTER TABLE `prestamos` DISABLE KEYS */;
INSERT INTO `prestamos` VALUES (75,5,1930337,'2021-12-03 16:09:00','2021-12-03 16:10:00','2021-12-10 16:09:00',_binary ''),(76,6,1930337,'2021-12-03 16:10:00','2021-12-03 16:16:00','2021-12-10 16:10:00',_binary ''),(77,5,1930337,'2021-12-03 16:12:00','2021-12-03 16:12:00','2021-12-10 16:12:00',_binary ''),(78,5,1930337,'2021-12-03 16:15:00','2021-12-03 16:15:00','2021-12-10 16:15:00',_binary ''),(79,5,1930337,'2021-12-03 16:16:00',NULL,'2021-12-10 16:16:00',_binary ''),(80,6,1930337,'2021-12-03 16:17:00',NULL,'2021-12-10 16:17:00',_binary '');
/*!40000 ALTER TABLE `prestamos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `prestamos_v`
--

DROP TABLE IF EXISTS `prestamos_v`;
/*!50001 DROP VIEW IF EXISTS `prestamos_v`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `prestamos_v` AS SELECT 
 1 AS `id`,
 1 AS `libro_inventario_id`,
 1 AS `libro_id`,
 1 AS `libro_titulo`,
 1 AS `libro_tipo_recurso_nombre`,
 1 AS `libro_edicion`,
 1 AS `libro_editorial_nombre`,
 1 AS `libro_autores`,
 1 AS `libro_isbn`,
 1 AS `libro_estado`,
 1 AS `alumno_matricula`,
 1 AS `alumno_nombre`,
 1 AS `alumno_apellidos`,
 1 AS `alumno_carrera_nombre`,
 1 AS `fecha_prestamo`,
 1 AS `fecha_debe_devolver`,
 1 AS `fecha_devuelto`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `tipos_recursos`
--

DROP TABLE IF EXISTS `tipos_recursos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipos_recursos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(256) NOT NULL,
  `activo` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipos_recursos`
--

LOCK TABLES `tipos_recursos` WRITE;
/*!40000 ALTER TABLE `tipos_recursos` DISABLE KEYS */;
INSERT INTO `tipos_recursos` VALUES (1,'libro',_binary '');
/*!40000 ALTER TABLE `tipos_recursos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `alumnos_v`
--

/*!50001 DROP VIEW IF EXISTS `alumnos_v`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `alumnos_v` AS select `a`.`id` AS `id`,`a`.`matricula` AS `matricula`,`a`.`nombre` AS `nombre`,`a`.`apellidos` AS `apellidos`,`a`.`carrera_id` AS `carrera_id`,`c`.`nombre` AS `carrera_nombre`,`c`.`activo` AS `carrera_activo`,`a`.`fecha_ingreso` AS `fecha_ingreso`,`a`.`fecha_nacimiento` AS `fecha_nacimiento`,`a`.`genero` AS `genero` from (`alumnos` `a` join `carreras` `c` on((`a`.`carrera_id` = `c`.`id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `libros_inventario_existencia_v`
--

/*!50001 DROP VIEW IF EXISTS `libros_inventario_existencia_v`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `libros_inventario_existencia_v` AS select `l`.`id` AS `id`,`l`.`titulo` AS `titulo`,`l`.`tipo_recurso_id` AS `tipo_recurso_id`,`l`.`tipo_recurso_nombre` AS `tipo_recurso_nombre`,`l`.`tipo_recurso_activo` AS `tipo_recurso_activo`,`l`.`edicion` AS `edicion`,`l`.`editorial_id` AS `editorial_id`,`l`.`editorial_nombre` AS `editorial_nombre`,`l`.`editorial_pais` AS `editorial_pais`,`l`.`editorial_emial` AS `editorial_emial`,`l`.`editorial_activo` AS `editorial_activo`,`l`.`autores` AS `autores`,`l`.`isbn` AS `isbn`,`l`.`activo` AS `activo`,(select count(0) from `libros_inventario` `li` where ((`li`.`libro_id` = `l`.`id`) and (`li`.`disponible` = 1))) AS `cantidad_en_inventario` from `libros_v` `l` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `libros_inventario_v`
--

/*!50001 DROP VIEW IF EXISTS `libros_inventario_v`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `libros_inventario_v` AS select `l`.`id` AS `id`,`l`.`titulo` AS `titulo`,`l`.`tipo_recurso_id` AS `tipo_recurso_id`,`l`.`tipo_recurso_nombre` AS `tipo_recurso_nombre`,`l`.`tipo_recurso_activo` AS `tipo_recurso_activo`,`l`.`edicion` AS `edicion`,`l`.`editorial_id` AS `editorial_id`,`l`.`editorial_nombre` AS `editorial_nombre`,`l`.`editorial_pais` AS `editorial_pais`,`l`.`editorial_emial` AS `editorial_emial`,`l`.`editorial_activo` AS `editorial_activo`,`l`.`autores` AS `autores`,`l`.`isbn` AS `isbn`,`l`.`activo` AS `activo`,`li`.`id` AS `inventario_id`,`li`.`estado` AS `estado`,`li`.`disponible` AS `disponible` from (`libros_inventario` `li` join `libros_v` `l` on((`li`.`libro_id` = `l`.`id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `libros_v`
--

/*!50001 DROP VIEW IF EXISTS `libros_v`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `libros_v` AS select `l`.`id` AS `id`,`l`.`titulo` AS `titulo`,`l`.`tipo_recurso_id` AS `tipo_recurso_id`,`tr`.`nombre` AS `tipo_recurso_nombre`,`tr`.`activo` AS `tipo_recurso_activo`,`l`.`edicion` AS `edicion`,`l`.`editorial_id` AS `editorial_id`,`e`.`nombre` AS `editorial_nombre`,`e`.`pais` AS `editorial_pais`,`e`.`email` AS `editorial_emial`,`e`.`activo` AS `editorial_activo`,`l`.`autores` AS `autores`,`l`.`isbn` AS `isbn`,`l`.`activo` AS `activo` from ((`libros` `l` join `tipos_recursos` `tr` on((`l`.`tipo_recurso_id` = `tr`.`id`))) left join `editoriales` `e` on((`l`.`editorial_id` = `e`.`id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `prestamos_v`
--

/*!50001 DROP VIEW IF EXISTS `prestamos_v`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `prestamos_v` AS select `p`.`id` AS `id`,`p`.`libro_inventario_id` AS `libro_inventario_id`,`li`.`id` AS `libro_id`,`li`.`titulo` AS `libro_titulo`,`li`.`tipo_recurso_nombre` AS `libro_tipo_recurso_nombre`,`li`.`edicion` AS `libro_edicion`,`li`.`editorial_nombre` AS `libro_editorial_nombre`,`li`.`autores` AS `libro_autores`,`li`.`isbn` AS `libro_isbn`,`li`.`estado` AS `libro_estado`,`p`.`alumno_matricula` AS `alumno_matricula`,`a`.`nombre` AS `alumno_nombre`,`a`.`apellidos` AS `alumno_apellidos`,`a`.`carrera_nombre` AS `alumno_carrera_nombre`,`p`.`fecha_prestamo` AS `fecha_prestamo`,`p`.`fecha_debe_devolver` AS `fecha_debe_devolver`,`p`.`fecha_devuelto` AS `fecha_devuelto` from ((`prestamos` `p` join `libros_inventario_v` `li` on((`p`.`libro_inventario_id` = `li`.`id`))) join `alumnos_v` `a` on((`p`.`alumno_matricula` = `a`.`matricula`))) where (`li`.`disponible` = 0) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-03 16:39:12

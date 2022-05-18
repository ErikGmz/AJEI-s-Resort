-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-05-2022 a las 20:59:16
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6


CREATE DATABASE IF NOT EXISTS baseajei;
USE baseajei;


SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `baseajei`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `galeria`
--

CREATE TABLE `galeria` (
  `image_id` int(10) UNSIGNED NOT NULL,
  `description` varchar(50) NOT NULL,
  `image_path` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `galeria`
--

INSERT INTO `galeria` (`image_id`, `description`, `image_path`) VALUES
(1, 'Habitación Chaac Suite (T1)', 'src/img/fotos/habitacionsimple1.jpg'),
(2, 'Habitación Chaac Suite (T2)', 'src/img/fotos/habitacionsimple2.jpg'),
(3, 'Habitación Chaac Suite (T3)', 'src/img/fotos/habitacionsimple3.jpg'),
(4, 'Habitación Itzamná Suite (T1)', 'src/img/fotos/habitaciondoble1.jpg'),
(5, 'Habitación Itzamná Suite (T2)', 'src/img/fotos/habitaciondoble2.jpg'),
(6, 'Habitación Itzamná Suite (T3)', 'src/img/fotos/habitaciondoble3.jpg'),
(7, 'Habitación Kauil Suite (T1)', 'src/img/fotos/habitaciontriple1.jpg'),
(8, 'Habitación Kauil Suite (T2)', 'src/img/fotos/habitaciontriple2.jpg'),
(9, 'Habitación Kauil Suite (T3)', 'src/img/fotos/habitaciontriple3.jpg'),
(10, 'Bar del Resort', 'src/img/fotos/bar.jpg'),
(11, 'SPA de Lujo', 'src/img/fotos/spa.jpg'),
(12, 'Gimnasio del Resort', 'src/img/fotos/gimnasio.jpg'),
(13, 'Zona de Juegos', 'src/img/fotos/zonajuegos.jpg'),
(14, 'Canchas de Tennis', 'src/img/fotos/tennis.jpg'),
(15, 'Tiro con Arco', 'src/img/fotos/tiroconarco.jpg'),
(16, 'Campo de Golf', 'src/img/fotos/campogolf.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitaciones`
--

CREATE TABLE `habitaciones` (
  `room_type_id` int(10) UNSIGNED NOT NULL,
  `room_type` enum('S','D','T') NOT NULL,
  `rooms_count` tinyint(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `habitaciones`
--

INSERT INTO `habitaciones` (`room_type_id`, `room_type`, `rooms_count`) VALUES
(1, 'S', 9),
(2, 'D', 9),
(3, 'T', 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huespedes`
--

CREATE TABLE `huespedes` (
  `guest_id` int(10) UNSIGNED NOT NULL,
  `name` varchar(80) NOT NULL,
  `city` varchar(40) NOT NULL,
  `check_in` date NOT NULL,
  `check_out` date NOT NULL,
  `days` tinyint(4) NOT NULL DEFAULT 1,
  `room_id` varchar(3) NOT NULL,
  `room_type` enum('S','D','T') NOT NULL DEFAULT 'S',
  `floor` tinyint(2) NOT NULL DEFAULT 1,
  `guests` tinyint(5) NOT NULL DEFAULT 1,
  `extras` tinyint(2) NOT NULL DEFAULT 0,
  `active` tinyint(1) NOT NULL DEFAULT 0,
  `expense` double(9,2) NOT NULL DEFAULT 0.00
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `huespedes`
--

INSERT INTO `huespedes` (`guest_id`, `name`, `city`, `check_in`, `check_out`, `days`, `room_id`, `room_type`, `floor`, `guests`, `extras`, `active`, `expense`) VALUES
(1, 'Maricruz Jiménez', 'Aguascalientes', '2021-05-20', '2021-05-29', 9, '213', 'S', 2, 1, 0, 1, 0.00),
(2, 'Alejandro Montañez', 'Aguascalientes', '2019-05-18', '2019-06-04', 17, '105', 'D', 1, 2, 2, 1, 0.00),
(3, 'Erik Gómez', 'Aguascalientes', '2021-02-27', '2021-03-13', 14, '207', 'T', 2, 2, 0, 0, 98972.80),
(4, 'José Ramírez', 'Guanajuato', '2021-05-25', '2021-05-29', 4, '215', 'T', 2, 3, 1, 0, 30844.25),
(5, 'Emiliano Torres', 'Florida', '2021-05-19', '2021-05-28', 9, '212', 'D', 2, 2, 2, 1, 0.00),
(6, 'Carmen Guadalupe', 'Chihuahua', '2021-06-30', '2021-07-06', 6, '209', 'D', 2, 2, 0, 0, 34975.58),
(7, 'Ricardo Sánchez', 'Nueva York', '2021-06-19', '2021-06-30', 11, '208', 'S', 2, 1, 1, 1, 0.00),
(8, 'Salvador López', 'Guadalajara', '2021-05-25', '2021-06-06', 12, '207', 'T', 2, 3, 2, 0, 102733.23),
(9, 'Ernesto Galindo', 'Yucatán', '2021-06-26', '2021-07-02', 6, '103', 'T', 1, 3, 1, 1, 0.00),
(10, 'Mariana Velázquez', 'Oaxaca', '2021-11-13', '2021-11-15', 2, '211', 'S', 2, 1, 0, 0, 10116.84),
(11, 'Mariano Luna', 'Monterrey', '2021-02-09', '2021-02-15', 6, '104', 'S', 1, 1, 1, 1, 0.00),
(12, 'Sandra Juárez', 'Acapulco', '2021-06-30', '2021-07-11', 11, '215', 'T', 2, 3, 2, 1, 0.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `precios`
--

CREATE TABLE `precios` (
  `price_id` int(10) UNSIGNED NOT NULL,
  `room_type` enum('S','D','T') NOT NULL,
  `price` double(6,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `precios`
--

INSERT INTO `precios` (`price_id`, `room_type`, `price`) VALUES
(1, 'S', 4321.54),
(2, 'D', 5340.91),
(3, 'T', 6912.13);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

CREATE TABLE `servicios` (
  `guest_id` int(11) NOT NULL,
  `room_service` tinyint(1) NOT NULL DEFAULT 0,
  `bar_access` tinyint(1) NOT NULL DEFAULT 0,
  `cleaner_service` tinyint(1) NOT NULL DEFAULT 0,
  `SPA_service` tinyint(1) NOT NULL DEFAULT 0,
  `baby_sister_service` tinyint(1) NOT NULL DEFAULT 0,
  `gym_access` tinyint(1) NOT NULL DEFAULT 0,
  `gaming_access` tinyint(1) NOT NULL DEFAULT 0,
  `tennis_access` tinyint(1) NOT NULL DEFAULT 0,
  `bow_shooting` tinyint(1) NOT NULL DEFAULT 0,
  `golf_access` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `servicios`
--

INSERT INTO `servicios` (`guest_id`, `room_service`, `bar_access`, `cleaner_service`, `SPA_service`, `baby_sister_service`, `gym_access`, `gaming_access`, `tennis_access`, `bow_shooting`, `golf_access`) VALUES
(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
(2, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1),
(3, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1),
(4, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0),
(5, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0),
(6, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0),
(7, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1),
(8, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1),
(9, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1),
(10, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0),
(11, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1),
(12, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `user_id` int(10) UNSIGNED NOT NULL,
  `user_name` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`user_id`, `user_name`, `email`, `password`) VALUES
(1, 'Erik Gómez', 'erikgomez@ajei.com.mx', 'Ä>ôÞ¹ÑÞŒs€|ì'),
(2, 'Gabriel Galindo', 'gabogalindo@ajei.com.mx', 'kÔhM³·E£ÇiýIû'),
(3, 'Israel Mora', 'israel@ajei.com.mx', 'ZL¡Ý€y”*\'vgo‚²’'),
(4, 'Emmanuel Rodríguez', 'emmanuel@ajei.com.mx', 'Œ¨üÕ×¸ç“ÝŠ=]M'),
(5, 'Fernando Ramírez', 'fernandormz@ajei.com.mx', 'ó@OBÞ¦­QÞˆqæ¸—');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `galeria`
--
ALTER TABLE `galeria`
  ADD PRIMARY KEY (`image_id`);

--
-- Indices de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  ADD PRIMARY KEY (`room_type_id`);

--
-- Indices de la tabla `huespedes`
--
ALTER TABLE `huespedes`
  ADD PRIMARY KEY (`guest_id`);

--
-- Indices de la tabla `precios`
--
ALTER TABLE `precios`
  ADD PRIMARY KEY (`price_id`);

--
-- Indices de la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD PRIMARY KEY (`guest_id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `galeria`
--
ALTER TABLE `galeria`
  MODIFY `image_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  MODIFY `room_type_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `huespedes`
--
ALTER TABLE `huespedes`
  MODIFY `guest_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `precios`
--
ALTER TABLE `precios`
  MODIFY `price_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `user_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

CREATE TABLE `admin` (
  `id` bigint(20) NOT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `contraseña` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `perfil` int(11) DEFAULT '2',
  `provincia` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `company` (
  `id` bigint(20) NOT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `contraseña` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `perfil` int(11) DEFAULT '1',
  `provincia` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `name_company` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `ofertas` (
  `id` bigint(20) NOT NULL,
  `date_limit` datetime(6) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `salario` double NOT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `ubicacion` varchar(255) DEFAULT NULL,
  `visibilidad` int(11) DEFAULT '1',
  `company` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2ry3b1x99kyw0wasyo6a0x7ri` (`company`),
  CONSTRAINT `FK2ry3b1x99kyw0wasyo6a0x7ri` FOREIGN KEY (`company`) REFERENCES `company` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `empleado` (
  `id` bigint(20) NOT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `contraseña` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `perfil` int(11) DEFAULT '0',
  `provincia` varchar(255) DEFAULT NULL,
  `nacimiento` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `registro` (
  `id` bigint(20) NOT NULL,
  `fecha` datetime(6) DEFAULT NULL,
  `empleados` bigint(20) DEFAULT NULL,
  `ofertas` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK36pnxxgo1m4m99dut22g42pwd` (`empleados`),
  KEY `FKqotesh1j2i2sx9g0gaeqkrkiq` (`ofertas`),
  CONSTRAINT `FK36pnxxgo1m4m99dut22g42pwd` FOREIGN KEY (`empleados`) REFERENCES `empleado` (`id`),
  CONSTRAINT `FKqotesh1j2i2sx9g0gaeqkrkiq` FOREIGN KEY (`ofertas`) REFERENCES `ofertas` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


insert into admin(id,apellidos,contraseña, email, nombre) values
(1,'Sanco','1234', 'lara@gmail.com', 'Lara' ),
(11,'Conde','1234', 'Ivan@gmail.com', 'Ivan' );

insert into company(id, contraseña, email, ciudad, name_company, provincia, descripcion) values
(2, '1234', 'c1@c1.com','Madrid', 'NHTransportes', 'Madrid', 'Compañia encargada de transporte de mercancias peligrosas'),
(3,'1234',  'c2@c2.com', 'Barcelona', 'Event Venue BCN', 'Barcelona','Compañia encargada de organización de eventos'),
(4, '1234','c3@c3.com', 'Toledo', 'Toletech', 'Toledo', 'Compañia encargada de gestión de datos'),
(22, '1234','c4@c4.com', 'Madrid', 'MadMad', 'Madrid', 'Centros deportivos de alto rendimiento');

insert into ofertas(id, titulo, salario, ubicacion, date_limit, company, descripcion) values
(5, 'Event Planner', '5000', 'Madrid', '2020-12-17', 3, 'Se busca planificador de eventos con experencia en el sector tecnológico e idiomas'),
(6, 'Junior Consultant', '15000', 'Cataluña', '2020-12-12', 4, 'A realizar diversas tareas en el campo de consultas'),
(7, 'Financial Aid Advisor', '25000', 'País Vasco', '2020-3-15', 2, 'Para incorporación inmediata en el equipo del País Vasco, jornada parcial'),
(8, 'Jefe/a de Animación', '5000', 'Cantabria', '2020-12-17', 3, 'Para cubrir diversos eventos en la zona de Madrid, jornada parcial'),
(9, 'Category Management Manager', '15000', 'Cataluña', '2020-12-12', 2, 'A consultar los roles a desarrollar'),
(10, 'Sales Analyst', '25000', 'Madrid', '2020-3-15', 4, 'Periodo de prueba con el equipo de desarrollo'),
(23, 'Coach', '28000', 'Ciudad Real', '2020-3-25', 22, 'Incorporacion inmediata para equipo de Castilla La Mancha'),
(24, 'Nutricionista', '2500', 'Barcelona', '2020-4-28',22, 'Con posibilidad de contrato indefinido'),
(25, 'Senior Consultant', '28000', 'Madrid', '2020-5-25', 4, 'Capacidades de comunicación y búsqueda de requisitos'),
(26, 'Coordinador de equipo', '2500', 'País Vasco', '2020-6-28',4, 'A consultar jornada'),
(27, 'Camionero', '28000', 'Cantabria', '2020-3-25', 2, 'Para cubrir rutas de este a oeste'),
(28, 'Secretaria', '3500', 'Barcelona', '2020-4-28', 3, 'Paquete office a nivel avanzado');

insert into empleado (id, apellidos, ciudad, contraseña, email, nombre, provincia, nacimiento) values
(12, 'Navarro', 'Madrid', '1234', 'e1@e1.com', 'Mario', 'Madrid', '1990-03-03'),
(13, 'Gallego', 'Navarra', '1234', 'e2@e2.com', 'Victor', 'Navarra', '1991-03-03'),
(14, 'Muñóz', 'La Coruña', '1234', 'e3@e3.com', 'Sara', 'Galicia', '1992-03-03'),
(15, 'Sanchez', 'Cadiz', '1234', 'e4@e4.com', 'Manuel', 'Cadiz', '1993-03-03'),
(16, 'Gonzalez', 'Toledo', '1234', 'e5@e5.com', 'Benito', 'Castilla la Mancha', '1994-03-03'),
(17, 'Rodriguez', 'Leon', '1234', 'e6@e6.com', 'Maria', 'Castilla y León', '1995-03-03'),
(18, 'Lopez', 'Álava', '1234', 'e7@e7.com', 'Laura', 'País Vasco', '1996-03-03'),
(19, 'Berros', 'Salamanca', '1234', 'e8@e8.com', 'Victoria', 'Castilla y León', '1997-03-03'),
(54, 'Beltrán', 'Madrid', '1234', 'e9@e9.com', 'Gonzalo', 'Madrid', '1997-03-03');

insert into registro (id, fecha, empleados, ofertas) values
(29, '2020-02-02', '12', '5'),
(30, '2020-01-01', '13', '6'),
(31, '2020-02-03', '14', '7'),
(32, '2020-02-04', '15', '8'),
(33, '2020-02-02', '16', '9'),
(34, '2020-02-02', '17', '10'),
(35, '2020-02-05', '18', '23'),
(36, '2020-02-04', '19', '24'),
(37, '2020-02-05', '19', '5'),
(38, '2020-02-07', '12', '6'),
(39, '2020-02-02', '17', '7'),
(40, '2020-02-29', '16', '8'),
(41, '2020-02-03', '15', '9'),
(42, '2020-02-04', '14', '10'),
(43, '2020-02-05', '13', '23'),
(44, '2020-02-06', '12', '24'),
(45, '2020-02-07', '13', '5'),
(46, '2020-02-08', '14', '6'),
(47, '2020-02-08', '15', '7'),
(49, '2020-02-09', '19', '8'),
(50, '2020-02-29', '17', '5'),
(51, '2020-02-03', '18', '6'),
(52, '2020-02-20', '18', '7'),
(53, '2020-02-17', '13', '8');
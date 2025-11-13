--
-- Estructura de tabla para la tabla `pelicula`
--

CREATE TABLE `pelicula` (
  `id` int(11) NOT NULL,
  `titulo` varchar(255) NOT NULL,
  `año` int(11) NOT NULL,
  `genero` varchar(100) NOT NULL,
  `director` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pelicula`
--

INSERT INTO `pelicula` (`id`, `titulo`, `año`, `genero`, `director`) VALUES
(1, 'Origen', 2010, 'ciencia ficción', 'Christopher Nolan'),
(2, 'El Padrino', 1972, 'drama', 'Francis Ford Coppola'),
(3, 'El Caballero Oscuro', 2008, 'accion', 'Christopher Nolan'),
(4, 'Forrest Gump', 1994, 'drama', 'Robert Zemeckis'),
(5, 'Interstellar', 2014, 'ciencia ficción', 'Christopher Nolan'),
(6, 'Pulp Fiction', 1994, 'drama', 'Quentin Tarantino'),
(7, 'Matrix', 1999, 'ciencia ficción', 'Lana Wachowski, Lilly Wachowski'),
(8, 'Titanic', 1997, 'romance', 'James Cameron'),
(9, 'Jurassic Park', 1993, 'aventura', 'Steven Spielberg'),
(10, 'El Señor de los Anillos: La Comunidad del Anillo', 2001, 'fantasía', 'Peter Jackson'),
(11, 'Star Wars: Una Nueva Esperanza', 1977, 'ciencia ficción', 'George Lucas'),
(12, 'Gladiador', 2000, 'acción', 'Ridley Scott'),
(13, 'El Rey León', 1994, 'animación', 'Roger Allers, Rob Minkoff'),
(14, 'Volver al Futuro', 1985, 'ciencia ficción', 'Robert Zemeckis'),
(15, 'Harry Potter y la Piedra Filosofal', 2001, 'fantasía', 'Chris Columbus'),
(16, 'Avatar', 2009, 'ciencia ficción', 'James Cameron'),
(17, 'Toy Story', 1995, 'animación', 'John Lasseter'),
(18, 'Indiana Jones: En Busca del Arca Perdida', 1981, 'aventura', 'Steven Spielberg'),
(19, 'Los Vengadores', 2012, 'acción', 'Joss Whedon'),
(20, 'La La Land', 2016, 'musical', 'Damien Chazelle'),
(21, 'El Silencio de los Corderos', 1991, 'thriller', 'Jonathan Demme'),
(22, 'Cadena Perpetua', 1994, 'drama', 'Frank Darabont'),
(23, 'Parasite', 2019, 'thriller', 'Bong Joon-ho'),
(24, 'El Resplandor', 1980, 'terror', 'Stanley Kubrick'),
(25, 'Regreso al Futuro', 1985, 'ciencia ficción', 'Robert Zemeckis'),
(26, 'Blade Runner', 1982, 'ciencia ficción', 'Ridley Scott'),
(27, 'Django Desencadenado', 2012, 'western', 'Quentin Tarantino'),
(28, 'El Gran Hotel Budapest', 2014, 'comedia', 'Wes Anderson'),
(29, 'Whiplash', 2014, 'drama', 'Damien Chazelle'),
(30, 'El Viaje de Chihiro', 2001, 'animación', 'Hayao Miyazaki'),
(31, 'Ciudad de Dios', 2002, 'drama', 'Fernando Meirelles, Kátia Lund'),
(32, 'El Laberinto del Fauno', 2006, 'fantasía', 'Guillermo del Toro'),
(33, 'Drive', 2011, 'thriller', 'Nicolas Winding Refn'),
(34, 'Mad Max: Furia en la Carretera', 2015, 'acción', 'George Miller'),
(35, 'John Wick', 2014, 'acción', 'Chad Stahelski, David Leitch'),
(36, 'Kill Bill: Volumen 1', 2003, 'acción', 'Quentin Tarantino'),
(37, 'El Sexto Sentido', 1999, 'thriller', 'M. Night Shyamalan'),
(38, 'Psicosis', 1960, 'terror', 'Alfred Hitchcock'),
(39, 'Alien: El Octavo Pasajero', 1979, 'ciencia ficción', 'Ridley Scott'),
(40, 'Eternal Sunshine of the Spotless Mind', 2004, 'romance', 'Michel Gondry'),
(41, 'Scott Pilgrim vs. The World', 2010, 'comedia', 'Edgar Wright'),
(42, 'Spider-Man: Into the Spider-Verse', 2018, 'animación', 'Bob Persichetti, Peter Ramsey, Rodney Rothman'),
(43, 'El Protegido', 2000, 'thriller', 'M. Night Shyamalan'),
(44, 'Los Infiltrados', 2006, 'thriller', 'Martin Scorsese'),
(45, 'Shrek', 2001, 'animación', 'Andrew Adamson, Vicky Jenson'),
(46, 'Coco', 2017, 'animación', 'Lee Unkrich, Adrian Molina'),
(47, 'El Origen del Miedo', 2010, 'terror', NULL),
(48, 'El Último Testigo', 1972, 'suspense', NULL),
(49, 'Ciudad en Llamas', 2008, 'thriller', NULL),
(50, 'Corazones Perdidos', 1994, 'romance', NULL),
(51, 'Más Allá del Cosmos', 2014, 'aventura', NULL),
(52, 'Historias Cruzadas', 1994, 'comedia', NULL),
(53, 'Matrix', 1999, 'acción', 'Lana Wachowski, Lilly Wachowski'),
(54, 'Océano de Amor', 1997, 'drama', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
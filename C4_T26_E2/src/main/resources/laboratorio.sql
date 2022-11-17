DROP DATABASE IF EXISTS laboratorio;
CREATE DATABASE laboratorio;
USE laboratorio;

CREATE TABLE cientificos(
id int AUTO_INCREMENT PRIMARY KEY,
nom_apels VARCHAR(255)
);

CREATE TABLE proyectos(
id int AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(255),
horas INT 
);

CREATE TABLE asignado_a(
id int AUTO_INCREMENT PRIMARY KEY,
cientifico int,
proyecto int,
FOREIGN KEY(cientifico) REFERENCES cientificos(id)
ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY(proyecto) REFERENCES proyectos(id)
ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO cientificos(nom_apels) VALUES
('Victoria Lavega'),
('Jaume Curto'),
('Alvaro Lopez'),
('Ivan Herrero'),
('Dani Martos'),
('Carlos Montero'),
('Alberto Gonzalez'),
('Justin Bieber'),
('Benito Martinez'),
('Selena Gomez');

INSERT INTO proyectos (nombre,horas) values
('Reaccion de Caustificacion',100),
('Humo al vacio',50),
('Vortex Rings',150),
('Electrolisis de una mezcla de agua y sal',70),
('Explosion de burbujas',70),
('acido base',50),
('Reaccion de precipitacion',60),
('globo newtoniano',75),
('cuchara con agua',20),
('derretir una cuchara con agua',35);

INSERT INTO asignado_a (cientifico, proyecto) VALUES
 (1,1),
 (2,2),
 (3,3),
 (4,4),
 (5,5),
 (6,6),
 (7,7),
 (8,8),
 (9,9),
 (10,10);
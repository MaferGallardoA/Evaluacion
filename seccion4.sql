CREATE TABLE profesor (
  id_profesor NUMBER PRIMARY KEY,
  nombre VARCHAR2(50),
  especialidad VARCHAR2(50)
);

CREATE TABLE materia (
  id_materia NUMBER PRIMARY KEY,
  nombre VARCHAR2(50),
  id_profesor NUMBER,
  FOREIGN KEY (id_profesor) REFERENCES profesor(id_profesor)
);

-- Inserción de Profesores
INSERT INTO profesor (id_profesor, nombre, especialidad) VALUES (1, 'Carlos Pérez', 'Matemáticas');
INSERT INTO profesor (id_profesor, nombre, especialidad) VALUES (2, 'Ana Gómez', 'Física');
INSERT INTO profesor (id_profesor, nombre, especialidad) VALUES (3, 'Luis Martínez', 'Química');

-- Inserción de Materias
INSERT INTO materia (id_materia, nombre, id_profesor) VALUES (1, 'Álgebra', 1); 
INSERT INTO materia (id_materia, nombre, id_profesor) VALUES (2, 'Geometría', 1); 
INSERT INTO materia (id_materia, nombre, id_profesor) VALUES (3, 'Cálculo', 2); 
INSERT INTO materia (id_materia, nombre, id_profesor) VALUES (4, 'Termodinámica', 2); 
INSERT INTO materia (id_materia, nombre, id_profesor) VALUES (5, 'Química Orgánica', 3);

--nombre de la materia junto con el nombre del profesor que la imparte
SELECT materia.nombre AS nombre_materia, profesor.nombre AS nombre_profesor
FROM materia
JOIN profesor ON materia.id_profesor = profesor.id_profesor;

--cuántas materias tiene cada profesor
SELECT profesor.nombre AS nombre_profesor, COUNT(materia.id_materia) AS cantidad_materias
FROM profesor
LEFT JOIN materia ON profesor.id_profesor = materia.id_profesor
GROUP BY profesor.nombre;


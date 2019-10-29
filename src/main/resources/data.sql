CREATE TABLE registro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    contenido NVARCHAR(3500) NOT NULL,
    id_aplicacion NVARCHAR(6) NOT NULL,
    fecha_registro DATETIME NOT NULL
);
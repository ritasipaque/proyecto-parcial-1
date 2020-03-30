create database inicio_sesion;
use inicio_sesion;
create table inicios_sesion
(
  Inicio_secion int(11) NOT NULL,
  CodigoUsuario int(11) NOT NULL,
  PRIMARY KEY (Inicio_secion)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4


create table inicio_sesion.planilla
(
  CodigoDato_personal INT NOT NULL,
  Codigo_Ingreso INT NOT NULL,
  Codigo_Descuento VARCHAR(45) NULL
 ) PRIMARY KEY CodigoDato_personal;


CREATE TABLE inicio_sesion.registro_empleados (
  Codigo INT NOT NULL,
  CodigoEmpleado VARCHAR(45) NULL,
  CodigoCargo VARCHAR(45) NULL,
  FechaContrato DATE NULL,
  CodigoSueldo FLOAT NULL,
  PRIMARY KEY (Codigo));






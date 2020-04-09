CREATE DATABASE bd_ins800;
Use bd_ins800;
CREATE TABLE Mantenimiento
(
ID INT(20) auto_increment PRIMARY KEY ,
NombreEmpleado VARCHAR (60) NOT NULL , 
 DepartamentoEmpleado Varchar (60) NOT NULL ,
PuestoEmpleado VARCHAR (45) NOT NULL,
telefonoEmpleado  varchar (45)NOT NULL,
 CuentaEmpleado  VARCHAR (5) NOT NULL , 
 DireccionEmpleado Varchar (60) NOT NULL ,
 SexoEmpleado VARCHAR (45) NOT NULL ,
EdadEmpleado  varchar (45)NOT NULL,
CorreoEmpleado VARCHAR (45) NOT NULL
 )ENGINE = InnoDB DEFAULT 
CHARSET = latin1;

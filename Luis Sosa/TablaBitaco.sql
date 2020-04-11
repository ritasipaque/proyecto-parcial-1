create database Bitacora_BD13;
use Bitacora_BD13;

create table Bitacora_de_empleados1
(
ID int auto_increment primary key,
Codigo varchar(60) not null,
Empleado varchar(60) not null,
Cargo varchar(60) not null,
Fecha varchar(50) not null,
Sueldo varchar(50) not null,
Contraseña varchar(60) not null 

) ENGINE=InnoDB;

use Bitacora_BD13;
select * from Bitacora_de_empleados1;


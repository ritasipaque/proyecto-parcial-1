/*BITACORA*/

create database Bitacora_BD13;
use Bitacora_BD13;
create  table Bitacora_de_empleados1
(
ID int (20) auto_increment primary key,
Codigo varchar (60),
Empleado varchar (60),
Cargo varchar (60),
Fecha varchar (50),
Sueldo varchar (50),
Contraseña varchar (60) 
)ENGINE=InnoDB;

use Bitacora_BD13;
select* from  Bitacora_de_empleados1;
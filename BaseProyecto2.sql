create database BitacoraBD17;
use BitacoraBD17;

create table Bitacora_de_empleado17
(
ID int(50) primary key auto_increment,
Codigo varchar(60) not null,
Empleado varchar(60) not null,
Cargo varchar(60) not null,
Fecha varchar(50) not null,
Sueldo varchar(50) not null,
Contraseña varchar(60) not null 

) engine=InnoDB;

use BitacoraBD17;
select * from Bitacora_de_empleado17;

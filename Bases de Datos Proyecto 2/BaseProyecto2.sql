create database Bitacora_BD14;
use Bitacora_BD14;

create table Bitacora_de_empleado
(
ID int primary key,
Codigo varchar(60) not null,
Empleado varchar(60) not null,
Cargo varchar(60) not null,
Fecha varchar(50) not null,
Sueldo varchar(50) not null,
Contraseña varchar(60) not null 

) ENGINE=InnoDB;

use Bitacora_BD14;
select * from Bitacora_de_empleado;
update Bitacora_de_empleado set Contraseña='23451',Cargo='Contador/a',Sueldo='4000'
where ID = 1;

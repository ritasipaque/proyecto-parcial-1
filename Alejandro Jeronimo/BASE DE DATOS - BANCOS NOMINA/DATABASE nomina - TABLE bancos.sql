create database nominabancos;
use nominabancos;
create table bancos
(
	ID varchar(10) primary key,
    Nombre varchar(50) not null,
    Puesto varchar(50) not null,
    Sueldo varchar(15) not null,
    No_De_Cuenta varchar(15) not null,
    Igss varchar(10) not null,
    ISR varchar(10) not null
) engine=innodb;
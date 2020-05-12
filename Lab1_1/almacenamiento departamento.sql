create database A_D;
USE A_D;
create table  departamento (
id int (11) auto_increment  primary key,
departamento varchar (10)  null default null,
codigo  varchar (10) not null,
jefe  varchar (10) not null,
codigo1  varchar (10) not null,
puesto varchar (15)  null default null
)engine=InnoDB Default charset = latin1;




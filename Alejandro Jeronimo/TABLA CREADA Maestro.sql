/*create DATABASE Universidad;*/
/*usar la base de datos de Universidad*/
use universidad;

/*Creación de tablas*/
create table Maestro
(
	Codigo_Maestro int(20) auto_increment,
	Nombre_Maestro varchar(50) not null,
    Apellido_Maestro varchar(50) not null,
    Edad_Maestro varchar(5) not null,
    Correo_Electronico varchar(60) not null,
    No_Telefono varchar(20) not null,
    Profesion_Maestro varchar(50) not null,
    Facultad_impartida varchar(40),
    PRIMARY KEY (Codigo_Maestro)
) engine=innodb;

/*para editar tabla se usa el (drop table Maestro;)*/
create database nominab;
use nominab;
create table bancosss
(
	ID int(10) auto_increment primary key,
    Nombre varchar(50) not null,
    Puesto varchar(50) not null,
    Sueldo varchar(15) not null,
    NodeCuenta varchar(50) not null,
    HorasExtras varchar(10)not null,
    IGSS varchar(10) not null,
    ISR varchar(10) not null,
    Otros varchar(10) not null
) engine=innodb DEFAULT CHARSET=latin1;
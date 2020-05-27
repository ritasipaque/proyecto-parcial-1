create database nominabancos;
use nominabancos;
/*---------------------------------------------------*/
/*BASE DE DATOS RECIBO 1 BANCO INDUSTRIAL*/
create table bancoindustrial
(
	ID int(10) primary key,
    Nombre varchar(50) not null,
    Sueldo varchar(15) not null,
    NodeCuenta varchar(50) not null,
    HorasExtras varchar(10)not null,
    IGSS varchar(10) not null,
    ISR varchar(10) not null,
    Otros varchar(10) not null,
    Totales varchar(10) not null
) engine=innodb DEFAULT CHARSET=latin1;

use nominabancos;
select * from bancoindustrial;

/*---------------------------------------------------*/

/*BASE DE DATOS RECIBO 2 BANRURAL*/
create table bancobanrural
(
	ID int(10) primary key,
    Nombre varchar(50) not null,
    Sueldo varchar(15) not null,
    NodeCuenta varchar(50) not null,
    HorasExtras varchar(10)not null,
    IGSS varchar(10) not null,
    ISR varchar(10) not null,
    Otros varchar(10) not null,
    Totales varchar(10) not null
) engine=innodb DEFAULT CHARSET=latin1;

use nominabancos;
select * from bancobanrural;

/*---------------------------------------------------*/

/*BASE DE DATOS RECIBO 3 BANTRAB*/
create table bancobantrab
(
	ID int(10) primary key,
    Nombre varchar(50) not null,
    Sueldo varchar(15) not null,
    NodeCuenta varchar(50) not null,
    HorasExtras varchar(10)not null,
    IGSS varchar(10) not null,
    ISR varchar(10) not null,
    Otros varchar(10) not null,
    Totales varchar(10) not null
) engine=innodb DEFAULT CHARSET=latin1;

use nominabancos;
select * from bancobantrab;
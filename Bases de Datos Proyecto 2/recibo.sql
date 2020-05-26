/*RECIBO*/

create database  nominab;
use nominab;
create table bancosss
(
	ID int ( 10 ) primary key auto_increment ,
    Nombre varchar ( 50 ) not null ,
    Puesto varchar ( 50 ) not null ,
    Sueldo varchar ( 15 ) not null ,
    NodeCuenta varchar ( 50 ) not null ,
    HorasExtras varchar ( 10 ) not null ,
    IGSS varchar ( 10 ) not null ,
    ISR varchar ( 10 ) not null ,
    Otros varchar ( 10 ) not null
) ENGINE = InnoDB;

use nominab;
select * from bancosss; 
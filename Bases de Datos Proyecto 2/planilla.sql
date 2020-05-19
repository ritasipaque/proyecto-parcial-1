/*Planilla*/

create database nominaphase3;
use nominaphase3;
create table planilla
(
	ID  int (20) auto_increment primary key,
    CodigoNombre varchar (20),
	CodigoPuesto varchar (20),
    CodigoSueldo varchar (20),
    CodigoComisiones varchar (20),
    CodigoOtros varchar (20),
     CodigoAnticipos varchar (20),
    CodigoDescuento varchar (20),
    CodigoOtros2 varchar (20)
    )ENGINE=InnoDB;
    
use nominaphase3;
select * from planilla;
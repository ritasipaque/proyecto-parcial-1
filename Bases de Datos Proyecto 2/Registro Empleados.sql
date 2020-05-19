/*REGISTRO EMPLEADOS*/

create database nominaphase2;
use nominaphase2;
create table employee_record1
(
	ID  int (20) auto_increment primary key,
    Codigo varchar (20),
	CodigoEmpleado varchar (20),
    CodigoCargo varchar (20),
    CodigoFecha varchar (20),
    CodigoSueldo int (20)
    )ENGINE=InnoDB;
    
use nominaphase2;
select * from employee_record1;
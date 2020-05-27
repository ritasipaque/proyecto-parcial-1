create database nomina;
use nomina;
create table concepto(
id_empleado int (20)primary key,
nombre_empleado varchar(45),
estatus varchar(45),
naturaleza varchar(45),
tipo varchar(45),
sueldo_ordinario float(45),
sueldo_extraordinario float(45),
comisiones float(45),
bonificaciones float(45),
otros_ingresos float(45),
total_ingresos float(45),
anticipos float(45),
descuento_judicial float(45),
igss float (45),
isr float (45),
otros_descuentos float(45),
total_egresos float(45),
fecha_inicial varchar(45),
fecha_final varchar(45),
sueldo_liquido varchar(45)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;
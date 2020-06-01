CREATE DATABASE Proyectofinal;
USE Proyectofinal;
/*Planilla*/
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
    
    /*LOGIN*/
CREATE TABLE usuarios
(
  id int(11) auto_increment PRIMARY KEY ,
  usuario varchar(10) ,
  password varchar(45) ,
  nombre varchar(60) ,
  email varchar(30) ,
  idTipo int(11) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



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

create  table Bitacora_de_empleados1
(
ID int (20) auto_increment primary key,
Codigo varchar (60),
Empleado varchar (60),
Cargo varchar (60),
Fecha varchar (50),
Sueldo varchar (50),
Contraseña varchar (60) 
)ENGINE=InnoDB;

/*REGISTRO EMPLEADOS*/

create table employee_record1
(
	ID  int (20) auto_increment primary key,
    Codigo varchar (20),
	CodigoEmpleado varchar (20),
    CodigoCargo varchar (20),
    CodigoFecha varchar (20),
    CodigoSueldo int (20)
    )ENGINE=InnoDB;

/*Registro Empleados*/
CREATE TABLE Mantenimiento
(
ID INT(20) auto_increment PRIMARY KEY ,
NombreEmpleado VARCHAR (60) NOT NULL , 
 DepartamentoEmpleado Varchar (60) NOT NULL ,
PuestoEmpleado VARCHAR (45) NOT NULL,
telefonoEmpleado  varchar (45)NOT NULL,
 CuentaEmpleado  VARCHAR (5) NOT NULL , 
 DireccionEmpleado Varchar (60) NOT NULL ,
 SexoEmpleado VARCHAR (45) NOT NULL ,
EdadEmpleado  varchar (45)NOT NULL,
CorreoEmpleado VARCHAR (45) NOT NULL
 )ENGINE = InnoDB DEFAULT 
CHARSET = latin1;

CREATE TABLE puestos
(
id int (20) auto_increment  primary key,
codigo_puestos varchar(10) ,
nombre_empleado Varchar (45) ,
Estatus_puesto varchar (30),
Puesto varchar (20)


)Engine = InnoDB ;

create table  departamento (
id int (11) auto_increment  primary key,
departamento varchar (10)  null default null,
codigo  varchar (10) not null,
jefe  varchar (10) not null,
codigo1  varchar (10) not null,
puesto varchar (15)  null default null
)engine=InnoDB Default charset = latin1;


/*BASE DE DATOS DE RECIBOS*/
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
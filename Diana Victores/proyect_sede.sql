create table sede;
use UMG;
create table edificio
(
    Codigosede varchar (5) PRIMARY KEY,
    Nombrecarreras varchar (50) NOT null,
    Estatusedificio varchar (1) NOT null
    )engine=INNODB;

create table carreras
(
Codigocarreras varchar (5) primary key,
Nombrecarerras varchar (50) not null,
Estatuscarrera varchar (1) not null
)engine=innodb;

create table muebless
(
Codigomobiliario varchar (5) primary key,
Nombremueble varchar (50) not null,
Codigocarrera varchar (5) not null,
Codigomuebles varchar (5) not null,
EstatusEmpleado varchar (1) not null,
Codigosede varchar(5) not null,

foreign key (Codigosede) references edificio (Codigosede),
foreign key (Codigoedificio) references carreras (Codigoedificio)


)engine=innodb;



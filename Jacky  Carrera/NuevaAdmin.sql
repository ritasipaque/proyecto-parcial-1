create database admini;
use admini;
create table coordinadores
(
codigopuestocoordinador varchar(5) primary key,
nombrepuesto varchar(20) not null,
nombrepersona varchar(50) not null,
horariotrabajo varchar(20)not null
)engine=innodb;

create table catedraticos
(
codigopuestocatedratico varchar(5) primary key,
cursosqueimparte varchar(20) not null,
nombrecatedratico varchar(50) not null,
horariotrabaj varchar(20)not null,
sueldo varchar(10) not null,
diasquetrabaja varchar(40) not null
)engine=innodb;
create table oficina
(
nombrecarrera varchar(40) primary key,
codigopuestocatedratico varchar(5) not null,
codigopuestocoordinador varchar(5) not null,
horariocarrera varchar(20) not null,
cuotainscripcion varchar(10)not null,
cuotamensualidad varchar(10) not null,
numeropapeleria varchar(20) not null,
carnetestudiante varchar(10) not null,
foreign key (codigopuestocoordinador) references coordinadores(codigopuestocoordinador),
foreign key (codigopuestocatedratico) references catedraticos(codigopuestocatedratico)
)engine=innodb;
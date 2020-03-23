CREATE DATABASE es;
USE es ;
CREATE TABLE alumnos_clase ( 
codigoclase03 VARCHAR (20) PRIMARY KEY , 
codigocarrera03 VARCHAR (10) NOT NULL , 
codigosmestre VARCHAR (15) NOT NULL, 
horariosalumno03 VARCHAR (20) Not Null
);
CREATE TABLE datos_alumnos ( 
nombredelalumno03 varchar (25) PRIMARY KEY , 
carnetdelalumno03 VARCHAR (20) NOT NULL , 
asignacióndecursosdelalumno03 VARCHAR (20) Not Null, 
jornadadelalumno03 VARCHAR (10) NOT NULL,
pensumdelamuno03 VARCHAR (10) NOT NULL

);

CREATE TABLE control_academico03 ( 
notasprimerparcial03 VARCHAR (2) PRIMARY KEY , 
notasegundoparcial03 VARCHAR (2) NOT NULL , 
notas VARCHAR (2) NOT NULL, 
activididades03  VARCHAR (2) Not Null, 
extraordiarios03 VARCHAR (2) NOT NULL 
);
CREATE TABLE alumnos_clase1 ( 
codigoclase03 VARCHAR (20) PRIMARY KEY , 
codigocarrera03 VARCHAR (10) NOT NULL , 
codigosmestre03 VARCHAR (15) NOT NULL, 
horariosalumno03 VARCHAR (20) Not Null
);
alter table alumnos_clase1  add FOREIGN KEY(carnetdelalumno03 ) REFERENCES alumnos_clase(codigoclase03  );
alter table  alumnos_clase add FOREIGN KEY(codigosmestre) REFERENCES alumnos_clase(nombredelalumno03);
alter table  control_academico03 add  FOREIGN KEY(notas) REFERENCES datos_alumnos(asignacióndecursosdelalumno);
insert into alumnos_clase(codigoclase03 ) values('');
select * from datos_alumnos ;
select * from datos_alumnos1 ;
select * from control_academico03 ;
select * from  control_academico03 ;
insert into alumnos_clase(codigoclase03 ) values('');
insert into  control_academico03 ( (notas) values('');
insert into alumnos_clase(codigoclase03 ) values('');









CREATE DATABASE alumnos45;
USE alumnos45 ;
CREATE TABLE alumnos_clase ( 
codigoclase VARCHAR (20) PRIMARY KEY , 
codigocarrera VARCHAR (10) NOT NULL , 
codigosmestre VARCHAR (15) NOT NULL, 
horariosalumno VARCHAR (20) Not Null,
FOREIGN KEY(codigosmestre) REFERENCES alumnos_clase(nombredelalumno03)
) 
engine=InnoDB;
CREATE TABLE datos_alumnos ( 
nombredelalumno varchar (25) PRIMARY KEY , 
carnetdelalumno  VARCHAR (20) NOT NULL , 
carreradelalumno  VARCHAR (20) NOT NULL, 
asignacióndecursosdelalumno VARCHAR (20) Not Null, 
jornadadelalumno  VARCHAR (10) NOT NULL,
pensumdelamuno VARCHAR (10) NOT NULL,
FOREIGN KEY(carnetdelalumno) REFERENCES alumnos_clase(codigoclase));
CREATE TABLE control_academico ( 
notas VARCHAR (2) PRIMARY KEY ,
notasprimerparcial  VARCHAR (2),  
notasegundoparcial VARCHAR (2) NOT NULL , 
notafinal VARCHAR (2) NOT NULL, 
activididades VARCHAR (2) Not Null, 
extraordiarios VARCHAR (2) NOT NULL,
FOREIGN KEY(notas) REFERENCES datos_alumnos(asignacióndecursosdelalumno)
) engine=InnoDB;
CREATE TABLE carrerasalumnos
(
carrerasalumnos VARCHAR (5) PRIMARY KEY,
INGENIERIAS VARCHAR (10) NOT NULL,
DERECHO VARCHAR (10) NOT NULL,
ADMINISTRACIONDEEMPRESAS  VARCHAR (10) NOT NULL,
PSICOLOGIA VARCHAR (10) NOT NULL,
TRABAJOSOCIAL VARCHAR (10) NOT NULL,
FOREIGN KEY (carrerasalumno) REFERENCES  alumnos_clase(codigosemestre)
) engine=InnoDB;


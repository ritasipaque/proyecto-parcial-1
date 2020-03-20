create database if not exists Finanza;
use Finanza;

create table if not exists PagoDeColegiaturas(
colegiatura int auto_increment,
Mensualidad double,
Mora double,
primary key(sueldo)
)engine=InnoDB;
select*from PagoDeColegiatura;
insert into Sueldo(Mensualidad,Mora)values(775.00,25.00);
delete from PagoDeColegiatura where colegiatura=1;
update PagoDeColegiatura set Mensualidad=1550.00 where colegiatura=1;
update PagoDeColegiatura set Mora=50.00 where colegiatura=1;

create table if not exists Sueldo(
sueldo int auto_increment,
Director double,
Coordinador double,
Catedratico double,
primary key(sueldo)
)engine=InnoDB;
select*from Sueldo;
insert into Sueldo(Director,Coordinador,Catedratico)values(8000.00,4000.00,3000.00);
delete from Sueldo where sueldo=1;
update Sueldo set Director='7000.00' where sueldo=1;
update Sueldo set Coordinador='3500.00' where sueldo=1;
update Sueldo set Catedratico='2900.00' where sueldo=1;

create table if not exists FinanzaTotal
(
id_FinanzasTotal INT,
colegiatura INT,
sueldo INT
)engine=innoBD;


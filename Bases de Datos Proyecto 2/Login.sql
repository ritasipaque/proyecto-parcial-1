/*LOGIN*/

create database Nomina;
use Nomina;
create table Login
(
	id int  (50),
	Fecha_alta timestamp,
	CodigoUsuario blob (20) PRIMARY KEY,
	CodigoContrasenia blob (20)
) ENGINE=InnoDB;

use Nomina;
select * from Login;


/*insert into Login (CodigoUsuario, CodigoContrasenia) VALUES('Diana', '1234');*/







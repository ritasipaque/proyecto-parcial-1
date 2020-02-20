#include<iostream>
#include<fstream>
#include<string>
#include<stdlib.h>
#pragma warning(disable: 4996)
#pragma warning(supress: 4996)
#include <cstdlib>
using namespace std;
ifstream leer,no;
ofstream archivo,se;
ofstream temp;
 string palabra,nuevo,palabras;

  int resp; int rep,reps;
struct regla
	{

		char contra[100];

		char nombre[100], sexso[100], oficio[100],depatartamento[100],puesto[100],direccion[100],cuenta[100],codigo[100];
		int telefono ,edad;
         char txt[100];
           float emp,sueldo,sueldoex,bonificacion,comisiones,totaldeven;
    float  suma,suma1,horas,igss,isr,anticipos,descujudi,totaldescue,totalliquido;
    float suma2,suma3,suma4,suma5,suma6,suma7,suma8;
    float i;

	}datos;
	void nom() {
archivo.open("original nuevo 19.txt", ios::app);
if(archivo.is_open())
{
    //ingreso de los datos para formar la planilla

cout<<"ingrese la cantidad de empleados:"<<endl;
    cin >> datos.emp;
    for (float i=1;i<= datos.emp;i++)
    cout<<"Ingrese el nombre del empleado: ";
	cin>>datos.nombre;
	cout<<"Ingrese el puesto del empleado: ";
	cin>>datos.puesto;
   cout<<"Ingrese su sueldo: ";
	cin>>datos.sueldo;
	cout<<"Ingrese las horas trabajadas:";
	cin>>datos.horas;
//datos para calcular el sueldo extraordinario
	datos.suma=datos.sueldo/30/8;
	datos.suma1=datos.suma*01.5;
	datos.sueldoex=datos.suma1*datos.horas;

	cout<<"\n****** el total del sueldo extraordinario es de Q:"<<datos.sueldoex<<endl;
cout<<"Ingrese la bonificacion: ";
//calculando las bonificaiones
	cin>>datos.bonificacion;
	cout<<"Ingrese sus comisiones: ";
	cin>>datos.comisiones;
	if(datos.comisiones >=200)
    {cout<<"si hay comisiones ";

}
else{
    cout<<"no hay comisiones: ";
    }
 datos.totaldeven=datos.sueldo+datos.sueldoex+datos.bonificacion+datos.comisiones;


 cout<<"\n**********el total devengado es de Q:"<<datos.totaldeven<<endl;
 //calculo del IGSS
datos.suma2=datos.sueldo*04.83;
datos.igss=datos.suma2/100;
cout<<"\n**********el total del IGSS es de Q:"<<datos.igss<<endl;
if(datos.sueldo>5000)
    {cout<<"si hay ISR ";
//calculo de cuando el empleado tiene derecho a ISR
datos.suma3= datos.sueldo*12;
datos.suma4= datos.suma3*04.83/100;
datos.suma5=48000+12000+ datos.suma4;
datos.suma6= datos.suma3- datos.suma5;
datos.suma7= datos.suma6*0.05+5.78;
datos.isr= datos.suma7/6;
cout<<"\n**********el total de ISR es de Q:"<< datos.isr<<endl;

}
if(datos.sueldo<5000)
{cout<<"\n***************no hay ISR****************** ";
}
cout<<"\n Ingrese el anticipo: ";
	cin>> datos.anticipos;
cout<<"Ingrese el descuento judical: ";
	cin>> datos.descujudi;
	//calculo de sumas del total descuentos
datos.totaldescue= datos.igss+ datos.isr+ datos.anticipos+ datos.descujudi;
cout<<"\n**********el total de descuentos es de Q:"<< datos.totaldescue<<endl;
datos.totalliquido= datos.totaldeven- datos.totaldescue;
cout<<"\n**********el total liquido  es de Q:"<< datos.totalliquido<<endl;
//Almacenando con archivos la informacion de la planilla a traves de (txt)

archivo<<"\n*******datos de los empleados planilla***********\n"<<endl;
archivo<<datos.nombre<<"\t"<<datos.puesto<<"\t"<<endl;
archivo<<"\n"<<endl;
archivo<<"sueldos"<<endl;
archivo<<datos. sueldo<<"\t"<<endl;
archivo<<"sueldos Extraordinario"<<endl;
archivo<<datos.sueldoex<<"\t"<<endl;
archivo<<"Bonificaciones"<<endl;
archivo<<datos.bonificacion<<"\t"<<endl;
archivo<<"Comisones"<<endl;
archivo<<datos.comisiones<<"\t"<<endl;
archivo<<"Total Devengado"<<endl;
archivo<<datos.totaldeven<<"\t"<<endl;
archivo<<"Total Igss"<<endl;
archivo<<datos.igss<<"\t"<<endl;
archivo<<"Total Isr"<<endl;
archivo<<datos.isr<<"\t"<<endl;
archivo<<"Total Anticipos"<<endl;
archivo<<datos.anticipos<<"\t"<<endl;
archivo<<"Total Descuentos Judiciales"<<endl;
archivo<<datos.descujudi<<"\t"<<endl;
archivo<<"Total Descuentos"<<endl;
archivo<<datos. totaldescue<<"\t"<<endl;
archivo<<"total liquido"<<endl;
archivo<<datos.totalliquido<<"\t"<<endl;

}

		else
		{

			cout << "error" << endl;
		}
		archivo.close();
	}
	// Generando el recibo de pago
void navegar(){

leer.open("original nuevo 19.txt", ios::in);
if(leer.is_open())
    {
    while(!leer.eof()){
//Archivo del recibo de  Pago
leer>>datos.txt;
        leer>>datos.txt;
    cout<<datos.txt<<endl;

    }


    }leer.close();





}







void leerana(){
		leer.open("registro.txt");
		if (leer.is_open())
		{
			leer >> datos.nombre;
			bool encontrado = false;
			cout << "nombre" << endl;
			cin >> palabra;
			while (!leer.eof())
			{
				leer >> datos.nombre;
				if (datos.nombre == palabra)
				{
					encontrado = true;
        cout << datos.nombre << "\t"<<datos.sexso<<"\t"<<datos.direccion<<"\t"<<datos.telefono<<"\t"<<datos.edad<<"\t"<<endl;
		cout<<"\n"<<endl;
		cout <<"datos de empleado"<<endl;
		cout <<datos.codigo<<"\t"<<datos.cuenta<<"\t"<< datos.depatartamento << "\t"<<datos.puesto<<"\t"<<endl;

			}

			}

		}leer.close();

	}
void modificar_a() {
		leer.open("sistema.txt");
		archivo.open("sistema.txt");
		temp.open("temp.txt");
		if (leer.is_open() && temp.is_open())
		{
			leer >> datos.nombre;

			bool encontrado = false;
			cout << "nombre de empleado"<< endl;
				cin >> palabra;

			while (!leer.eof())
			{
				leer >> datos.nombre;

				if (datos.nombre==palabra)
				{
					encontrado = true;
					   cout << "datos personales" << endl;

          cout << "\n" << endl;
		cout << "ingrese nombre" << endl;
		cin>> datos.nombre;
		cout << "ingrese sexo" << endl;
		cin >>  datos.sexso;
		cout << "ingrese direcion" << endl;
		cin >> datos.oficio;

		cout << "ingrese telefono" << endl;
		cin >> datos.telefono;

		cout << "ingrese edad" << endl;
		cin >>  datos.edad;

        cout << "datos de  empleados" << endl;
        cout << "\n" << endl;
       cout << " codigo de  empleado" << endl;
        cin >>  datos.codigo;
        cout << "cuenta de  empleados" << endl;
        cin >>  datos.cuenta;
        cout << "depatamentos de   empleados" << endl;
        cin >>  datos.depatartamento;
        cout << "puesto de  empleados" << endl;
        cin >>  datos.puesto;
        cout << "\n" << endl;
        cout << "se  a guardado" << endl;
				archivo << datos.nombre << "\t"<<datos.sexso<<"\t"<<datos.direccion<<"\t"<<datos.telefono<<"\t"<<datos.edad<<"\t"<<datos.codigo<<"\t"<<datos.cuenta<<"\t"<< datos.depatartamento << "\t"<<datos.puesto<<"\t"<<endl;
			archivo <<"\n"<<endl;
					cout << "modificado"<<endl;
				}
				else
				{
					temp << datos.nombre << "" << endl;
				}
				leer >> datos.nombre;

		}
			if (encontrado==false)
			{
				cout << "nombre no" << endl;
			}
			leer.close();
			temp.close();
			remove("sistema.txt");
			rename("temp.txt", "sistema.txt");
		}
		else
		{
			cout << "error" << endl;
		}
	}
void eliminar_a() {
	leer.open("sistema.txt");
	temp.open("temp.txt");
	if (leer.is_open() && temp.is_open())
	{
		leer >> datos.codigo;
		leer >> datos.cuenta;
		bool encontro = false;
		cout << "ingrese nombre  empleado" << endl;
		cin >> palabra;


		while (!leer.eof())
		{
			leer >> datos.nombre;


				if (datos.cuenta == palabra)
				{
					encontro = true;
					cout << "eliminado" << endl;

				}
				else
				{

				}
			leer >> datos.nombre;
		}
		if (encontro == false)
		{
			cout << "no encontro" << endl;
		}

		leer.close();
		temp.close();
		remove("sistema.txt");
		rename("temp.txt", "sistema.txt");
	}
}
void registrop() {
		 archivo.open("sistema.txt", ios::app);
		if(archivo.is_open())
		{
        cout << "datos personales" << endl;

          cout << "\n" << endl;
		cout << "ingrese nombre" << endl;
		cin>> datos.nombre;
		cout << "ingrese sexo" << endl;
		cin >>  datos.sexso;
		cout << "ingrese direcion" << endl;
		cin >> datos.oficio;

		cout << "ingrese telefono" << endl;
		cin >> datos.telefono;

		cout << "ingrese edad" << endl;
		cin >>  datos.edad;

        cout << "datos de  empleados" << endl;
        cout << "\n" << endl;
       cout << " codigo de  empleado" << endl;
        cin >>  datos.codigo;
        cout << "cuenta de  empleados" << endl;
        cin >>  datos.cuenta;
        cout << "depatamentos de   empleados" << endl;
        cin >>  datos.depatartamento;
        cout << "puesto de  empleados" << endl;
        cin >>  datos.puesto;
        cout << "\n" << endl;
        cout << "se  a guardado" << endl;


		archivo << datos.nombre << "\t"<<datos.sexso<<"\t"<<datos.direccion<<"\t"<<datos.telefono<<"\t"<<datos.edad<<"\t"<<endl;
		archivo <<datos.codigo<<"\t"<<datos.cuenta<<"\t"<< datos.depatartamento << "\t"<<datos.puesto<<"\t"<<endl;
			archivo <<"\n"<<endl;

}
		else
		{
			cout << "error" << endl;
		}
		archivo.close();
	}
void bus(){

no.open("sistema.txt", ios::in);
if(no.is_open())
    {
    while(!no.eof()){
//Archivo del recibo de  Pago
no>>datos.txt;

    cout<<datos.txt<<endl;

    }


    }leer.close();





}
void registrop_a() {
		 archivo.open("registro.txt", ios::app);
		if(archivo.is_open())
		{
        cout << "datos personales" << endl;
          cout << "\n" << endl;
		cout << "ingrese nombre" << endl;
		cin>> datos.nombre;
		cout << "ingrese sexo" << endl;
		cin >>  datos.sexso;
		cout << "ingrese direcion" << endl;
		cin >> datos.oficio;
		cout << "datos personales" << endl;
		cout << "ingrese telefono" << endl;
		cin >> datos.telefono;
		cout << "ingrese edad" << endl;
		cin >>  datos.edad;

        cout << "datos de  empleados" << endl;
        cout << "\n" << endl;
        cout << "datos de codigo de  empleado" << endl;
        cin >>  datos.codigo;
        cout << "datos de  empleados" << endl;

        cin >>  datos.cuenta;
        cout << "depatamentos de   empleados" << endl;
        cin >>  datos.depatartamento;
        cout << "datos de  empleados" << endl;
        cin >>  datos.puesto;
        cout << "\n" << endl;
        cout << "se  a guardado" << endl;


archivo <<"datos de persanales empleado"<<endl;
		archivo << datos.nombre << "\t"<<datos.sexso<<"\t"<<datos.direccion<<"\t"<<datos.telefono<<"\t"<<datos.edad<<"\t"<<endl;
		archivo <<"\n"<<endl;
		archivo <<"datos de empleado"<<endl;
		archivo <<datos.codigo<<"\t"<<datos.cuenta<<"\t"<< datos.depatartamento << "\t"<<datos.puesto<<"\t"<<endl;
}
		else
		{
			cout << "error" << endl;
		}
		archivo.close();
	}
void matenimineto(){

do{
	      cout<<"agregar empleado 1"<<endl;
cout<<"buscar empleado 2"<<endl;
cout<<"moficar empleado 3"<<endl;
cout<<"eliminar empleado 4"<<endl;
cout<<"atras 5"<<endl;
cin>>rep;
switch(rep)

{


case 1 :

system("cls");
    registrop();

    break;
        case 2 :
system("cls");
  bus();

break;
        case 3:
          system("cls");
            modificar_a();
            break;
              case 4:
                  system("cls");
                  eliminar_a();    system("cls");

            break;
              case 5:
            system("pause");
  break;

}

}while(rep != 5);

 system("cls");
 }
void forma_de_pago(){}

void registropa() {
		 archivo.open("registro.txt", ios::app);
		if(archivo.is_open())
		{
        cout << "datos personales" << endl;
          cout << "\n" << endl;
		cout << "ingrese nombre" << endl;
		cin>> datos.nombre;
		cout << "ingrese sexo" << endl;
		cin >>  datos.sexso;
		cout << "ingrese direcion" << endl;
		cin >> datos.oficio;
		cout << "datos personales" << endl;
		cout << "ingrese telefono" << endl;
		cin >> datos.telefono;
		cout << "ingrese edad" << endl;
		cin >>  datos.edad;

        cout << "datos de  empleados" << endl;
        cout << "\n" << endl;
        cout << "datos de codigo de  empleado" << endl;
        cin >>  datos.codigo;
        cout << "datos de  empleados" << endl;

        cin >>  datos.cuenta;
        cout << "depatamentos de   empleados" << endl;
        cin >>  datos.depatartamento;
        cout << "datos de  empleados" << endl;
        cin >>  datos.puesto;
        cout << "\n" << endl;
        cout << "se  a guardado" << endl;


archivo <<"datos de persanales empleado"<<endl;
		archivo << datos.nombre << "\t"<<datos.sexso<<"\t"<<datos.direccion<<"\t"<<datos.telefono<<"\t"<<datos.edad<<"\t"<<endl;
		archivo <<"\n"<<endl;
		archivo <<"datos de empleado"<<endl;
		archivo <<datos.codigo<<"\t"<<datos.cuenta<<"\t"<< datos.depatartamento << "\t"<<datos.puesto<<"\t"<<endl;
}
		else
		{
			cout << "error" << endl;
		}
		archivo.close();
	}
void regi() {
		 archivo.open("seguridad.txt", ios::app);
		if(archivo.is_open())
		{
  cout<<"usuario"<<endl;
     cin>>datos.nombre;
      cout<<"contraseña"<<endl;
           cin>>datos.contra;
           archivo<<"\n";
           archivo<<datos.nombre<<"\t"<<datos.contra;
           archivo<<"\n";
		}

		else
		{
			cout << "error" << endl;
		}
		archivo.close();
	}
void sub_menu (){
    do{
cout<<"matenimineto de empleado 1"<<endl;
cout<<"nomina de la planilla 2"<<endl;
cout<<"forma de pago 3"<<endl;
cout<<"atras 4"<<endl;
cin>>reps;
switch(reps)
{
case 1 :
     system("cls");
    matenimineto();
    system("cls");

    break;
        case 2 :
            system("cls");
  nom();

break;
        case 3:
             system("cls");
           navegar();
            break;
  case 4:
             system("pause");
            break;
            		default:
			system("cls");
			cout << "no es valido" << endl;




 }

}while(reps != 4);

}
	 int main(){
	    system("color F8");
	     do{
	      cout<<"inciar sesion 1"<<endl;
cout<<"inciar nuevo usuario 2"<<endl;
cout<<"salir 3"<<endl;
cin>>rep;
switch(rep)

{
case 1 :
      se.open(("seguridad_de_registro.txt"),ios::app);
		leer.open(("seguridad.txt"),ios::in);

		if (leer.is_open()&&se.is_open())
		{
			leer >> datos.nombre;
			leer >> datos.contra;
			bool encontrado = false;
			cout << "usuario" << endl;
			cin >> palabra;
			cout << "contraseña" << endl;
			cin >> palabras;

			while (!leer.eof()){

				leer >> datos.nombre;
				leer >> datos.contra;
				if (datos.nombre == palabra && datos.contra == palabras){


					encontrado = true;

				cout << "bienvendo" << endl;
				cout << "\n" << endl;
 system("cls");
				   sub_menu();

          se<<"a acedido al programa"<<endl;


	}
	}




		}



    system("cls");

    break;
        case 2 :
            system("cls");
  regi();
  system("cls");
break;
        case 3:
            system("pause");
            break;
 system("cls");
 }
}while(rep != 3);
 return 0;
 }

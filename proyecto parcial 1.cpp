#include<iostream>
#include<fstream>
#include<string>
#include<stdlib.h>
#pragma warning(disable: 4996)
#pragma warning(supress: 4996)
#include <cstdlib>
using namespace std;
ifstream leer,ler ,le;
ofstream archivo,se;
ofstream temp;
 string palabra,nuevo,palabras,txt;
  int rep,reps;
struct regla
	{


		char contra[10];

		char nombre[10], sexso[10], oficio[10],depatartamento[10],puesto[10],direccion[10],cuenta[10],codigo[10];

    char    texto;


	}datos;

string nombre, sexso, oficio,depatartamento,puesto,direccion,cuenta,codigo, telefono ,edad,texto;
void regis() {
		 archivo.open("registro.txt", ios::app);
		if(archivo.is_open())
		{
		cout << "datos personales" << endl;

          cout << "\n" << endl;
		cout << "ingrese nombre" << endl;
		cin>> nombre;
		cout << "ingrese sexo" << endl;
		cin >>  sexso;
		cout << "ingrese direcion" << endl;
		cin >> direccion;

		cout << "ingere telefono" << endl;
		cin>> telefono;
        cout << "datos de  empleados" << endl;
        cout << "\n" << endl;
       cout << " codigo de  empleado" << endl;
        cin >>  codigo;
        cout << "cuenta de  empleados" << endl;
        cin >>  cuenta;
        cout << "depatamentos de   empleados" << endl;
        cin >>  depatartamento;
        cout << "puesto de  empleados" << endl;
        cin >>  puesto;
        cout << "\n" << endl;
        cout << "se  a guardado" << endl;


			archivo <<"\n"<<endl;
		archivo << nombre << "\t"<<sexso<<"\t"<<direccion<<"\t"<<telefono<<"\t"<<codigo<<"\t"<<cuenta<<"\t"<<depatartamento << "\t"<<puesto<<"\t"<<endl;

}
		else
		{
			cout << "error" << endl;
		}
		}
void modificar_a() {
		leer.open("registro.txt");
		temp.open("temp.txt");
		if (leer.is_open() && temp.is_open())
		{
			leer >> nombre;

			bool encontrado = false;
			cout << "ingrese numero de  codigo de  empleado"<< endl;
				cin >> palabra;

			while (!leer.eof())
			{
				leer >> nombre;

				if (nombre==palabra)
				{
					encontrado = true;
					cout << "nombre" << nombre;
					cin >> nuevo;
					temp << nuevo << endl;
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
			remove("registro.txt");
			rename("temp.txt", "resgistro.txt");
		}
		else
		{
			cout << "error" << endl;
		}
	}
void nomina(){}
void forma_de_pago(){
ler.open("registro.txt"),ios::in;
		if (ler.is_open())
		{

			while (!ler.eof())
			{
				ler >>txt;
				getline(ler,txt);
				cout<<txt<<endl;
			}

		}ler.close();}

void eliminar_a(){
		leer.open("registro.txt");
		temp.open("temp.txt");
		if (leer.is_open() && temp.is_open())
		{
			leer >> datos.codigo;
			leer >> datos.cuenta;
			bool encontro = false;
				cout << "ingrese numero de  codigo de  empleado"<< endl;
				cin >> palabra;
				cout << "ingrese numero de  cuenta de  empleado"<< endl;
				cin >> palabras;

		while (!leer.eof())
		{
			leer >> datos.codigo;
			leer >> datos.cuenta;
			if (datos.codigo== palabra)
			if (datos.cuenta== palabra)
			{
				encontro = true;
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
		cin>>telefono;
		cout << "ingrese edad" << endl;
		cin >>  edad;

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

				cout << "eliminado" << endl;
				cout << "se  a guardado" << endl;
				archivo <<"datos de persanales empleado"<<endl;
		archivo << datos.nombre << "\t"<<datos.sexso<<"\t"<<datos.direccion<<"\t"<<telefono<<"\t"<<edad<<"\t"<<endl;
		archivo <<"\n"<<endl;
		archivo <<"datos de empleado"<<endl;
		archivo <<datos.codigo<<"\t"<<datos.cuenta<<"\t"<< datos.depatartamento << "\t"<<datos.puesto<<"\t"<<endl;

			}
			else
			{
				archivo <<"datos de persanales empleado"<<endl;
		temp << datos.nombre << "\t"<<datos.sexso<<"\t"<<datos.direccion<<"\t"<<telefono<<"\t"<<edad<<"\t"<<endl;
		temp<<"\n"<<endl;
		temp<<"datos de empleado"<<endl;
		temp<<datos.codigo<<"\t"<<datos.cuenta<<"\t"<< datos.depatartamento << "\t"<<datos.puesto<<"\t"<<endl;
		     }
		leer >> datos.nombre;
		}
		if (encontro == false)
		{
			cout << "no encontro" << endl;
		}

		leer.close();
		temp.close();
		remove("registro.txt");
		rename("temp.txt", "registro.txt");
		 }


	}
void registrop() {
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

		cout << "ingrese telefono" << endl;
		cin >> telefono;
cout << "\n" << endl;
		cout << "ingrese edad" << endl;
		cin >>  edad;

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


		archivo << datos.nombre << "\t"<<datos.sexso<<"\t"<<datos.direccion<<"\t"<<telefono<<"\t"<<edad<<"\t"<<datos.codigo<<"\t"<<datos.cuenta<<"\t"<< datos.depatartamento << "\t"<<datos.puesto<<"\t"<<endl;
			archivo <<"\n"<<endl;

}
		else
		{
			cout << "error" << endl;
		}
		archivo.close();
	}
void buscar(){
 ler.open("registro.txt"),ios::in;
		if (ler.is_open())
		{

			while (!ler.eof())
			{
				ler >>txt;
				getline(ler,txt);
				cout<<txt<<endl;
			}

		}ler.close();}
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
		cin >> telefono;
		cout << "ingrese edad" << endl;
		cin >>  edad;

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
		archivo << datos.nombre << "\t"<<datos.sexso<<"\t"<<datos.direccion<<"\t"<<telefono<<"\t"<<edad<<"\t"<<endl;
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
    regis();

    break;
        case 2 :
            system("cls");
buscar();
 system("pause");
break;
        case 3:
            system("pause");
            modificar_a();
            break;
              case 4:
            system("cls");
            eliminar_a();
            break;
              case 5:
                system("pause");
  break;

}

}while(rep != 4);

 system("cls");
 }
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
		cout << "ingrese telefono" << endl;
		cin >> telefono;
		cout << "ingrese edad" << endl;
		cin >>  edad;

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
		archivo << datos.nombre << "\t"<<datos.sexso<<"\t"<<datos.direccion<<"\t"<<telefono<<"\t"<<edad<<"\t"<<endl;
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
    matenimineto();
    system("cls");

    break;
        case 2 :
            system("cls");
            nomina();
break;
        case 3:
             system("cls");
           forma_de_pago();
            break;
  case 4:
             system("pause");

            break;



 }

}while(rep != 4);

}
	 int main(){
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

				   sub_menu();

          se<<"a acedido al programa"<<endl;


	}
	}




		}buscar();



    system("cls");

    break;
        case 2 :
            system("cls");
  registrop();
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

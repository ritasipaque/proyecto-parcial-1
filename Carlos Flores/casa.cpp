#include<iostream>
#include<fstream>
#include<string>
#include<stdlib.h>
using namespace std;
ifstream leer;
ofstream archivo;
ofstream temp;

int resp;
string palabra,nuevo,palabras;
	struct regla
	{

		char nombre[100], sexso[100], oficio[100],depatartamento[100],puesto[100],direccion[100],cuenta[100],codigo[100];
		int telefono ,edad;
		long indice;


	}datos;


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
	void leera()
	{
		leer.open("registro.txt");
		if (leer.is_open())
		{
			leer >> datos.nombre;
			leer >> datos.codigo;

			bool encontrado = false;
			cout << "codigo de  empleado" << endl;
			cin >> palabra;
			while (!leer.eof())
			{
				leer >> datos.codigo;
				if (datos.codigo == palabra)
				{
					encontrado = true;
						cout << " ya esta" << endl;
        cout << datos.nombre << "\t"<<datos.sexso<<"\t"<<datos.direccion<<"\t"<<datos.telefono<<"\t"<<datos.edad<<"\t"<<endl;
		cout<<"\n"<<endl;
		cout <<"datos de empleado"<<endl;
		cout <<datos.codigo<<"\t"<<datos.cuenta<<"\t"<< datos.depatartamento << "\t"<<datos.puesto<<"\t"<<endl;

			}

			}

		}leer.close();

	}


	void eliminar()
	{
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

				cout << "eliminado" << endl;
				cout << "se  a guardado" << endl;
				archivo <<"datos de persanales empleado"<<endl;
		archivo << datos.nombre << "\t"<<datos.sexso<<"\t"<<datos.direccion<<"\t"<<datos.telefono<<"\t"<<datos.edad<<"\t"<<endl;
		archivo <<"\n"<<endl;
		archivo <<"datos de empleado"<<endl;
		archivo <<datos.codigo<<"\t"<<datos.cuenta<<"\t"<< datos.depatartamento << "\t"<<datos.puesto<<"\t"<<endl;

			}
			else
			{
				archivo <<"datos de persanales empleado"<<endl;
		temp << datos.nombre << "\t"<<datos.sexso<<"\t"<<datos.direccion<<"\t"<<datos.telefono<<"\t"<<datos.edad<<"\t"<<endl;
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

	void modificar() {
		leer.open("registro.txt");
		temp.open("temp.txt");
		if (leer.is_open() && temp.is_open())
		{
			leer >> datos.codigo;
			leer >> datos.cuenta;
			bool encontrado = false;
			cout << "ingrese numero de  codigo de  empleado"<< endl;
				cin >> palabra;
				cout << "ingrese numero de  cuenta de  empleado"<< endl;
				cin >> palabras;
			while (!leer.eof())
			{
				leer >> datos.codigo;
			leer >> datos.cuenta;
				if (datos.nombre==palabra)
				{
					encontrado = true;
					cout << "nombre" << datos.nombre;
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
	int main() {

		cout << "selecione" << endl;
		cout << "registro 1" << endl;
		cout << "leer     2" << endl;
		cout << "eliminar 3" << endl;
		cout << "modificar 4" << endl;
		cin >> resp;
		switch (resp)
		{
		case 1:

			registrop();
			break;

		case 2:
			leera();
			break;
		case 3:
			eliminar();
			break;

		case 4:
			modificar();
			break;
	}
	system("pause");
	return 0;
}

#include<iostream>
#include<fstream>
#include<string>
using namespace std;
ifstream leer;
ofstream archivo;
ofstream temp;

int resp;
string palabra,nuevo;
	struct regla
	{

		char nombre[100], sexso[100], oficio[100];
		int telefono ,edad;
		long indice;


	}datos;


	void registrop() {
		 archivo.open("registro.txt", ios::app);
		if(archivo.is_open())
		{
		cout << "ingrese nombre" << endl;
		cin>> datos.nombre;
		cout << "ingrese sexo" << endl;
		cin >>  datos.sexso;
		cout << "ingrese oficio" << endl;
		cin >> datos.oficio;
		cout << "ingrese telefono" << endl;
		cin >> datos.telefono;
		cout << "ingrese edad" << endl;
		cin >>  datos.edad;
		archivo<<datos.indice<<"\t" << datos.nombre << "\t"<<datos.sexso<<"\t"<<datos.oficio<<"\t"<<datos.telefono<<"\t"<<datos.edad<<"\t"<<endl;
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

			cout << "nombre" << endl;
			cin >> palabra;
			while (!leer.eof())
			{
				leer >> datos.nombre;
				if (datos.nombre == palabra)
				{
					leer >> datos.nombre;

					cout << " ya esta" << endl;

				cout << "\n" << endl;

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
			leer >> datos.nombre;
			bool encontro = false;
				cout << "ingrese nombre a eliminar" << endl;
				cin >> palabra;

		while (!leer.eof())
		{
			leer >> datos.nombre;
			if (datos.nombre == palabra)
			{
				encontro = true;
				cout << "nombre" << datos.nombre << endl;
				cout << "\n" << endl;
				cout << "eliminado" << endl;
			}
			else
			{
				temp <<""<< datos.nombre << endl;
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
			leer >> datos.nombre;
			bool encontrado = false;
			cout << "ingrese nombre a nodificar" << endl;
			cin >> palabra;
			while (!leer.eof())
			{
				leer >> datos.nombre;
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

	return 0;
}


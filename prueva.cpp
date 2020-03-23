#include<iostream>
#include<fstream>
#include<string>
#include<stdlib.h>
#pragma warning(disable: 4996)
#pragma warning(supress: 4996)
#include <cstdlib>
using namespace std;
ifstream leer;
ofstream archivo,se;
ofstream temp;
 string palabra,nuevo,palabras,texto;
  int rep,reps;
  string txt;
  int main(){

  leer.open("registro.txt"),ios::in;
		if (leer.is_open())
		{

			while (!leer.eof())
			{
				leer >>txt;
				getline(leer,txt);
				cout<<txt<<endl;
			}

		}leer.close();

	}




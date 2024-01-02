package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aplicacion 
{
	BufferedReader br;
	TablaDispersa tablaEquipos;
	public Aplicacion() 
	{ 
		tablaEquipos = new TablaDispersa();
		br = new BufferedReader(new InputStreamReader(System.in));
	}

public void Menu() throws IOException
{	
	boolean salir = false;
	do 
	{
	System.out.println("1. Crear equipo\n2. Dar puntos a equipo\n"
			+ "3. Dar goles a favor\n4. Dar goles en contra\n"
			+ "5. Ver puntuaciones\n6. Salir");
	System.out.println("Escribe el numero de la accion deseada: ");
	int opcion = br.read();
	switch(opcion) 
	{
	case 1:
		CrearEquipo();
		break;
	case 2:
		{
		DarPuntos();
			break;
		}
	case 3:
		{
		DarGolesFavor();
			break;
		}
	case 4:
		{
		DarGolesContra();
			break;
		}
	case 5:
		{
		VerPuntuaciones();
			break;
		}
	case 6:
		{
		salir = true;
		System.out.println("Saliendo del sistema...");
		break;
		}
	default:
		System.out.println("Opcion no valida");
		break;
	}	
	}while(salir == false);
}

public void CrearEquipo() throws IOException
{
	if(tablaEquipos.numElementos < 21) 
	{
		System.out.println("Nombre del equipo: ");
		String nombre = br.readLine();
		tablaEquipos.insertar(new Equipo(nombre));
	} 
	else System.out.println("Hay demasiados equipos");
}
public void DarPuntos() throws IOException
{
	
}
public void DarGolesFavor() throws IOException
{
	
}
public void DarGolesContra() throws IOException
{
	
}
public void VerPuntuaciones() throws IOException
{
	
}
}
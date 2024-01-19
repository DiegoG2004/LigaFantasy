package classes;

import java.util.Scanner;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class Aplicacion 
{    
	private Scanner scanner;
	//BufferedReader br;
	TablaDispersa tablaEquipos;
	public Aplicacion() 
	{ 
		tablaEquipos = new TablaDispersa();
        scanner = new Scanner(System.in);

		//br = new BufferedReader(new InputStreamReader(System.in));
	}

public void Menu() 
{	
	boolean salir = false;
	do 
	{
	System.out.println("1. Crear equipo\n2. Dar puntos a equipo\n"
			+ "3. Dar goles a favor\n4. Dar goles en contra\n"
			+ "5. Ver puntuaciones\n6. Salir");
	System.out.println("Escribe el numero de la accion deseada: ");
	//int opcion = br.read();
	int opcion = scanner.nextInt();
	switch(opcion) 
	{
	case 1:
		crearEquipo();
		break;
	case 2:
		{
		darPuntos();
			break;
		}
	case 3:
		{
		darGolesFavor();
			break;
		}
	case 4:
		{
		darGolesContra();
			break;
		}
	case 5:
		{
		verPuntuaciones();
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

public void crearEquipo() 
{
	if(tablaEquipos.numElementos < 21) 
	{
		System.out.println("Nombre del equipo: ");
		//String nombre = br.readLine();
        String nombre = scanner.nextLine();
		tablaEquipos.insertar(new Equipo(nombre));
	} 
	else System.out.println("Hay demasiados equipos");
}
public void darPuntos() 
{
	System.out.println("Nombre del equipo: ");
	//String nombre = br.readLine();
    String nombre = scanner.nextLine();
	System.out.println("\nCantidad de puntos (0, 1 o 3): ");
	//String entrada = br.readLine();
    int puntos = scanner.nextInt();

	//int puntos = Integer.parseInt(entrada);
	//if(tablaEquipos.buscar(nombre).puntos += puntos <=3)
    while(puntos!=0&&puntos!=1&&puntos!=3) {
    	System.out.println("\nERROR: Introduce 0, 1 o 3. ");
        puntos = scanner.nextInt();
    }
    if (tablaEquipos.buscar(nombre) != null) {
		tablaEquipos.buscar(nombre).puntos += puntos;
    } else {
        System.out.println("Este equipo no existe");
    }
    
    //else System.out.println("Este equipo tiene demasiados puntos");
}
public void darGolesFavor() 
{
	System.out.println("Nombre del equipo: ");
    String nombre = scanner.nextLine();
    
    while(tablaEquipos.buscar(nombre) == null){
    	System.out.println("Este equipo no existe. Introduzca de nuevo el nombre del equipo: ");
        nombre = scanner.nextLine();
    }
	System.out.println("\nCantidad de goles a favor: ");
		//String entrada = br.readLine();
		//int goles = Integer.parseInt(entrada);
    int goles = scanner.nextInt();
	tablaEquipos.buscar(nombre).golesFavor += goles;
}

public void darGolesContra() 
{
	System.out.println("Nombre del equipo: ");
    String nombre = scanner.nextLine();
    
    while(tablaEquipos.buscar(nombre) == null){
    	System.out.println("Este equipo no existe. Introduzca de nuevo el nombre del equipo: ");
        nombre = scanner.nextLine();
    }
	System.out.println("\nCantidad de goles en contra: ");
    int goles = scanner.nextInt();
	tablaEquipos.buscar(nombre).golesContra += goles;
	
	/*if(tablaEquipos.buscar(nombre) != null) //Esto no lo tengo muy claro
	{
		System.out.println("\nCantidad de goles en contra: ");
		String entrada = br.readLine();
		int goles = Integer.parseInt(entrada);
		tablaEquipos.buscar(nombre).golesContra += goles;
	} else System.out.println("Este equipo no existe");*/
}
public void verPuntuaciones() 
{
	
}
}
package classes;

import java.util.Scanner;


public class Aplicacion 
{    
	private Scanner scanner;
	TablaDispersa tablaEquipos;
	public Aplicacion() 
	{ 
		tablaEquipos = new TablaDispersa();
        scanner = new Scanner(System.in);
	}

public void Menu() 
{	
	boolean salir = false;
	do 
	{
	System.out.println("\n\n1. Crear equipo\n2. Dar puntos a equipo\n"
			+ "3. Dar goles a favor\n4. Dar goles en contra\n"
			+ "5. Ver puntuaciones\n6. Salir");
	System.out.println("\nEscribe el numero de la accion deseada: ");
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
		System.out.println("\nSaliendo del sistema...");
		break;
		}
	default:
		System.out.println("\nOpcion no valida");
		break;
	}	
	}while(salir == false);
}

public void crearEquipo() 
{
	if(tablaEquipos.numElementos < 21) 
	{
		System.out.println("\nNombre del equipo: ");
		scanner.nextLine();
        String nombre = scanner.nextLine();
        if(tablaEquipos.buscar(nombre) != null) {
        	System.out.println("\nEste equipo ya existe.");
        }else{
        	tablaEquipos.insertar(new Equipo(nombre));
        	System.out.println("\nEquipo nuevo guardado.");
        }
		
	} 
	else System.out.println("\nHay demasiados equipos");
}

public void darPuntos() 
{
	System.out.println("\nNombre del equipo: ");
	scanner.nextLine();
    String nombre = scanner.nextLine();
    if(tablaEquipos.buscar(nombre) == null)
    {
    	System.out.println("\nEste equipo no existe.");
    }else{
    	System.out.println("\nCantidad de puntos (0, 1 o 3): ");
        int puntos = scanner.nextInt();

        while(puntos!=0&&puntos!=1&&puntos!=3) {
        	System.out.println("\nERROR: Introduce 0, 1 o 3. ");
            puntos = scanner.nextInt();
        }
        tablaEquipos.buscar(nombre).puntos += puntos;
    } 
}

public void darGolesFavor() 
{
	System.out.println("\nNombre del equipo: ");
	scanner.nextLine();
    String nombre = scanner.nextLine();
    
    if(tablaEquipos.buscar(nombre) == null)
    {
    	System.out.println("\nEste equipo no existe.");
    }else{
		System.out.println("\nCantidad de goles a favor (0-7): ");
	    int goles = scanner.nextInt();
	    while(goles<0||goles>7) {
	    	System.out.println("\nERROR: Introduce un numero del 0 al 7: ");
            goles = scanner.nextInt();
	    }
		tablaEquipos.buscar(nombre).golesFavor += goles;
    }
}

public void darGolesContra() 
{
	System.out.println("\nNombre del equipo: ");
	scanner.nextLine();
    String nombre = scanner.nextLine();
    
    if(tablaEquipos.buscar(nombre) == null)
    {
    	System.out.println("\nEste equipo no existe.");
    }else{
		System.out.println("\nCantidad de goles en contra (0-7): ");
	    int goles = scanner.nextInt();
	    while(goles<0||goles>7) {
	    	System.out.println("\nERROR: Introduce un numero del 0 al 7: ");
            goles = scanner.nextInt();
	    }
		tablaEquipos.buscar(nombre).golesContra += goles;
    }
}
public void verPuntuaciones() 
{
	// Obtener los equipos en un array
    Equipo[] equipos = tablaEquipos.obtenerEquipos();

    // Llamar a shellSort para ordenar el array
    ShellSort.shellSort(equipos);

    // Imprimir el estado después de ordenar
    for (Equipo equipo : equipos) {
        System.out.println(equipo);
    }

}
}
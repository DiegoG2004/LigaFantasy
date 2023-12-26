package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import classes.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Equipo UDAlmeria = new Equipo();
		UDAlmeria.Nombre = "UD Almeria";
		Equipo RayoVallecano = new Equipo();
		RayoVallecano.Nombre = "Rayo Vallecano";
		Equipo RealSociedad = new Equipo();
		RealSociedad.Nombre = "Real Sociedad";
		Equipo GironaFC = new Equipo();
		GironaFC.Nombre = "Girona FC";
		Equipo AthleticClub = new Equipo();
		AthleticClub.Nombre = "Athletic Club";
		Equipo RealMadrid = new Equipo();
		RealMadrid.Nombre = "Real Madrid";
		Equipo VillarrealCF = new Equipo();
		VillarrealCF.Nombre = "Villareal CF";
		Equipo RealBetis = new Equipo();
		RealBetis.Nombre = "RealBetis";
		Equipo CadizCF = new Equipo();
		CadizCF.Nombre = "Cadiz CF";
		Equipo DeportivoAlaves = new Equipo();
		DeportivoAlaves.Nombre = "Deportivo Alaves";
		Equipo SevillaFC = new Equipo();
		SevillaFC.Nombre = "Sevilla FC";
		Equipo ValenciaCF = new Equipo();
		ValenciaCF.Nombre = "Valencia CF";
		Equipo UDLasPalmas = new Equipo();
		UDLasPalmas.Nombre = "UD Las Palmas";
		Equipo RCDMallorca = new Equipo();
		RCDMallorca.Nombre = "RCD Mallora";
		Equipo RCCelta = new Equipo();
		RCCelta.Nombre = "RC Celta";
		Equipo CAOsasuna = new Equipo();
		CAOsasuna.Nombre = "CA Osasuna";
		Equipo GetafeCF = new Equipo();
		GetafeCF.Nombre = "Getafe CF";
		Equipo FCBarcelona = new Equipo();
		FCBarcelona.Nombre = "FC Barcelona";
		Equipo AtleticoDeMadrid = new Equipo();
		AtleticoDeMadrid.Nombre = "Atletico de Madrid";
		Equipo GranadaCF = new Equipo();
		GranadaCF.Nombre = "Granada CF";
		
		//NO ESTOY SEGURO SI SE HACE ASI O LO TIENE QUE PONER EL USUARIO PERO LO DEJO QUE ME HA LLEVADO UN BUEN RATO
		
		//Esta linea solo es para poder leer inputs del usuario
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean salir = false;
		
		TablaDispersa tablaEquipos = new TablaDispersa();
		//Añadir equipos del sistema a la tabla
		//no se si esta bien 
		for (int i=0;i<21;i++)
		{
		    Equipo nuevoEquipo = new Equipo();
		    nuevoEquipo.Nombre = "Equipo " + (i + 1);
		    tablaEquipos.insertar(nuevoEquipo);
		}
		while(salir == false) {
			System.out.println("1. Añadir equipo");
			System.out.println("2. Simulacion");
			int opcion = br.read();
			switch(opcion) {
			case 1:
				if(tablaEquipos.numElementos <= 21) {
					System.out.println("Nombre del equipo: ");
					String nombre = br.readLine();
					Equipo Equipo = new Equipo();
					Equipo.Nombre = nombre;
					tablaEquipos.insertar(Equipo);
				} else System.out.println("Hay demasiados equipos");
				
			}
		}
	}
}

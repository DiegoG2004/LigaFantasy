package classes;

public class Equipo {
	public int puntos, golesFavor, golesContra;
	
	public String Nombre;
	public boolean UsadoEnJornada;
	public boolean esAlta;
	
	public Equipo(String nombre) {
		Nombre = nombre;
		puntos = 0; golesFavor = 0; golesContra = 0;
		UsadoEnJornada = false;
		esAlta = true;
	}
	public String getCodigo() {
		return Nombre;
	}
}
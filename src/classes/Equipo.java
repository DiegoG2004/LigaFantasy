package classes;

public class Equipo {
	public int puntos, golesFavor, golesContra;
	
	public String nombre;
	public boolean usadoEnJornada;
	public boolean esAlta;
	
	public Equipo(String nombre) {
		this.nombre = nombre;
		puntos = 0; golesFavor = 0; golesContra = 0;
		usadoEnJornada = false;
		esAlta = true;
	}
	public String getCodigo() {
		return nombre;
	}
	public int getDiferenciaGoles() {
        return golesFavor - golesContra;
    }
	public String toString() {
        return "Nombre: " + nombre + ", Puntuación: " + puntos + ", Goles a favor: " + golesFavor
                + ", Goles en contra: " + golesContra + ", Diferencia de goles: " + getDiferenciaGoles();
    }
}
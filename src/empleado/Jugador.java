package empleado;

public class Jugador extends Empleado {
	private boolean incentivos;
	private int goles;

	public Jugador(String nombre, int edad, String sexo, int sueldo, boolean incentivos) {
		super(nombre, edad, sexo, sueldo);
	}
	
	public void cambiarIncentivo(boolean siNo) {
		this.incentivos = siNo;
	}
	
	public void setGoles(int goles) {
		this.goles = goles;
	}
	
	public int getGoles() {
		return goles;
	}
	
	public float cobrar() {
		if(incentivos) {
			super.sueldo *= 1.2314;
		}
		
		return sueldo;
	}
	
	public String toString() {
		return "El Jugador " + super.nombre + " de la edad " + super.edad + " cobra " + super.sueldo;
	}
	
}

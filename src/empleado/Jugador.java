package empleado;

public class Jugador extends Empleado {
	boolean incentivos;
	int goles;

	public Jugador(String nombre, int edad, String sexo, int sueldo, boolean incentivos) {
		super(nombre, edad, sexo, sueldo);
	}
	
	public void cambiarIncentivo(boolean siNo) {
		this.incentivos = siNo;
	}
	
	public float cobrar() {
		if(incentivos) {
			super.sueldo *= 1.2314;
		}
		
		return sueldo;
	}
	
}

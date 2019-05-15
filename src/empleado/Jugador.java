package empleado;

public class Jugador extends Empleado {
	boolean incentivos;
	
	public Jugador(){
		
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

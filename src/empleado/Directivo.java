package empleado;

public class Directivo extends Empleado{
	float comision;
	public Directivo(){
		
	}
	
	public Directivo(String nombre, int edad, String sexo, int sueldo, float comision){
		super(nombre, edad, sexo, sueldo);
		this.comision = comision;
	}
	
	public void setComision(float comision) {
		this.comision = comision;
	}
	
	public float cobrar() {
		float nomina = super.sueldo *  (1 + comision / 100);
		return nomina;
	}
}

package empleado;

public class Directivo extends Empleado{
	private float comision;
	public Directivo(){
		
	}
	
	public Directivo(String nombre, int edad, String sexo, int sueldo, float comision){
		super(nombre, edad, sexo, sueldo);
		setComision(comision);
	}
	
	public void setComision(float comision) {
		this.comision = comision;
	}
	
	public float cobrar() {
		float nomina = super.sueldo *  (1 + comision / 100);
		return nomina;
	}
	
	public String toString() {
		String frase;
		if (super.sexo.equalsIgnoreCase("Hombre")) {
			frase = "El directivo " + super.nombre + " de la edad " + super.edad + " cobra " + super.sueldo;
		}else {
			frase = "La directiva " + super.nombre + " de la edad " + super.edad + " cobra " + super.sueldo;
		}
		return frase;
	}
}

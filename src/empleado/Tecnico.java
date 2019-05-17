package empleado;

public class Tecnico extends Empleado{
	private int objetivos;


	public Tecnico(){

	}

	public Tecnico(String nombre, int edad, String sexo, int sueldo, int objetivos){
		super(nombre, edad, sexo, sueldo);
		setObjetivos(objetivos);
	}
	
	public void setObjetivos(int objetivos) {
		this.objetivos = objetivos;
	}

	public float cobrar() {
		float cumplido = 0;

		switch(objetivos) {
		case 1: cumplido = super.sueldo * 1.50f;
		case 2: cumplido = super.sueldo * 1.30f;
		case 3: cumplido = super.sueldo * 1.15f;
		case 4: cumplido = super.sueldo * 1.05f;
		}
		
		float nomina = super.sueldo + cumplido;
		return nomina;
	}
	
	public String toString() {
		return "El tecnico " + super.nombre + " de la edad " + super.edad + " cobra " + super.sueldo;
	}


}
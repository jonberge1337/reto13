package empleado;

public class Tecnico extends Empleado{
	int objetivos;


	public Tecnico(){

	}

	public Tecnico(int objetivos){
		super();
		setObjetivos(objetivos);
	}
	
	public void setObjetivos(int objetivos) {
		this.objetivos = objetivos;
	}

	public float cobrar() {
		float cumplido = 0;

		switch(objetivos) {
		case 1: cumplido = super.sueldo *1.50f;
		case 2: cumplido = super.sueldo *1.30f;
		case 3: cumplido = super.sueldo *1.15f;
		case 4: cumplido= super.sueldo *1.05f;
		}
		
		float nomina = super.sueldo + cumplido;
		return nomina;
	}


}
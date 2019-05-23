package empleado;

public class Tecnico extends Empleado{

	private int objetivos;
	public Tecnico(){

	}

	/**
	 * Da valor a todos los atributos del Técnico
	 *
	 * @param nombre corresponde al nombre del Técnico
	 * @param edad corresponde a la edad del Técnico
	 * @param sexo corresponde al género del Técnico
	 * @param sueldo corresponde al sueldo del Técnico
	 * @param objetivos corresponde a los objetivos del Técnico
	 */
	public Tecnico(String nombre, int edad, String sexo, int sueldo, int objetivos){
		super(nombre, edad, sexo, sueldo);
		setObjetivos(objetivos);
	}
	
	/**
	 * Da valor a los objetivos del Técnico
	 *
	 * @param objetivos corresponde a los objetivos del Técnico
	 */
	public void setObjetivos(int objetivos) {
		this.objetivos = objetivos;
	}

	/* (non-Javadoc)
	 * @see empleado.Empleado#cobrar()
	 */
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
	
	/* (non-Javadoc)
	 * @see empleado.Empleado#toString()
	 */
	public String toString() {
		String frase;
		if (super.sexo.equalsIgnoreCase("Hombre")) {
			frase = "El tecnico " + super.nombre + " de la edad " + super.edad + " cobra " + super.sueldo;
		}else {
			frase = "La tecnico " + super.nombre + " de la edad " + super.edad + " cobra " + super.sueldo;
		}

		return frase;
	}


}
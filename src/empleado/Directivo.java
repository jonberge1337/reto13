package empleado;

public class Directivo extends Empleado{
	private float comision;
	/**
	 * Constructor por defecto de la subclase Directivo
	 */
	public Directivo(){
		
	}
	
	/**
	 * Constructor en el que se dan valor a todos los atributos
	 * 
	 * @param nombre corresponde al nombre del Directivo
	 * @param edad corresponde a la edad del Directivo
	 * @param sexo corresponde al género del Direcitvo
	 * @param sueldo corresponde al sueldo del Directivo
	 * @param comision corresponde a la comisión del Directivo
	 */
	public Directivo(String nombre, int edad, String sexo, int sueldo, float comision){
		super(nombre, edad, sexo, sueldo);
		setComision(comision);
	}
	
	/**
	 * Da valor a la comisión del Directivo
	 * 
	 * @param comision
	 */
	public void setComision(float comision) {
		this.comision = comision;
	}
	
	/* (non-Javadoc)
	 * @see empleado.Empleado#cobrar()
	 */
	public float cobrar() {
		float nomina = super.sueldo *  (1 + comision / 100);
		return nomina;
	}
	
	/* (non-Javadoc)
	 * @see empleado.Empleado#toString()
	 */
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

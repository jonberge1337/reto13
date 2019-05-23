package empleado;

public class Jugador extends Empleado {
	private boolean incentivos;
	private int goles;

	/**
	 * Da valor a todos los atributos del Jugador
	 * 
	 * @param nombre corresponde al nombre del Jugador
	 * @param edad corresponde a la edad del Jugador
	 * @param sexo corresponde al género del Jugador
	 * @param sueldo corresponde al sueldo del Jugador
	 * @param incentivos corresponde a los incentivos del Jugador
	 */
	public Jugador(String nombre, int edad, String sexo, int sueldo, boolean incentivos) {
		super(nombre, edad, sexo, sueldo);
	}
	
	/**
	 * Da valor Verdadero O Falso al atributo de Incentivos
	 * 
	 * @param siNo corresponde a los Incentivos del Jugador
	 */
	public void cambiarIncentivo(boolean siNo) {
		this.incentivos = siNo;
	}
	
	/**
	 * Da valor a los goles del Jugador
	 * 
	 * @param goles corresponde a los goles del Jugador
	 */
	public void setGoles(int goles) {
		this.goles = goles;
	}
	
	/**
	 * Devuelve la cantidad de goles del Jugador
	 * 
	 * @return cantidad de goles del Jugador
	 */
	public int getGoles() {
		return goles;
	}
	
	/* (non-Javadoc)
	 * @see empleado.Empleado#cobrar()
	 */
	public float cobrar() {
		if(incentivos) {
			super.sueldo *= 1.2314;
		}
		
		return sueldo;
	}
	
	/* (non-Javadoc)
	 * @see empleado.Empleado#toString()
	 */
	public String toString() {
		String frase;
		if (super.sexo.equalsIgnoreCase("Hombre")) {
			frase = "El Jugador " + super.nombre + " de la edad " + super.edad + " cobra " + super.sueldo;
		}else {
			frase = "La Jugadora " + super.nombre + " de la edad " + super.edad + " cobra " + super.sueldo;
		}

		return frase;
	}
	
}

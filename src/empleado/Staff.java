package empleado;

/**
 * @author adminportatil
 *
 */
public class Staff extends Empleado{

    private float horasExtra;
    
    /**
     *
     * Constructor por defecto
     */
    public Staff(){

    }

    /**
     * Constructor que da valor a todos los atributos del Staff
     *
     * @param nombre corresponde al nombre del Staff
     * @param edad corresponde a la edad del Staff
     * @param sexo corresponde al género del Staff
     * @param sueldo corresponde al sueldo del Staff
     * @param horasExtra corresponde a las Horas Extra del Staff
     */
    public Staff(String nombre, int edad, String sexo, int sueldo, float horasExtra){
        super(nombre, edad, sexo, sueldo);
        this.horasExtra= horasExtra;
    }
    
    /**
     * Da valor al atributo de Horas Extra
     *
     * @param horas corresponde a las Horas Extra del Staff
     */
    public void setHorasExtra(float horas){
    	this.horasExtra = horas;
    }

    /* (non-Javadoc)
     * @see empleado.Empleado#cobrar()
     */
    public float cobrar() {
        float nomina = super.sueldo *  horasExtra;
        return nomina;
    }
    
    /* (non-Javadoc)
     * @see empleado.Empleado#toString()
     */
    public String toString() {
		String frase;
		if (super.sexo.equalsIgnoreCase("Hombre")) {
			frase = "El staff " + super.nombre + " de la edad " + super.edad + " cobra " + super.sueldo;
		}else {
			frase = "La staff " + super.nombre + " de la edad " + super.edad + " cobra " + super.sueldo;
		}

		return frase;
	}
}
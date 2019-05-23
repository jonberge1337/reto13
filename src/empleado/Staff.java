package empleado;

/**
 * @author adminportatil
 *
 */
public class Staff extends Empleado{

    /**
     * 
     */
    private float horasExtra;

    /**
     * 
     */
    public Staff(){

    }

    /**
     * @param nombre
     * @param edad
     * @param sexo
     * @param sueldo
     * @param horasExtra
     */
    public Staff(String nombre, int edad, String sexo, int sueldo, float horasExtra){
        super(nombre, edad, sexo, sueldo);
        this.horasExtra= horasExtra;
    }
    
    /**
     * @param horas
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
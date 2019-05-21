package empleado;

public class Staff extends Empleado{

    private float horasExtra;

    public Staff(){

    }

    public Staff(String nombre, int edad, String sexo, int sueldo, float horasExtra){
        super(nombre, edad, sexo, sueldo);
        this.horasExtra= horasExtra;
    }
    
    public void setHorasExtra(float horas){
    	this.horasExtra = horas;
    }

    public float cobrar() {
        float nomina = super.sueldo *  horasExtra;
        return nomina;
    }
    
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
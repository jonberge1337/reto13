package empleado;

public class Staff extends Empleado{

    float horasExtra;

    public Staff(){

    }

    public Staff(float horasExtra){
        super();
        this.horasExtra= horasExtra;
    }

    public float cobrar() {
        float nomina = super.sueldo *  horasExtra;
        return nomina;
    }
}
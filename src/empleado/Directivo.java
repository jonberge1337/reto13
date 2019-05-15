package empleado;

public class Directivo extends Empleado{
	float comision;
	Directivo(){
		
	}
	
	Directivo(float comision){
		super();
		this.comision = comision;
	}
	
	public float cobrar() {
		float nomina = super.sueldo *  comision;
		return nomina;
	}
}

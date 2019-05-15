package empleado;

public class GestionaProyecto {
	
	public static void crearJugadores(Jugador[] j, String[] nombres, String[] sexo) {
		int[] numeros = new int[3];
		
		
		for (int i = 0; i < j.length; i++) {
			numeros[0] = (int) (Math.random()* 9);
			numeros[1] = (int) (Math.random() * (35 - 18) + 18);
			numeros[2] = (int) (Math.random() * 2);
			
			j[i] = new Jugador(nombres[numeros[0]], numeros[1], sexo[numeros[2]], 1500, true); 
		}
	}
	
	public static void crearDirectiva(Directivo[] d, String[] nombres, String[] sexo) {
		int[] numeros = new int[3];
		
		for (int i = 0; i < nombres.length; i++) {
			numeros[0] = (int) (Math.random()* 9);
			numeros[1] = (int) (Math.random() * (35 - 18) + 18);
			numeros[2] = (int) (Math.random() * 2);
			
			d[i] = new Directivo(nombres[numeros[0]], numeros[1], sexo[numeros[2]], 1500, 20);
		}
	}
	
	public static void main(String[] args) {
		String[] sexo = {"Hombre", "Mujer"};
		String[] nombre = {"Kasem", "Snong", "Günther", "Bamphen", "Vichai", "Paiboon", "Nit", "Wanchai"};
		Directivo[] directores = new Directivo[4];
		Tecnico[] entrenadores = new Tecnico[2];
		Jugador[] plantilla = new Jugador[11];
		Staff[] mantenimiento = new Staff[4];
		
		crearJugadores(plantilla, nombre, sexo);
		
	}
	
}

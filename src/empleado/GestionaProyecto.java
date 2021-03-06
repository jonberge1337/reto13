package empleado;

import java.util.Scanner;

/**
 * @author THAILAND DEVELOPER TEAM
 *
 */
public class GestionaProyecto {

	/**
	 * Crea individualmente los jugadores y los introduce en el array
	 * 
	 * @param j corresponde al array de los jugadores
	 * @param nombres le pasamos un array de nombres
	 * @param sexo corresponde al array del género
	 */
	public static void crearJugadores(Jugador[] j, String[] nombres, String[] sexo) {
		// creamos este array para añadirle la edad, nombre y sexo
		int[] numeros = new int[4];


		for (int i = 0; i < j.length; i++) {
			numeros[0] = (int) (Math.random()* 8);
			numeros[1] = (int) (Math.random() * (35 - 18) + 18);
			numeros[2] = (int) (Math.random() * 2);
			numeros[3] = (int) (Math.random() * (100000 - 20000) + 20000);

			j[i] = new Jugador(nombres[numeros[0]], numeros[1], sexo[numeros[2]], numeros[3], true); 
		}
	}

	/**
	 * Crea individualmente los directivos y los introduce en el array
	 * 
	 * @param d corresponde al array de los directivos
	 * @param nombres corresponde al array de género
	 * @param sexo corresponde al array de género
	 */
	public static void crearJuntaDirectiva(Directivo[] d, String[] nombres, String[] sexo) {
		// creamos este array para añadirle la edad, nombre y sexo
		int[] numeros = new int[4];

		for (int i = 0; i < d.length; i++) {
			numeros[0] = (int) (Math.random()* 8);
			numeros[1] = (int) (Math.random() * (65 - 35) + 35);
			numeros[2] = (int) (Math.random() * 2);
			numeros[3] = (int) (Math.random() * (50000 - 20000) + 20000);

			d[i] = new Directivo(nombres[numeros[0]], numeros[1], sexo[numeros[2]], numeros[3], 20);
		}
	}

	/**
	 * Crea individualmente los directivos y los introduce en el array
	 * 
	 * @param t corresponde al array de los tecnicos
	 * @param nombres corresponde al array de género
	 * @param sexo corresponde al array de género
	 */
	public static void crearEquipoTecnico(Tecnico[] t, String[] nombres, String[] sexo) {
		// creamos este array para añadirle la edad, nombre y sexo
		int[] numeros = new int[4];

		for (int i = 0; i < t.length; i++) {
			numeros[0] = (int) (Math.random()* 8);
			numeros[1] = (int) (Math.random() * (65 - 36) + 36);
			numeros[2] = (int) (Math.random() * 2);
			numeros[3] = (int) (Math.random() * (80000 - 50000) + 50000);

			t[i] = new Tecnico(nombres[numeros[0]], numeros[1], sexo[numeros[2]], numeros[3], 20);
		}
	}

	/**
	 * Crea individualmente los staff y los introduce en el array
	 * 
	 * @param s corresponde al array de los staff
	 * @param nombres corresponde al array de nombres
	 * @param sexo corresponde al array de género
	 */
	public static void crearStaff(Staff[] s, String[] nombres, String[] sexo) {
		// creamos este array para añadirle la edad, nombre y sexo
		int[] numeros = new int[3];

		for (int i = 0; i < s.length; i++) {
			numeros[0] = (int) (Math.random()* 8);
			numeros[1] = (int) (Math.random() * (65 - 18) + 18);
			numeros[2] = (int) (Math.random() * 2);
			// con el staff vamos a usar el sueldo constante de 1500 
			
			s[i] = new Staff(nombres[numeros[0]], numeros[1], sexo[numeros[2]], 1500, 20);
		}
	}

	/**
	 * Muestra el menú principal
	 * 
	 * @return devuelve el numero seleccionado por el usuario
	 */
	public static int eligeMenuPrincipal() {
		int num;

		System.out.println("Bienvenido al menu principal:");
		System.out.println("Estos son las fichas de perfiles que ofrecemos");
		System.out.println("1- Jugadores\n 2- Directivos\n 3- Tecnicos\n 4- Staff");

		num = pedirNumero(1, 4);
		return num;
	}

	/**
	 * pedir un numero con los tamaños definidos
	 * 
	 * @param min primer parametro el minimo
	 * @param max segundo parametro el maximo
	 * @return devuelve el número introducido por el usuario
	 */
	public static int pedirNumero(int min, int max) {
		int num;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			try {				
				num = sc.nextInt();
			} catch (Exception e) {
				num = 0;
				sc.nextLine();
			}
			if(num < min|| num > max) {
				System.out.println("Por favor Señor/a introduce una opcion correcta");
			}
		} while (num < min|| num > max);

		return num;
	}

	/**
	 * pedir un String del tamaño definido
	 * 
	 * @param tamaño define el tamaño del string
	 * @return devuelve un String no acepta digitos
	 */
	public static String pedirNombre(int tamaño) {
		String nombre;
		boolean correcto;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do {
			correcto = true;
			System.out.println("Introduce un nombre");
			System.out.println("Recuerda de que tiene que tener menos de " + tamaño + " caracteres");
			System.out.println("Y que la palabra no contenga numeros");
			nombre = sc.nextLine();
			if(nombre.length() > tamaño) {
				System.out.println("La palabra que has metido supera el tamaño permitido");
				correcto = false;
			}
			for (int i = 0; i <  nombre.length() && correcto; i++) {
				if(Character.isDigit(nombre.charAt(i))) {
					correcto = false;
					System.out.println("La palabra que has metido contiene un numero y eso no esta permitido");
				}
			}
		} while (correcto == false);

		return nombre;
	}

	/**
	 * Mostramos el SubMenu de jugadores y recogemos la opcion elegida por el usuario
	 * 
	 * @param plantilla corresponde al array de los jugadores 
	 * @param sexo corresponde al array de género
	 */
	public static void subMenuJugador(Jugador[] plantilla, String[] sexo) {
		int numOpcion;
		int numJugador;
		final int MIN = 1;
		final int MAX = 7;
		@SuppressWarnings("unused")
		String continuar; // Lo usamos para hacer la pausa y que no nos salte el menu

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {


			System.out.println("Elige un menu de los siguientes:");
			System.out.println("1- Mostrar ficha tecnica");
			System.out.println("2- Modificar nombre");
			System.out.println("3- Modificar edad");
			System.out.println("4- Modificar sexo");
			System.out.println("5- Modificar sueldo");
			System.out.println("6- Modificar goles");
			System.out.println("7- Menu principal");

			numOpcion = pedirNumero(MIN, MAX);

			if (numOpcion != 7) {


				System.out.println("Estos son los jugadores que hay");
				for (int i = 0; i < plantilla.length; i++) {
					System.out.println((i+1) + " " + plantilla[i].nombre);
				}

				System.out.println("Elige un jugador de la lista:");
				numJugador = pedirNumero(1, plantilla.length) - 1;

				switch (numOpcion) {
				case 1:	System.out.println(plantilla[numJugador]); break;
				case 2: plantilla[numJugador].setNombre(pedirNombre(30)); break;	
				case 3: System.out.println("Introduce la nueva edad");
				plantilla[numJugador].setEdad(pedirNumero(18, 36));break;
				case 4: System.out.println("Introduce un 1 si quieres hombre");
				System.out.println("En caso contrario si quieres mujer pulsa 2");
				plantilla[numJugador].setSexo(sexo[pedirNumero(1, 2)]); break;
				case 5: System.out.println("Introduce un nuevo sueldo");
				plantilla[numJugador].setEdad(pedirNumero(20000, 100000));break;
				case 6: System.out.println("Introduce la cantidad de goles");
				plantilla[numJugador].setEdad(pedirNumero(0, 50));break;
				}
				System.out.println("\n\n\nPulse enter para continuar");
				continuar = sc.nextLine();
			}
		} while (numOpcion != 7);
	}

	/**
	 * Mostramos el SubMenu de directivos y recogemos la opcion elegida por el usuario
	 * 
	 * @param plantilla corresponde al array de los directivos
	 * @param sexo corresponde al array de género
	 */
	public static void subMenuDirectivo(Directivo[] plantilla, String[] sexo) {
		int numOpcion;
		int numDirectivo;
		final int MIN = 1;
		final int MAX = 7;
		@SuppressWarnings("unused")
		String continuar; // Lo usamos para hacer la pausa y que no nos salte el menu

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Elige un menu de los siguientes:");
			System.out.println("1- Mostrar ficha tecnica");
			System.out.println("2- Modificar nombre");
			System.out.println("3- Modificar edad");
			System.out.println("4- Modificar sexo");
			System.out.println("5- Modificar sueldo");
			System.out.println("6- Modificar comision");
			System.out.println("7- Menu principal");

			numOpcion = pedirNumero(MIN, MAX);

			if (numOpcion != 7) {


				System.out.println("Estos son los directivos que hay");
				for (int i = 0; i < plantilla.length; i++) {
					System.out.println((i+1) + " " + plantilla[i].nombre);
				}

				System.out.println("Indica al directivo que quieras modificar");
				numDirectivo = pedirNumero(1, plantilla.length) - 1;

				switch (numOpcion) {
				case 1:	System.out.println(plantilla[numDirectivo]); break;
				case 2: plantilla[numDirectivo].setNombre(pedirNombre(30)); break;	
				case 3: System.out.println("Introduce la nueva edad");
				plantilla[numDirectivo].setEdad(pedirNumero(18, 36));break;
				case 4: System.out.println("Introduce un 1 si quieres hombre");
				System.out.println("En caso contrario si quieres mujer pulsa 2");
				plantilla[numDirectivo].setSexo(sexo[pedirNumero(1, 2)]); break;
				case 5: System.out.println("Introduce un nuevo sueldo");
				plantilla[numDirectivo].setSueldo(pedirNumero(20000, 100000));break;
				case 6: System.out.println("Introduce una edad");
				plantilla[numDirectivo].setComision(pedirNumero(0, 50));break;
				}
				System.out.println("\n\n\nPulse enter para continuar");
				continuar = sc.nextLine();
			}
		} while (numOpcion != 7);

	}

	/**
	 * Mostramos el SubMenu de tecnicos y recogemos la opcion elegida por el usuario
	 * 
	 * @param plantilla plantilla corresponde al array de los técnicos
	 * @param sexo corresponde al array de género
	 */
	public static void subMenuTecnico(Tecnico[] plantilla, String[] sexo) {
		int numOpcion;
		int numTecnico;
		final int MIN = 1;
		final int MAX = 7;
		@SuppressWarnings("unused")
		String continuar; // Lo usamos para hacer la pausa y que no nos salte el menu

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("\nElige un menu de los siguientes:");
			System.out.println("1- Mostrar ficha tecnica");
			System.out.println("2- Modificar nombre");
			System.out.println("3- Modificar edad");
			System.out.println("4- Modificar sexo");
			System.out.println("5- Modificar sueldo");
			System.out.println("6- Modificar objetivos");
			System.out.println("7- Menu principal");


			numOpcion = pedirNumero(MIN, MAX);

			if(numOpcion != 7) {
				System.out.println("Estos son los directivos que hay");
				for (int i = 0; i < plantilla.length; i++) {
					System.out.println((i+1) + " " + plantilla[i].nombre);
				}

				System.out.println("Indica al directivo que quieras modificar");
				numTecnico = pedirNumero(1, plantilla.length) - 1;

				switch (numOpcion) {
				case 1:	System.out.println(plantilla[numTecnico]); break;
				case 2: plantilla[numTecnico].setNombre(pedirNombre(30)); break;	
				case 3: System.out.println("Introduce la nueva edad");
				plantilla[numTecnico].setEdad(pedirNumero(18, 36)); break;
				case 4: System.out.println("Introduce un 1 si quieres hombre");
				System.out.println("En caso contrario si quieres mujer pulsa 2");
				plantilla[numTecnico].setSexo(sexo[pedirNumero(1, 2)]); break;
				case 5: System.out.println("Introduce un nuevo sueldo");
				plantilla[numTecnico].setSueldo(pedirNumero(20000, 100000)); break;
				case 6: System.out.println("Introduce una edad");
				plantilla[numTecnico].setObjetivos(pedirNumero(0, 50)); break;
				} 
				System.out.println("\n\n\nPulse enter para continuar");
				continuar = sc.nextLine();
			}
		}while (numOpcion != 7);

	}

	/**
	 * Mostramos el SubMenu de staff y recogemos la opcion elegida por el usuario
	 * 
	 * @param plantilla corresponde al array de los staff
	 * @param sexo corresponde al array de género
	 */
	public static void subMenuStaff(Staff[] plantilla, String[] sexo) {
		int numOpcion;
		int numStaff;
		final int MIN = 1;
		final int MAX = 7;
		@SuppressWarnings("unused")
		String continuar; // Lo usamos para hacer la pausa y que no nos salte el menu

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);		

		do {


			System.out.println("Elige un menu de los siguientes:");
			System.out.println("1- Mostrar ficha tecnica");
			System.out.println("2- Modificar nombre");
			System.out.println("3- Modificar edad");
			System.out.println("4- Modificar sexo");
			System.out.println("5- Modificar sueldo");
			System.out.println("6- Modificar objetivos");
			System.out.println("7- Menu principal");


			numOpcion = pedirNumero(MIN, MAX);
			if (numOpcion != 7) {

				System.out.println("Estos son los directivos que hay");
				for (int i = 0; i < plantilla.length; i++) {
					System.out.println((i+1) + " " + plantilla[i].nombre);
				}

				System.out.println("Indica al directivo que quieras modificar");
				numStaff = pedirNumero(1, plantilla.length) - 1;

				switch (numOpcion) {
				case 1:	System.out.println(plantilla[numStaff]); break;
				case 2: plantilla[numStaff].setNombre(pedirNombre(30)); break;	
				case 3: System.out.println("Introduce la nueva edad");
				plantilla[numStaff].setEdad(pedirNumero(18, 36));break;
				case 4: System.out.println("Introduce un 1 si quieres hombre");
				System.out.println("En caso contrario si quieres mujer pulsa 2");
				plantilla[numStaff].setSexo(sexo[pedirNumero(1, 2)]); break;
				case 5: System.out.println("Introduce un nuevo sueldo");
				plantilla[numStaff].setSueldo(pedirNumero(20000, 100000));break;
				case 6: System.out.println("Introduce una edad");
				plantilla[numStaff].setHorasExtra(pedirNumero(0, 50));break;
				}
				System.out.println("\n\n\nPulse enter para continuar");
				continuar = sc.nextLine();
			}
		} while (numOpcion != 7);
	}
	
	/**
	 * Nos suma los salarios de directivos
	 *
	 * @param directivos corresponde al array de los directivos
	 * @return devuelve la suma de los salarios
	 */
	public static float sumaSalario(Directivo[] directivos) {
		float suma = 0;
		for (int i = 0; i < directivos.length; i++) {
			suma += directivos[i].cobrar();
		}
		
		return suma;
	}
	
	/**
	 * Nos suma los salarios de tecnicos
	 *
	 * @param tecnicos corresponde al array de los tecnicos
	 * @return devuelve la suma de los salarios
	 */
	public static float sumaSalario(Tecnico[] tecnicos) {
		float suma = 0;
		for (int i = 0; i < tecnicos.length; i++) {
			suma += tecnicos[i].cobrar();
		}
		
		return suma;
	}
	
	/**
	 * Nos suma los salarios de jugadores
	 *
	 * @param jugadores corresponde al array de los jugadores
	 * @return devuelve la suma de los salarios
	 */
	public static float sumaSalario(Jugador[] jugadores) {
		float suma = 0;
		for (int i = 0; i < jugadores.length; i++) {
			suma += jugadores[i].cobrar();
		}
		
		return suma;
	}
	
	/**
	 * Nos suma los salarios de staff
	 *
	 * @param staffes corresponde al array de los staff
	 * @return devuelve la suma de los salarios
	 */
	public static float sumaSalario(Staff[] staffes) {
		float suma = 0;
		for (int i = 0; i < staffes.length; i++) {
			suma += staffes[i].cobrar();
		}
		
		return suma;
	}
	
	/**
	 * Suma los salarios de todo el equipo
	 *
	 * @param directivos corresponde al array de los directivos
	 * @param tecnicos corresponde al array de los staff tecnicos
	 * @param jugadores corresponde al array de los jugadores
	 * @param staffes corresponde al array de los staff
	 */
	public static void presupuestoEquipo(Directivo[] directivos, Tecnico[] tecnicos, Jugador[] jugadores, Staff[] staffes) {
		
		float sumaDire = sumaSalario(directivos);
		float sumaTecn = sumaSalario(tecnicos);
		float sumaJuga = sumaSalario(jugadores);
		float sumaStaf = sumaSalario(staffes);
		float total = sumaDire + sumaTecn + sumaJuga + sumaStaf;
		int opcion;
		final int MIN = 1;
		final int MAX = 5;
		
		System.out.println("Elige que opcion quieres elegir:");
		System.out.println("1- Presupuesto general");
		System.out.println("2- Presupuesto de la junta directiva");
		System.out.println("3- Presupuesto del total de los tecnicos");
		System.out.println("4- Presupuesto del total de los jugadores");
		System.out.println("5- Presupuesto del total de los staff");
		
		opcion = pedirNumero(MIN, MAX);
		
		switch (opcion) {
		case 1: System.out.println("El equipo cada mes tiene el gasto de " + total); break;
		case 2: System.out.println("La junta directiva cuesta " + sumaDire + "€ " +  sumaDire * 100 / total + "% del presupuesto total"); break;
		case 3: System.out.println("El total de los tecnicos cuesta " + sumaTecn + "€ " +  sumaTecn * 100 / total + "% del presupuesto total"); break;
		case 4: System.out.println("El total de los jugadores cuesta " + sumaJuga + "€ " + sumaJuga * 100 / total + "% del presupuesto total"); break;
		case 5: System.out.println("El total de los staff cuesta " + sumaStaf + "€ " +  sumaStaf * 100 / total + "% del presupuesto total"); break;
		}
		
		
		
	}

	/**
	 * Muestra el menú principal y crea todos los objetos necesarios
	 *	
	 * @param args parametro por defecto del metodo main
	 */
	public static void main(String[] args) {
		String[] sexo = {"Hombre", "Mujer"};
		String[] nombre = {"Kasem", "Snong", "Günther", "Bamphen", "Vichai", "Paiboon", "Nit", "Wanchai"};
		Directivo[] directores = new Directivo[4];
		Tecnico[] entrenadores = new Tecnico[2];
		Jugador[] plantilla = new Jugador[11];
		Staff[] mantenimiento = new Staff[4];
		int menu;
		final int MIN = 1;
		final int MAX = 6;

		crearJugadores(plantilla, nombre, sexo);
		crearJuntaDirectiva(directores, nombre, sexo);
		crearEquipoTecnico(entrenadores, nombre, sexo);
		crearStaff(mantenimiento, nombre, sexo);

		do {
			System.out.println("Elige un menu de los siguientes:");
			System.out.println("1- Jugadores");
			System.out.println("2- Directivos");
			System.out.println("3- Tecnicos");
			System.out.println("4- Staff");
			System.out.println("5- Ver presupuesto del equipo");
			System.out.println("6- Salir");
			menu = pedirNumero(MIN, MAX);
			switch (menu) {
			case 1:	subMenuJugador(plantilla, sexo); break;
			case 2: subMenuDirectivo(directores, sexo); break;
			case 3: subMenuTecnico(entrenadores, sexo); break;
			case 4: subMenuStaff(mantenimiento, sexo); break;
			case 5: presupuestoEquipo(directores, entrenadores, plantilla, mantenimiento); break;
			case 6: System.out.println("Programa finalizado"); break;
			}
		} while (menu != 6);

	}

}

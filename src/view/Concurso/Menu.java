package view.Concurso;

import model.AgrupacionOficial;
import model.Chirigota;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;
import view.Util;

public class Menu {

	public static void opcConcurso() {
		int opc;
		do {
			mostrarMenuConcurso();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> vaCaminitoDelFalla();
			case 2 -> hacenTipo();
			case 3 -> cantarPresentacion();


			}
		} while (opc != 0);
	}

	public static void mostrarMenuConcurso() {
		Util.escribir("\n");
		Util.escribir(" 	GESTION DEL CONCURSO ");
		Util.escribir("  ----------------------------------");
		Util.escribir("	Concurso:");
		Util.escribir("  ----------------------------------");
		Util.escribir("  	1. Va camino del Falla.");
		Util.escribir(" 	2. Hacen el Tipo.");
		Util.escribir(" 	3. Canta la Presentación.");
		Util.escribir(" 	4. Asignar puntos.");
		Util.escribir("  ----------------------------------");
		Util.escribir("	Listado de agrupaciones participantes:");
		Util.escribir("  ----------------------------------");
		Util.escribir("  	5. Listar todos.");
		Util.escribir("  	6. Listar Chirigotas.");
		Util.escribir(" 	7. Listar Coros.");
		Util.escribir(" 	8. Listar Cuartetos.");
		Util.escribir(" 	9. Listar Comparsas.");
		Util.escribir("  ----------------------------------");
		Util.escribir("	Ordenación del listado:");
		Util.escribir("  ----------------------------------");
		Util.escribir(" 	10. Ordenar por puntos.");
		Util.escribir(" 	11. Ordenar por el nombre.");
		Util.escribir("	    12. Ordenar por el autor.");
		Util.escribir(" 	13. Ordenar por autor de música/letra.");
	}

	public static void mostrarMenuFalla() {

		Util.escribir("\nEscoja una opción: ");
		Util.escribir("  1. Chirigota");
		Util.escribir("  2. Comparsa");
		Util.escribir("  3. Coro");
		Util.escribir("  4. Cuarteto");
	}


	public static void cantarPresentacion() {
		AgrupacionOficial agruOfi = null;
		int opc;
		do {
			mostrarMenuFalla();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1:
				agruOfi = new Chirigota();
			case 2:
				agruOfi = new Comparsa();
			case 3:
				agruOfi = new Coro();
			case 4:
				agruOfi = new Cuarteto();
			case 5:
				if (agruOfi != null) {
					String tipo = agruOfi.cantarPresentacion();
					System.out.println(tipo);
				} else {
					System.out.println("Aún no se ha seleccionado una agrupación.");
				}
				break;
			}
		} while (opc != 0);
	}

	public static void hacenTipo() {
		AgrupacionOficial agruOfi = null;
		int opc;
		do {
			mostrarMenuFalla();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1:
				agruOfi = new Chirigota();
			case 2:
				agruOfi = new Comparsa();
			case 3:
				agruOfi = new Coro();
			case 4:
				agruOfi = new Cuarteto();
			case 5:
				if (agruOfi != null) {
					String tipo = agruOfi.hacerTipo();
					System.out.println(tipo);
				} else {
					System.out.println("Aún no se ha seleccionado una agrupación.");
				}
				break;
			}
		} while (opc != 0);
	}

	public static void vaCaminitoDelFalla() {
		AgrupacionOficial agruOfi = null;
		int opc;
		do {
			mostrarMenuFalla();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1:
				agruOfi = new Chirigota();
				break;
			case 2:
				agruOfi = new Comparsa();
				break;
			case 3:
				agruOfi = new Coro();
				break;
			case 4:
				agruOfi = new Cuarteto();
				break;
			}
			if (agruOfi != null) {
				String tipo = agruOfi.caminitoDelFalla();
				System.out.println(tipo);
			} else {
				System.out.println("Opción no valida");
			}

		} while (opc != 0);
	}

	
}


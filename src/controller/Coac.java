
/**
 * 
 * @author danigil
 * @version v1.2023
 * @since 3-3-2023
 * 
 * <p>Esta clase Coac, Concurso Oficial de Agrupaciones Carnavalescas</p>
 *
 */

package controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

import model.AgrupacionOficial;
import model.Agrupaciones;
import model.Chirigota;
import model.CompAuLe;
import model.CompAuMu;
import model.CompAutor;
import model.CompPuntos;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;
import model.Integrante;
import model.Romancero;
import model.Sort_puntos;
// import view.Util;

public class Coac {

	public AgrupacionOficial[] agrupa = new AgrupacionOficial[10];
	public Agrupaciones[] agrupaciones = new Agrupaciones[10];
	public Integrante[] integrante = new Integrante[10];
	public int contAgrupaciones = 0;

	
	
	public Coac() {
		super();
	}

/**
 * Getters and setters
 */
/**
 * 
 * @return agrupa
 */
	public AgrupacionOficial[] getAgrupa() {
		return agrupa;
	}

	public void setAgrupa(AgrupacionOficial[] agrupa) {
		this.agrupa = agrupa;
	}
/**
 * 
 * @return agrupaciones
 */
	public Agrupaciones[] getAgrupaciones() {
		return agrupaciones;
	}

	public void setAgrupaciones(Agrupaciones[] agrupaciones) {
		this.agrupaciones = agrupaciones;
	}
/**
 * 
 * @return integrante
 */
	public Integrante[] getIntegrante() {
		return integrante;
	}

	public void setIntegrante(Integrante[] integrante) {
		this.integrante = integrante;
	}
/**
 * 
 * @return contAgrupaciones
 */
	public int getContAgrupaciones() {
		return contAgrupaciones;
	}

	public void setContAgrupaciones(int contAgrupaciones) {
		this.contAgrupaciones = contAgrupaciones;
	}

	/**
	 * El siguiente metodo intenta inscribir una agrupación oficial en una lista de agrupaciones. Recibe como parámetro un objeto de tipo AgrupacionOficial y devuelve un valor booleano que indica
	 * si la operación de inscripción fue exitosa o no. El método utiliza un bucle for para recorrer AgrupacionOficial que es llamado agrupa
	 * @param agrupacion
	 * @return boolean
	 */
	public boolean inscribir_agrupacion(AgrupacionOficial agrupacion) {
		boolean inscrito = false;
		for (int i = 0; i < agrupa.length; i++) {
			if (agrupa[i] == null) {
				agrupa[i] = agrupacion;
				contAgrupaciones++;
				inscrito = true;
				break;
			} else {
				inscrito = false;
			}
		}

		return inscrito;

	}

	public void ordenar_por_puntos() {
		Arrays.sort(agrupa, new CompPuntos());
	}

	public void ordenar_por_autor() {
		Arrays.sort(agrupaciones, new CompAutor());

	}

	public void ordenar_por_nombre() {
		Arrays.sort(agrupaciones);

	}
	
	public void ordenar_por_autorLetra() {
		Arrays.sort(agrupaciones, new CompAuLe());
	}
	
	public void ordenar_por_autorMusica() {
		Arrays.sort(agrupaciones, new CompAuMu());
	}

	public void numAgrupaciones() {
		System.out.println(contAgrupaciones);
	}

	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Coac [toString()=" + super.toString() + "]";
	}

	/**
	 * 
	 * @return AgrupacionOficial
	 */
	public AgrupacionOficial[] verAgrupacion() {
		return agrupa;

	}

	/**
	 * 
	 * @return Integrante
	 */
	public Integrante[] verIntegrante() {
		return integrante;

	}

	/**
	 * El método utiliza un bucle for para recorrer un arreglo de Agrupaciones llamado agrupaciones. Si encuentra una posición nula en el arreglo, asigna el objeto de agrupación a esa posición, incrementa 
	 * el contador de agrupaciones y establece la variable add en true para indicar que la operación fue exitosa. Si no encuentra una posición nula en el arreglo, la variable add se mantiene 
	 * en false para indicar que la operación no fue exitosa
	 * @param agrupacion
	 * @return boolean
	 */
	public boolean add_agrupacion(Agrupaciones agrupacion) {
		boolean add = false;
		for (int i = 0; i < agrupa.length; i++) {
			if (agrupaciones[i] == null) {
				agrupaciones[i] = agrupacion;
				contAgrupaciones++;
				add = true;
				break;
			} else {
				add = false;
			}
		}

		return add;

	}

	/**
	 * Este metodo elimina la agrupacion, Recibe como parametro un entero que es pos y devuelve un boolean que indica si fue eliminado o no.
	 * @param pos
	 * @return boolean
	 */
	public boolean eliminar_agrupacion(int pos) {
		boolean eliminar = false;
			if (pos < agrupaciones.length && agrupaciones[pos] != null) {
				agrupaciones[pos] = null;
				contAgrupaciones--;
				eliminar = true;
			}

		return eliminar;
	}
	
	/**
	 * 
	 * @param pos
	 * @return Agrupaciones
	 */
	public Agrupaciones getAgrupacion(int pos) {
		return agrupaciones[pos];
	}
	

	/**
	 * Este metodo inserta valores al array Integrante
	 */
	public void precargarDatosParaPruebas() {
		Integrante[] integ = new Integrante[9];
		integ[0] = new Integrante( "Juan", 32, "El Puerto");
		integ[1] = new Integrante( "Roberto", 35, "San Juan");
		integ[2] = new Integrante( "Andrés", 28, "Las Cabezas");
		integ[3] = new Integrante("Julia", 42, "Lebrija");
		integ[4] = new Integrante( "Ana", 29, "El Cuervo");
		integ[5] = new Integrante( "Pepe", 46, "San Juan");
		integ[6] = new Integrante("Jimena", 40, "Utrera");
//		integ[7] = new Integrante( "Manuel", 39, "Ronda");
//		integ[8] = new Integrante( "Carlota", 37, "El Puerto");
		
		
		
		Chirigota ch1 = new Chirigota("La de allí", "Manuel", "Carlos", "Antonio", "Caballos", 8, 72, integ );
		Coro c1 = new Coro("Coreando", "Julia", "Jimena", "Andrés", "Juguetes",3,2, 70, integ );
		Comparsa co1 = new Comparsa("Vuelta y Vuelta", "Manuel", "Ana", "Antonio", "Indios y vaqueros","La Casita", 72, integ);
		Cuarteto cu1 = new Cuarteto("Casa Paco", "Ana", "Pepe", "Roberto", "Paraguas", 4, 65, integ );
		Romancero ro1 = new Romancero("La bien paga", "Roberto", "Julia", "Juan", "Epoca","El romance medieval");
		Chirigota ch2 = new Chirigota("La Abuela", "Alvaro", "Carlota", "Maria", "Perros", 3, 75, integ );
		Chirigota ch3 = new Chirigota("Comeremos", "Juan", "Alejandro", "Pepe", "Sirenas", 6, 68, integ );
		Comparsa co2 = new Comparsa("Media Hora", "Alvaro", "Julia", "Andrés", "Princesas","Media Luna", 76, integ );
		Coro c2 = new Coro("Controlarse", "Pedro", "Marina", "Juan", "Rastafari",4,3, 82, integ );
		Cuarteto cu2 = new Cuarteto("Envuelvelo", "Juan", "Andrés", "Julia", "Bebé Gigante", 4, 69, integ );
		
//		ch1.insertarIntegrante(integ[0]);		
//		ch1.insertarIntegrante(integ[1]);		
//		ch1.insertarIntegrante(integ[2]);		
//		ch1.insertarIntegrante(integ[3]);		
//		ch1.insertarIntegrante(integ[4]);		
//		
		add_agrupacion(ch1);
		add_agrupacion(c1);
		add_agrupacion(co1);
		add_agrupacion(cu1);
		inscribir_agrupacion(ch1);
		inscribir_agrupacion(c1);
		inscribir_agrupacion(co1);
		inscribir_agrupacion(cu1);
		
		ch1.insertarIntegrante(new Integrante( "Manuel2", 39, "Ronda"));		
		
	}
	
}

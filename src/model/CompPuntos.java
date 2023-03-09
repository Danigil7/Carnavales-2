
/**
 * 
 * @author danigil
 * @version v1.2023
 * @since 3-2023
 * 
 * <p>Esta clase CompPuntos, se encarga de los puntos de cada especialidad de agrupaciones</p>
 *
 */

package model;

import java.util.Comparator;

public class CompPuntos implements Comparator <AgrupacionOficial>{

	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
		int comp;
		comp = o1.getPuntos().compareTo(o2.getPuntos());
		return comp;
	}
	

}

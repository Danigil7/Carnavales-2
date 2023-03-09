
/**
 * 
 * @author danigil
 * @version v1.2023
 * @since 3-2023
 * 
 * <p>Esta clase Sort_puntos, se encarga del sorteo de los puntos</p>
 *
 */

package model;

import java.util.Comparator;

public class Sort_puntos implements Comparator <AgrupacionOficial>{

	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
		
		Integer comp = 0;
		if( o1 != null && o2 != null) 
		comp = o1.getPuntos().compareTo(o2.getPuntos());
		return comp;
	}

}

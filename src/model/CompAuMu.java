
/**
 * 
 * @author danigil
 * @version v1.2023
 * @since 3-2023
 * 
 * <p>Esta clase CompAuMu, se encarga de los compositores y autores de la musica de las agrupaciones</p>
 *
 */

package model;

import java.util.Comparator;

public class CompAuMu implements Comparator <Agrupaciones>{

	
	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public int compare(Agrupaciones o1, Agrupaciones o2) {
		int comp = 0;
		if( o1 != null && o2 != null) 
		comp = o1.getAutorMusica().compareTo(o2.getAutorMusica());
		return comp;
	}
	
	
}

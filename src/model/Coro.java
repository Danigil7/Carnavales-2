
/**
 * 
 * @author danigil
 * @version v1.2023
 * @since 3-2023
 * 
 * <p>Esta clase Coro, se encarga de la especialidad de agrupaciones, coros</p>
 *
 */

package model;

public class Coro extends AgrupacionOficial {

	private Integer numBandurrias;
	private Integer numGuitarras;


	/**
	 * Metodo constructor de la clase sin parametros
	 */
	public Coro() {
		super();
		setNumBandurrias(0);
		setNumGuitarras(0);

	}

	/**
	 * Metodo constructor de la clase con parametros
	 * @param nombre
	 * @param autor
	 * @param autorMusica
	 * @param autorLetra
	 * @param tipoDisfraz
	 * @param numBandurrias
	 * @param numGuitarras
	 * @param puntos
	 * @param integrante
	 */
	public Coro(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz,
			Integer numBandurrias, Integer numGuitarras, Integer puntos, Integrante[] integrante) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz, integrante);
		setNumBandurrias(numBandurrias);
		setNumGuitarras(numGuitarras);
		setPuntos(puntos);
	}

	/**
	 * Getters and Setters
	 * @return numBandurrias
	 */
	
	public Integer getNumBandurrias() {
		return numBandurrias;
	}

	public void setNumBandurrias(Integer numBandurrias) {
		this.numBandurrias = numBandurrias;
	}

	public Integer getNumGuitarras() {
		return numGuitarras;
	}

	public void setNumGuitarras(Integer numGuitarras) {
		this.numGuitarras = numGuitarras;
	}

	
	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String toString() {
		return "------------------- \n Coro \n------------------- \nNumBandurrias()=" + getNumBandurrias() + ", \nNumGuitarras()=" + getNumGuitarras()
				+ ",  \nPuntos()=" + getPuntos() + ",  \nNombre()=" + getNombre() + ",  \nAutor()=" + getAutor()
				+ ",  \nAutorMusica()=" + getAutorMusica() + ",  \nAutorLetra()=" + getAutorLetra()
				+ ",  \nTipoDisfraz()=" + getTipoDisfraz() + "]";
	}

	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String cantarPresentacion() {
		String cadena;
		return cadena = "Cantando la presentación del Coro " + super.getNombre();
	}

	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String hacerTipo() {
		String cadena;
		return cadena = "El Coro " + super.getNombre() + " va de " + super.getTipoDisfraz();
	}

	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String caminitoDelFalla() {
		String cadena;
		return cadena = "El Coro" + super.getNombre() + "va caminito del Falla";

	}

	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public int compareTo(Agrupaciones o) {
		int comp;
		comp = getNombre().compareTo(o.getNombre());
		return comp;
		
	}


}

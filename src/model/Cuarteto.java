
/**
 * 
 * @author danigil
 * @version v1.2023
 * @since 3-2023
 * 
 * <p>Esta clase Cuartero, se encarga de la especialidad de agrupaciones, Cuartetos</p>
 *
 */

package model;

public class Cuarteto extends AgrupacionOficial implements Callejera{
	
	private Integer numMiembros;

	/**
	 * Metodo constructor de la clase sin parametros
	 */
	public Cuarteto() {
		super();
		setNumMiembros(0);
		
	}
	
	/**
	 * Metodo constructor de la clase con parametros
	 * @param nombre
	 * @param autor
	 * @param autorMusica
	 * @param autorLetra
	 * @param tipoDisfraz
	 * @param numMiembros
	 * @param puntos
	 * @param integrante
	 */
	public Cuarteto(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz,Integer numMiembros, Integer puntos, Integrante[] integrante) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz, integrante);
		setNumMiembros(numMiembros);
		setPuntos(puntos);
	}
	
	
	/**
	 * Getters and Setters
	 * @return numMiembros
	 */
	
	public Integer getNumMiembros() {
		return numMiembros;
	}
	public void setNumMiembros(Integer numMiembros) {
		this.numMiembros = numMiembros;
	}
	


	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String toString() {
		return "------------------- \n Coro \n------------------- \nNumMiembros()=" + getNumMiembros() + ", \nPuntos()=" + getPuntos() + ", \nNombre()="
				+ getNombre() + ", \nAutor()=" + getAutor() + ", \nAutorMusica()=" + getAutorMusica()
				+ ", \nAutorLetra()=" + getAutorLetra() + ", \nTipoDisfraz()=" + getTipoDisfraz() + "]";
	}


	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String cantarPresentacion() {
		String cadena;
		return cadena = "Cantando la presentación del Cuarteto " + super.getNombre();
	}
	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String hacerTipo() {
		String cadena;
		return cadena = "El Cuarteto " + super.getNombre() + " va de " + super.getTipoDisfraz();

	}


	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String caminitoDelFalla() {
		String cadena;
		return cadena = "El Cuarteto" + super.getNombre() + "va caminito del Falla";

	}


	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String amoAEscucha() {
		String cadena;
		return cadena = "Amo a escuchá el Cuarteto " + super.getNombre();
		
		
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


/**
 * 
 * @author danigil
 * @version v1.2023
 * @since 3-3-2023
 * 
 * <p>Esta clase Chirigota, se encarga de la especialidad de agrupaciones, Chirigotas</p>
 *
 */

package model;

public class Chirigota extends AgrupacionOficial implements Callejera{
	
	
	private Integer numCuples;
	
	/**
	 * Constructor de la clase sin parametros
	 */
	public Chirigota() {
		super();
		setNumCuples(0);
	}
	
	/**
	 * Constructor de la clase, pero este con parametros
	 * @param nombre
	 * @param autor
	 * @param autorMusica
	 * @param autorLetra
	 * @param tipoDisfraz
	 * @param numCuples
	 * @param puntos
	 * @param integrante
	 */
	public Chirigota(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, Integer numCuples, Integer puntos, Integrante[] integrante) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz, integrante);
		setNumCuples(numCuples);
		setPuntos(puntos);
	}
	
	/**
	 * Getters and Setters
	 * @return Integer
	 */
	public Integer getNumCuples() {
		return numCuples;
	}
	public void setNumCuples(Integer numCuples) {
		this.numCuples = numCuples;
	}
	

	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String toString() {
		return "------------------- \n Chirigota \n------------------- \nNumCuples()=" + getNumCuples() + ", \nPuntos()=" + getPuntos() + ", \nNombre()="
				+ getNombre() + ", \nAutor()=" + getAutor() + ", \nAutorMusica()=" + getAutorMusica()
				+ ", \nAutorLetra()=" + getAutorLetra() + ", \nTipoDisfraz()=" + getTipoDisfraz() + "]";
	}


	
	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String cantarPresentacion() {
		
		return "Cantando la presentación de la Chirigota " + super.getNombre();
	}

	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String hacerTipo() {
		
		return "La Chirigota " + super.getNombre() + " va de " + super.getTipoDisfraz();

	}


	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String caminitoDelFalla() {
		
		return  "La Chirigota" + super.getNombre() + "va caminito del Falla";

	}


	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String amoAEscucha() {
		
		return "Amo a escuchá la Chirigota " + super.getNombre();
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

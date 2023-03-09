
/**
 * 
 * @author danigil
 * @version v1.2023
 * @since 3-3-2023
 * 
 * <p>Esta clase Agrupaciones, </p>
 *
 */

package model;

public abstract class Agrupaciones implements Comparable <Agrupaciones> {
	/**
	 * Atributo para conocer el nombre de la agrupacion
	 */
	private String nombre;
	/**
	 * Atributo para conocer el autor de la agrupacion
	 */
	private String autor;
	/**
	 * Atributo para conocer el autor de la musica de la agrupacion
	 */
	private String autorMusica;
	/**
	 * Atributo para conocer el autor de la letra de la agrupacion
	 */
	private String autorLetra;
	/**
	 * Atributo para conocer el tipo de disfraz de la agrupacion
	 */
	private String tipoDisfraz;

	/**
	 * Constructor de la clase Agrupaciones, establece valores predeterminados vacios
	 */
	public Agrupaciones() {
		setNombre("");
		setAutor("");
		setAutorMusica("");
		setAutorLetra("");
		setTipoDisfraz("");
	}

	/**
	 * Establece las variables en el metodo constructor
	 * @param nombre
	 * @param autor
	 * @param autorMusica
	 * @param autorLetra
	 * @param tipoDisfraz
	 */
	public Agrupaciones(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz) {
		setNombre(nombre);
		setAutor(autor);
		setAutorMusica(autorMusica);
		setAutorLetra(autorLetra);
		setTipoDisfraz(tipoDisfraz);
	}
	
	/**
	 * Getters and Setters
	 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutorMusica() {
		return autorMusica;
	}

	public void setAutorMusica(String autorMusica) {
		this.autorMusica = autorMusica;
	}

	public String getAutorLetra() {
		return autorLetra;
	}

	public void setAutorLetra(String autorLetra) {
		this.autorLetra = autorLetra;
	}

	public String getTipoDisfraz() {
		return tipoDisfraz;
	}

	public void setTipoDisfraz(String tipoDisfraz) {
		this.tipoDisfraz = tipoDisfraz;
	}

	public abstract String cantarPresentacion();

	public abstract String hacerTipo();
	
	
	/**
	 * El método compareTo compara el valor del nombre de la instancia actual de Agrupaciones con el valor del nombre del objeto obj. Si el valor del nombre de la instancia actual es menor que el valor 
	 * del nombre del objeto obj, el método devuelve un valor negativo. Si el valor del nombre de la instancia actual es igual al valor del nombre del objeto obj, el método devuelve 0. Si el valor del nombre
	 *  de la instancia actual es mayor que el valor del nombre del objeto obj, el método devuelve un valor positivo.
	 *  @return int
	 *  @param obj
	 */
	public int compareTo(Agrupaciones obj) {
		int comp = 0;
		if( getNombre() != null && obj != null) 
		comp = getNombre().compareTo(obj.getNombre());
		return comp;
		
	}

/**
 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
 */
	@Override
	public String toString() {
		return "Agrupaciones:  \nNombre()=" + getNombre() + ", \nAutor()=" + getAutor() + ", \nAutorMusica()="
				+ getAutorMusica() + ", \nAutorLetra()=" + getAutorLetra() + ", \nTipoDisfraz()=" + getTipoDisfraz()
				+ "";
	}

}


/**
 * 
 * @author danigil
 * @version v1.2023
 * @since 3-2023
 * 
 * <p>Esta clase Romancero, se encarga de la especialidad de agrupaciones, Romancero</p>
 *
 */

package model;

public class Romancero extends Agrupaciones implements Callejera{

	private String tematicaCartel;
	

	/**
	 * Metodo constructor sin parametros
	 */
	public Romancero() {
		super();
		setTematicaCartel("");
	}
	
	/**
	 * Metodo constructor con parametros
	 * @param nombre
	 * @param autor
	 * @param autorMusica
	 * @param autorLetra
	 * @param tipoDisfraz
	 * @param tematicaCartel
	 */
	public Romancero(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, String tematicaCartel) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz);
		setTematicaCartel(tematicaCartel);
	}
	
	/**
	 * Getters and Setters
	 * @return tematicaCartel
	 */

	public String getTematicaCartel() {
		return tematicaCartel;
	}

	public void setTematicaCartel(String tematicaCartel) {
		this.tematicaCartel = tematicaCartel;
	}


	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String toString() {
		return "Romancero [getTematicaCartel()=" + getTematicaCartel() + ", getNombre()=" + getNombre()
				+ ", getAutor()=" + getAutor() + ", getAutorMusica()=" + getAutorMusica() + ", getAutorLetra()="
				+ getAutorLetra() + ", getTipoDisfraz()=" + getTipoDisfraz() + "]";
	}

	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String cantarPresentacion() {
		String cadena;
		return cadena = "Cantando la presentación del Romancero " + getNombre();
	}
	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String hacerTipo() {
		String cadena;
		return cadena = "El Romancero " + getNombre() + " va de " + getTipoDisfraz();

	}
	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */

	@Override
	public String amoAEscucha() {
		String cadena;
		return cadena = "Amo a escuchá el Romancero " + super.getNombre();
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


/**
 * 
 * @author danigil
 * @version v1.2023
 * @since 3-2023
 * 
 * <p>Esta clase Comparsa, se encarga de la especialidad de agrupaciones, Comparsas</p>
 *
 */

package model;

public class Comparsa extends AgrupacionOficial{

	private String empresaAtrezzo;

	/**
	 * Metodo constructor sin parametros
	 */
	public Comparsa() {
		super();
		setEmpresaAtrezzo("");

	}

	/**
	 * Metodo constructor con parametros
	 * @param nombre
	 * @param autor
	 * @param autorMusica
	 * @param autorLetra
	 * @param tipoDisfraz
	 * @param empresaAtrezzo
	 * @param puntos
	 * @param integrante
	 */
	public Comparsa(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz,
			String empresaAtrezzo, Integer puntos, Integrante[] integrante) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz, integrante);
		setEmpresaAtrezzo(empresaAtrezzo);
		setPuntos(puntos);
	}

	/**
	 * Getters and Setters
	 * @return String
	 */
	public String getEmpresaAtrezzo() {
		return empresaAtrezzo;
	}

	public void setEmpresaAtrezzo(String empresaAtrezzo) {
		this.empresaAtrezzo = empresaAtrezzo;
	}

	
	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String toString() {
		return "------------------- \n Comparsa \n------------------- \nEmpresaAtrezzo()=" + getEmpresaAtrezzo() + ", \nPuntos()=" + getPuntos()
				+ ", \nNombre()=" + getNombre() + ", \nAutor()=" + getAutor() + ", \nAutorMusica()="
				+ getAutorMusica() + ", \nAutorLetra()=" + getAutorLetra() + ", \nTipoDisfraz()=" + getTipoDisfraz()
				+ "]";
	}
	
	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String cantarPresentacion() {
		String cadena;
		return cadena = "Cantando la presentación de la Comparsa " + super.getNombre();
	}

	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String hacerTipo() {
		String cadena;
		return cadena = "La Comparsa " + super.getNombre() + " va de " + super.getTipoDisfraz();

	}

	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String caminitoDelFalla() {
		String cadena;
		return cadena = "La Comparsa " + super.getNombre() + " va caminito del Falla";

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

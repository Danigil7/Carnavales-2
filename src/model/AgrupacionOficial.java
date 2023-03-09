
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

import java.util.Arrays;


public abstract class AgrupacionOficial extends Agrupaciones{

	private Integrante[] integrantes;
	private Integer puntos;

	/**
	 * Constructor de la clase
	 */
	public AgrupacionOficial() {
		super();
		setIntegrantes(new Integrante[10]);

	}

	/**
	 * este metodo es otro constructor de la clase pero este tiene parametros
	 * @param nombre
	 * @param autor
	 * @param autorMusica
	 * @param autorLetra
	 * @param tipoDisfraz
	 * @param numIntegrante
	 */
	public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz,
			Integrante[] numIntegrante) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz);
		setIntegrantes(numIntegrante);
	}

	/**
	 * 
	 * Getters and Setters
	 */
	public Integrante[] getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(Integrante[] numIntegrante) {
		this.integrantes = numIntegrante;
	}
	
	

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	/**
	 * busca la primera posición que este vacia o con valor null. Si la encuentra inserta el integrante y pone la variable insertar en true, si no se queda en false
	 * @param integ
	 * @return boolean
	 */
	public boolean insertarIntegrante(Integrante integ) {
		boolean insertar = false;
		for (int i = 0; i < integrantes.length; i++) {
			if (integrantes[i] == null) {
				integrantes[i] = integ;
				insertar = true;
				break;
			} else {
				insertar = false;
			}
		}

		return insertar;
	}
	

	/**
	 * este método elimina un integrante del arreglo de integrantes de la instancia actual de la clase AgrupacionOficial. Si encuentra la posición del integrante, establece el valor 
	 * de esa posición como null y devuelve true. Si no encuentra la posición del integrante, devuelve false.
	 * @param integ
	 * @return boolean
	 */
	public boolean eliminarIntegrante(Integrante integ) {
		boolean eliminar = false;
		for (int i = 0; i < integrantes.length; i++) {
			if (integrantes[i]!= null &&  integrantes[i].equals(integ)) {
				integrantes[i] = null;
				eliminar = true;
			} else {
				eliminar = false;
			}
		}

		return eliminar;
	}

	public abstract String caminitoDelFalla();
	
	
	/**
	 * Este metodo sobreescribe el toString() de la clase padre. Devuelve una cadena de caracteres 
	 */
	@Override
	public String toString() {
		return "AgrupacionOficial \nNumIntegrante()=" + Arrays.toString(getIntegrantes()) + ", \nPuntos()="
				+ getPuntos() + ", caminitoDelFalla()=" + caminitoDelFalla() + ", \nNombre()=" + getNombre()
				+ ", \nAutor()=" + getAutor() + ", \nAutorMusica()=" + getAutorMusica() + ", \nAutorLetra()="
				+ getAutorLetra() + ", \nTipoDisfraz()=" + getTipoDisfraz() + ", cantarPresentacion()="
				+ cantarPresentacion() + ", hacerTipo()=" + hacerTipo() + "]";
	}

	
	
	
	

}


package model;

import java.util.Arrays;


public abstract class AgrupacionOficial extends Agrupaciones{

	private Integrante[] integrantes;
	private Integer puntos;

	public AgrupacionOficial() {
		super();
		setIntegrantes(new Integrante[10]);

	}

	public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz,
			Integrante[] numIntegrante) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz);
		setIntegrantes(numIntegrante);
	}

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
	
	
	
	@Override
	public String toString() {
		return "AgrupacionOficial \nNumIntegrante()=" + Arrays.toString(getIntegrantes()) + ", \nPuntos()="
				+ getPuntos() + ", caminitoDelFalla()=" + caminitoDelFalla() + ", \nNombre()=" + getNombre()
				+ ", \nAutor()=" + getAutor() + ", \nAutorMusica()=" + getAutorMusica() + ", \nAutorLetra()="
				+ getAutorLetra() + ", \nTipoDisfraz()=" + getTipoDisfraz() + ", cantarPresentacion()="
				+ cantarPresentacion() + ", hacerTipo()=" + hacerTipo() + "]";
	}

	
	
	
	

}

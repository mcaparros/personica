package gitt;
/**
 * Clase que representa a una Persona
 * @author Manuel
 * @version 1.0
 */
public class Persona {
	/**
	 * Nombre de la Persona
	 */
	private String nombre;
	/**
	 * Método que nos muestra el nombre de un objeto de la clase Persona
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Asignamos el nombre a la Persona
	 * @param nombre que queramos darle a la Persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

package tabla.ajedrez;

public class PiezaTorres {
	private String nombre;
	private String ubictabla;
	private int numpieza;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbictabla() {
		return ubictabla;
	}
	public void setUbictabla(String ubictabla) {
		this.ubictabla = ubictabla;
	}
	public int getNumpieza() {
		return numpieza;
	}
	public void setNumpieza(int numpieza) {
		this.numpieza = numpieza;
	}
	
	public String toString() {
		return " [nombre=" + nombre + ", ubictabla=" + ubictabla +  ", numpieza=" + numpieza+ "]";

}
}

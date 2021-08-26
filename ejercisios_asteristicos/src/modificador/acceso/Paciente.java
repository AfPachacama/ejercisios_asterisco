package modificador.acceso;

public class Paciente {
	public String nombre;
	public String apellido;
	private int edad;

	private void caminar() {

	}

	private void correr() {

	}

//	Metodo SET y GET
//	Siempre son publicos
	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return this.nombre;

	}

	public void setApellido(String apellido) {
		this.apellido = apellido;

	}

	public String getApellido() {
		return this.apellido;
	}

	public void setEdad(int edad1) {
		this.edad = edad1;
	}

	public int getEdad() {
		return this.edad;
	}

}

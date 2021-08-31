package prueba.uno;

public class PasajerosVip {
	private String nombre;
	private String apellido;
	private int edad;
	private String TipoVuelo;
	private String Ubicacion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setTipoVuelo(PasajerosVip vip) {
		// TODO Auto-generated method stub
		
	}
	public String getTipoVuelo() {
		return TipoVuelo;
	}
	public void setTipoVuelo(String tipoVuelo) {
		TipoVuelo = tipoVuelo;
	}
	
	public String toString() {
		return "PasajerosVip [nombre=" + nombre + ", apellido=" + apellido +  ", edad=" + edad +", tipo vuelo=" + TipoVuelo
				+ "]";
	}
	public String getUbicacion() {
		return Ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}

}

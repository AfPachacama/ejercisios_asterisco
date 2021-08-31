package prueba.uno;

public class PasajerosEconomicos implements AerolineaCieloInterfaz {
	private String nombre;
	private String apellido;
	private int edad;
	private String TipoVuelo;
	private String Ubicacion;
	
	
	
	
	

	@Override
	public void codigoMembresia(String extras) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void codigoDescuento(String extras) {
		// TODO Auto-generated method stub
		
	}

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

	public String getTipoVuelo() {
		return TipoVuelo;
	}

	public void setTipoVuelo(String tipoVuelo) {
		TipoVuelo = tipoVuelo;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}
	public String toString() {
		return "Pasajeros Economicos [nombre=" + nombre + ", apellido=" + apellido +  ", edad=" + edad +", tipo vuelo=" + TipoVuelo
				+ "]";
	}

}

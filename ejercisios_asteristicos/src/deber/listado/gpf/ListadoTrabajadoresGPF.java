package deber.listado.gpf;


public class ListadoTrabajadoresGPF implements Comparable<ListadoTrabajadoresGPF>{
	private String nombre;
	private String apellido;
	private int edad;
	private int salario;
	
	
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
	
	
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
	public int compareTo(ListadoTrabajadoresGPF o) {
	// TODO Auto-generated method stub
	// 3 posibles retornos
	// 0
	// -1
	// 1
	if (this.salario > o.getSalario()) {
	return 1;
	} else if (this.salario == o.getSalario()) {
	return 0;
	} else {
	return -1;
	}
	}
	
	public String toString() {
		return "ListadoTrabajadoresGPF [nombre=" + nombre + ", apellido=" + apellido +  ", edad=" + edad +", salario=" + salario
				+ "]";
	}
}




	



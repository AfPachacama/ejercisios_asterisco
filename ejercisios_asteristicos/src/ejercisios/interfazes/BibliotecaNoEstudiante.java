package ejercisios.interfazes;

public class BibliotecaNoEstudiante implements BibliotecaInterfaz{

	@Override
	public void inicioBiblioteca() {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido al Sistema de Biblioteca");
		System.out.println("Ingrese sus usuario");
		System.out.println("Si no es estudiante, ingrese NO");
		
	}
	@Override
	public void validarIdentificacion() {
		// TODO Auto-generated method stub
		System.out.println("----Validando su usario----");
		System.out.println("No pertenece a la Institucion:");
		
	}
	@Override
	public void menuBiblioteca() {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese el nombre o codigo del texto");
		System.out.println("Ingrese por Orden Alfabetico");	
	}
	@Override
	public void selecionarLibro() {
		// TODO Auto-generated method stub
		System.out.println("Seleccione su texto");
		
	}
	@Override
	public void descargarMaterial() {
		// TODO Auto-generated method stub
		System.out.println("Biblioteca UCE:");
		System.out.println("Abrir Texto");
		

	}

}

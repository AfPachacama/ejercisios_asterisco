package ejercisios.interfazes;

public class BibliotecaEstudiante implements BibliotecaInterfaz {
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
		System.out.println("Ingrese a la Facultad a cual pertenece:");
		
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
		System.out.println("Compartir texto a su repositorio");
		
	}
	@Override
	public void descargarMaterial() {
		// TODO Auto-generated method stub
		System.out.println("Ingrese a su perfil personal:");
		System.out.println("Abrir Texto");
		System.out.println("Compartir Texto");
		System.out.println("Eliminar Texto");
		System.out.println("Descargar Texto");
		
	}



	
}

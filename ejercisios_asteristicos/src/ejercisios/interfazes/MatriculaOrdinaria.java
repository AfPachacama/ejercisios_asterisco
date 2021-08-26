package ejercisios.interfazes;

public class MatriculaOrdinaria implements MatriculaInterfaz {

	@Override
	public void IngreseSistemaSIUU() {
		// TODO Auto-generated method stub
		System.out.println("Ingrese Usuario:agpacha@uce.edu.ec ");
		System.out.println("Ingrese Contraseña");
		
	}

	@Override
	public void VerificarFechasMatriculacion() {
		// TODO Auto-generated method stub
		System.out.println("Consulte Tipo De Matricula");
		System.out.println("Su Matricula Es Ordinaria");
		System.out.println("Consulte Fecha");
		System.out.println("Su Fecha es: 12,13,14 de septiembre");
		
	}

	@Override
	public void MatriculaOrdinaria() {
		// TODO Auto-generated method stub
		System.out.println(" Matricula Ordinaria");
		System.out.println(" Se encuentra habilitado");
		System.out.println(" No cuenta con Materias Reprobadas");
		
	}

	@Override
	public void MatriculaExtraordinaria() {
		// TODO Auto-generated method stub
		System.out.println("");

		
	}

	@Override
	public void ImprimirComprobante() {
		// TODO Auto-generated method stub
		System.out.println(" Matricula Ordinaria");
		System.out.println(" Estudiante: Alex Pachacama");
		System.out.println(" Correo: agpacha@uce.edu.ec");
		System.out.println(" Los Dias De Matricula que tiene son:");
		System.out.println("12,13,14 de septiembre ");
		




	}

}

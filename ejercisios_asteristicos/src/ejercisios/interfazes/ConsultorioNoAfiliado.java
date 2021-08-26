package ejercisios.interfazes;

public class ConsultorioNoAfiliado implements ConsultorioInterfaz {

	@Override
	public void inicioSistema() {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido A MEDIFORT");
		System.out.println("Fecha Consulta");
		System.out.println("Doctores Disponibles");
		
	}

	@Override
	public void tipoConsulta() {
		// TODO Auto-generated method stub
		System.out.println("Ingrese tipo especialista");
		System.out.println("Cancelar Consulta");
		
	}

	@Override
	public void requerirTurno() {
		// TODO Auto-generated method stub
		System.out.println("Requqerir Turno");
		System.out.println("Seleccione Doctores Disponibles ");
		System.out.println("Cancelar Consulta");
		
	}

	@Override
	public void consultaMedicamento() {
		// TODO Auto-generated method stub
		System.out.println("Medicamento Disponible");
		System.out.println("Medicamento Disponible");
		System.out.println("Impresion Receta");
	}

	@Override
	public void impresionFactura() {
		// TODO Auto-generated method stub
		System.out.println("Validar Afiliado");
		System.out.println("No Afiliado");
		System.out.println("Pago Tarjeta de Credito o Efectivo");
		
	}

}

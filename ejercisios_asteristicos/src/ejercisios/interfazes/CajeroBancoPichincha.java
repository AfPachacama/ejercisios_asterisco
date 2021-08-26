package ejercisios.interfazes;

public class CajeroBancoPichincha implements CajeroInterfaz {

	@Override
	public void solicitarTarjeta(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su tarjeta correctamente");
		System.out.println("Espere 5 segundos");
		System.out.println("Retire la tarjeta");
		
	}

	@Override
	public void solicitarClave(String clave) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su pin");
		System.out.println("Muestra Menu");
		System.out.println("---------------------------------");
		
	}

	@Override
	public void solictarTipoTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("Selleciones:");
		System.out.println("Cuenta de Ahorros o Cuenta Corriente");
		System.out.println("Retirar o consultar");
		
	}

	@Override
	public void solicitarMonto(int monto) {
		// TODO Auto-generated method stub
		System.out.println("Selecciones la cantidad a retirar");
		System.out.println("Espere un momento");
		System.out.println("------------------");
		
	}

	@Override
	public void validarElSaldo() {
		// TODO Auto-generated method stub
		System.out.println("Consultar Saldo Disponible");
		System.out.println("Imprimir consulta con sobre cargo de 0,50");
		System.out.println("------------------------------------------");
		
	}

	@Override
	public void entregarDinero() {
		// TODO Auto-generated method stub
		System.out.println("Retire el dinero del cajero");
		System.out.println("...........................");
		
	}

	@Override
	public void realizarTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("Abre las llaves");
		System.out.println("Toma la manguera");
		System.out.println("Riega el cesped");
		
	}

	@Override
	public void entregarRecibo() {
		// TODO Auto-generated method stub
		System.out.println("Imprimir recibo Si o No");
		System.out.println("Si, Entrega recibo");
		System.out.println("Gracias por su preferencia.");
		
	}

}

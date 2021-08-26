package ejercisios.interfazes;

public interface CajeroInterfaz {
	
	public void solicitarTarjeta(String numero);
	
	public void solicitarClave(String clave);
	
	public void solictarTipoTransaccion();
	
	public void solicitarMonto(int monto);
	
	public void validarElSaldo();
	
	public void entregarDinero();
	
	public void realizarTransaccion();
	
	public void entregarRecibo();

	

}

package ejercisio.cajero.banco;

public class ClaseHijaConsulta extends ClasePadre {
	public void BloquearCuenta() {
		System.out.println("TU SALDO ACTUAL ES:"+ getSaldo());
	}

}

package ejercisios.interfazes;

public class JardineroVecino implements JardineroInterfaz {

	@Override
	public void regar() {
		// TODO Auto-generated method stub
		System.out.println("Abre las llaves");
		System.out.println("Toma la manguera");
		System.out.println("Riega el cesped");

	}

	@Override
	public void cortar() {
		// TODO Auto-generated method stub
		System.out.println("Prender la maquina");
		System.out.println("Poner el cesped");
		System.out.println("Cortar la primera linea");
		
	}

	@Override
	public void abonar() {
		// TODO Auto-generated method stub
		System.out.println("Bajar del carro el abono");
		System.out.println("Mexclar con la viruta");
		System.out.println("Regar por partes");
	}

	@Override
	public void fertilizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
		
	}

}

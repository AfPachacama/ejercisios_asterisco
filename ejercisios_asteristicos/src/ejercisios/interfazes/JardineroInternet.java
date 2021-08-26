package ejercisios.interfazes;

public class JardineroInternet implements JardineroInterfaz {

	@Override
	public void regar() {
		// TODO Auto-generated method stub
		System.out.println("Abre las llaves");
		System.out.println("Toma la manguera");
		System.out.println("Cloro al agua");
		System.out.println("Moja el cesped");
		
	}

	@Override
	public void cortar() {
		// TODO Auto-generated method stub
		System.out.println("Prender la maquina");
		System.out.println("Poner el cesped");
		System.out.println("Corta por la mitad");
		
		
	}

	@Override
	public void abonar() {
		// TODO Auto-generated method stub
		System.out.println("Bajar del carro el abono");
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

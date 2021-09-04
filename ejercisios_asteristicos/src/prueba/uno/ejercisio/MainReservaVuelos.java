package prueba.uno.ejercisio;



public class MainReservaVuelos {

	public static void main(String[] args) {
		
		
		
		
		System.out.println("Ingrese informacion del pasajero");
		System.out.println("Ingrese nombre");
		System.out.println("Ingresepellido");
		

		
		
		PasajeroVip pasajero1 = new PasajeroVip();
		pasajero1.setNombre("daniel");
		pasajero1.setApellido("teran");
		pasajero1.setCodigoMembresia("lkjhg");
		pasajero1.setEdad(25);
		
		
		PasajeroVip pasajero2 = new PasajeroVip();
		pasajero2.setNombre("fernando");
		pasajero2.setApellido("teran");
		pasajero2.setCodigoMembresia("sadfd");
		pasajero2.setEdad(19);
		
		PasajeroVip pasajero3 = new PasajeroVip();
		pasajero3.setNombre("alex");
		pasajero3.setApellido("pachacama");
		pasajero3.setCodigoMembresia("fgsfg");
		pasajero3.setEdad(21);
		
			
		PasajeroVip pasajero2 = new PasajeroVip("javier", "Cruz", "asdf", 30);

		
		
	}

}

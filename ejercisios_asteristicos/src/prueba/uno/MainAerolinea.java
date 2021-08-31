package prueba.uno;

public class MainAerolinea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PasajerosVip vip = new PasajerosVip();
		vip.setNombre("Alex");
		vip.setApellido("Pachacama");
		vip.setEdad(20);
		vip.setTipoVuelo("VIP ; VENTANA;");
		vip.setUbicacion("Fila 1; Columna 1");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("AEROLINEA CIELO");
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println();


		System.out.println("ASIENTOS VIP");
		System.out.println(vip);
		
		PasajerosVip vip1 = new PasajerosVip();
		vip1.setNombre("Diego");
		vip1.setApellido("Pachacama");
		vip1.setEdad(18);
		vip1.setTipoVuelo("VIP ; VENTANA;");
		vip1.setUbicacion("Fila 1; Columna 2");
		System.out.println("ASIENTOS VIP");
		System.out.println(vip1);
		
		
		PasajerosVip vip2 = new PasajerosVip();
		vip2.setNombre("Sofia");
		vip2.setApellido("Pachacama");
		vip2.setEdad(12);
		vip2.setTipoVuelo("VIP ; VENTANA;");
		vip2.setUbicacion("Fila 1; Columna 3");
		System.out.println("ASIENTOS VIP");
		System.out.println(vip2);
		
		PasajerosVip vip3 = new PasajerosVip();
		vip3.setNombre("Diana");
		vip3.setApellido("Pachacama");
		vip3.setEdad(13);
		vip3.setTipoVuelo("VIP ; VENTANA;");
		vip3.setUbicacion("Fila 1; Columna 4");
		System.out.println("ASIENTOS VIP");
		System.out.println(vip3);
		
		
		PasajerosVip vip4 = new PasajerosVip();
		vip4.setNombre("Jordan");
		vip4.setApellido("Pachacama");
		vip4.setEdad(10);
		vip4.setTipoVuelo("VIP ; VENTANA;");
		vip4.setUbicacion("Fila 1; Columna 5");
		System.out.println("ASIENTOS VIP");
		System.out.println(vip4);
		
		PasajerosVip vip5 = new PasajerosVip();
		vip5.setNombre("Kevin");
		vip5.setApellido("Pachacama");
		vip5.setEdad(18);
		vip5.setTipoVuelo("VIP ; VENTANA;");
		vip5.setUbicacion("Fila 4; Columna 1");
		System.out.println("ASIENTOS VIP");
		System.out.println(vip5);
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------------");

		
		System.out.println("");
		
		
		
		PasajerosEconomicos eco = new PasajerosEconomicos();
		eco.setNombre("Kevin");
		eco.setApellido("Nacimba");
		eco.setEdad(18);
		eco.setTipoVuelo("ECONOMICO; PASILLO");
		eco.setUbicacion("Fila 2; Columna 1");
		System.out.println("ASIENTOS ECONOMICOS");
		System.out.println(eco);
		
		
		PasajerosEconomicos eco1 = new PasajerosEconomicos();
		eco1.setNombre("Tatiana");
		eco1.setApellido("Suntaxi");
		eco1.setEdad(24);
		eco1.setTipoVuelo("ECONOMICO; PASILLO");
		eco1.setUbicacion("Fila 2; Columna 2");
		System.out.println("ASIENTOS ECONOMICOS");
		System.out.println(eco1);
		
		
		PasajerosEconomicos eco2 = new PasajerosEconomicos();
		eco2.setNombre("Jonatan");
		eco2.setApellido("Suntaxi");
		eco2.setEdad(11);
		eco2.setTipoVuelo("ECONOMICO; PASILLO");
		eco2.setUbicacion("Fila 2; Columna 3");
		System.out.println("ASIENTOS ECONOMICOS");
		System.out.println(eco2);
		
		
		PasajerosEconomicos eco3 = new PasajerosEconomicos();
		eco3.setNombre("Kev");
		eco3.setApellido("Sunta");
		eco3.setEdad(13);
		eco3.setTipoVuelo("ECONOMICO; PASILLO");
		eco3.setUbicacion("Fila 2; Columna 4");
		System.out.println("ASIENTOS ECONOMICOS");
		System.out.println(eco3);
		
		
		PasajerosEconomicos eco4 = new PasajerosEconomicos();
		eco4.setNombre("Jordan");
		eco4.setApellido("Suntaxi");
		eco4.setEdad(17);
		eco4.setTipoVuelo("ECONOMICO; PASILLO");
		eco4.setUbicacion("Fila 2; Columna 5");
		System.out.println("ASIENTOS ECONOMICOS");
		System.out.println(eco4);
		
		
		
		

	}
	

}

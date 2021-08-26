package deber.listado.gpf;

import java.util.Arrays;

public class MainSueldosTrabajadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ListadoTrabajadoresGPF danilo = new ListadoTrabajadoresGPF();
		danilo.setNombre("Danilo");
		danilo.setApellido("Alvarracin");
		danilo.setEdad(21);
		danilo.setSalario(344);
		System.out.println(danilo);
		
		
		
		ListadoTrabajadoresGPF kevin = new ListadoTrabajadoresGPF();
		kevin.setNombre("kevin");
		kevin.setApellido("casamen");
		kevin.setEdad(25);
		kevin.setSalario(354);
		System.out.println(kevin);
		
		
		
		ListadoTrabajadoresGPF josue = new ListadoTrabajadoresGPF();
		josue.setNombre("josue");
		josue.setApellido("Alvarez");
		josue.setEdad(21);
		josue.setSalario(344);
		System.out.println(josue);
		
		
		ListadoTrabajadoresGPF marco = new ListadoTrabajadoresGPF();
		marco.setNombre("marco");
		marco.setApellido("pozo");
		marco.setEdad(21);
		marco.setSalario(344);
		System.out.println(marco);
		
		
		ListadoTrabajadoresGPF diego = new ListadoTrabajadoresGPF();
		diego.setNombre("Diego");
		diego.setApellido("nacimba");
		diego.setEdad(21);
		diego.setSalario(344);
		System.out.println(diego);
		
		ListadoTrabajadoresGPF darwin = new ListadoTrabajadoresGPF();
		darwin.setNombre("Darwin");
		darwin.setApellido("Aguas");
		darwin.setEdad(21);
		darwin.setSalario(444);
		System.out.println(darwin);
		
		
		ListadoTrabajadoresGPF fernando = new ListadoTrabajadoresGPF();
		fernando.setNombre("fernando");
		fernando.setApellido("tocte");
		fernando.setEdad(21);
		fernando.setSalario(344);
		System.out.println(fernando);
		
		
		ListadoTrabajadoresGPF daniel = new ListadoTrabajadoresGPF();
		daniel.setNombre("Danilo");
		daniel.setApellido("Alvarracin");
		daniel.setEdad(21);
		daniel.setSalario(344);
		System.out.println(daniel);
		
		
		ListadoTrabajadoresGPF paul = new ListadoTrabajadoresGPF();
		paul.setNombre("paul");
		paul.setApellido("taco");
		paul.setEdad(21);
		paul.setSalario(567);
		System.out.println(paul);
		
		
		ListadoTrabajadoresGPF jordan = new ListadoTrabajadoresGPF();
		jordan.setNombre("jordan");
		jordan.setApellido("Aguirre");
		jordan.setEdad(21);
		jordan.setSalario(256);
		System.out.println(jordan);
		
		
		ListadoTrabajadoresGPF[] listaTrabajadoresGPF = new ListadoTrabajadoresGPF[10];
		listaTrabajadoresGPF[0] = danilo;
		listaTrabajadoresGPF[1] = kevin;
		listaTrabajadoresGPF[2] = josue;
		listaTrabajadoresGPF[3] = marco;
		listaTrabajadoresGPF[4] = diego;
		listaTrabajadoresGPF[5] = darwin;
		listaTrabajadoresGPF[6] = fernando;
		listaTrabajadoresGPF[7] = daniel;
		listaTrabajadoresGPF[8] = paul;
		listaTrabajadoresGPF[9] = jordan;
		

		//Vector antes de ordenar
		System.out.println("Listado Trabajadores antes de ordenar");
		System.out.println(Arrays.toString(listaTrabajadoresGPF));

		//Aqui ordeno la lista
		Arrays.sort(listaTrabajadoresGPF);
		System.out.println("Listado Trabajadores despues de ordenar");
		System.out.println(Arrays.toString(listaTrabajadoresGPF));

}
}

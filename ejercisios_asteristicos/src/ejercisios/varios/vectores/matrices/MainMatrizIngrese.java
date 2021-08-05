package ejercisios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatrizIngrese {
//Este es mi teclado
	Scanner lector = new Scanner(System.in);
	
	System.out.println("Ingrese el numero de filas del vector: ");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char A[][]= new char[3][4];
		for(int fila = 0;fila<3;fila++) {
			for(int columna=0;columna<4;columna++) {
				System.out.println("Ingrese un valor de la fila: " + fila + " Columna: " +columna);
//				El usuario digita el valor por teclado y acontinuacion lo leo
			
				char n = lector.next().charAt(0);
				A[fila][columna]=n;
		
	}

}
		for(int fila = 0;fila<3;fila++) {
			for(int columna=0;columna<4;columna++) {
				System.out.println( " El valor de la fila: " +fila+" y Columna " +columna+" es: " +A[fila][columna]);
				
}
		}
	}
}

	}

}

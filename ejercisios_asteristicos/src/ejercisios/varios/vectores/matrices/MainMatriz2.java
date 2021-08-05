package ejercisios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Desarrolar un programa que imprima la siguiente imagen.
		char A[][]= new char[5][5];
		for(int fila = 0;fila<=5;fila++) {
			for(int columna=0;columna<=5;columna++) {
//				El usuario digita el valor por teclado y acontinuacion lo leo
				Scanner lector = new Scanner(System.in);
				char n = lector.next().charAt(0);
				A[fila][columna]=n;
		
	}

}
		System.out.println( " Impresion de la Matriz: ");
		for(int fila = 0;fila<=5;fila++) {
			for(int columna=0;columna<=5;columna++) {
				System.out.print(A[fila][columna]+" ");
				
}
			System.out.println();
		}
	}



	}



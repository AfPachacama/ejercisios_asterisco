package ejercisios_asteristicos;

import java.util.Scanner;

public class asteriscos {
	// Segundo comit

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Introduce el numero de filas: ");
		Scanner Leer = new Scanner(System.in);
		int n = Leer.nextInt();
		
		for (int fila = 0; fila>= 0 ; fila --) {
			for (int ast = 0; ast<= n ; ast ++ ) {
				System.out.print("*");
		}
			System.out.println();	
}
	}
}

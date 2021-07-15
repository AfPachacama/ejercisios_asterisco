package ejercisios_asteristicos;

import java.util.Scanner;

public class asteriscos {
	// Segundo comit

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Introduce el numero de filas: ");
		Scanner Leer = new Scanner(System.in);
		int n = Leer.nextInt();
		
		for (int fila = n; fila>= 1 ; fila = - 1) {
			for (int ast = 1; ast<= n ; ast = ast + 1 ) {
				System.out.print("*");
		}
			System.out.println();	
}
	}
}

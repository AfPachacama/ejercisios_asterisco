package deberes.progra;

import java.util.Scanner;

public class T12EjercisioWhile {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
	        System.out.print("Introduce un numero del 1 al 10: ");
	        int dato = 1;
	        while (dato > 1|| dato>11) {
	            System.out.print("Es un numero entero ");
	            dato = teclado.nextInt();
	        }
	        System.out.println("Terminado!");
	    }
	}
package ejercisios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare un vector X cuya longitud se solicite al usuario de tipo int y construya un programa
		// que pida al usuario que ingrese valores para cada posicion
		//y finalemnte que se imprima todo los valores ingresados
		
        Scanner teclado= new Scanner(System.in);

       System.out.println("Defina el tamaño de la matriz: ");
        int[][] matriz = new int[teclado.nextInt()][teclado.nextInt()];
        System.out.println(matriz);
        
//       
	  } 
}
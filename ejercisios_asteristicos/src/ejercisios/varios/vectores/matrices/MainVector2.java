package ejercisios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare un vector X cuya longitud se solicite al usuario de tipo int y construya un programa
		// que pida al usuario que ingrese valores para cada posicion
		//y finalemnte que se imprima todo los valores ingresados
		
		Scanner entrada = new Scanner (System.in);
	    int f = entrada.nextInt();
//	    int f = entrada.nextInt();
	    int c = entrada.nextInt();

	    int matriz [][]= new int [f][c];

	    for (int i = 0; i < f; i++) {
	        for (int j = 0; j < c; j++) {
	            System.out.print(matriz[i][j]);
	        }
	        System.out.println();
	    }
	}
}
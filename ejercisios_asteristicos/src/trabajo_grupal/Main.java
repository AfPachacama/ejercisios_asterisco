package trabajo_grupal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        
	        Vector mergeSort = new Vector();
	        Scanner teclado = new Scanner(System.in);
	        System.out.println("Ingrese la longitud del vector:");
	        int N = teclado.nextInt();
	        int X[] = new int[N];
	        for (int i=0;i<N;i++) {
	        System.out.println("Ingrese valor de la posicion: " + i);
	        int M = teclado.nextInt();
	        X[i]=M;
	        }
	        System.out.println("Los valores ingresados son: ");
	        for (int i=0;i<N;i++) {
	        System.out.print( X[i] + " | ");
	        }
	        System.out.println();

	 

	 

	        System.out.println("Valores ordenados son: ");
	        Vector.sort(X,0,N-1);
	        Vector.printX(X);
	       
	        System.out.println("Ordenamiento Por JAVA ");
	        System.out.println("El vector antes de ordenar: " + Arrays.toString());

            //Aqui Ordeno mi vector.
	        Arrays.sort(Vector);
	        System.out.println("El vector despues de ordenar: " + Arrays.toString());



	}

}

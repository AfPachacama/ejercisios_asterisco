package metodo.merge.sort;

import java.util.Scanner;

public class MainMergeSort {

private static void printArray(int[] vector) {
		
		for(int i: vector) {
			System.out.print(i + " | ");
			
		}
		System.out.println();
		
	}
	// Comienza a dividir la matriz en elementos mas simples.
	private static int[] mergeSort(int[] vector) {
		
		
		//metodo merge sort
//		.length
//		Esta función se usa para obtener la longitud de una cadena Java.
//		Este método devuelve la longitud de cualquier cadena que sea igual al número de caracteres Unicode 
//		de 16 bits en la cadena.
		if(vector.length <= 1) {
			
			return vector;
			
		}
		
		int midpoint = vector.length / 2;
		
		// declaramos los movientos a ejecutar para el orden
		int[] izquierda = new int[midpoint];
		int[] derecha;
//		vector par
		if(vector.length % 2 == 0) {
			
			derecha = new int[midpoint];
			
		} else {
			
			derecha = new int[midpoint + 1];	
		}
		
		// Movimiento de izquierda a derecha
		
		for(int i=0; i < midpoint; i++) {
			
			izquierda[i] = vector[i];	
		}
		
		for(int j=0; j < derecha.length; j++) {
			
			derecha[j] = vector[midpoint+j];
		}
		
		int[] result = new int[vector.length];
		
		izquierda = mergeSort(izquierda);
		derecha = mergeSort(derecha);
		
		result = merge(izquierda, derecha);
//		El return es una manera de indicar que el método en cuestión ha terminado.
		return result;
		
	}
	
	
	private static int[] merge(int[] izquierda, int[] derecha) {
		
		int[] result = new int[izquierda.length + derecha.length];
		
		int izquierdaPointer, derechaPointer, resultPointer;
		izquierdaPointer = derechaPointer = resultPointer = 0;
		
		while(izquierdaPointer < izquierda.length || derechaPointer < derecha.length) {
			
			if(izquierdaPointer < izquierda.length && derechaPointer < derecha.length) {
				
				if(izquierda[izquierdaPointer] < derecha[derechaPointer]) {
					
					result[resultPointer++] = izquierda[izquierdaPointer++];
					
				} else {
					
					result[resultPointer++] = derecha[derechaPointer++];
				}
				
			}
			
			else if(izquierdaPointer < izquierda.length) {
				
				result[resultPointer++] = izquierda[izquierdaPointer++];
				
			}
			
			else if(derechaPointer < derecha.length) {
				
				result[resultPointer++] = derecha[derechaPointer++];
		}	
 			
		}
		
		return result;
		
	}
	
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Metodo MergeSort");
		System.out.println("----------------------------------------------------------------------------------------- ");
		System.out.println("Ingrese el numero de filas del vector:");

		int n = teclado.nextInt();
		int array []= new int[n];

		for (int i = 0; i<array.length; i++) {
			System.out.print("Ingrese fila "+(i+1)+": ");
			array[i] = teclado.nextInt();
		}
		System.out.println("Vector Desordenado: ");
		printArray(array);
		
		array = mergeSort(array);
		System.out.println("Vector Ordenado: ");
		printArray(array);
		
	}

}
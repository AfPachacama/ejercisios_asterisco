package ejercisios_asteristicos;

import java.util.Scanner;

public class asteriscos {
	// Segundo comit

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Muy buena codificacion 
		
		System.out.println("---------Prueba 1--------- ");
		Scanner Leer = new Scanner(System.in);
		int num,suma;
		 suma=0;
		 do
		 {
		 System.out.print("Introduzca un número: ");
		 num=Leer.nextInt();
		 suma=suma+num;
		 }
		 while(num!=0);
		 
		 System.out.println("La suma de todos los números es: "+suma);
		 
		 }
		}


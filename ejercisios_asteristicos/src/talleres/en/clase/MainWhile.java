package talleres.en.clase;

import java.util.Scanner;

public class MainWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------Prueba 1--------- ");
		Scanner teclado = new Scanner(System.in);
		int num,sum;
		sum=0;
		 
		 System.out.print("Ingrese un número: ");
		 num=teclado.nextInt();
		 while(num != 0){ 
		 sum=sum+num;
		 System.out.print("Ingrese un número: ");
		 num=teclado.nextInt();
		 } 
		 System.out.print("La suma de los numeros es: "+sum);
		 }
		}
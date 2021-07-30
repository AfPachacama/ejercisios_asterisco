package talleres.en.clase;

import java.util.Scanner;

public class MainDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------Prueba 2--------- ");
		Scanner teclado = new Scanner(System.in);
		int num, suma, elementos;
		 float media; 
		 System.out.print("Ingrese un numero: ");
		 num=teclado.nextInt();
		 
		 suma= 0;
		 elementos= 0;
		 
		 while(num>=0) 
		 {
		 suma+=num;
		 elementos++;
		 System.out.print("Ingrese otro numero: ");
		 num=teclado.nextInt();
		 }
		 if (elementos == 0) 
		 System.out.println("No es posible hacer la media");
		 else
		 {
		 media= (float)suma/elementos;
		 System.out.println("La media es de : " + media);
		 }
		 }
		}


	

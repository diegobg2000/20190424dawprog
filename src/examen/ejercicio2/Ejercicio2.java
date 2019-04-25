package examen.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.println("Escriba el primer numero");
		int n ;  
		n = in.nextInt();
		
		try {
			n=-1;
		}
		catch(ArrayIndexOutOfBoundsException excepcion)
		{
			System.out.println("Este numero no se encuentra en el rango valido de valores que se puden introducir");
			
		}
		
	
		
		if(n<1) {
			
			do {
			System.out.println("El numero tiene que ser mayor que 0");
			System.out.println("Escribalo de nuevo");
			n = in.nextInt();
			}
			while(n<1);

}
	
		
		System.out.print("Escriba el segundo numero");
		int m = 0;
		m = in.nextInt();
		
		
		if(m<1) {
			
			do {
			System.out.println("El numero tiene que ser mayor que 0");
			System.out.println("Escribalo de nuevo");
			n = in.nextInt();
			}
			while(m<1);
			
		
		
					}
		
		
				
			
		}
}


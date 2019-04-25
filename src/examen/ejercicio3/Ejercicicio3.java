package examen.ejercicio3;

import java.util.Scanner;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicicio3 {

/*	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dir;
		System.out.println("Escriba la direccion IP");	
		dir = in.nextInt();
		int dir2 = Integer.toString(dir).length();
		if(dir2<4 || dir2>12) {
			do {
			System.out.println("Esta escribiendo de forma incorrecta la direccion IP");
			System.out.println("Escribala correctamente");
			dir = in.nextInt();
			dir2 = Integer.toString(dir).length();

			}
			while(dir2<4 || dir2>12);
			System.out.println("Escriba todos los numero ");

		}
		
	}

}*/
	 
	    public static void main(String[] args) {
	    	boolean finalizar = false;
	    	int contador = 0;
	    	boolean comprobador = false;
	        Scanner in = new Scanner(System.in);
	        System.out.print("Escribe una direccion IP");
	        String cadena = in.next();
	        String [] Numers=cadena.split("\\.");
	        int [] Numeros= new int[4];
	        while (Numeros.length <4 || Numeros.length >4){
	            System.out.println("Esta direccion IP es incorrecta por numero de bloques");
	            break;}
	        if(Numers.length > 12) {
	         	System.out.println("Direccion IP incorrecta por numero de cifras por bloque");
	         	finalizar = true;
	        }
	     /*   if (finalizar = true) {
	        	System.out.println("El programa ha finalizado");
	        	 System.exit(0);
	        }*/

	        for(int i = 0; i<Numeros.length;i++) {

	        	if(Numeros [i]<=255 && Numeros [i]>=0 ) {
	        		
	        			contador ++;
	        			comprobador = true;
	        	
	        	}
	        	if (comprobador = true && contador == Numeros.length) {
		        	System.out.println("La direccion IP es correcta");
		        }
	        }
	        
	        
	    }
}
	        
	        
	        
	        /*if(Numeros[0]<=255 && Numeros[1]<=255 && Numeros[2]<=255 && Numeros[3]<=255){
	        	 if(Numeros[0]>=0 && Numeros[1]>=0 && Numeros[2]>=0 && Numeros[3]>=0) {
	        	System.out.println("La direccion IP es valida");
	        	 }
	        }
	         else {
		            System.out.println("Esta direccion IP es incorrecta");
	         }
	    }
	}*/



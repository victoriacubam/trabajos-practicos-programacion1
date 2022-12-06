/*Escribir un programa que mientras el usuario cargue desde teclado un numero distinto de 0, llame a un método que imprima por pantalla los numeros entre 1 y 4 de forma creciente 
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo_4 {
	
	public static void main(String[] args) {
		int numero;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			System.out.println("Ingrese un entero (0 para salir): ");
			numero = Integer.valueOf(entrada.readLine());
			while (numero != 0) {
				imprimir_de_1_a_4 ();				
				System.out.println("Ingrese un entero (0 para salir): ");
				numero = Integer.valueOf(entrada.readLine());
			}	
		}
		catch (Exception exc) {
			System.out.println(exc);
		}		
	}
	
	public static void imprimir_de_1_a_4 () {
		final int MAX = 4;
		final int MIN = 1;
		for (int i = MIN; i<= MAX; i++) {
			System.out.println("Numero es " + i);
		}
	}
}

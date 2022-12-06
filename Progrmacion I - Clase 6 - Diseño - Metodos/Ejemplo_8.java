/* Escribir un programa que dado un numero natural (entero > 0 o >=1) ingresado por el usuario llame un metodo que imprima de forma decreciente 
los numeros naturales menores a ese numero ingresado. Finalmente, imprima el numero natural ingresado 
*/

/* Pseudocodigo:
	...
	public static void main(String[] args) {
	obtener un numero de teclado
	si ese numero es natural 
		imprimir_decreciente(numero)
	}
	public static void imprimir_decreciente(int numero) {
		mientras numero > 0
			imprimir el numero
			decrementar el numero
	}	
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo_8 {
	public static final int MIN = 1; //LA CONSTANTE DEFINIRLA COMO GLOBAL PARA PODER USARLA EN OTROS
	public static void main(String[] args) {
		int numero_natural;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			System.out.println ("Ingrese un numero natural: ");
			numero_natural = Integer.valueOf(entrada.readLine());
			if (numero_natural >= MIN) {
				imprimir_decreciente(numero_natural);
			}
			System.out.println ("Numero natural ingresado: " + numero_natural);
		}
		catch (Exception exc){
			System.out.println(exc);
		}
	}
	public static void imprimir_decreciente(int numero) {
		while (numero >= MIN) {
			System.out.println ("El natural es: " + numero);
			numero--;
		}
	}
}
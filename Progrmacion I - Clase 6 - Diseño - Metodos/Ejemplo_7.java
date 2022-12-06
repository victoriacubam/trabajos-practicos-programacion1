/*Escribir un programa que dado un numero ingresado por el usuario, si el numero es natural imprima la tabla de multiplicar de ese numero.
*/


/*import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo_7 {

	public static void main(String[] args) {
		Usuario ingresa un numero
		Si el numero es natural
			imprime tabla de multiplicar (numero)
	}
	imprimir tabla de multiplicar (numero) {
		con un multiplicador =1 va a iterar de 1 a 10
			imprimir multiplicador*numero
			incrementar multiplicador
	}	
}
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo_7 {
	public static final int MIN = 0; //Las contantes definirnas como globales para que puedan ser utilizadas por otros metodos
	public static final int MAXMULTIPLICADOR = 10;
	public static void main(String[] args) {
		int numero;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			System.out.println ("Ingrese un numero: ");
			numero = Integer.valueOf(entrada.readLine());
			if (numero > MIN) {
				imprimir_tabla_multiplicar (numero);
			}
		}
		catch (Exception exc){
			System.out.println(exc);
		}
	}
	public static void imprimir_tabla_multiplicar (int numero) {
		for (int multiplicador = 1 ; multiplicador <= MAXMULTIPLICADOR; multiplicador++) {
			System.out.println (multiplicador + " * " + numero + " = " + multiplicador*numero);
		}
	}
	
}

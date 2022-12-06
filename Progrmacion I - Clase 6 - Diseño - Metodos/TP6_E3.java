import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP6_E3 {
	public static void main(String[] args) {
		char caracter;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			System.out.println("Ingrese un caracter letra minuscula");
			caracter = entrada.readLine().charAt(0);
		
			while ((caracter<='z')&&(caracter>='a')) {
				imprimir_tabla_multiplicar_9 ();
				System.out.println("Ingrese un caracter letra minuscula");
				caracter = entrada.readLine().charAt(0);
			}
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}		
		public static void imprimir_tabla_multiplicar_9 () {
			final int MAX = 10;
			final int MIN = 0;
			for (int i = MIN; i<= MAX; i++) {
				System.out.println("9 x " + i + " = " + 9*i);
			}
		}
}

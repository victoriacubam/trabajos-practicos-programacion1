import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP5_E7 {
	public static void main(String[] args) {
		char caracter;
		char mayor = 'a';
		char menor = 'z';
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese in caracter letra minuscula: ");
			caracter = entrada.readLine().charAt(0);
			while ((caracter >= 'a') && (caracter <= 'z')) {
				if (caracter < menor) {
					menor = caracter;
				}
				else if (caracter > mayor) {
					mayor = caracter;
				}
				System.out.println("Ingrese in caracter letra minuscula: ");
				caracter = entrada.readLine().charAt(0);	
			}
			System.out.println("La menor letra ingresada fue: " + menor);
			System.out.println("La mayor letra ingresada fue: " + mayor);
		}
		catch (Exception exc) {
			System.out.println (exc);
		}
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP5_E6 {
	public static void main(String[] args) {
		char caracter;
		int cantidad_vocales = 0;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un caracter: ");
			caracter = entrada.readLine().charAt(0);
			while ((caracter>='a') && (caracter<='z')) {
				if ((caracter=='a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u')) {
					cantidad_vocales++;
				}
				System.out.println("Ingrese un caracter: ");
				caracter = entrada.readLine().charAt(0);	
			}
			System.out.println(cantidad_vocales);
		}
		catch (Exception exc) {
			System.out.println (exc);
		}
	}

}

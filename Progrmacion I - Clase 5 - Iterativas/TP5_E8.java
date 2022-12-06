import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP5_E8 {
	public static void main(String[] args) {
		char caracter;
		int entero;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un caracter letra minuscula: ");
			caracter = entrada.readLine().charAt(0);
			while ((caracter >= 'a') && (caracter <= 'z')) {
				System.out.println("Ingrese un entero: ");
				entero = Integer.valueOf (entrada.readLine());	
				if ((entero >= 1) && (entero <= 5)) {
					for (int multiplicador=0 ; multiplicador <=10 ; multiplicador++) {
						System.out.println(entero + "x" + multiplicador + "=" + entero*multiplicador);
					}
				}
				System.out.println("Ingrese un caracter letra minuscula: ");
				caracter = entrada.readLine().charAt(0);
			}
		}
		catch (Exception exc) {
			System.out.println (exc);
		}
	}
}
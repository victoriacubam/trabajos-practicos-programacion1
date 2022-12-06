import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP4_E1 {
	public static void main(String[] args) {
		char caracter;
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Ingrese un caracter");
			caracter = entrada.readLine().charAt(0);
			if ((caracter >= '0') && (caracter <= '9')) {
				System.out.println("Es caracter digito");
			}
			else {
				System.out.println("No es caracter digito");
			}
		}
		catch (Exception exc) {
		      System.out.println(exc);
		}
	}
}

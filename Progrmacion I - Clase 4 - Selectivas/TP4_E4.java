import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP4_E4 {
	public static void main(String[] args) {
		int numero;
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Ingrese un numero entero");
			numero= Integer.valueOf(entrada.readLine());
			if (numero > 0) {
				System.out.println("El valor ingresado es positivo");
				if (numero > 100) {
					System.out.println("Grande");
				}
				else {
						System.out.println("Chico");
				}
			}
			else if (numero % 2 == 0) {
				System.out.println(numero + " es par");
			}
			else if (numero % 3 == 0) {
				System.out.println(numero + " es multiplo de 3");
			}
			else {
				System.out.println(numero + " no es par ni multiplo de 3");
			}
		}
		catch (Exception exc) {
		      System.out.println(exc);
		}
	}
}
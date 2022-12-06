import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP4_E5 {
	public static void main(String[] args) {
		char caracter;
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Ingrese un caracter");
			caracter= entrada.readLine().charAt(0);
			if ((caracter >= '0')&&(caracter <= '9')) {
				System.out.println("El caracter ingresado es un digito");
			}
			else if ((caracter >= 'a')&&(caracter <= 'z')) {
				System.out.println("El caracter ingresado es una letra minuscula");
				if ((caracter == 'a')||(caracter == 'e')||(caracter == 'i')||(caracter == 'o')||(caracter == 'u')) {
					System.out.println("Vocal");
				}
				else {
						System.out.println("Consonante");
				}
			}
			else {
				System.out.println(caracter + " Es un caracter que no es digito ni letra minuscula");
			}
		}
		catch (Exception exc) {
		      System.out.println(exc);
		}
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP5_E5 {
	public static void main(String[] args) {
		int numero;
		int suma = 0;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero entre 1 y 10: ");
			numero =Integer.valueOf (entrada.readLine());
			while ((numero >= 1) && (numero <= 10)) {
				suma+=numero;
				System.out.println("Ingrese un numero entre 1 y 10: ");
				numero =Integer.valueOf (entrada.readLine());
			}
			System.out.println("La suma de los numeros ingresados es: " + suma);
		}
		catch (Exception exc) {
			System.out.println (exc);
		}
	}

}

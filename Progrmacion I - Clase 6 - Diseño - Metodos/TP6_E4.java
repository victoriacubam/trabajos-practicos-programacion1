import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP6_E4 {

	public static void main(String[] args) {
		int entero;
		int sumatoria;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			System.out.println("Ingrese un numero distinto de 0");
			entero = Integer.valueOf (entrada.readLine ());
			while (entero != 0) {
				sumatoria=sumatoria_primeros_200 ();
				System.out.println("La sumatoria de los primeros 200 numeros naturales es= " + sumatoria);
				System.out.println("Ingrese un numero distinto de 0");
				entero = Integer.valueOf (entrada.readLine ());
			}
		}
		catch (Exception exc) {
			System.out.println(exc);
		}
	}

	public static int sumatoria_primeros_200 () {
		final int MAX = 200;
		final int MIN = 1;
		int sumatoria = 0;
		for (int suma = MIN; suma <= MAX; suma++) {
			sumatoria+=suma;
		}
		return sumatoria;
	}
}

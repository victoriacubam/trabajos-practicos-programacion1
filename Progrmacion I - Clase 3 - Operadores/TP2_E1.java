import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP2_E1 {
	public static void main(String[] args) {
		int numero1, resultado;
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Ingrese un numero: ");
			numero1 = Integer.valueOf(entrada.readLine());
			resultado = (numero1/2);
			System.out.println("El cociente entre " + numero1 + " y 2 es: " + resultado);
			resultado = (numero1/3);
			System.out.println("El cociente entre " + numero1 + " y 3 es: " + resultado);
			resultado = (numero1/4);
			System.out.println("El cociente entre " + numero1 + " y 4 es: " + resultado);
		}
		catch (Exception exc) {
		      System.out.println(exc);
		    }
	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP2_E1_1 {
	public static void main(String[] args) {
		int numero1;
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
			
			System.out.println("Ingrese un numero: ");
			numero1 = Integer.valueOf(entrada.readLine());
			
			System.out.println("El cociente entre " + numero1 + " y 2 es: " + (numero1/2));
		
			System.out.println("El cociente entre " + numero1 + " y 3 es: " + (numero1/3));
			
			System.out.println("El cociente entre " + numero1 + " y 4 es: " + (numero1/4));
		}
		catch (Exception exc) {
		      System.out.println(exc);
		    }
	}

}

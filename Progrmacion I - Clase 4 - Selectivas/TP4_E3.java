import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP4_E3 {
	public static void main(String[] args) {
		int numero;
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Ingrese un numero entero");
			numero= Integer.valueOf(entrada.readLine());
			if ((numero % 6 == 0)&&(numero % 7 == 0)) {
				System.out.println("Es multiplo de 6 y de 7");
			}
			else if ((numero > 30) && (numero % 2 == 0)){
				System.out.println("Es mayor a 30 y multiplo de 2");
			}
			if ((numero/5)>10) {
				System.out.println("El cociente entre " + numero + " y 5 es mayor a 10");
			}
		}
		catch (Exception exc) {
		      System.out.println(exc);
		}
	}
}
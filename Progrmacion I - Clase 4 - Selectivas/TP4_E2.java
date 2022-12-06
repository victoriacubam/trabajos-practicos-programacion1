import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP4_E2 {
	public static void main(String[] args) {
		int numero1, numero2;
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Ingrese un numero entero");
			numero1= Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese otro numero entero");
			numero2= Integer.valueOf(entrada.readLine());
			if (numero1 > numero2) {
				System.out.println("A");
			}
			else if ((numero1 % 2 == 0) && (numero2 % 2 == 0)) {
				System.out.println("B");
			}
			else {
				System.out.println("C");
			}
		}
		catch (Exception exc) {
		      System.out.println(exc);
		}
	}
}
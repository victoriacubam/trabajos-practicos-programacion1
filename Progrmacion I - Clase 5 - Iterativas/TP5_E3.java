import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP5_E3 {
	public static void main (String [] args) {
		int entero1, entero2;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			System.out.println("Ingrese un numero entero distinto de 0: ");
			entero1=Integer.valueOf (entrada.readLine());
			while (entero1!=0) {
				System.out.println("Ingrese otro numero entero distinto de 0: ");
				entero2=Integer.valueOf (entrada.readLine());
				System.out.println("El numero ingresado es " + entero2);
				System.out.println("Ingrese un numero entero distinto de 0: ");
				entero1=Integer.valueOf (entrada.readLine());
			}
		}
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
}

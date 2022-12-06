import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP2_E3 {

	public static void main(String[] args) {
		int numero1, numero2;
		boolean resultado;
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Ingrese un numero: ");
			numero1= Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese otro numero: ");
			numero2= Integer.valueOf(entrada.readLine());
			resultado = (numero1 > numero2);
			System.out.println(numero1 + " es mayor a " + numero2 + " : " + resultado);
			resultado = (((numero1%2)==0)&&((numero2%2)==0));
			System.out.println(numero1 + " y " + numero2 + " son multiplos de 2: " + resultado);
		}
		catch (Exception exc) {
		      System.out.println(exc);
		    }
	}

}

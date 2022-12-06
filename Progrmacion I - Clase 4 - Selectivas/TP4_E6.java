import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP4_E6 {
	public static void main(String[] args) {
		int numeroMes, anio;
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Ingrese un numero de mes");
			numeroMes= Integer.valueOf(entrada.readLine());
			if ((numeroMes == 1)||(numeroMes == 3)||(numeroMes == 5)||(numeroMes == 7)||(numeroMes == 8)||(numeroMes == 10)||(numeroMes == 12)) {
				System.out.println("El mes ingresado tiene 31 dias");
			}
			else if ((numeroMes == 4)||(numeroMes == 6)||(numeroMes == 9)||(numeroMes == 11)) {
				System.out.println("El mes ingresado tiene 30 dias");
			}
			else if (numeroMes == 2) {
				System.out.println("Por favor ingrese numero de anio");
				anio = Integer.valueOf(entrada.readLine());
				if ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)) {
					System.out.println("El mes ingresado tiene 29 dias");
				}
				else {
						System.out.println("El mes ingresado tiene 28 dias");
				}
			}
		}
		catch (Exception exc) {
		      System.out.println(exc);
		}
	}
}
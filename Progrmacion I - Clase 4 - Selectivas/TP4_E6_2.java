import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP4_E6_2 {
	public static void main(String[] args) {
		int numeroMes, anio;
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Ingrese un numero de mes");
			numeroMes= Integer.valueOf(entrada.readLine());
			switch (numeroMes) {
				case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : {
					System.out.println("El mes ingresado tiene 31 dias");
					break;
				}
				case 4 : case 6 : case 9 : case 11 : {
					System.out.println("El mes ingresado tiene 30 dias");
					break;
				}
				case 2 : {
					System.out.println("Ingrese numero de año");
					anio = Integer.valueOf(entrada.readLine());
					if ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)) {
						System.out.println("El mes ingresado tiene 29 dias");
					}
					else {
							System.out.println("El mes ingresado tiene 28 dias");
					}
					break;
				}
			}
		}
		catch (Exception exc) {
		      System.out.println(exc);
		}
	}
}
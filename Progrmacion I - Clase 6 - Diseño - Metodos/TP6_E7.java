import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Escribir un programa que mientras el usuario ingresa un numero de mes 
(entero) entre 1 y 12 inclusive, muestre por pantalla la cantidad de días del 
mes ingresado (suponer febrero de 28 días) (¿mostrar por pantalla la 
cantidad de días del mes debería realizarse con un método? Debería). */

public class TP6_E7 {
	public static void main (String[] args) {
		int mes;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			System.out.println("Ingrese un numero de mes (entre 1 y 12 inclusive): ");
			mes = Integer.valueOf(entrada.readLine());
			while ((mes>=1)&&(mes<=12)) {
				cantidad_dias_del_mes(mes);
				System.out.println("Ingrese un numero de mes (entre 1 y 12 inclusive): ");
				mes = Integer.valueOf(entrada.readLine());
			}
		}
		catch (Exception exc){
			System.out.println(exc);
		}	
	}
	
	public static int cantidad_dias_del_mes(int cantidad_dias) {
		switch (cantidad_dias) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
				System.out.println("El mes ingresado tiene 31 dias");
				break;
			}
			case 4: case 6: case 9: case 11: {
				System.out.println("El mes ingresado tiene 30 dias");
				break;
			}
			case 2: {
				System.out.println("El mes ingresado tiene 28 dias");
				break;
			}
		}
		return cantidad_dias;
	}
}

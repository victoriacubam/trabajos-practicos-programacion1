/* Realizar un programa que dado dos números enteros ingresados por el usuario, muestre por pantalla el resultado de las operaciones matemáticas 
básicas: la suma, la resta, la multiplicación y la división entre ambos números.
*/

/*
public class Clase_6_Ejemplo_9 {
	public static void main(String[] args){
		obtener numero1 entero
		obtener numero2 entero
		imprimir resultados operaciones matematicas (numero1, numero2)
	}
	public static void imprimir resultados operaciones matematicas (numero1, numero2){
		imprimir numero1 + numero2
		imprimir numero1 - numero2
		imprimir numero1 * numero2
		imprimir numero1 / numero2
	}
} 
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejemplo_9 {
	public static void main(String[] args) {
		int numero1, numero2;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			System.out.println ("Ingrese un numero entero: ");
			numero1= Integer.valueOf(entrada.readLine());
			System.out.println ("Ingrese otro numero entero: ");
			numero2= Integer.valueOf(entrada.readLine());
			imprimir_resultados_operaciones_matematicas (numero1, numero2);
		}
		catch (Exception exc){
			System.out.println(exc);
		}
	}
	public static void imprimir_resultados_operaciones_matematicas (int numero1, int numero2) { //Estos parametros tienen que coincidir en tipo y en orden con lo de arriba
		System.out.println (numero1 + " + " + numero2 + " = " + (numero1 + numero2));
		System.out.println (numero1 + " - " + numero2 + " = " + (numero1 - numero2));
		System.out.println (numero1 + " * " + numero2 + " = " + (numero1 * numero2));
		System.out.println (numero1 + " / " + numero2 + " = " + (numero1 / numero2));
	}
}

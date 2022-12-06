/*Realizar un programa que dado dos números enteros y un carácter, todos ingresados por el usuario, muestre por pantalla el resultado de la operación matemática 
 básica considerando el valor del carácter. Si ingreso el caracter: – ‘a’ la suma, ‘b’ la resta, ‘c’ la multiplicación y ‘d’ la división entre ambos números. 
*/

/*
public class Clase_6_Ejemplo_10 {
	public static void main(String[] args){
		obtener numero1 entero
		obtener numero2 entero
		obtener caracter
		imprimir resultado operacion matematica (carácter, numero1, numero2)
	}
	public static void imprimir resultado operacion matematica (opción, numero1, numero2){
		si la opción es 
			a imprimir numero1 + numero2
			b imprimir numero1 - numero2
			c imprimir numero1 * numero2
			d imprimir numero1 / numero2
	}
}
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo_10 {
	public static void main(String[] args) {
		int numero1, numero2;
		char caracter;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			System.out.println ("Ingrese un numero entero: ");
			numero1= Integer.valueOf(entrada.readLine());
			System.out.println ("Ingrese otro numero entero: ");
			numero2= Integer.valueOf(entrada.readLine());
			System.out.println ("Ingrese un caracter: ");
			caracter= entrada.readLine().charAt(0);
			imprimir_resultado_operacion_matematica (caracter, numero1, numero2);
		}
		catch (Exception exc){
			System.out.println(exc);
		}
	}
	public static void imprimir_resultado_operacion_matematica (char opcion, int numero1, int numero2) {
		switch (opcion) {
			case 'a': {
				System.out.println (numero1 + " + " + numero2 + " = " + (numero1 + numero2));
				break;
			}
			case 'b': {
				System.out.println (numero1 + " - " + numero2 + " = " + (numero1 - numero2));
				break;
			}
			case 'c': {
				System.out.println (numero1 + " * " + numero2 + " = " + (numero1 * numero2));
				break;
			}
			case 'd': {
				System.out.println (numero1 + " / " + numero2 + " = " + (numero1 / numero2));
				break;
			}
		}
	}
}

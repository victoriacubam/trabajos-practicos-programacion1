/*Realizar un programa que dado dos n�meros enteros y un car�cter, todos ingresados por el usuario, muestre por 
pantalla el resultado de la operaci�n matem�tica b�sica considerando el valor del car�cter. Si ingreso el caracter: 
� �a� la suma, �b� la resta, �c� la multiplicaci�n y �d� la divisi�n entre ambos n�meros.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TP6_E9 {
	public static void main(String[] args) {
		int entero1, entero2;
		char caracter;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			System.out.println("Ingrese un numero entero: ");
			entero1= Integer.valueOf (entrada.readLine());
			System.out.println("Ingrese otro numero entero: ");
			entero2= Integer.valueOf (entrada.readLine());
			System.out.println("Ingrese un caracter: ");
			caracter= entrada.readLine().charAt(0);
			imprimir_operacion_matematica_basica (caracter, entero1, entero2);
		}
		catch (Exception exc){
			System.out.println(exc);
		}	
	}
	public static void imprimir_operacion_matematica_basica (char opcion, int entero1, int entero2) {
		switch (opcion) {
			case 'a': {
				System.out.println(entero1 + " + " + entero2 + " = "+ (entero1 + entero2));
				break;
			}
			case 'b': {
				System.out.println(entero1 + " - " + entero2 + " = "+ (entero1 - entero2));
				break;
			}
			case 'c': {
				System.out.println(entero1 + " * " + entero2 + " = "+ (entero1 * entero2));
				break;
			}
			case 'd': {
				System.out.println(entero1 + " / " + entero2 + " = "+ (entero1 / entero2));
				break;
			}
		}
	}
}

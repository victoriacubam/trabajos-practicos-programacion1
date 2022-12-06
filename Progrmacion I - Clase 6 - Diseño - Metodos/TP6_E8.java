/*Escribir un programa que mientras que el usuario ingrese un caracter letra minúscula, pida ingresar un numero entero. Si el número ingresado está 
entre 1 y 5 inclusive deberá imprimir la tabla de multiplicar de dicho numero.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TP6_E8 {
	public static final int MAXMULTIPLICADOR = 10;
	public static final int MAX = 5;
	public static final int MIN = 1;
	public static void main(String[] args) {
		char caracter;
		int entero;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			System.out.println("Ingrese un caracter letra minuscula: ");
			caracter= entrada.readLine().charAt(0);
			while ((caracter >='a')&&(caracter <='z')) {
				System.out.println("Ingrese un numero entero: ");
				entero = Integer.valueOf(entrada.readLine());
				if ((entero >= MIN) && (entero <= MAX)) {
					imprimir_tabla_multiplicar(entero);
				}
				System.out.println("Ingrese un caracter letra minuscula: ");
				caracter= entrada.readLine().charAt(0);
			}
		}
		catch (Exception exc){
			System.out.println(exc);
		}	
	}
	public static void imprimir_tabla_multiplicar(int entero) {
		for (int multiplicador = 1; multiplicador <=MAXMULTIPLICADOR; multiplicador++) {
			System.out.println(multiplicador + " x " + entero + " = " + multiplicador * entero);
		}
	}
}

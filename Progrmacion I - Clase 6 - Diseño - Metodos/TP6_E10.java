/*Escribir un programa que mientras el usuario ingrese un n�mero entero 
entre 1 y 10, pida ingresar un caracter, y por cada caracter ingresado 
imprima:
� �letra min�scula� si el caracter es una letra del abecedario en min�scula;
� �letra may�scula� si el caracter es una letra del abecedario en may�scula;
� �d�gito� si el caracter corresponde a un car�cter n�mero;
� �otro� para los restantes casos de caracteres.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP6_E10 {
	public static final int MIN = 1;
	public static final int MAX = 10;
	public static void main(String[] args) {
		int entero;
		char caracter;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			System.out.println("Ingrese un numero entero entre 1 y 10: ");
			entero= Integer.valueOf (entrada.readLine());
			while ((entero >= MIN) && (entero <= MAX)) {
				System.out.println("Ingrese un caracter: ");
				caracter= entrada.readLine().charAt(0);
				imprimir_tipo_caracter(caracter);
				System.out.println("Ingrese un numero entero: ");
				entero= Integer.valueOf (entrada.readLine());
			}
		}
		catch (Exception exc){
			System.out.println(exc);
		}
	}
	public static void imprimir_tipo_caracter(char caracter) {
		if ((caracter >='a')&&(caracter <='z')) {
			System.out.println("letra minuscula");
		}
		else if ((caracter >='A')&&(caracter <='Z')) {
			System.out.println("letra mayuscula");
		}
		else if ((caracter >='0')&&(caracter <='9')) {
			System.out.println("digito");
		}
		else {
			System.out.println("otro");
		}
	}
}

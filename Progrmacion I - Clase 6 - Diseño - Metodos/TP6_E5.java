//Escribir un programa que mientras el usuario ingresa un caracter distinto 
//del caracter ‘*’, invoque a un método que imprima si es caracter dígito o 
//caracter letra minúscula, y si es letra minúscula imprimir si es vocal o 
//consonante. 
/*public class TP6_E5 {
	definir variables
	obtener caracter de teclado
	mientras que caracter sea distinto de *
		imprimir_tipo_caracter(caracter)
		obtener caracter de teclado
}

imprimir_tipo_caracter() {
	
}*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP6_E5 {
	public static void main (String[] args) {
		char caracter;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			System.out.println("Ingrese un caracter distinto de '*' : ");
			caracter = entrada.readLine().charAt(0);
			while (caracter != '*') {
				imprimir_tipo_caracter(caracter);
				System.out.println("Ingrese un caracter distinto de '*' : ");
				caracter = entrada.readLine().charAt(0);
			}
		}
		catch (Exception exc){
			System.out.println(exc);
		}	
	}
	public static char imprimir_tipo_caracter(char caracter) {
		if ((caracter >='a')&&(caracter <='z')) {
			System.out.println("El caracter ingresado es una letra minuscula");
			if ((caracter=='a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u')) {
				System.out.println("Vocal");
			}
			else {
				System.out.println("Consonante");
			}
		}
		else if ('0'<=caracter){
			System.out.println("El caracter ingresado es un digito");
		}				
		return caracter;
	}
}
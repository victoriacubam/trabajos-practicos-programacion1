/*Escribir un programa que mientras el usuario ingrese un número entero entre 1 y 10 realice:
– Si el numero ingresado es múltiplo de 3 pida ingresar un caracter, y para el caracter ingresado imprima a que tipo de carácter esta asociado:
• “letra minúscula” si el caracter es una letra del abecedario en minúscula;
• “letra mayúscula” si el caracter es una letra del abecedario en mayúscula;
• “dígito” si el caracter corresponde a un carácter número;
• “otro” para los restantes casos de caracteres.
– Si el numero ingresado es múltiplo de 5 imprima la tabla de multiplicar del numero ingresado.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TP6_E11 {
	public static final int MIN=1;
	public static final int MAX=10;
	public static void main(String[] args) {
		int entero;
		char caracter;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			System.out.println("Ingrese un numero entero entre " + MIN + " y " + MAX +": ");
			entero= Integer.valueOf (entrada.readLine());
			while ((entero >= MIN) && (entero <= MAX)) {
				if ((entero%3)==0) {
					System.out.println("Ingrese un caracter: ");
					caracter= entrada.readLine().charAt(0);
					imprimir_tipo_caracter(caracter);
				}
				else if ((entero%5)==0) {
					imprimir_tabla_multiplicar(entero);
				}
				System.out.println("Ingrese un numero entero entre " + MIN + " y " + MAX +": ");
				entero= Integer.valueOf (entrada.readLine());
			}
		}
		catch (Exception exc){
			System.out.println(exc);
		}
	}
	public static void imprimir_tipo_caracter(char caracter) {
		if ((caracter >='a')&&(caracter <='z')) {
			System.out.println("Es letra minuscula");
		}
		else if ((caracter >='A')&&(caracter <='Z')) {
			System.out.println("Es letra mayuscula");
		}
		else if ((caracter >='0')&&(caracter <='9')) {
			System.out.println("Es digito");
		}
		else {
			System.out.println("Es otro");
		}
	}
	public static void imprimir_tabla_multiplicar(int entero) {
		for (int multiplicador=1; multiplicador<=MAX; multiplicador++) {
			System.out.println(multiplicador + " x " + entero + " = " + multiplicador * entero);
		}
	}
}

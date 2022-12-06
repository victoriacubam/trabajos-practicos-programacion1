/*Escribir un diseno de un programa que mientras el usuario ingrese de un numero entero mayor que 0, imprima la tabla de multiplicar de 10. 
Cuando salga del ciclo vuelva a imprimir la tabla de multiplicar de 10.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejemplo_6 {
	public static final int MIN = 0;
	public static final int MINMULTIPLICADOR = 1;
	public static final int MAXMULTIPLICADOR = 10;
	public static final int VALOR = 10;
	public static void main(String[] args) {
		int numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingresar un numero entero natural: ");//Obtener numero desde teclado
			numero = Integer.valueOf(entrada.readLine());
			while (numero > MIN) {	//mientras numero >0 {
				imprimir_tabla_multiplicar_10(); //imprimir tabla de multiplicar de 10
				System.out.println("Ingresar un numero entero natural: "); //Obtener numero desde teclado
				numero = Integer.valueOf(entrada.readLine());
			}
			imprimir_tabla_multiplicar_10(); //imprimir tabla de multiplicar de 10
		}
		catch (Exception exc) {
			System.out.println(exc);
		}
		
	}
	public static void imprimir_tabla_multiplicar_10() {//Imprimir tabla de multiplicar de 10 {
		for (int multiplicador = MINMULTIPLICADOR; multiplicador <= MAXMULTIPLICADOR; multiplicador++) {//recorrer con un multiplicador de 1 a 10 (Esto es como se muestra una tabla de multiplicar)
			System.out.println(multiplicador + "*" + VALOR + "=" + multiplicador*VALOR);//imprimir multiplicador x 10 (Tabla de multiplicar del 10)
		}
	}
}

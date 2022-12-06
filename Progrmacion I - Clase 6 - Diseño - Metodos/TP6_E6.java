/*Escribir un programa que mientras que el usuario ingrese un número entero natural, llame a un método que calcule la sumatoria entre 1 y dicho 
numero y se lo retorne como resultado.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TP6_E6 {
	public static final int CONSTANTE = 1;
	public static void main(String[] args) {
		int natural;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			System.out.println("Ingrese un numero entero: ");
			natural = Integer.valueOf(entrada.readLine());
			while (natural>0) {
				sumatoria_entre_1_y_natural (natural);
				System.out.println("Ingrese un numero entero: ");
				natural = Integer.valueOf(entrada.readLine());
			}
		}
		catch (Exception exc){
			System.out.println(exc);
		}	
	}
	public static int sumatoria_entre_1_y_natural (int numero) {
		int resultado = numero + CONSTANTE;
		System.out.println("La sumatoria entre 1 y " + numero + " es: " + resultado);
		return resultado;	
	}
	
}

/*8. Hacer un programa que dado un arreglo ordenado creciente de enteros 
de tamaño 10 que se encuentra precargado, solicite al usuario un numero 
entero y elimine la primer ocurrencia de numero (un número igual) en el 
arreglo (si existe)*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP7_E8 {
	public static final int MAX = 10;
	public static void main(String[] args) {
		int [] arrentero;
		arrentero = new int [MAX];
		int numero, pos;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 
		try{
			cargar_arreglo_int(arrentero);
			imprimir_arreglo_int(arrentero);
			System.out.println("Ingrese un numero entero :");
			numero = Integer.valueOf(entrada.readLine());
			pos = buscar_pos(arrentero, numero);
			corrimiento_izq(arrentero, pos);
			imprimir_arreglo_int(arrentero);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}

	public static int buscar_pos(int [] arr, int numero) {
		int pos = 0;
		while ((pos < MAX)&&(arr[pos]!=numero)) {
			pos++;
		}
		return pos;
	}
	
	public static void corrimiento_izq(int [] arr, int pos) {
		int i = pos;
		while (i<MAX-1) {
			arr[i]= arr [i+1];
			i++;
		}
	}
	
	public static void cargar_arreglo_int(int [] arr){
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			for (int pos = 0; pos < MAX; pos++){
				System.out.println("Ingrese un entero: ");
				//modifico arr[pos], entonces modifico arrenteros[pos]
				arr[pos] = Integer.valueOf(entrada.readLine());
			} 
		}
		catch(Exception exc){
			System.out.println(exc); 
		}
	}
	public static void imprimir_arreglo_int(int [] arr){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}
}

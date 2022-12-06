/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra precargado, 
solicite al usuario un numero entero y elimine la primer ocurrencia de numero (un número igual) 
en el arreglo si existe. Para ello tendrá que buscar la posición y si está, realizar un corrimiento 
a izquierda (queda una copia de la última posición del arreglo en la anteúltima posición).
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class TP7_5 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		int [] arrentero;
		arrentero = new int [MAX];
		int numero, pos;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 
		try{
			cargar_arreglo_aleatorio_int(arrentero);
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
	
	public static void cargar_arreglo_aleatorio_int(int [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR); 
		}
	}
	public static void imprimir_arreglo_int(int [] arr){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}
	
}

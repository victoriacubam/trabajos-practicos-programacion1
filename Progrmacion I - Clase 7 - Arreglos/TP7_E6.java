/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra 
precargado, solicite al usuario un numero entero y elimine todas las ocurrencia de numero en el 
arreglo si existe. Mientras exista (en cada iteración tiene que buscar la posición dentro del 
arreglo) tendrá que usar la posición para realizar un corrimiento a izquierda (quedarán tantas 
copias de la última posición del arreglo como cantidad de ocurrencias del número).*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class TP7_E6 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		int [] arrentero;
		arrentero = new int [MAX];
		int numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 
		try{
			cargar_arreglo_aleatorio_int(arrentero);
			imprimir_arreglo_int(arrentero);
			System.out.println("Ingrese un numero entero :");
			numero = Integer.valueOf(entrada.readLine());
			
			while (hayOcurrencias(arrentero, numero)) {
				eliminar_ocurrencias(arrentero, numero);
			}
			imprimir_arreglo_int(arrentero);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}

	public static void eliminar_ocurrencias(int [] arr, int numero) {	
		for (int i=0; i < MAX; i++) {
			if (arr[i]==numero) {
				corrimiento_izq(arr, i);
			}
		}
	}
	
	public static boolean hayOcurrencias(int[] arr, int numero) {
		for (int valorActual : arr) {
			if (valorActual == numero) {
				return true;
			}
		}
		return false;
	}
	
	/*public static void eliminar_ocurrencias(int [] arr, int numero) {	
		for (int i=0; i < MAX; i++) {
			if (equal(arr[i], numero)) {
				corrimiento_izq(arr, i);
			}
		}
	}
	
	//el alan tira esta, re gomas
	public static boolean equal(int a, int b) {
		return a == b;
	}	*/
	
	public static void corrimiento_izq(int [] arr, int pos) {
		while (pos < MAX-1) {
			arr[pos]=arr[pos+1];
			pos++;
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



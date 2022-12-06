import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TP7_E13 {
	public static final int MAX = 20;
	public static void main(String[] args) {
		int [] arrEntero = { 0,2,3,0,5,9,0,1,1,0,2,8,9,7,0,1,4,4,10,0 };
		int numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 
		try{
			imprimir_arreglo(arrEntero);
			System.out.println("Ingresar posicion entera: ");
			numero=Integer.valueOf(entrada.readLine());
			buscar_tamaño_secuencia(arrEntero,numero);
			imprimir_arreglo(arrEntero);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	public static void buscar_tamaño_secuencia(int[] arr, int numero) {
		int inicio, fin, tamanio;
		inicio=0;
		fin=-1;
		while (inicio<MAX) {
			inicio=obtener_inicio_secuencia(arr,fin+1);
			if (inicio<MAX) {
				fin=obtener_fin_secuencia(arr, inicio);
				tamanio=obtener_tamanio_secuencia(arr,inicio,fin);
				if (tamanio==numero) {
					corrimiento_izquierda(arr,fin, tamanio);
				}
			}
			
		}
	}
	public static void corrimiento_izquierda(int[] arr, int fin, int tamanio) {
		int i=fin;
		while (i<MAX-1) {
			arr[i]=arr[i+tamanio];
			i++;
		}
	}
	public static int obtener_tamanio_secuencia(int[] arr, int inicio, int fin) {
		int tamanio = 0;
		tamanio=fin-inicio+1;
		return tamanio;
	}
	public static int obtener_fin_secuencia(int[] arr, int inicio) {
		int fin = inicio;
		while (arr[fin]!=0) {
			fin++;
		}
		return fin-1;
	}
	public static int obtener_inicio_secuencia(int[] arr, int fin) {
		int inicio=fin;
		while (arr[inicio]==0) {
			inicio++;
		}
		return inicio;
	}
	
	public static void imprimir_arreglo(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
		System.out.print("\n");
	}
}

/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra 
precargado, solicite al usuario un numero entero y lo agregue al principio del arreglo (posición 
0). Para ello tendrá que realizar un corrimiento a derecha (se pierde el último valor del arreglo) y 
colocar el numero en el arreglo en la posición indicada.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class TP7_E4 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		int [] arrentero;
		arrentero = new int [MAX];
		int numero;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			cargar_arreglo_aleatorio_int(arrentero);
			imprimir_arreglo_int(arrentero);
			System.out.println("Ingrese un numero entero: ");
			numero = Integer.valueOf (entrada.readLine());
			arrentero= corrimiento_der(arrentero);
			arrentero= agregar_valor(arrentero, numero);
			imprimir_arreglo_int(arrentero);
		}
		catch (Exception exc) {
			System.out.println(exc);
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
	
	public static int [] corrimiento_der(int [] arr) {	
		int pos = MAX-1;
		while (pos > 0){
			arr[pos] = arr[pos-1];
			pos--;
		}
		return arr;		
	}
	
	public static int[] agregar_valor(int[] arr, int numero) {
		arr[0] = numero;
		return arr;
	}
	
}

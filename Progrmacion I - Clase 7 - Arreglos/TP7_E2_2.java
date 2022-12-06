/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra 
precargado, obtenga la cantidad de números pares que tiene y la imprima.*/
import java.util.Random;
public class TP7_E2_2 {
	public static final int MAX = 10;
	public static int MINVALOR = 1;
	public static int MAXVALOR = 10;
	public static void main(String[] args) {
		int [] arrentero;
		arrentero = new int [MAX];
		int cantidad_pares;
		try {
			cargar_arreglo_aleatorio_int(arrentero);
			imprimir_arreglo_int(arrentero);
			cantidad_pares = obtener_numeros_pares(arrentero);
			System.out.println("En este arreglo hay " + cantidad_pares + " numeros pares");
		}
		catch(Exception exc){
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
	public static int obtener_numeros_pares(int [] arr) {
		int cantidad=0;
		for (int pos = 0; pos < MAX; pos++) {
			if (arr[pos]%2==0) {
				cantidad++;
			}
		}
		return cantidad;	
	}
}

/*Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra 
precargado, solicite al usuario una posición y realice un corrimiento a izquierda o hacia la 
menor posición del arreglo.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class TP7_E3 {
	public static final int MAX=10;
	public static final int MAXVALOR=10;
	public static final int MINVALOR=1;
	public static void main(String[] args) {
		int [] arrEntero;
		arrEntero = new int [MAX];
		int pos;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			cargar_arreglo_aleatorio_int(arrEntero);
			imprimir_arreglo_int(arrEntero);
			System.out.println("Ingrese un numero entero pos entre 0 y 9: ");
			pos = Integer.valueOf(entrada.readLine());
			corrimiento_izq(arrEntero,pos);
			imprimir_arreglo_int(arrEntero);
			
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
	public static void corrimiento_izq(int [] arr, int pos){
		int indice = 0;
		while (indice<pos) {
			arr[indice]= arr [indice+1];
			indice++;
		}
	}
}

/*Hacer un programa que dado un arreglo de enteros de tamano 8 que se encuentra precargado, solicite al usuario una posicion y 
realice un corrimiento a derecha o hacia la mayor posicion del arreglo. Ademas imprima el arreglo antes y despues del 
corrimiento
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random; //Carga del arreglo de forma aleatoria
public class Ejemplo5 {
	public static int MAXVALOR = 10;
	public static int MINVALOR = 1;
	public static int MAX = 8;
	public static void main(String[] args) {
		int [] arrenteros;
		arrenteros = new int [MAX];
		int pos;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			cargar_arreglo_aleatorio_int(arrenteros);//Cargar arreglo
			imprimir_arreglo_int(arrenteros);//imprimir arreglo
			System.out.println("Ingrese un numero entero pos: ");
			pos = Integer.valueOf(entrada.readLine()); //obtener posicion por teclado	
			corrimiento_der(arrenteros, pos);//corrimiento derecha
			imprimir_arreglo_int(arrenteros);//imprimir arreglo
		}
		catch(Exception exc){
			System.out.println(exc); 
		}
		
	}
	public static void corrimiento_der(int [] arrenteros ,int pos) { //esto es un procedimiento pq no retorna ningun valor, solo modifica el arreglo
		int indice = MAX-1;//indice = partir de max-1 //partir desde la derecha e ir pidiendole el anterior sin perder el valor 
		while (indice > pos) {//mientras no llegue a pos  
			arrenteros [indice] = arrenteros [indice-1];//copiar lo que esta en indice - 1 a indice
			indice--; //decrementar indice
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

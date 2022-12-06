/*Hacer un programa que dado un arreglo de enteros de tama�o 10 que se encuentra precargado, invierta el orden del contenido 
(por ejemplo: el que est� en 0 se intercambia con el que est� en 9, el que est� en 1 con el que est� en 8�). Este intercambio no se debe realizar 
de manera expl�cita, hay que hacer un m�todo que incluya una iteraci�n de intercambio.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TP7_E1 {
	public static final int MAX = 10;
	public static int MINVALOR = 1;
	public static int MAXVALOR = 10;
	public static void main(String[] args) {
		int [] arrentero;
		arrentero = new int [MAX];
		cargar_arreglo_int (arrentero);
		imprimir_arreglo (arrentero);
		invertir_arreglo (arrentero);
		imprimir_arreglo (arrentero);
	}
	public static void cargar_arreglo_int(int [] arr){
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			for (int pos = 0; pos < MAX; pos++){
				System.out.println("Ingrese un entero: ");
				arr[pos] = Integer.valueOf(entrada.readLine());
			} 
		}
		catch(Exception exc){
		System.out.println(exc); 
		}
	}
	public static void imprimir_arreglo (int [] arr) {
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
		}
	}
	public static void invertir_arreglo (int [] arr) {
		int aux;
		for (int i=0; i<MAX/2;i++) { //La cantidad de iteraciones es la mitad del arreglo
			aux = arr [i]; //Auxiliar almacena el numero de la posicion i
			arr [i] = arr [(MAX-1)-i]; // La posicion i ahora almacena el numero de la posicion 10-1-i
			arr [(MAX-1)-i] = aux; //La posicion 10-1-i almacena al numero de la posicion i
		} 
	}
}
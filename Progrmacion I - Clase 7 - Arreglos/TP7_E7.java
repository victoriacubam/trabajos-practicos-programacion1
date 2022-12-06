import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP7_E7 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static void main(String[] args) {
		int [] arrentero = new int [MAX];
		int numero, pos;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 
		try {
			cargar_arreglo_int(arrentero);
			imprimir_arreglo_int(arrentero);
			System.out.println("Ingrese un numero entero :");
			numero = Integer.valueOf(entrada.readLine());
			pos= buscar_pos(arrentero, numero);
			corrimiento_der(arrentero, pos);
			insertar_numero(arrentero,numero,pos);
			imprimir_arreglo_int(arrentero);
		}
		catch(Exception exc){
			System.out.println(exc);
		}	
	}
	public static void insertar_numero(int [] arr, int numero, int pos) {
		arr[pos]=numero;
	}
	public static int buscar_pos(int [] arr, int numero) {	
		int pos=0;
		while((numero>arr[pos])&&(pos<MAX)) {
			pos++;
		}
		return pos;
	}
	
	public static void corrimiento_der(int [] arr, int pos) {
		int indice = MAX-1;
		while (pos<indice) {
			arr[indice]= arr [indice-1];
			indice--;
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

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP7_E9 {
	public static final int MAX = 10;
	public static void main(String[] args) {
		int [] arrentero;
		arrentero = new int [MAX];
		int posicion1, posicion2;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 
		try{
			cargar_arreglo_int(arrentero);
			imprimir_arreglo_int(arrentero);
			System.out.println("Ingrese un numero entero :");
			posicion1 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese un numero entero :");
			posicion2 = Integer.valueOf(entrada.readLine());
		//	ordenar_arreglo_selecion(arrentero, posicion1, posicion2);
			if (posicion1<posicion2) {
				ordenar_arreglo_burbujeo(arrentero, posicion1, posicion2);
				imprimir_arreglo_int(arrentero);
			}
			else {
				ordenar_arreglo_burbujeo(arrentero, posicion2, posicion1);
				imprimir_arreglo_int(arrentero);
			}
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	
	public static void ordenar_arreglo_burbujeo(int[] arr, int posicion1, int posicion2) {
		int tmp;
		int max= posicion2 - posicion1 + 1;
		for (int i= 1; i <max; i++) {
			for (int j=posicion1; j<posicion2; j++) {
				if(arr[posicion1]> arr[posicion1+1]) {
					tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
	}

	/*public static void ordenar_arreglo_selecion(int [] arr, int pos1, int pos2) {
		int posMenor, tmp;
		for (int i= pos1; i<=pos2; i++) {
			posMenor=i;
			for (int j=i+1; j<=pos2; j++) {
				if (arr[j]<arr[posMenor]) {
					posMenor=j;
				}
			}
			if (posMenor!=i) {
				tmp = arr[i];
				arr[i]=arr[posMenor];
				arr[posMenor]=tmp;
			}
		}
	}*/
	
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


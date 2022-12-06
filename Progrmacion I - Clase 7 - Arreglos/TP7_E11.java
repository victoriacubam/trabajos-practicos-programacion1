/* Hacer un programa que dado el arreglo definido y precargado permita encontrar la
posición de inicio de la secuencia cuya suma de valores sea mayor. */
public class TP7_E11 {
	public static final int MAX = 10;
	public static void main(String[] args) {
		int [] arrEntero = { 0,2,3,0,5,9,0,1,1,0 };
		int inicio;
		imprimir_arreglo(arrEntero);
		inicio=obtener_inicio_secuencia_mayor(arrEntero);
		System.out.println("El inicio de la secuencia mayor se encuentra en la posicion: "+inicio);		
	}
	
	public static void imprimir_arreglo(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
		System.out.print("\n");
	}
	
	public static int obtener_inicio_secuencia_mayor(int [] arr) {
		int secuenciaMayor=0;
		int inicio=0;
		int fin, sumatoria=0;
		for (int i=0; i<MAX; i++) {
			inicio=obtener_inicio(arr);
			fin=obtener_fin(arr, inicio);
			sumatoria=sumar_valores_secuencia(arr, inicio, fin);
			if (sumatoria>secuenciaMayor) {
				secuenciaMayor=inicio;
			}
		}
		System.out.print(sumatoria + " ");
		return inicio;
	}
	
	private static int sumar_valores_secuencia(int[] arr, int inicio, int fin) {
		int suma = 0;
		for (int i=inicio-1; i<fin; i++) {
			suma+=arr[i+1];
		}
	
		return suma;
	}

	public static int obtener_inicio (int [] arr) {
		int inicio=0;
		while ((arr[inicio]==0)&&(inicio<MAX)) {
			inicio++;
		}
		return inicio;
	}
	public static int obtener_fin (int [] arr, int inicio){
		int fin=inicio;
		while (arr[fin]!=0) {
			fin++;
		}
		return fin--;
	}
}


public class parcial {
	public static final int MAX=15;
	public static void main (String[]args) {
		int [] arrA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int [] arrB = {0,1,2,0,11,13,0,8,7,0,2,4,0,9,3};
		int inicio=5;
		int fin=6;
		
		imprimir_arreglo(arrA);
		imprimir_arreglo(arrB);
		eliminar_numero_primos(arrA, arrB, inicio, fin);
		imprimir_arreglo(arrA);
	}
	public static void eliminar_numero_primos(int[] arrA, int[] arrB, int inicio, int fin) {
		for (int i=0;i<MAX-1; i++) {
			for (int j=inicio; j<=fin;j++) {
				if (arrA[i]==arrB[inicio]) {
					corrimiento_izquierda(arrA, i);
				}
			}
		}
	}
	public static void corrimiento_izquierda(int[] arrA, int indice) {
		while (indice<MAX-1) {
			arrA[indice]=arrA[indice+1];
			indice++;
		}
	}
	public static void imprimir_arreglo(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
		System.out.print("\n");
	}
}

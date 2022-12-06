
public class TP7_E12 {
	public static final int MAX = 20;
	public static void main(String[] args) {
		int [] arrEntero = { 0,2,3,0,5,9,0,1,1,0,2,8,9,7,0,1,4,4,10,0 };
		int inicio, anteultimoFin,anteultimoInicio;
		imprimir_arreglo(arrEntero);
		inicio= buscar_inicio(arrEntero);
		anteultimoFin= buscar_anteultimo_fin(arrEntero, inicio);
		anteultimoInicio=buscar_anteultimo_inicio(arrEntero, anteultimoFin);
		System.out.print("La posiciond de incio de la anteultima secuencia es "+anteultimoInicio);
		
	}
	public static int buscar_inicio(int[] arr) {
		int inicio=0;
		int fin;
		fin = buscar_fin(arr);
		inicio=fin;
		while (arr[inicio]!=0) {
			inicio--;
		}
		return inicio+1;
	}
	public static int buscar_fin(int[] arr) {
		int fin = MAX-1;
		while (arr[fin]==0){
			fin--;
		}
		return fin;
	}
	public static int buscar_anteultimo_fin(int[] arr, int inicio) {
		int fin;
		fin = inicio;
		while (arr[fin-1]==0){
			fin--;
		}
		return fin-1;
	}
	
	public static int buscar_anteultimo_inicio(int[] arr, int fin) {
		int inicio = fin;
		while (arr[inicio]!=0){
			inicio--;
		}
		return inicio+1;
	}
	
	
	public static void imprimir_arreglo(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
		System.out.print("\n");
	}
}

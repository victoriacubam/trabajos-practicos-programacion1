import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP7_E10 {
	public static final int MAX = 20;
	public static final int MAXVALOR = 9;
	public static final int MINVALOR = 1;
	public static final double probabilidad_numero = 0.4;
	public static void main(String[] args) {
		int [] arrEntero = new int [MAX];
		int posicion, inicio, fin;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 
		try{
			cargar_arreglo_aleatorio_secuencias_int(arrEntero);
			imprimir_arreglo_secuencias_int(arrEntero);
			System.out.println("Ingresar posicion entera: ");
			posicion=Integer.valueOf(entrada.readLine());
			if ((posicion<MAX)&&(posicion>0)) {
				inicio= obtener_inicio_secuencia(arrEntero, posicion);
				fin= obtener_fin_secuencia(arrEntero, inicio);
				System.out.println("La secuencia inicia en "+inicio+" y termina en "+fin);
			}
			else {
				System.out.println("La secuencia no esta definida en la posicion ingresada");
			}
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	public static void cargar_arreglo_aleatorio_secuencias_int(int [] arr){
		Random r = new Random();
		arr[0] = 0;
		arr[MAX-1] = 0;
		for (int pos = 1; pos < MAX-1; pos++){
			if (r.nextDouble()>probabilidad_numero){
				arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR); 
			}
			else{
				arr[pos]=0;
			}
		}
	}
	public static void imprimir_arreglo_secuencias_int(int [] arr){
		System.out.print("Arreglo de secuencias int\n|");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(arr[pos]+"|");
		}
		System.out.print("\n");
	}
	
	public static int obtener_inicio_secuencia(int [] arr, int pos) {
		int inicio=pos;
		while (arr[inicio]!=0) {
			inicio--;
		}
		while (arr[inicio]==0) {
			inicio++;
		}
		return inicio;
	}
	public static int obtener_fin_secuencia(int [] arr, int inicio) {
		int fin=inicio;
		while (arr[fin]!=0) {
			fin++;
		}
		return fin-1;
	}
}

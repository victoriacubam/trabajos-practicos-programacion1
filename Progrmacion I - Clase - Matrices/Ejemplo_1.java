/*
     0 1 2
0   |1|3|5|
1   |2|4|4|

     0 1 2
fila|1|3|5|

*/
import java.util.Random;
public class Ejemplo_1 {
	public static final int MAX = 10;
	public static final int MAXVALOR = 10;
	public static final int MINVALOR = 1;
	public static final int MAXFILA=2;
	public static final int MAXCOLUMNA=3;
	public static void main (String[] args) {
		int [][] matInt;
		matInt = new int [MAXFILA][MAXCOLUMNA];
		cargar_matriz_int(matInt);
		imprimir_matriz_int(matInt);
	}
	public static void cargar_matriz_int(int [][] matInt) {
		for (int fila=0; fila<MAXFILA; fila++) {
			cargar_arreglo_aleatorio_int(matInt[fila]);
		}
	}
	
	public static void cargar_arreglo_aleatorio_int(int [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR); 
		}
	}
	
	public static void imprimir_matriz_int(int [][] matInt){
		for (int pos = 0; pos < MAX; pos++){
			System.out.println("Matriz["+pos+"]=>: "+matInt[pos]);
		}
	}
}

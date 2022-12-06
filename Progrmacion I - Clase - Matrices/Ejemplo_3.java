/*
Hacer un programa que dado una matriz de enteros de tamano 4*5 que se encuentra precargada, 
imprima por pantalla el promedio de cada una de sus filas.
*/

public class Ejemplo_3 {
	public static final int MAXFILA=4;
	public static final int MAXCOLUMNA=5;
	
	public static void main(String[] args) {
		int [][] matInt;
		matInt = new int [MAXFILA][MAXCOLUMNA];
		imprimir_promedios_filas(matInt);
	}
	
	public static void imprimir_promedios_filas(int [][] mat) {
		int promedio;
		for (int fila=0; fila<MAXFILA; fila++) {
			promedio = obtener_promedio_arreglo(mat [fila]);
			System.out.println("El primedio de la fila " + fila + " es " + promedio);
					
		}
	}
	public static int obtener_promedio_arreglo(int [] arr) { /*REUTILIZO EL METODO*/
		int suma, promedio;
		suma = 0;
		for (int pos=0; pos<MAXCOLUMNA; pos++) {
			suma+=arr[pos];
		}
		promedio = suma/MAXCOLUMNA;
		return promedio;
	}
}

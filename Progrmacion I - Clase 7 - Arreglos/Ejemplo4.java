/*Hacer un programa que dado un arreglo de enteros de tamano 10 que se encuentra precargado, encuentre la posicion de un numero entero 
ingresado por el usuario. Si existe, muestre esa posicion por pantalla, o indique que no existe.
*/
/*public class Ejemplo4 {
	public static void main (String [] args) {
		cargar un arreglo arrenteros (arrenteros)
		imprimir arrenteros (arrenteros)
		cargar un numero por teclado
		pos = obtener posicion de (arrenteros, numero) //Arrentero es una variable de tipo arreglo y numero es tipo primitivo
		si existe pos
			imprimo pos
		sino
			imprimo no existe
	}
	obtener posicion de (arrenteros, numero)
		posicion = 0
		mientras (posicion < maximo) Y (arrentero[posicion] <> numero)
			avanzar la posicion
		retornar posicion
				
}*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class Ejemplo4 {
	public static int MINVALOR = 1;
	public static int MAXVALOR = 10;
	public static int MAX = 10;
	public static void main (String [] args) {
		int [] arrenteros = new int [MAX];
		int pos, numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			cargar_arreglo_aleatorio_int (arrenteros);        //Cargo el arreglo
			imprimir_arreglo_int(arrenteros);                 //Lo imrpimo
			System.out.println("Ingrese un numero entero: "); //Pido ingresar el numero
			numero = Integer.valueOf(entrada.readLine()); 
			pos = obtener_pos_arreglo(arrenteros,numero);     //Obtengo la posicion
			if (pos < MAX) {								  // Si la posicion es menor que el maximo existe en tal posicion sino no existe
				System.out.println(numero + " Esta en " + pos);
			}
			else {
				System.out.println("No existe " + numero);
			}
		}
		catch(Exception exc){
		System.out.println(exc); 
		}
	}
	public static int obtener_pos_arreglo(int [] arr, int numero){ //Metodo que es funcion
		int posicion = 0;
		while ((posicion< MAX)&&(arr[posicion] != numero)) {
			posicion++;
		}
		return posicion;
		
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


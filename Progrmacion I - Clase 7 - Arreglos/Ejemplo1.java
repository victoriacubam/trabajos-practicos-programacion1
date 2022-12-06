import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejemplo1 {
	public static int MAX = 5;
	public static void main (String [] args) {
		int [] arrenteros = new int [MAX];
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			for (int pos = 0; pos < MAX; pos++){
				System.out.println("Ingrese un entero: ");
				/*arrenteros es un arreglo, arrenteros[pos] es como una
				variable de tipo entero a la que se le asigna un valor
				*/
				arrenteros[pos] = Integer.valueOf(entrada.readLine());
			} 
			for (int pos = 0; pos < MAX; pos++){
			System.out.println("arrenteros["+pos+"] -> "+arrenteros[pos]);
			} 
		}
		catch(Exception exc){
		System.out.println(exc); 
		}
	}
}
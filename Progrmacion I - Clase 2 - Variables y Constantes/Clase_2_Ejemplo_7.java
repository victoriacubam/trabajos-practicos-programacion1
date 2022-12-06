/* importación de dos librerías de operaciones de * entrada/salida y carga de una variable de tipo entero desde consola
*/ 
import java.io.BufferedReader; 
import java.io.InputStreamReader;
 
public class Clase_2_Ejemplo_7{ 
	public static void main(String[] args){ 
		//declaro la variable donde quiero cargar el valor ingresado 
		int entero;
		try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un entero: ");
            entero = Integer.valueOf(entrada.readLine());
            //imprimo por consola un mensaje con el valor de la variable entero
            System.out.println("El valor ingresado es " + entero);
		} 
		catch (Exception exc) { 
            //imprimo por consola un mensaje con el valor de la variable exc (tipo de error)
            System.out.println(exc);
		}
	} 
}
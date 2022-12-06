/* Carga de variables de tipos primitivos desde consola 
*/ 
import java.io.BufferedReader; 
import java.io.InputStreamReader;
public class Clase_2_Ejemplo_8{ 
	public static void main(String[] args){ 
		float flotante;
        double doble;
        int entero;
        char caracter;
        try {
            //Puedo utilizar el mismo buffer entrada mas de una vez o por cada carga desde consola 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 
            System.out.println ("Ingrese un float: "); 
            flotante = Float.valueOf(entrada.readLine());//la sentencia Float.valueOf() convierte a float 
            System.out.println ("Ingrese un double: "); 
            doble = Double.valueOf(entrada.readLine());//la sentencia Double.valueOf() convierte a double 
            System.out.println ("Ingrese un entero: "); 
            entero = Integer.valueOf(entrada.readLine());//la sentencia Integer.valueOf() convierte a int
        	System.out.println ("Ingrese char: "); //Para convertir/acceder al carácter la sentencia es diferente 
          	caracter = entrada.readLine().charAt(0); 
			System.out.println ("El float es: " + flotante); 
			System.out.println ("El double es: " + doble);
          	System.out.println ("El entero es: " + entero);
          	System.out.println ("El char es: " + caracter); 
		} 
		catch (Exception exc) { 
			System.out.println(exc); 
		} 
    }
} 
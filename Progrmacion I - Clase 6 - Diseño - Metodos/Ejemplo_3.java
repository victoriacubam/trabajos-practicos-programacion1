/*Escribir un programa que llame un método que calcule el promedio de la suma de valores enteres entre 1 y 1000. 
Finalmente, el resultado debe mostrarse por pantalla. 
*/

public class Ejemplo_3 {

	public static void main (String[] args) {
		int promedio; //no es la misma variable que abajo
		promedio = calcular_promedio_1_y_1000 (); //aca guardamos el resultado de la funcion 
		//todas las funciones tienen que estar a la derecha de una asignacion o de una evaluacion (podria estar dentro de una expresion logica)
		System.out.println("El promedio es: " + promedio);
	}
	
	public static int calcular_promedio_1_y_1000 () { //Int:Tipo de dato
		final int MAX = 1000;
		final int MIN = 1;
		int promedio;
		int suma = 0;
		
		for (int numero = MIN; numero <= MAX; numero++) { //La primera vez numero vale 1, verifica y cuando termina de evaluar, suma se actualiza, vuelve a evaluar, numero vale 2 y verifica
			suma+=numero;
		}
		promedio = suma / (MAX - MIN + 1); //La suma dividido la cantidad de veces que hice esa suma.
		return promedio;
	}
}

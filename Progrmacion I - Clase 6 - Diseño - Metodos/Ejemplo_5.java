/* Similar a Clase_6_Ejemplo_3. Escribir un programa que llame un método que calcule el promedio de la suma 
de valores enteres entre 1 y 1000. Finalmente, el promedio debe mostrarse por pantalla. 
*/
public class Ejemplo_5 {
	public static final int MAX = 1000;
	public static final int MIN = 1;
	
	public static void main(String[] args) {
		int promedio;
		promedio = calcular_promedio_MIN_y_MAX (); //Las funciones siempre tienen que estar a la derecha de una asignacion o en una evaluacion o en una expresion logica 
		System.out.println("El promedio de la suma es = " + promedio);
	}
	
	public static int calcular_promedio_MIN_y_MAX () { //calcular promedio entre 1 y 1000
		int promedio; //Definimos una variable promedio para calcular el promedio
		int suma = 0; //En esta variable acumulamos los numero que van entre 1 y 1000. Primero numeoro vale 1, se lo sumo a suma, despues vale 2 y se lo sumo a suma y asi hasta que numero ya no cumpla con la condicion .
			for (int numero = MIN; numero <= MAX; numero++) { // suma+=numero es lo mismo que suma= suma + numero
				suma+= numero;
			}
			promedio = suma / (MAX-MIN+1); //Si fuera entre 3 y 1000, se sumo MAX veces - 2.
			return promedio;
	}

}

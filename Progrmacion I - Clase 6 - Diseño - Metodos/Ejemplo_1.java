public class Ejemplo_1 {
	public static void main (String [] args) {
		imprimir_1_a_4 ();
		System.out.println ("Termino");	
	}
	
	public static void imprimir_1_a_4 () {
		final int MAX = 4;
		for (int numero=1; numero <= MAX; numero++) {
			System.out.println("El numero es: " + numero);
		}
	}
}
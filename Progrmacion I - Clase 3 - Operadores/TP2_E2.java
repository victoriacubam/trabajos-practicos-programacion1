
public class TP2_E2 {

	public static void main(String[] args) {
		//Tabla de verdad del OR
		System.out.println("False or false es: " + (false || false));
		System.out.println("False or true es: " + (false || true));
		System.out.println("True or false es: " + (true || false));
		System.out.println("True or true es: " + (true || true));
		//Tabla de verdad del AND
		System.out.println("False and false es: " + (false && false));
		System.out.println("True and false es: " + (true && false));
		System.out.println("False and true es: " + (false && true));
		System.out.println("True and true es: " + (true && true));
	}

}

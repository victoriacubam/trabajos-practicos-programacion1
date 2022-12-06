import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP5_E4 {
	public static void main(String[]args) {
		char caracter;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try {
			System.out.println ("Ingresar un caracter digito o caracter letra minuscula: ");
			caracter = entrada.readLine().charAt(0);
			while ((('0'<=caracter)&&(caracter<='9'))||(('a'<=caracter)&&(caracter<='z'))) {
				if(('a'<=caracter)&&(caracter<='z')) {
					System.out.println("El caracter ingresado es una letra minuscula");	
					if ((caracter=='a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u')) {
						System.out.println("Es una vocal");	
					}
					else {
						System.out.println("Es una consonante");	
					}
				}
				else /*if (('0'<=caracter)&&(caracter<='9')) */ {
					System.out.println("El caracter ingresado es un digito");					
				}
				
				System.out.println ("Ingresar un caracter digito o caracter letra minuscula: ");
				caracter = entrada.readLine().charAt(0);
			}
		}
		catch (Exception exc) {
			System.out.println (exc);
		}
	}

}

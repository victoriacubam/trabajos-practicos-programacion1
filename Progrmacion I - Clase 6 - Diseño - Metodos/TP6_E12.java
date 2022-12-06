import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP6_E12 {

	public static void main(String[] args) {
		int dia,mes,anio;
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
		try {
			System.out.println("Ingrese un dia: ");
			dia= Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese un numero de mes: ");
			mes= Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese un año: ");
			anio= Integer.valueOf(entrada.readLine());
			
			cantidad_dias_desde_luna_nueva (dia,mes,anio);
		}
		catch (Exception exc) {
		      System.out.println(exc);
		}
	}
	public static void cantidad_dias_desde_luna_nueva (int dia, int mes, int anio) {
			int aureo = ((anio+1)%19);
			int epacta = (((aureo-1)*11)%30);
			int mesesDesdeMarzo = ((mes-3+1)%12);
			int pasaron=dia+epacta+mesesDesdeMarzo;
			int fase = (pasaron/7);
			
			System.out.println("Pasaron " + pasaron + " dias desde la ultima luna nueva");
								
			switch (fase) {
				case 0: {
					System.out.println("Fase lunar: Luna nueva");
					break;
				}
				case 1: {
					System.out.println("Fase lunar: cuarto creciente");
					break;
				}
				case 2 : {
					System.out.println("Fase lunar: Luna llena");
					break;
				}
				case 3 : {
					System.out.println("Fase lunar: cuarto menguante");
					break;
				}
			}
	}
			
		

}

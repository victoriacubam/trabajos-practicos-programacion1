import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP4_E7 {
	public static void main(String[] args) {
		int dia,mes,anio,aureo,epacta,mesesDesdeMarzo, pasaron, fase;
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Ingrese un dia: ");
			dia= Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese un numero de mes: ");
			mes= Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese un año: ");
			anio= Integer.valueOf(entrada.readLine());
		
			aureo = ((anio+1)%19);
			epacta = (((aureo-1)*11)%30);
			mesesDesdeMarzo = ((mes-3+1)%12);
			pasaron=dia+epacta+mesesDesdeMarzo;
			fase = (pasaron/7);
			
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
		catch (Exception exc) {
		      System.out.println(exc);
		}
	}
}
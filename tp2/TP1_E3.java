import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP1_E3 {
  public static void main (String [] args) {
    //Declaro las variables
    double radio;
    final double p = 3.14;
    try {
      BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
      System.out.println ("Ingrese radio: ");
      radio = Double.valueOf(entrada.readLine());
      System.out.println ("La circunferencia del circulo esta dada por la multiplicacion de: " + "2x" + p + "x" + radio + " =");
    }
    catch (Exception exc) { 
      System.out.println(exc);
    }
  }
}

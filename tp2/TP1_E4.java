import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP1_E4 {
  public static void main(String[] args) {
    String nombre, apellido, ocupacion, direccion;
    int edad;
    double altura;
    try {
      BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
      System.out.println("Ingrese su nombre: ");
      nombre = entrada.readLine();
      System.out.println("Ingrese su apellido: ");
      apellido = entrada.readLine();
      System.out.println("Ingrese su edad: ");
      edad = Integer.valueOf (entrada.readLine());
      System.out.println("Ingrese su altura: ");
      altura = Double.valueOf (entrada.readLine());
      System.out.println("Ingrese su ocupacion: ");
      ocupacion = entrada.readLine();
      System.out.println("Ingrese su direccion: ");
      direccion = entrada.readLine();
      System.out.println("Nombre: " + nombre);
      System.out.println("Apellido: " + apellido);
      System.out.println("Edad: " + edad);
      System.out.println("Altura: " + altura);
      System.out.println("Ocupacion: " + ocupacion);
      }        
    
	catch (Exception exc) {
      System.out.println(exc);
    }
  }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TP1_E5 {

	public static void main(String[] args) {
	char tipoFactura;
	int numero;
	String nombreCliente, producto1, producto2;
	double importe1, importe2, importeTotal;
	try {
		BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
	      System.out.println("Ingrese el tipo de factura correspondiente: ");
	      tipoFactura = entrada.readLine().charAt(0);
	      System.out.println("Ingrese numero de factura: ");
	      numero = Integer.valueOf (entrada.readLine());
	      System.out.println("Ingrese nombre del cliente: ");
	      nombreCliente = entrada.readLine();
	      System.out.println("Ingrese el primer producto: ");
	      producto1 = entrada.readLine();
	      System.out.println("Ingrese el importe del primero producto: ");
	      importe1 = Double.valueOf(entrada.readLine());
	      System.out.println("Ingrese el segundo producto: ");
	      producto2 = entrada.readLine();
	      System.out.println("Ingrese el importe del segundo producto: ");
	      importe2 = Double.valueOf(entrada.readLine());
	      System.out.println("Ingrese importe total: ");
	      importeTotal = Double.valueOf(entrada.readLine());
	      System.out.println("Factura" + "\t\t\t" + tipoFactura + "\t\t" + numero);
	      System.out.println("Nombre y apellido" + "\t" + nombreCliente);
	      System.out.println("Producto"+"\t\t\t\t"+"Importe");
	      System.out.println(producto1 + "\t\t\t\t\t" + importe1);
	      System.out.println(producto2 + "\t\t\t\t" + importe2);
	      System.out.println("Importe total" + "\t\t\t\t" + importeTotal);
		}

	catch (Exception exc) {
	      System.out.println(exc);
	    }
	}
}

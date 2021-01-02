/**
 * 
 */
package ejerciciosTema3;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema3Ejercicio7 {

	/**
	 * Escribe un programa que calcule el total de una factura a partir de la base
	 * imponible.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca el precio bruto del producto: ");
		double baseImponible = s.nextDouble();
		
		System.out.println("__________________________");
		System.out.printf("|Base imponible %8.2f€|\n", baseImponible);
		System.out.printf("|IVA %19.2f€|\n", baseImponible * 0.21);
		System.out.printf("|Total %17.2f€|\n", baseImponible * 1.21);
		System.out.println("__________________________");

	}

}

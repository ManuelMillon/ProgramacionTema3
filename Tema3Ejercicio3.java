/**
 * 
 */
package ejerciciosTema3;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema3Ejercicio3 {

	/**
	 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
	 * convertir debe ser introducida por teclado.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca el número de pesetas a convertir: ");
		int pesetas = Integer.parseInt(s.nextLine());
		
		double euros = (double) (pesetas / 166.386);
		
		System.out.printf(pesetas + " pesetas serían  %.2f euros.\n", euros);

	}

}

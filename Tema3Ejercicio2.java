/**
 * 
 */
package ejerciciosTema3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Tema3Ejercicio2 {

	/**
	 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
	 * convertir debe ser introducida por teclado.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca el número de euros a convertir: ");
		double euros = Integer.parseInt(s.nextLine());
		
		int pesetas = (int) (euros * 166.386);
		
		System.out.println(euros + " euros son " + pesetas + " pesetas.");

	}

}

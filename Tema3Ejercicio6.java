/**
 * 
 */
package ejerciciosTema3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Tema3Ejercicio6 {

	/**
	 * Escribe un programa que calcule el �rea de un tri�ngulo.

	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca la longitud de la base del tri�ngulo: ");
		double base = Integer.parseInt(s.nextLine());
		System.out.print("Introduzca la longitud de la altura del tri�ngulo: ");
		double altura = Integer.parseInt(s.nextLine());
		
		double superficie = base * altura / 2;
		System.out.println("La superficie del tri�ngulo es de " + superficie);
	}

}

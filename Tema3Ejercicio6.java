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
	 * Escribe un programa que calcule el área de un triángulo.

	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca la longitud de la base del triángulo: ");
		double base = Integer.parseInt(s.nextLine());
		System.out.print("Introduzca la longitud de la altura del triángulo: ");
		double altura = Integer.parseInt(s.nextLine());
		
		double superficie = base * altura / 2;
		System.out.println("La superficie del triángulo es de " + superficie);
	}

}

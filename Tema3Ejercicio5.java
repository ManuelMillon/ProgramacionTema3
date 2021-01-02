/**
 * 
 */
package ejerciciosTema3;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema3Ejercicio5 {

	/**
	 * Escribe un programa que calcule el área de un rectángulo.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca la longitud de la base: ");
		double base = Integer.parseInt(s.nextLine());
		System.out.print("Introduzca la longitud de la altura: ");
		double altura = Integer.parseInt(s.nextLine());
		
		double superficie = base * altura;
		System.out.println("La superficie del rectángulo es de " + superficie);
		

	}

}

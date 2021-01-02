/**
 * 
 */
package ejerciciosTema3;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema3Ejercicio1 {

	/**
	 * Realiza un programa que pida dos números y que luego muestre el resultado
	 * de su multiplicación.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca el primer número: ");
		double x = s.nextDouble();
		System.out.println("Introduzca el segundo número: ");
		double y = s.nextDouble();
		System.out.println("El resultado de la multiplicación es " + (x * y));
		
		System.out.println("Introduzca el tercer número: ");
		int a = s.nextInt();
		System.out.println("Introduzca el cuarto número: ");
		int b = s.nextInt();
		System.out.println("El resultado de la multiplicación es " + (a * b));
		
		
		
	}

}

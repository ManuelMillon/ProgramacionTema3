/**
 * 
 */
package ejerciciosTema3;
import java.util.Scanner;
/**
 * @author Manuel Mill�n
 *
 */
public class Tema3Ejercicio1 {

	/**
	 * Realiza un programa que pida dos n�meros y que luego muestre el resultado
	 * de su multiplicaci�n.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca el primer n�mero: ");
		double x = s.nextDouble();
		System.out.println("Introduzca el segundo n�mero: ");
		double y = s.nextDouble();
		System.out.println("El resultado de la multiplicaci�n es " + (x * y));
		
		System.out.println("Introduzca el tercer n�mero: ");
		int a = s.nextInt();
		System.out.println("Introduzca el cuarto n�mero: ");
		int b = s.nextInt();
		System.out.println("El resultado de la multiplicaci�n es " + (a * b));
		
		
		
	}

}

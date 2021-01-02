/**
 * 
 */
package ejerciciosTema3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Tema3Ejercicio4 {

	/**
	 * Escribe un programa que sume, reste, multiplique y divida dos números 
	 * introducidos por teclado.

	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca el valor del primer número: ");
		double y = Integer.parseInt(s.nextLine());
		System.out.print("Introduzca el valor del segundo número: ");
		double x = Integer.parseInt(s.nextLine());
		double suma = x + y;
		double resta = x - y;
		double multiplicacion = x * y;
		double division = x / y;
		
		System.out.println("La suma de " + x + " y " + y + " es " + suma + ".");
		System.out.println("La resta de " + x + " y " + y + " es " + resta + ".");
		System.out.println("La multiplicación de " + x + " y " + y + " es " + multiplicacion + ".");
		System.out.println("La división de " + x + " y " + y + " es " + division + ".");
	}

}

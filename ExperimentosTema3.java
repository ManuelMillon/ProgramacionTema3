/**
 * 
 */
package ejerciciosTema3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ExperimentosTema3 {

	/**
	 * Experimentos
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		String apellido;
		System.out.print("Por favor, tu apellido: ");
		apellido = keyboard.nextLine();
		System.out.println("Hola, señor/a " + apellido + ". Encantado de saludarle.");
		System.out.print("¿Y cuántos años tiene? ");
		int edad = Integer.parseInt(keyboard.nextLine());
		System.out.println("Bien, señor " + apellido + ". Tendrá " + edad + " años, pero aparenta unos cuantos menos.");
				System.out.println("Introduzca un número con decimales: ");
		double numeroConDecimales; 
		numeroConDecimales = keyboard.nextDouble();
		System.out.println(numeroConDecimales);
		System.out.print("Por favor, tu nombre: ");
		String nombre;
		nombre = keyboard.next();
		
	}

}

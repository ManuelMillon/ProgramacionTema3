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
		System.out.println("Hola, se�or/a " + apellido + ". Encantado de saludarle.");
		System.out.print("�Y cu�ntos a�os tiene? ");
		int edad = Integer.parseInt(keyboard.nextLine());
		System.out.println("Bien, se�or " + apellido + ". Tendr� " + edad + " a�os, pero aparenta unos cuantos menos.");
				System.out.println("Introduzca un n�mero con decimales: ");
		double numeroConDecimales; 
		numeroConDecimales = keyboard.nextDouble();
		System.out.println(numeroConDecimales);
		System.out.print("Por favor, tu nombre: ");
		String nombre;
		nombre = keyboard.next();
		
	}

}

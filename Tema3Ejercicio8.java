/**
 * 
 */
package ejerciciosTema3;
import java.util.Scanner;
/**
 * @author Manuel Mill�n
 *
 */
public class Tema3Ejercicio8 {

	/**
	 * Escribe un programa que calcule el salario semanal de un empleado en base a
	 * las horas trabajadas, a raz�n de 12 euros la hora.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca el n�mero de horas trabajadas semanalmente: ");
		double salario = Integer.parseInt(s.nextLine());
		double salarioSemanal = salario * 12;
		System.out.printf("Su salario semanal es de %.2f�.\n", salarioSemanal);

	}

}

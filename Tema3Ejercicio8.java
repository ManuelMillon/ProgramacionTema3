/**
 * 
 */
package ejerciciosTema3;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema3Ejercicio8 {

	/**
	 * Escribe un programa que calcule el salario semanal de un empleado en base a
	 * las horas trabajadas, a razón de 12 euros la hora.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca el número de horas trabajadas semanalmente: ");
		double salario = Integer.parseInt(s.nextLine());
		double salarioSemanal = salario * 12;
		System.out.printf("Su salario semanal es de %.2f€.\n", salarioSemanal);

	}

}

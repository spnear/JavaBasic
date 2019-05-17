import java.util.Scanner;

public class Suma{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nombre = "";
		int numero1,numero2,resultado = 0;
		
		System.out.println("Ingresar nombre:");
		nombre = in.nextLine();

		System.out.println("Ingresar primer numero:");
		numero1 = in.nextInt();

		System.out.println("Ingresar segundo numero:");
		numero2 = in.nextInt();

		resultado = numero1 + numero2;
		System.out.println("Usuario " + nombre + " el resultado de la suma es: " + resultado);

	}
}
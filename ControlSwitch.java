import java.util.Scanner;

public class ControlSwitch{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int opcion = 0;
		double numero1,numero2,resultado = 0;

		System.out.println("\n\n*********************************************************");
		System.out.println("PROGRAMA PARA REALIZAR OPERACIONES ENTRE DOS NÚMEROS.");
		System.out.println("*********************************************************\n\n");

		System.out.println("Ingrese el primero número");
		numero1 = in.nextDouble();
		System.out.println("Ingrese el segundo número");
		numero2 = in.nextDouble();

		System.out.println("Ingrese una opción para decidir que operación hacer entre los dos números");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Módulo");
		System.out.println("6. Salir del programa");
		System.out.println("\n\nSu respuesta: ");
		opcion = in.nextInt();

		/*Switch solo recibe Char o Int*/

		switch(opcion){
			case 1: System.out.println("\nIngresó la opción uno, realizando la suma de los dos números...");
					resultado = numero1 + numero2;
					System.out.println("El resultado obtenido es: " + resultado);
					break;
			case 2: System.out.println("\nIngresó la opción dos, realizando la resta de los dos números...");
					resultado = numero1 - numero2;
					System.out.println("El resultado obtenido es: " + resultado);
					break;
			case 3: System.out.println("\nIngresó la opción tres, realizando la multiplicación de los dos números...");
					resultado = numero1 * numero2;
					System.out.println("El resultado obtenido es: " + resultado);
					break;
			case 4: System.out.println("\nIngresó la opción cuatro, realizando la división de los dos números...");
					resultado = numero1 / numero2;
					System.out.println("El resultado obtenido es: " + resultado);
					break;
			case 5: System.out.println("\nIngresó la opción cinco, realizando el cálculo del módulo de los dos número...");
					resultado = numero1 % numero2;
					System.out.println("El resultado obtenido es: " + resultado);
					break;
			case 6: System.out.println("\nSaliendo del programa ...");
					break;
			default: System.out.println("Ingresó una opcion no válida");
		}
	}
}
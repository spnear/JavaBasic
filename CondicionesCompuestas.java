import java.util.Scanner;

public class CondicionesCompuestas{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nombre = "";
		int clave,antiguedad = 0;

		System.out.println("*******************************************************");
		System.out.println("*Bienvenido al sistema vacacional de Coca-Cola Company*");
		System.out.println("*******************************************************");
		System.out.println("");
		System.out.println("");

		System.out.println("Ingrese el nombre del trabajador: ");
		nombre = in.nextLine();

		System.out.println("Ingrese la clave: ");
		clave = in.nextInt();

		System.out.println("Ingrese cuantos años tiene de antiguedad: ");
		antiguedad = in.nextInt();

		if(clave == 1){

			if (antiguedad == 1) {
				System.out.println("El trabajador " + nombre + " tiene derecho a 6 días de vacaciones");
			} else if(antiguedad >= 2 && antiguedad <= 6){
				System.out.println("El trabajador " + nombre + " tiene derecho a 14 días de vacaciones");
			} else if (antiguedad >= 7) {
				System.out.println("El trabajador " + nombre + " tiene derecho a 20 días de vacaciones");
			} else if (antiguedad >= 0 && antiguedad <1) {
				System.out.println("El trabajador " + nombre + " no tiene derecho a vacaciones");
			} else{
				System.out.println("Número de años ingresado no es válido");
			} 

		} else if (clave == 2) {
			if (antiguedad == 1) {
				System.out.println("El trabajador " + nombre + " tiene derecho a 7 días de vacaciones");
			} else if(antiguedad >= 2 && antiguedad <= 6){
				System.out.println("El trabajador " + nombre + " tiene derecho a 15 días de vacaciones");
			} else if (antiguedad >= 7) {
				System.out.println("El trabajador " + nombre + " tiene derecho a 22 días de vacaciones");
			} else if (antiguedad >= 0 && antiguedad <1) {
				System.out.println("El trabajador " + nombre + " no tiene derecho a vacaciones");
			} else{
				System.out.println("Número de años ingresado no es válido");
			} 
			
		} else if (clave == 3) {

			if (antiguedad == 1) {
				System.out.println("El trabajador " + nombre + " tiene derecho a 10 días de vacaciones");
			} else if(antiguedad >= 2 && antiguedad <= 6){
				System.out.println("El trabajador " + nombre + " tiene derecho a 20 días de vacaciones");
			} else if (antiguedad >= 7) {
				System.out.println("El trabajador " + nombre + " tiene derecho a 30 días de vacaciones");
			} else if (antiguedad >= 0 && antiguedad <1) {
				System.out.println("El trabajador " + nombre + " no tiene derecho a vacaciones");
			} else{
				System.out.println("Número de años ingresado no es válido");
			} 
			
		} else {
			System.out.println("Error! Clave incorrecta.");
		}

	}
}
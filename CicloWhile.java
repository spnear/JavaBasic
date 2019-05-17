/*
CICLO WHILE...

Mientras sea verdadera la condición, va a hacer una serie de instrucciones.

	while(condición){
		INSTRUCCIONES...
	}

Condición implica el uso de operadores lógicos y una variable previamente declarada
*/

public class CicloWhile{
	public static void main(String[] args) {
		int i = 1;
		while(i<=10){
			System.out.println(i + ", ");
			i+=2;
		}
	}
}
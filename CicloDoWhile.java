/*CICLOS DO-WHILE EN JAVA

Primero hacemos, luego preguntamos la condición
Sintaxis:
	do{
		INSTRUCCIONES...
	}while(condición);
*/

public class CicloDoWhile{
	public static void main(String[] args) {
		int i = 1000;
		do{
			System.out.println(i + ", ");
			i-=200;

		}while(i>=0);
	}
}
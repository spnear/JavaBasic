public class EjercicioCiclosDos{
	public static void main(String[] args) {
		int i = 1, j = 99;

		System.out.println("Serie con ciclo for: ");
		for (i = 1; i <= 5; i++) {
			if (i<5) {
				System.out.print(i + ", " + j + ", ");
			} else{
				System.out.print(i + ", " + j + "\n");
			}
			j--;
		}

		i=i-i+1;j=99;
		System.out.println("Serie con ciclo while: ");
		while(i<=5){
			if (i<5) {
				System.out.print(i + ", " + j + ", ");
			} else{
				System.out.print(i + ", " + j + "\n");
			}
			i++;j--;
		}
		i=1;j=99;
		System.out.println("Serie con ciclo Do-While: ");
		do{
			if (i<5) {
				System.out.print(i + ", " + j + ", ");
			} else{
				System.out.print(i + ", " + j + "\n");
			}
			i++;j--;

		}while(i <= 5);
	}
}
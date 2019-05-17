public class EjerciciosCiclos{
	public static void main(String[] args) {
		int i = 0;

		System.out.println("Serie con for: ");
		for (i = 1; i<=10; i++) {
			if (i < 10) {
				System.out.print(i + ", ");
				
			} else {
				System.out.print(i + "\n");
			}
		}
		i=i-i+1;

		System.out.println("Serie con While: ");
		while (i <= 10) {
			if (i < 10) {
				System.out.print(i + ", ");
				
			} else {
				System.out.print(i + "\n");
			}
			i++;
		}
		i=i-i+1;

		System.out.println("Serie con Do-While");
		do{
			if (i < 10) {
				System.out.print(i + ", ");
				
			} else {
				System.out.print(i + "\n");
			}
			i++;
		}while(i <= 10);
	}
}
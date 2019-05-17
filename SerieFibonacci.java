public class SerieFibonacci{
	public static void main(String[] args) {
		int a=0,b=1,c=0,i=0;
		System.out.println("Serie Fibonacci con ciclo for:");
		for (i = 0; i < 10; i++) {
			if(i<9){
				System.out.print(a + ",");
				c = a + b;
				a = b;
				b = c;
			} else{
				System.out.print(a);
			}
		}
		a=0;b=1;c=0;i=0;
		System.out.println("\nSerie Fibonacci con ciclo while:");
		while(i < 10){
			if(i<9){
				System.out.print(a + ",");
				c = a + b;
				a = b;
				b = c;
			} else{
				System.out.print(a);
			}
			i++;
		}
		a=0;b=1;c=0;i=0;
		System.out.println("\nSerie Fibonacci con ciclo do-while:");
		do{
			if(i<9){
				System.out.print(a + ",");
				c = a + b;
				a = b;
				b = c;
			} else{
				System.out.print(a + "\n");
			}	
			i++;
		}while(i < 10);
	}
}
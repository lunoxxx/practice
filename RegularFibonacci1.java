import java.util.Scanner;

public class RegularFibonacci1{

	public static void main(String args[]){
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Let's do the fibonacci now");

		long holder = scanner1.nextInt();

		long total = 1;
		long temp1 = 0;
		long temp2 = 0;

		System.out.println("Printing out Fibonacci...");

		for(long ctr=1; ctr<=holder; ctr++){
			total = temp2 + total;
			temp2 = temp1;
			temp1 = total;
			System.out.println(ctr + "." + total);
		}
			System.out.println("This is the fibonacci number " + total);
	}
			
}





























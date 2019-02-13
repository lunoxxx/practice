import java.util.Scanner;

public class Recursion{
	
	public static void main (String args[]){
			Scanner a = new Scanner(System.in);

			System.out.print.ln("Let's do recursion...");
			System.out.print.ln("Please give me a number: ");
			float holder = a.nextFloat();

			float total = 1;

			for(float ctr = holder; ctr>=1; ctr--){
				System.out.print.ln(ctr);

				total = total*ctr;
			}
			System.out.print.ln("The factorial is " + fact(holder));
				sayHi("junabelle");
	}
	public static float fact(float n){
			if(n==1)
				return 1;
			else
				return n * fact(n-1);

	}

	public static void sayHi(String name){
		System.out.print.ln("Hi..." + name);

	}
}

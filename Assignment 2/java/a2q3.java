import java.util.Scanner;

public class SimpleMath
{
	public static void main(String []args)
	{
		Scanner keyb = new Scanner(System.in);
		int one;
		int two;
		
		System.out.println("Enter two integers.");
		one = keyb.nextInt();
		two = keyb.nextInt();
		
		System.out.println("Sum: " + (one+two));
		System.out.println("Difference: " + (one-two));
		System.out.println("Product: " + (one*two));
		
			int Av = ((one+two)/2) ;
		System.out.println ("Average: " + Av);
		
			int Dis = Math.abs(one-two);
		System.out.println("Distance: " + Dis);
		
		
		if (one>=two){
			System.out.println("Maximum: " + one);
			System.out.println("Minimum: " + two);
			}
		
		
		if (two>one){
			System.out.println("Maximum: " + two);
			System.out.println("Minimum: " + one);
			}
		
		
	}
}
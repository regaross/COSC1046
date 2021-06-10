import java.util.Scanner;
public class Prime
{
	public static void main(String [] args) 
	{
		int end = 10;
		
		/* for every number, all factors must be checked to be
		sure that it is prime.*/ //Check method below.***************
		
		
		System.out.println("enter a range of numbers to check as prime");
		
		int num1 = //scanner input
		int num 2 = //scanner input
		
		for(int i = num1; num
		
		
		
		
		
		
		
		for(int num = 1; num <= end; num++)
		{
			boolean isPrime =  true;
			
			for(int check = 2; check < num; check++)
			{
				if(num % check == 0)
					isPrime = false;
				System.out.println("\tChecking Divisor: " + check);
			}
			
				System.out.println(num + " " + isPrime);
		}
			
	
		
	}
	
	public static boolean isPrime(int in){
		boolean result = true;
		for(int i = 2; i<in; i++){
			if(in%i == 0)
				result = false;
		}
		return result;
		
	}

	
	
	
}
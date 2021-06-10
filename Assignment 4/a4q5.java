//Regan Ross, 0369345
//COSC 1046, Assignment 4, Question 5
//Dr. Aaron Langille giver of doughnut bites

import java.util.Scanner;

public class Q5
{
	public static void main(String [] args)
	{
		//Output for Prime function
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an interger to check if it is prime.");
		int in = input.nextInt();
		boolean prime = isPrime(in);
		if(prime == false)
			System.out.println(in + " is not prime.");
		else
			System.out.println(in + " is prime");
		
		
		//////////////////////////////////////////////////////////////////////
		
		input.nextLine();  //Eating the new line
		System.out.println();
		//////////////////////////////////////////////////////////////////////
		
		// Output for vowel function
			 
		System.out.println("Enter a string to count the vowels.");
		String s = input.nextLine();
		int vowels = vowels(s);                                    
		System.out.println(s + " has " + vowels + " vowel(s).");
		
		//////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println();
		
		//////////////////////////////////////////////////////////////////////
		
		//Output for compound interest function 
		
		System.out.println("Compound interest calculator!\n");
		
		System.out.println("Enter the initial amount.");
			double ini = input.nextDouble();
			input.nextLine();
		System.out.println("Enter the interest rate per year.");
			double rt = input.nextDouble();
			input.nextLine();
		System.out.println("Enter the number of years.");
			double tm = input.nextDouble();
			input.nextLine();
		
		double future = compint(ini, rt, tm);
		
		System.out.println("Your final amount is: " + future);
		
		
		//////////////////////////////////////////////////////////////////////
		
		//Output for Factorial Function
		System.out.println();
		System.out.println("Enter a value to compute its factorial.");
			int n = input.nextInt();
			long fac = factorial(n);
		System.out.println(n+"! = " + fac);
		
		//////////////////////////////////////////////////////////////////////
		
		//Output for eEstimate Function
		System.out.println();
		System.out.println();
		System.out.print("Enter an integer to estimate Euler's number. ");
		System.out.println("The higher the integer, the more precise your value will be.");
		int e = input.nextInt();
		
		double k = eEstimate(e);
		System.out.println("Your estimate for Euler's number is: " + k);
		
		//////////////////////////////////////////////////////////////////////
		
		
	}
	//Prime check method
	public static boolean isPrime(int in){ 
		boolean result = true;
		for(int i = 2; i<in; i++){
			if(in%i == 0)
				result = false;
		}
		return result;
		}
		
		//Vowel counting method
	public static int vowels(String s){
		int vcount = 0;
		for(int i = 0; i < s.length(); i++){               //Big, long, stinky if-statement (i hope there's another way to do this)
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || 
			s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
				vcount++;
			}
		}
		return vcount;
		}
			
		//Compound interest method
	public static double compint(double in, double rt, double tm){
		
		double future = in * Math.pow((1 + rt), tm);
		
		return future;
		}
	
		//Factorial Method
	public static long factorial(int in){
		long result = 1;
		for(int i = 1; i <= in; i++)
			result *= i;
		
		return result;
	}
	
		//Euler's number method
	public static double eEstimate(int n){
		double e = 1;
		
		for(int i = 1; i <= n; i++)
			e = e + 1.0 /(double)factorial(i);
		
		return e;
	}
	
	
}

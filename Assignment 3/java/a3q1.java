/*Regan Ross 
(0369345)
COSC 1046
 Dr. Aaron Langille, 
 master of the keyboard
 */

import java.util.Scanner;
public class Stats
{
	public static void main(String [] args)
	{
		int count = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;			//declaring all variables
		double sum = 0;
		double prd = 1;
		double avg = 0;
		double rge = 0;
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a double number (negative to quit):");
		double x = scn.nextDouble();		//loop control variable
		
		
		while (x >= 0){
			
			count++;
			prd = (prd *= x);
			sum = (sum += x); 
			avg = (sum/count);
			
			if(x>max)
				max=x;
			if(x<min)
				min=x;
			x = scn.nextDouble();	
			
			rge = Math.abs(max-min);
			

		}
		
		
		
		System.out.println("Count: " + count);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + prd);
		System.out.println("Average: " + avg);
		System.out.println("Range: " + rge);
		
		
		System.out.println("Program Complete.");
	
	
	
	
	
	}

	
}
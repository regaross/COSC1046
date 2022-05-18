/*Regan Ross, 0369345
COSC 1046, Dr. Aaron Langille*/

import java.util.Scanner;

public class StringChecker {
	public static void main(String []args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 strings, one per line:");
		
			String s1 = input.nextLine();
			String s2 = input.nextLine();
			String s3 = input.nextLine();
			
	
			
				int result1 = (s1.compareTo(s2));
				int result2 = (s2.compareTo(s3));
			
			
			if ((s1.equals(s2)) && (s2.equals(s3)))	
					System.out.println("The strings are equal.");
			
			else if ((result1 <= 0) && (result2 <= 0))
				System.out.println("Your strings are in lexographical order (ascending) !");
			
			else if ((result1>= 0) && (result2 >= 0))
					System.out.println("Your strings are in lexographical order (descending) !");
			else
				System.out.println("Those strings are not in any order. :(");
			
	}
}
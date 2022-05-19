/*Regan Ross 
(0369345)
COSC 1046
 Dr. Aaron Langille, 
 Champion of the Skittle Toss
 */
 
import java.util.Scanner;
public class Nested
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an integer between 1 and 10: ");
		int input = s.nextInt();
		
		if(1<=input && input<= 10)
		{
		
			for(int i = 1; i <= input; i++)
			{
				for(int t = 1; t <= input; t++)
				{
					System.out.print(i*t +"\t");
				}
		
				System.out.println();
			}
		
		}
		
		
		System.out.println("Program Complete.");
	}
	
}

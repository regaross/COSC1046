//Regan Ross, 0369345
//COSC 1046
//Dr. Aaron Langille, king of basement dwellers
//Assignment5, Question 3


import java.util.Scanner;
public class Arrays2D{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println();
		
		int sum = 0;
		double avg;
		int x; //Occurence counter
		int count = 0;
		
		//These are  for each row
		int sum0 = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		
		//Max of columns
		int max0;
		int max1;
		int max2;
		int max3;
		int max4;
		
		
		//initializing array
		int[][] array = new int[4][5];
		
		//filling array with values
		for(int row = 0; row < 4; row++){
			
			for(int col = 0; col < 5; col++){
				
				array[row][col] = (int)((10*Math.random())+1);
			}
		}
		
		//array is now full of values
		
		System.out.println("Creating array (4x5, random numbers)");
		
		for(int row = 0; row < 4; row++){
			
			for(int col = 0; col < 5; col++){
				
				System.out.print(array[row][col] + "\t");
				sum += array[row][col];
			}
			
			System.out.println();
		}
		
		//Sum and average
		System.out.println("Sum of array is: " + sum);
		avg = ((double)sum)/20;
		System.out.println("Avg of array is: " + avg);
		
		for(int col = 0; col < 5; col++){
			sum0 += array[0][col];
			sum1 += array[1][col];
			sum2 += array[2][col];
			sum3 += array[3][col];
		}
		
		//System.out.println();
		
		//sum of rows output
		System.out.println("Sum of rows is:");
		System.out.println("0:" + sum0);
		System.out.println("1:" + sum1);
		System.out.println("2:" + sum2);
		System.out.println("3:" + sum3);
	
		//column Maximums
		
		max0 = array[0][0];
		max1 = array[0][1];
		max2 = array[0][2];
		max3 = array[0][3];
		max4 = array[0][4];
		
		for(int row = 0; row < 4; row++){
			
			if(array[row][0] > max0)
				max0 = array[row][0];
			
			if(array[row][1] > max1)
				max1 = array[row][1];
			
			if(array[row][2] > max2)
				max2 = array[row][2];
			
			if(array[row][3] > max3)
				max3 = array[row][3];
			
			if(array[row][4] > max4)
				max4 = array[row][4];
			
			
		}
		
		System.out.println("Max of Columns is:");
		System.out.println("0\t1\t2\t3\t4");
		System.out.println(max0 + "\t" + max1 + "\t" + max2 + "\t" + max3 + "\t" + max4);
		
		System.out.print("Count occurences of: ");
		x = in.nextInt();
		
		for(int row = 0; row < 4; row++){
			
			for(int col = 0; col < 5; col++){
			
			if(array[row][col] == x)
				count++;

			
			}	
		}
		
		System.out.println(count);
		
		
	}
	
}
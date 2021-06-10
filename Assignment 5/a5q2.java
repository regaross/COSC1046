//Regan Ross, 0369345
//COSC 1046
//Dr. Aaron Langille, Captain of Computer Pirates
//Assignment 5, Question 2


import java.util.Scanner;
import java.util.ArrayList;

public class arrayList{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int size; //number of elements in list
		int i; //for adding values to loop
		int x; //for find a value
		int max;
		
		ArrayList<Integer> list; //Declaring array list
		
		System.out.println("Enter an integer between 2 and 12 for list size: ");
		
		size = in.nextInt();
		
		//Entry validation
		while(2 > size || 12 < size){
			
			System.out.println("Invalid entry! Enter a value between 2 and 12: ");
			
			size = in.nextInt();
			System.out.println();
			
		} //loop closed
		
		list = new ArrayList<Integer>(size);
		
		System.out.println("Enter value for:");
		
		for(int index = 0; index < size; index++){
			
			System.out.print("Element " + (index+1) + ", Index " + index +": ");
			
			i = in.nextInt();
			list.add(i);
			
		}
		
			System.out.println(); //for CLEAN output
			System.out.println("---------------");
			System.out.println();
		
	//Array contents, single line with commas
	
		System.out.println("List Contents");
		for(int index = 0; index < size; index++){
			
			System.out.print(list.get(index) + ", ");
		}
		
			System.out.println(); //for CLEAN output
			System.out.println("---------------");
			System.out.println();
		
	//Array contents, reverse order
		
		System.out.println("List Contents Reversed");
		for(int j = (size - 1); j >= 0; j--){
		
			System.out.print(list.get(j) + ", ");
		}
		
			System.out.println(); //for CLEAN output
			System.out.println("---------------");
			System.out.println();
		
	//Odd values in list
	
		System.out.println("Odd Values");
		for(int index = 0; index < size; index++){
			if((list.get(index)) % 2 !=0)
				System.out.print(list.get(index) + ", ");
			
		}
		
			System.out.println(); //for CLEAN output
			System.out.println("---------------");
			System.out.println();
		
	//Odd indexes
		System.out.println("Odd Indexes");
		for(int index = 1; index < size; index++){
			
			System.out.println("Index # " + index + ": " + list.get(index));
				index++;
			
		}
		
			System.out.println(); //for CLEAN output
			System.out.println("---------------");
			System.out.println();
			
	//Max of Array
		
		max = list.get(0);
		for(int index = 0; index < size; index++){
			if(list.get(index) > max)
				max = list.get(index);
		}
		
		System.out.println("Max of Array: " + max);
		
			System.out.println(); //for CLEAN output
			System.out.println("---------------");
			System.out.println();
			
			
	//Find a value 
		System.out.print("Enter a value to find: ");
		x = in.nextInt();
		int count = 0;
		
		for(int index = 0; index < size; index++){
			 
			 if(list.get(index) == x)
				 count ++;
		
		}
		
		System.out.println();
		
		if(count > 0)
			System.out.println("Value found " + count + " times in list");
		
		
		else if(count == 0)
			System.out.println("0 : value not found in list.");
	
	}
	
}
//Regan Ross, 0369345, COSC 1046
//For Dr. Aaron Langille




import java.util.Scanner; //Bringing in my scanner


	public class GradeCalculator {
		
		public static void main(String []args)
			{
				Scanner input = new Scanner(System.in); // Scanner initialization
				
					System.out.println("Please enter three grades:");
					
						double grade1 = input.nextDouble();
					
						double grade2 = input.nextDouble();
					
						double grade3 = input.nextDouble();
					
						double product = (grade1 + grade2 + grade3);
						double average = product / 3.0;
		
				
				String grade = "grade";
				//introducing if statements
				
				if (average >= 90) {
				grade = "A+";}
				
				if (80 <= average && average <90 ) {
				grade = "A";}
				
				if (70 <= average && average <80 ) {
				grade = "B";}
				
				if (60 <= average && average <69 ) {
				grade = "C";}
				
				if (50 <= average && average <59 ) {
				grade = "D";}
				
				if (average <50 ){
				grade = "F";}
				
				if (0 > grade1 || grade1 >100 || 0 > grade2 || grade2 >100 || 0 > grade3 || grade3 >100){
				System.out.println("One of the grades is out of range. \nEnd of Program.");}
				
				else
					System.out.println("Average grade: " + average + "% or " + grade +"\nEnd of program.");
	}
	
}
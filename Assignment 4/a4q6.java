//Regan Ross, 0369345
//COSC 1046
//Dr. Aaron Langille, destroyer of all free weekends

import java.util.Scanner;
public class Q6{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nWelcome to this easy dice game that was way super hard to make."); //Welcome
		
		//Variables
		int oldScore = 0;
		int newScore2 = 0;
		int p1Score;
		int p2Score;
		String ans; // for initiating outter loop, different games
		String s; // for initiating individual dice rolls
		String p = ""; //player number
		int p1Wins = 0;
		int p2Wins = 0;
		
		//hopefully the loop for the entire game
		
		do{	
			p1Score = 0;
			p2Score = 0;
		
			System.out.print("\nReady to play? (y or n) >");
			ans = in.nextLine();
			int newScore1 = 0;
			
			if(ans.equals("y")){
				int first = whoGoesFirst();
				
				if(first == 1){
					System.out.println("\nPlayer one will start the game!");
					p = "Player one"; //for naming player in later output
				}
				if(first == 2){
					System.out.println("\nPlayer two will start the game");
					p = "Player two";
				}
				
					
				do{		//First player rolling sequence
					System.out.print("\nEnter y to roll dice, n to quit>");
					s = in.nextLine();
					
					if(s.equals("y")){
						int roll = rollDice();
						System.out.println();
						System.out.println("You rolled " + roll);
						
						if(roll == 2 || roll == 12 || roll == 7){ //first roller loses, game ends
							if(first == 1){
								System.out.println("Player one loses! Player two wins!");
								System.out.println("__________________________________");
								p2Wins++;
							}
							if(first == 2){
								System.out.println("Player two loses! Player one wins!");
								System.out.println("__________________________________");
								p1Wins++;
							}
							break;
						}
						else{ //game continues, scores displayed
						
						newScore1 = newScore(newScore1, roll);
						
						System.out.println();
							if(first == 1)
								System.out.println("P1 score: " + newScore1 + "\tP2 score: " + newScore2);
							if(first == 2)
								System.out.println("P1 score: " + newScore2 + "\tP2 score: " + newScore1);
						}
					}
					
					else if(s.equals("n")){ //First player done rolling, Next player's rolling sequence.
						
						System.out.println("**********************************");
						
						System.out.println("\n\nIt is now your turn, " + p + ".");
						
						do{															//First player rolling sequence
							System.out.print("\nEnter y to roll dice, n to quit>");
							s = in.nextLine();
					
							if(s.equals("y")){
								int roll = rollDice();
								System.out.println();
								System.out.println("You rolled " + roll);
						
								if(roll == 2 || roll == 12 || roll == 7){ //first roller loses
									if(first == 2){
										System.out.println("Player one loses! Player two wins!"); //Statements swapped
										System.out.println("__________________________________");
										p1Wins++;
									}
									if(first == 1){
										System.out.println("Player two loses! Player one wins!");
										System.out.println("__________________________________");
										p1Wins++;
									}
									break;
								}
								else{ //game continues
						
								newScore2 = newScore(newScore2, roll);
						
								System.out.println();
									if(first == 1)
										System.out.println("P1 score: " + newScore1 + "\tP2 score: " + newScore2);
									if(first == 2)
										System.out.println("P1 score: " + newScore2 + "\tP2 score: " + newScore1);
								}
								
							}
							else if(s.equals("n")){
								
								//now i need to compare points
								
								if(first == 1){
									p1Score = newScore1;
									p2Score = newScore2;
								}
								else if(first == 2){
									p1Score = newScore2;
									p2Score = newScore1;
								}
								if(p1Score > p2Score){
									System.out.println("Player one wins!");
									System.out.println("_________________");
									p1Wins++;
									break;
								}
								if(p2Score > p1Score){
									System.out.println("Player two wins!");
									System.out.println("_________________");
									p2Wins++;
									break;
								}
								
								}
							
							}while(s.equals("y"));
						
						}
					
					}while(s.equals("y"));
					
				//Displaying total games won
				System.out.println("P1 wins: " + p1Wins +"\tP2 wins: " + p2Wins);
			
			}
			
			//End of program if "n" is inputted a few times
			else if(ans.equals("n")){
				System.out.println("End Program");
				System.exit(0);
			}
			
		}while(ans.equals("y"));
		
		
		
		
		//Computer science is hard.....
		
		
		
		
		
		
	}
	public static int whoGoesFirst(){
		int i = (int)(Math.random()*2+1); 
		return i;
	}
	public static int rollDie(){
		int i = (int)(Math.random()*6+1); 
		return i;
	}
	public static int rollDice(){
		int i = (rollDie()+rollDie());
		return i;
	}
	public static int newScore(int oldScore, int rollValue){
		if(rollValue == 2 || rollValue == 7 || rollValue == 12){
			int i = -1;
			return i;
		}
		else{
		int newScore = oldScore + rollValue;
		return newScore;
		}
	}
	public static String winner(int playernumber){
		String win;
		if(playernumber == 1){
			 win = "Player one wins!";
		}
		else{
			win = "Player two wins!";
		}
		return win;
	}
	public static char keepRolling(){
		Scanner in = new Scanner (System.in);
		System.out.println("To keep rolling, enter y. To stop rolling, enter n.");
		char a = in.nextLine().charAt(0);
			return a;
	}
}

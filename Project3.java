import java.util.Scanner;
public class Project3 
{
 
	public static void main(String[] args)
	{
		// declare variables
		
		String nameYarn1;
		String nameYarn2;
		int numberBallYarn1;
		int yards1;
		int yards2;
		int totalYards;
		int ballsNeeded;
		
		// assign variable to scanner
		Scanner keyboard = new Scanner(System.in);
		
		
		// Get info from user
		System.out.println("Enter the name of the yarn specified by your pattern.");
		nameYarn1 = keyboard.nextLine();
		
		System.out.println("Enter the number of balls of " + nameYarn1 + ".");
		numberBallYarn1 = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("Enter the number of yards per ball of " + nameYarn1 + ".");
		yards1 = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("Enter the name of the substitute yarn.");
		nameYarn2 = keyboard.nextLine();
		
		System.out.println("Enter the number of yards per ball of " + nameYarn2 + ".");
		yards2 = keyboard.nextInt();
		keyboard.nextLine();
		
		// Find total yards needed
		totalYards = numberBallYarn1 * yards1;
		
		// Find the number of balls needed of the substitute to replace the specified yarn. Rounding up
		ballsNeeded = (int) Math.ceil ((double) totalYards / yards2);
		
		
		// Tell user how many balls of the substitute yarn are required to replace the amount of the specified yarn
		System.out.println("You should purchase " + ballsNeeded + " balls of " + nameYarn2 + " instead of " + numberBallYarn1 + " balls of " + nameYarn1 + ".");
	}

}

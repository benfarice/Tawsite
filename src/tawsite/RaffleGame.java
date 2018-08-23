package tawsite;
import java.util.Iterator;
import java.util.Scanner;
public class RaffleGame {

	public static void main(String[] args) {
		System.out.println("Please enter a number of friends");
		Scanner myScanner = new Scanner(System.in);
		int NumOfFriends = myScanner.nextInt();
		String Friends [] = new String[NumOfFriends];
		System.out.println("Enter their names");
		for (int i = 0; i < NumOfFriends; i++) {
			Friends[i]=myScanner.next();
		}
		int randomNumber = (int)Math.random()*3;
		
		//System.out.println(Friends.length);
		//System.out.println(NumOfFriends);
		//System.out.println(randomNumber);

		//System.out.println(Friends[0]);

		
		System.out.println("The winner is : "+Friends[randomNumber]);
	}

}

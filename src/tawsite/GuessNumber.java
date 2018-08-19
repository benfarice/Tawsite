package tawsite;
import java.util.Scanner;
public class GuessNumber {

	public static void main(String[] args) {
		int secretNumber = (int)(Math.random()*10);
		boolean guessed = false;
		do {
			System.out.println("Please guess the secret number");
			Scanner sc = new Scanner(System.in);
			int answer = sc.nextInt();
			if(answer==secretNumber){
				guessed=true;
				System.out.println("This is the right number");
			}else {
				guessed=false;
				System.out.println("Sorry This is not the right number");
			}
		} while (!guessed);
		
	}

}

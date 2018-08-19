package tawsite;
import java.util.Scanner;;
public class ScissorsPaperRock {

	public static void main(String[] args) {
		
		System.out.println("Choose from the following\n1-Scissors \n2-Paper\n3-Rock");
		Scanner scanner = new Scanner(System.in);
		int randomNumber = (int)(Math.random()*3)+1;
		//System.out.println(randomNumber);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			if(randomNumber == 2) {
				System.out.println("You win ! Scissors out paper");
			}else {
				System.out.println("Sorry you lost");
			}
			break;
		case 2:
			if(randomNumber == 3) {
				System.out.println("You win ! Paper covers rock");
			}else {
				System.out.println("Sorry you lost");
			}
			break;
		case 3:
			if(randomNumber == 1) {
				System.out.println("You win ! Rock breaks scissors");
			}else {
				System.out.println("Sorry you lost");
			}
			break;

		default:
			break;
		}
	}

}

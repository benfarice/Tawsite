package tawsite;
import java.util.Scanner;;
public class UInputs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int input = scan.nextInt();
		int max = input;
		while(input!=-1) {
			System.out.println("Please enter a number");
			input = scan.nextInt();
			if(input > max) {
				max=input;
			}
		}
		System.out.println("The maximal number is "+max);

	}

}

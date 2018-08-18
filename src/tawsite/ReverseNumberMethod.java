package tawsite;
import java.util.Scanner;

public class ReverseNumberMethod {

	
	static int myattribute = 25;
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a 3 digits number");
		
		int x = scan.nextInt();
		int a = reverse(x);
		System.out.println("the revesed number is : "+a);
		System.out.println("my age is : " + myattribute);
		
	}
	public static int reverse(int Number){
		if(Number <1000 && Number > 99){
			int lastNumber = Number%10;
			Number=Number/10;
			int MiddleNumber = Number%10;
			Number=Number/10;
			int firstNumber = Number;
			
			
			int reversedNumber = lastNumber*100+MiddleNumber*10+firstNumber;
			return reversedNumber;
		}else {
			System.out.println("You should enter a 3 digits number");
			return 0;
		}
	
	}

}

package tawsite;

public class NumbersGame {

	public static void main(String[] args) {
		int f = 4532;
		int lastNumber = f%10;
		f=f/10;
		int thirdNumber = f%10;
		f=f/10;
		int secondNumber = f%10;
		f=f/10;
		int firstNumber = f;
		System.out.println("the reversed Number is : "+lastNumber+thirdNumber+secondNumber+firstNumber);

		
		
		int reversedNumber = lastNumber*1000;
		reversedNumber+=thirdNumber*100;
		reversedNumber+=secondNumber*10;
		reversedNumber+=firstNumber;
		
		System.out.println("the reversed Number variable : "+reversedNumber);
		
	}

}

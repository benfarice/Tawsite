package tawsite;

public class ReverseNumberMethod {

	
	static int myattribute = 25;
	public static void main(String[] args) {
		
		int a = reverse(458);
		System.out.println("the revesed number is : "+a);
		System.out.println("my age is : " + myattribute);
		
	}
	public static int reverse(int Number){
		
		int lastNumber = Number%10;
		Number=Number/10;
		int MiddleNumber = Number%10;
		Number=Number/10;
		int firstNumber = Number;
		
		
		int reversedNumber = lastNumber*100+MiddleNumber*10+firstNumber;
		return reversedNumber;
	}

}

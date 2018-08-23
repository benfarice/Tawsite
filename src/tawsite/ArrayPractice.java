package tawsite;

public class ArrayPractice {

	public static void main(String[] args) {
		int myArray [] = {76,87,54,32,209,75,65};
		System.out.println("The max is : "+FindMax(myArray));
		System.out.println("The difference is : "+findDifference(myArray));

	}

	
	public static int FindMax(int [] someArray) {
		int max = someArray[0];
		
		for (int i = 0; i < someArray.length; i++) {
			if(someArray[i]>max){
				max=someArray[i];
			}
		}
		
		return max;
	}
	
	public static int findDifference(int [] someArray) {
		int max = someArray[0];
		int min = someArray[0];
		
		for (int i = 0; i < someArray.length; i++) {
			if(someArray[i]>max){
				max=someArray[i];
			}else if(someArray[i]<min){
				min=someArray[i];
			} 
		}
		return max-min;
	}
}

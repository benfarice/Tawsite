package tawsite;

public class Loops {

	public static void main(String[] args) {
		int myNumber=0;
		int i =0;//iterator
		while (i<10) {
			//actions to every loop
			myNumber+=2;
			System.out.println("my Number : "+myNumber);
			i++;
			
		}
		
		int iterator = 0;
		int mySecretInt = 0;
		do {
			iterator++;
			mySecretInt+=2;
			System.out.println("my Int : "+mySecretInt);
			
		} while (iterator<12);
	}

}

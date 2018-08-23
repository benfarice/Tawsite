package tawsite;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int myArray[][] = {{5,4,3,2},{5,4,3,2},{5,4,3,2},{5,4,3,2}};
		
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[0].length; j++) {
				System.out.print(myArray[i][j]+"   -    ");
			}
		}
		
	}

}

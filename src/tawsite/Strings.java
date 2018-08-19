package tawsite;

public class Strings {

	public static void main(String[] args) {
		String myName = "Imzoughene";
		System.out.println("The length of my name is : "+myName.length());
		String dream = "using my hardwork I will be a freelance developer";
		System.out.println("Insha Allah "+dream.substring(17));
		System.out.println("my fullname is : "+myName.concat(" Youssef"));
		
		String MyNameReversed = "";
		for (int i = myName.length()-1; i >= 0; i--) {
			MyNameReversed+=myName.charAt(i);
		}
		
		System.out.println("my name reversed : "+MyNameReversed);
	}

}

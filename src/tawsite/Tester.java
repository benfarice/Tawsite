package tawsite;

public class Tester {

	public static void main(String[] args) {
		Dog dogA = new Dog();
		Dog dogB = new Dog();
		
		dogA.set_name("Lucky");
		dogB.set_name("Mocha");
		
		System.out.println(dogA.get_name()+"\n"+dogB.get_name());
	}

}

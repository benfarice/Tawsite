package tawsite;

public class Tester {

	public static void main(String[] args) {
		/*
		
		Dog dogA = new Dog();
		Dog dogB = new Dog();
		Dog dogC = new Dog("Sara");
		
		
		dogA.set_name("Lucky");
		dogB.set_name("Mocha");
		
		System.out.println(dogA.get_name()+"\n"+dogB.get_name()+"\n"+dogC.get_name());
		 * 
		 * 
		 * 		Dog DogAlpha = new Dog("Mucky","Brown",67,9);
		 */
		Animal my_array[] = new Animal[4];
		my_array[0]=new Dog();
		my_array[1]=new Dog();
		my_array[2]=new Cat();
		
		my_array[0].jump();

		my_array[1].jump();

		my_array[2].jump();

	}

}

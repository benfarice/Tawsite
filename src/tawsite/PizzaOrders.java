package tawsite;
import java.util.Scanner;

public class PizzaOrders {

	public static void main(String[] args) {
		System.out.println("Type the topping you would like in your pizza");
		Scanner s = new Scanner(System.in);
		String top = s.nextLine();
		
		if(top.equals("Tuna")) {
			System.out.println("Great ! you chose Tuna");
		}else if(top.equals("Corn")) {
			System.out.println("Great ! you chose Corn");
		}else if(top.equals("Onion")) {
			System.out.println("we ran out of onion unfortunately");
		}else{
			System.out.println("you can't put that on our pizza");
		}
		
	}

}

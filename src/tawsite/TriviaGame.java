package tawsite;
import java.util.Scanner;
public class TriviaGame {

	public static void main(String[] args) {
		String triviaBoard[][] = new String[5][3];
		
		triviaBoard[0][0]="Who was the fifth president of United States";
		triviaBoard[1][0]="what do golfers shout to warn other golfers when they hit an errant shot";
		triviaBoard[2][0]="which city is traditionally said to be built on seven hills";
		triviaBoard[3][0]="Abraham Lincoln was assassinated in what year";
		triviaBoard[4][0]="Forsche is a brand of car that originated in what country";
		
		triviaBoard[0][1]="<A>Thomas<B>James<C>Madison";
		triviaBoard[1][1]="<A>Alpha<B>Beta<C>Lambda";
		triviaBoard[2][1]="<A>London<B>Tokyo<C>Rome";
		triviaBoard[3][1]="<A>1324<B>5643<C>8854";
		triviaBoard[4][1]="<A>Germany<B>Japon<C>France";
		
		
		triviaBoard[0][2]="b";
		triviaBoard[1][2]="a";
		triviaBoard[2][2]="c";
		triviaBoard[3][2]="c";
		triviaBoard[4][2]="a";
		
		
		Scanner scan = new Scanner(System.in);
		int money = 100;
		System.out.println("Welcome to the trivia king");
		System.out.println("You currently have : "+money+" $\nFor every question you answer correctly you will be rewarded with 50$\nHowever with any incorrect answer you will lose 50$");
		
		for (int i = 0; i < triviaBoard.length; i++) {
			if(money>0) {
				System.out.println("Question : "+(i+1));
				System.out.println(triviaBoard[i][0]);
				System.out.println(triviaBoard[i][1]);
				String answer = scan.next();
				if(answer.equals(triviaBoard[i][2])){
					money+=50;
					System.out.println("Good job ! you win 50 $ ! currently you have "+money+" $");
				}else {
					money-=50;
					System.out.println("Sorry you have the wrong answer ! and currently have : "+money+" $");
					
				}
			}else {
				System.out.println("Game over");
				break;
			}
		}
		
		if(money==350) {
			System.out.println("You are the winner");
		}
		
		

	}

}

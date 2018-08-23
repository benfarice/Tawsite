package tawsite;

public class Checkers {

	public static void main(String[] args) {
		char board[][] = BoardMaker(6,4);
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static char[][] BoardMaker(int h,int w) {
		char checkers [][] = new char[h][w];
		char current;
		for (int i = 0; i < checkers.length; i++) {
			if(i%2==0) current='X';
			else current='O';
			
			int j=0;
			do {
				checkers[i][j]=current;
				if(current=='X') {
					current='O';
				}else {
					current='X';
				}
				j++;
			} while (j<checkers[0].length);
			
		}
		return checkers;
	}
}

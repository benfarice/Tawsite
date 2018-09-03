package tawsite;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		int res[]=inToArray(5);
		print(res);
		System.out.println("---------");
		compete(res);
		
	}
	public static int[] inToArray(int size) {
		int array[] = new int [size];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter a number : ");
			array[i]=scan.nextInt();
		}
		return array;
	}
	
	
	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void compete(int[] x) {
		int first  = x[0];
		int second = x[0];
		for (int i = 0; i < x.length; i++){
			if(x[i]>first) {
				first=x[i];
			}else 
			if(x[i]>second) {
				second=x[i];
			}
		}
		System.out.println("First number : "+first+" ,Second Number : "+second);
	}
}

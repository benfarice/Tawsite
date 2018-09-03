package tawsite;

public class StaticPrac {
	public static int average(int [] nums) {
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
		}
		return sum/nums.length;
	}
	
	public static void main(Strings[] args) {
		int [] array= {6,87,54,34,24};
		System.out.println(StaticPrac.average(array));
	}
}

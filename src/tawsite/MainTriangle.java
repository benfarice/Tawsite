package tawsite;

public class MainTriangle {

	public static void main(String[] args) {
		Point a = new Point(56,54);
		Point b = new Point(96,34);
		Point c = new Point(86,14);

		Triangle triA = new Triangle(a,b,c);
		Point p = triA.getA();
		p.setX(345);
		System.out.println(triA.getA().getX());
	
	}

}

package tawsite;

public class Triangle {
	private Point A;
	private Point B;
	private Point C;
	
	
	//Constructor
	public Triangle(Point a,Point b,Point c){
		this.A=a;
		this.B=b;
		this.C=c;
	}
	
	
	
	public Point getA() {
		return new Point(A);
	}
	public void setA(Point a) {
		this.A=a;
	} 
	public Point getB() {
		return new Point(B);
	}
	public void setB(Point b) {
		this.B=b;
	} 
	public Point getC() {
		return new Point(C);
	}
	public void setC(Point c) {
		this.C=c;
	} 
}

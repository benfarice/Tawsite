package tawsite;

public class Point {
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x=x;
	}
	
	public Point() {
		
	}
	public Point(double x,double y) {
		this.x=x;
		this.y=y;
	}
	
	public Point(Point other) {
		this.x=other.x;
		this.y=other.y;
	}
}

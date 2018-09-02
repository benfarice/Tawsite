package tawsite;

public class Student {
	private String _name;
	private int _testA;
	private int _testB;
	private int _testC;
	
	public Student() {
		
	}
	
	
	public Student(String name,int testA,int testB,int testC) {
		this._name=name;
		this._testA=testA;
		this._testB=testB;
		this._testC=testC;
	}
	
	public String get_name() {
		return this._name;
	}
	
	public void set_name(String new_name) {
		this._name=new_name;
	}
	public int get_testA() {
		return this._testA;
	}
	
	public void set_testA(int new_testA) {
		this._testA=new_testA;
	}
	public int get_testB() {
		return this._testB;
	}
	
	public void set_testB(int new_testB) {
		this._testA=new_testB;
	}
	public int get_testC() {
		return this._testC;
	}
	
	public void set_testC(int new_testC) {
		this._testA=new_testC;
	}
	
	public int testsAvg() {
		return (this._testA+this._testB+this._testC)/3;
	}
	
	
	public static void main(String[] args) {}

}

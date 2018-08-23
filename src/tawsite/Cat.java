package tawsite;

public class Cat extends Animal{
	private int _NumberOfMeows;
	
	
	
	public Cat(){
		
	}
	

	
	public Cat(String name,String color,int size,int numberOfMeows){
		super(name,color,size);
		this._NumberOfMeows = numberOfMeows;
	}
	
	
	
}

package tawsite;

public class Dog extends Animal{
	
	private int _NumberOfBarks;
	
	//Constructors go here
	public Dog(){
		_color="Brown";
	}
	
	public Dog(String name){
		_name=name;
	}
	
	public Dog(String name,String color,int size,int numberOfBarks){
		super(name,color,size);
		this._NumberOfBarks = numberOfBarks;
	}
	public void jump(){
		System.out.println("The Dog jump");
	}
	
}

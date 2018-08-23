package tawsite;

public class Animal {
	protected String _name ;
	protected String _color;
	private int _size; 
	
	public Animal() {
		
	}
	
	public Animal(String name,String color,int size) {
		this._name=name;
		this._color=color;
		this._size=size;
	}
	
	
	
	
	public void jump(){}
	
	public void moveRight(){}

	public void moveLeft(){}
	
	
	public String get_name() {
		return this._name;
	}

	public String get_color() {
		return this._color;
	}

	public int get_size() {
		return this._size;
	}

	
	public void set_name(String name) {
		this._name=name;
	}
	
	public void set_color(String color) {
		this._color=color;
	}
	
	public void set_size(int size) {
		this._size=size;
	}
}

package tawsite;

public class ClassRoom {

	private Student _students[]=new Student[20];
	
	public ClassRoom() {
		int randomA,randomB,randomC;
		for (int i = 0; i < _students.length; i++) {
		//_students[i]=new Student();
			randomA=70+(int)(Math.random()*((100-70)+1));
			randomB=70+(int)(Math.random()*((100-70)+1));
			randomC=70+(int)(Math.random()*((100-70)+1));
			_students[i]=new Student("imzoughene", randomA, randomB, randomC);
		}
	}
	
	
	public Student[] getStudents() {
		return _students;
	}
	
	public String ToString() {
		String res = "A class tests chart \nname\t\ttestA\ttestB\ttestC\n";
		for (int i = 0; i < _students.length; i++) {
			res+=_students[i].get_name()+"\t\t"+_students[i].get_testA()+"\t"+_students[i].get_testB()+"\t"+_students[i].get_testC()+"\n";
		}
		return res;
	}
}

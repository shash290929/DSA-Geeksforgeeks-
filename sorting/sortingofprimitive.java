package sorting;

import java.util.Comparator;
import java.util.Arrays;

public class sortingofprimitive {
	public static void main (String[] args) {
		Student[] stud = {new Student(10,"App","Delhi"),new Student(1,"Shash","Delhi"),new Student(6,"shank","Delhi")};
		Arrays.sort(stud,new sortbyRoll());
		for(Student e:stud) {
			System.out.println(e.RollNo+" "+e.Name+" "+e.City);
		}
		Arrays.sort(stud,new sortbyName());
		System.out.println("sort by Name");
		for(Student e:stud) {
			System.out.println(e.RollNo+" "+e.Name+" "+e.City);
		}
	}
}

class Student1 implements Comparable<Student1>{
	int RollNo;
	String Name;
	public Student1(int RollNo,String Name) {
		this.RollNo=RollNo;
		this.Name=Name;
	}
	public int compareTo(Student1 stud) {
		return this.RollNo-stud.RollNo;
	}
}


class Student{
	int RollNo;
	String Name;
	String City;
	public Student(int RollNo,String Name,String City) {
		this.RollNo=RollNo;
		this.Name=Name;
		this.City=City;
	}
}

class sortbyRoll implements Comparator<Student>{
	public int compare(Student a,Student b) {
		return a.RollNo-b.RollNo;
	}
}

class sortbyName implements Comparator<Student>{
	public int compare(Student a,Student b) {
		return a.Name.compareTo(b.Name);
	}
}
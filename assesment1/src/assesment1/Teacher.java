package assesment1;

import java.util.ArrayList;
import java.util.Iterator;

public class Teacher extends Person {
	private int numCourses = 0;
	ArrayList courses = new ArrayList();
	
	Teacher(String name, String address) {
		super(name, address);
	}
	
	public String toString() {
		return "Teacher: " + super.toString();
	}
	
	public void introduce() {
		 System.out.println("Hello I am "+ super.getName() +" and I am a teacher" + ". I am from " + super.getAddress()); 
	}
	
	public boolean addCourse(String course) {
		for(int i = 0; i < this.numCourses; i++) {
			if(this.courses.get(i) == course) {
				return false;
			}
		}
		this.courses.add(course);
		this.numCourses++;
		return true;
	}
	
	public boolean removeCourse(String course) {
		int index = this.numCourses;
		for(int i = 0; i < this.numCourses; i++) {
			if(this.courses.get(i).equals(course)) {
				index = i;
				break;
			}
		}
//		
		if(index == this.numCourses) {
			return false;
		} else {
			Iterator i = this.courses.iterator();
			String str = "";
			while (i.hasNext()) {
				str = (String) i.next();
				if (str.equals(course)) {
					i.remove();
					System.out.println(course + " is removed");
					break;
				}
			}
			 numCourses--;
			 return true;
		}	
		
	}
	
	public void printCourses() {
		System.out.println("Total course: " + this.numCourses);
		System.out.println(this.courses);
	}
	
	
}

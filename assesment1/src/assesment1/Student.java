package assesment1;

import java.util.ArrayList;


class Student extends Person{
	private int numCourses = 0;
	ArrayList courses = new ArrayList();
	ArrayList grades = new ArrayList();
	
	Student(String name, String address) {
		super(name, address);
	}
	
	public int getNumCourses() {
		return this.numCourses;
	}
	
	public void addCourseGrade(String course, int grade) {
		this.courses.add(course);
		this.grades.add(grade);
		this.numCourses++;
	}
	
	public void printGrades() {
		System.out.println("Total courses: " + this.numCourses);
		
		for(int i = 0; i < this.numCourses; ++i) {
				System.out.println("Grades " +  this.courses.get(i) + ": " + this.grades.get(i));
		}	
	}
	
	public void  getAverageGrades() {
		
		int sum = 0;
	       for(int i=0; i < this.numCourses ; i++) {
	        sum += (int) this.grades.get(i);
	       }
	       double average = sum / this.numCourses;
	        System.out.println("Average grades : " + average);
//	       
//		
	}
	
	public String toString() {
		return "Student: " + super.toString();
		}
	
	public void introduce() {
		 System.out.println("Hello I am "+ super.getName() +" and I am a student" + ". I am from " + super.getAddress()); 
	}
	
}

package assesment1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Yunas", "bogor");
		
		System.out.println("【Student Info】");
		
		System.out.println(student1.toString());
		student1.introduce();
		student1.addCourseGrade("english", 70);
		student1.addCourseGrade("MTK", 80);
		student1.printGrades();
		student1.getAverageGrades();
		
		Teacher teacher1 = new Teacher("Adit", "Jakarta");
		
		System.out.println("【Teacher Info】");
		
		System.out.println(teacher1.toString());
		teacher1.introduce();
		teacher1.addCourse("Javascript");
		teacher1.addCourse("Java");
		teacher1.addCourse("C++");
		teacher1.printCourses();
		
		teacher1.removeCourse("C++");
		teacher1.printCourses();
		
		
		 
	}

}

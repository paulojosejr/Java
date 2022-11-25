package oo.composition;

public class TestStudent {
	public static void main(String[] args) {
		Student st1 = new Student("Daryl");
		Student st2 = new Student("Michonne");
		Student st3 = new Student("Becca");
		
		Course cs1 = new Course("Juris Doctor");
		Course cs2 = new Course("Management");
		Course cs3 = new Course("Computer Science");
		
		cs1.addStudent(st1);
		cs1.addStudent(st2);
		
		cs3.addStudent(st3);
		
		st1.addCourse(cs2);
		
		for(Student student: cs1.students) {
			System.out.println("I'm enrolled in " + cs1.name);
			System.out.println("and my name is " + student.name);
			System.out.println();
		}
		
		System.out.println(st1.courses.get(0).students);
	}
}

package Sos;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher lizzy = new Teacher(102,"lii",500);
	
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		
		Student sam = new Student(1,"taaa",4);
		List<Student> studentList = new ArrayList<>();
		studentList.add(sam);
		System.out.println("The name of the student is " + studentList);
		
		School ghs = new School(teacherList, studentList);
		System.out.println("GHS has earned :" +ghs.getTotalMoneyEarned());
		
		sam.payFees(5000);
		System.out.println("Ghs has earned: "+ghs.getTotalMoneyEarned());
		sam.payFees(7000);
		System.out.println("sams updated fees is:" +ghs.getTotalMoneyEarned());
		
		System.out.println(ghs.getStudent());
	
	System.out.println("---Making GHS paying salary----");
	lizzy.receiveSalary(lizzy.getSalary(500));
	System.out.println("ghs has spent for salary "+lizzy.getName()
	+ " and now salary has " + ghs.getTotalMoneyEarned());
	
	}

}

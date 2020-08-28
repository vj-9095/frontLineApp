package frontLineApp;

import java.util.Scanner;

public class student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentId;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse = 699;
	private static int id = 1001;
	
	
	// we need a constructor here
	//it prompt user to enter name and year
	public student()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();	
		
		System.out.println("1 . freshmen\n2 . sophere\n3 . senior \n4 . for senior\n Enter student grade level: ");
		this.gradeYear = in.nextInt();
		
		System.out.println(firstName +" "+lastName+" "+gradeYear);
	}
	//generate the id 
	
	//enroll in courses
	
	//view balance
	
	//pay tuition
	
	//show status 
	
	
	
	
}

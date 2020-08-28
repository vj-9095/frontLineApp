package Sos;

import java.util.List;

/**
 * it can have many teachers, students. 
 * implement arraylist for students, teachers
 */
public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static int  totalMoneyEarned;
	private static int totalMoneySpent;

	/**
	 * @param teachers is the list of teachers in school
	 * @param students is the list of students in school
	 */
	public School(List<Teacher> teachers, List<Student> students)
	{
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}
/**
 * 
 * @return the list of teachers in the school
 */
	public List<Teacher> getTeachers() {
		return teachers;
	}
/**
 * Adds a teacher to the school.
 * @param teachers the teacher to be added
 */
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
/**
 * 
 * @return the list of students in the school
 */
	public List<Student> getStudent() {
		return students;
	}
/**
 * Add a student to the school
 * @param student the student to be added.
 */
	public void addStudent(Student student) {
		students.add(student);
	}
/**
 * 
 * @return the total money earned by the school
 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
/**
 * adds the total money by the school
 * @param MoneyEarned money that supposed to be added
 */
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}
/**
 * 
 * @return the total money spent by the school
 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
/**
 * update the money that spent by the school which is 
 * the salary given by the school to its teachers.
 * @param MoneySpent the money spent by the school.
 */
	public void updateTotalMoneySpent(int MoneySpent) {
		totalMoneySpent -= MoneySpent;
	}
	
	
}

package Sos;

/**
 * @author vivek
 *This class is responsible for keeping the track
 *of the teacher's name, id , salary.
 */
public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private int salaryEared;
	private int salaryEarned; 
	
	/**
	 * creates a new teacher object.
	 * @param id id for the teacher.
	 * @param name name for the teacher.
	 * @param salary salary for the teacher.
	 */
	
	public Teacher(int id, String name, int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.salaryEared=0;
	}
	//return the current name for the teacher.
	
	public String getName()
	{
		return this.name; 
	}
	
	// return id of the current teacher.
	public int getId()
	{
		return id;
	}
	
	// returns the salary for the current teacher.
	
	public int getSalary(int salary)
	{
		return salary;
	}
	/**
	 * Adds to the salary
	 * removes from the total money earned by the school.
	 * @param salary.
	 */
	public void receiveSalary(int salary)
	{
		salaryEarned+= salary;
		School.updateTotalMoneyEarned(salary);
		
		}
	
}



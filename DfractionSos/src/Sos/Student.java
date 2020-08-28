package Sos;
/*This class is responsibe for keep track of students
 * fees, name,grade*/

public class Student {

	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/*To create new Student by initializing. 
	 * Fees for every student is $40000.
	 * Fees paid initially is 0.
	 * @param id for the student: unique.
	 * @param name name of the student.
	 * @param grade grade of the student.
	 * */
	
	public Student(int id, String name, int grade)
	{
		feesPaid=0;
		feesTotal=40000;
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	
	//Not going to alter Student's name, student's id.
	
	/**
	 * Used to update the student's grade.
	 * @param grade new grade of the student.
	 */
	
	public void setGrade(int grade)
	{
		this.grade=grade;
	}
	
	/**
	 * keep adding the fees to feesPaid field.
	 * feesPaid = 10,000 + 5000 + 15000
	 * Add the fees to the fees paid.
	 * The school is going to receive the funds.
	 * @param fees is the fees that the student pays.
	 */
	public void payFees(int fees)
	{
		feesPaid+=fees;
		School.updateTotalMoneyEarned(feesPaid);
		
	}
	
	/**
	 * @return id of the student
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @return name of the student
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @return feespaid by the student
	 */

	public int getFeesPaid()
	{
		return feesPaid;
	}

	/**
	 * @return total fees of the student
	 */

	public int getFeesTotal()
	{
		return feesTotal;
	}

	/**
	 * @return grade of the student
	 */

	public int getGrade()
	{
		return grade;
	}
	
	/**
	 * 
	 * @return the remaining fees.
	 */

	public int getRemainingFees()
	{
		return feesTotal-feesPaid;
	}
	
	
}

package encapExample;

public class Encap {
	
	private String geekName;
	private int geekRoll;
	private int geekAge;
	
	/**
	 * get method for age to access private 
	 * member geekAge;
	 * @return
	 */
	public int getAge()
	{
		return geekAge;
	}
	
	/**
	 * set method for age to access private 
	 * variable geekage
	 * @param newAge
	 */
	public void setAge(int newAge)
	{
		geekAge = newAge;
	}
	
	/**
	 * get method for name to access private 
	 * member geekName;
	 * @return
	 */
	public String getName()
	{
		return geekName;
	}
	
	/**
	 * set method for name to access private 
	 * variable geekName
	 * @param newName
	 */
	public void setName(String newName)
	{
		geekName=newName;
	}
	
	/**
	 * get method for rollno to access private 
	 * member geekRoll
	 * @return
	 */
	public int getRoll()
	{
		return geekRoll;
	}
	
	public void setRoll(int newRoll)
	{
		geekRoll = newRoll;
	}

}

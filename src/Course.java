

public class Course {
	
	private int ID;
	private String courseName;
	private int creditHour;
	
	
	public Course(int ID, String courseName, int creditHour)
	{
		this.ID = ID;
		this.courseName = courseName;
		this.creditHour = creditHour;
	}
	
	public int getID()
	{
		return ID;
	}
	public int getcreditHour()
	{
		return creditHour;
	}
	public String getcourseName()
	{
		return courseName;
	}
	public String toString()
	{
		return ID+"::"+courseName+"credit hours::"+creditHour+"\n";
	}

}

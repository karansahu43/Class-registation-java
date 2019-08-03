import java.util.HashSet;

public class Student {
	
	private String studentid;
	private String firstName;
	private String lastName;
	private HashSet <Course> studentCourses;
	private int credithours;

	
	public Student(String firstName, String lastName)
	{
		studentCourses = new HashSet <Course>();
		int random;
		this.firstName = firstName;
		this.lastName = lastName;	
		random = (int) ((Math.random() * ((9998 - 1) + 1)) + 1);
		String f = ""+firstName.charAt(0) + lastName.charAt(0);
		this.studentid =  f  + random+"";
		
	}
	
	public String getstudentid()
	{
		return studentid;
	}
	public String getname()
	{
		return firstName+" "+lastName;
	}
	public void addcourse(Course b)
	{
		this.credithours = this.credithours + b.getcreditHour();
		if (15<this.credithours)
			System.out.println("You can not take more than 15 credit hours. The course was not added");
		if(15>this.credithours)
			studentCourses.add(b);
	}
	public void removeCourse(Course b)
	{
		this.credithours = this.credithours - b.getcreditHour();
		studentCourses.remove(b);
	}
	public void display()
	{
		System.out.println("These is the course or courses the student is taking");
		for(Course b: studentCourses)
		{
			System.out.println(b);
		}
	}
	public String toString()
	{
		return studentid+"::"+firstName+" "+lastName;
	}

}

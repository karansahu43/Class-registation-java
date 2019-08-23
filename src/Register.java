import java.util.HashSet;

public class Register 
{

	private HashSet <Student> enrolledStudent;


	public Register() 
	{
		enrolledStudent = new HashSet<Student>();

	}
	

	public void removeStudent(String studentid)
	{
		for(Student b: enrolledStudent)
		{
			if (b.getstudentid().equals(studentid))
			{
				enrolledStudent.remove(b);
				break;
			}
		}
	}

	public void addStudent(Student b)
	{
		enrolledStudent.add(b);
	}


	public Student searchStudent(String studentid)
	{
		for(Student b: enrolledStudent)
		{
			if (b.getstudentid().equals(studentid))
			{
				return b;	
			}
		}
		return null;
	}
	



	public void display()
	{
		System.out.println("These are the Students enrolled");
		for(Student b: enrolledStudent)
		{
			System.out.println(b);
		}


	}
}


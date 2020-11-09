

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static File courses = new File("Courses.txt");
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) throws FileNotFoundException  {
		

		ArrayList<Course> courselist = new ArrayList<Course>();
		Scanner f = new Scanner(courses);
		int courseid;
		int credithr;
		String coursename;
		
		while (f.hasNext())
		{
			coursename = f.next();
			courseid = Integer.parseInt(f.next());
			credithr = Integer.parseInt(f.next());
			Course c = new Course(courseid, coursename, credithr);
			courselist.add(c);

		}
		f.close();
		
		int choice = 0;
		String selection;
		
		Register register = new Register();

		
		
		
		System.out.println("Welcome to the student class regristration center");
		System.out.println("Please select one of the following options");

		while(choice != 7)
		{
			System.out.println("1. enroll student");
			System.out.println("2. unenroll student");
			System.out.println("3. add course by ID for enrolled student");
			System.out.println("4. drop course from schedule from enrolled student");
			System.out.println("5. search and display student name and schedule");
			System.out.println("7: Exit");
			choice = s.nextInt();
			
			switch(choice)
			{
			
			case 1:

				System.out.println("Please enter first name and last name of student seperated by a space(Example: |John Frankenstein|): ");
				String firstName = s.next();

				String lastName = s.next();
				Student student = new Student(firstName, lastName);			
				register.addStudent(student);
				break; 
			case 2: 
				System.out.println("Which would You like to remove Please make a selection from the list");
				register.display();
				System.out.println("Enter student ID for removal selection");
				selection = s.next();
				register.removeStudent(selection);


				break; 
			case 3:	
				register.display();
				System.out.println("Please type in student id: ");
				selection = s.next();
				Student temp = register.searchStudent(selection);
				System.out.println(courselist);
				System.out.println("Which course would you like to add(enter code): ");
				choice = s.nextInt();
				for(Course b: courselist)
				{
					if (b.getID() == choice)
					{
						temp.addcourse(b);
					}
				}
				break;
			case 4:
				register.display();
				System.out.println("Please type in student id: ");
				selection = s.next();
				Student temp1 = register.searchStudent(selection);
				temp1.display();
				System.out.println("Which course would you like to remove(enter code): ");
				choice = s.nextInt();
				for(Course b: courselist)
				{
					if (b.getID() == choice)
					{
						temp1.removeCourse(b);
					}
				}
				break;
			case 5:
				register.display();
				selection = s.next();
				Student temp11 = register.searchStudent(selection);
				temp11.display();
				
				
				break;

			}//switch
		}//while loop
	}// main
	
}

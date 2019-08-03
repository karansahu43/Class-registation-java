
public class ClassReg 
{
	
	/**
	 * UT registration is just around the corner, but some OU kids
	 * hacked the UT registration system and now the UT kids can't get the
	 * classes they want, and the school is gonna be a disaster. 
	 * In Java, design a system that does the following tasks
	 * 
	 * * Students add courses by ID or name
	 * * Students can drop courses on their schedule
	 * * Students can change courses
	 * * Prints a student's schedule in this format into a text file "schedule.txt"
	 * * Enrolls/ Unenroll students into the system
	 * * Search the system by student name
	 * * Search the system by student ID
	 * 
	 *	______________________________________
	 *	Name: Alan Ngo 
	 *	eID: ahn525
	 *	
	 *	Courses:
	 *	ID								NAME								HOURS
	 * 	===============================================================================
	 * 	123456789						Data Structures							3
	 * 	234567890						Chemistry I								3
	 *  921405034						Philosophy II							3
	 *  839502430						Calculus III							4
	 *  ===============================================================================
	 *  
	 *  Total Hours: 13
	 *  _______________________________________
	 *  
	 *  Additional conditions/Constraints:
	 *  * Total Hours cannot exceed 15
	 *  * You must use an object oriented design
	 *  * Every time a student adds/drops or changes a course, the system MUST
	 *    write the change to "registration.log" in this format
	 *    For every add: 
	 *    (+) Sanjna Sunil added Intro to Human Sexuality 901234783
	 *    For every drop:
	 *    (-) Waleed Rana dropped Discrete Math 993526781
	 *  
	 *  
	 *  * Class IDs are a random 9-digit generated numbers
	 *  * Student IDs are formatted in their first initial, middle initial (if exists) , last initial, a random number up to 9999
	 *  	ex: scs4356
	 *  
	 *	Hints
	 *  * Use FileWriter to write to files
	 *  * Use certain data structures
	 *  * Write functions for specific actions
	 *  * Create the following classes
	 *  	* Student
	 *  	* Registration (already created)
	 *  	* Course
	 *  	* UTReg (main program)
	 *  		MENU
	 *  		0. enroll student  
	 *  		1. unenroll student
	 *  		2. add course by ID
	 *  		3. drop course from schedule
	 *  		4. search by student name
	 *  		5. search by student id
	 *  		6. print schedule for student S
	 * */
}
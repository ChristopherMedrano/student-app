package studentDatabaseApp;

import java.util.Scanner;

/**
 * 
 * Creates student based on name and grade and generates id
 * @author Chris M
 *
 */
public class Student {

	private String fName;
	private String lName; 
	private String studentId;
	private int grade;
	private String courses = null;
	private int balance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter student first name: ");
		this.fName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lName = in.nextLine();
		
		System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student grade level: ");
		this.grade = in.nextInt();
		
		setStudentId();
	}
	
	// Generate student ID
	private void setStudentId() {
		// increment class id every time new student is created
		id++;
		
		// grade level + id
		this.studentId = grade + "" + id;
	}
	
	// Enroll in courses
	public void enroll() {
		// get inside loop, until user hits Q
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses += "\n " + course;
				balance = balance + costOfCourse;
			} else {
				break;
				}
		} while (1 != 0 );
	}
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + balance);
	}
	
	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment amount: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		balance -= payment;
		System.out.println("Thank you for your payment of: " + payment);
		viewBalance();
	}
	
	// Show status 
	public String toString() {
		return "Name: " + fName + " " + lName + 
				"\nGrade Level: " + grade +
				"\nStudent ID: " + studentId + 
				"\nCourses Enrolled: " + courses + 
				"\nBalance: $" + balance;
	}
}
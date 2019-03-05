/**
 * 
 */
package studentDatabaseApp;

import java.util.Scanner;

/**
 * Main application runner for Student registration app. 
 * Refer to readme for additional information on this application
 * 
 * @author Chris M
 *
 */
public class StudentApp {

	public static void main(String[] args) {
		
		// Ask how many students to create
		System.out.println("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		// Create n number of students
		for (int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		
		// Print out students info
		for (int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n].toString());
		}
		
	}

}

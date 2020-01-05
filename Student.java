package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses="";
	private int tuitionBalance;
	private static int costOfCourse=600;
	private static int id=1000;  
    //constructor:prompt user to enter student's name and year
	public Student() {
		Scanner in=new Scanner(System.in); 
		System.out.println("Enter student first name: ");
		this.firstName=in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName=in.nextLine();
		
		System.out.println("1-Freshmen\n2-sophomore\n3-junior\n4-senior\nEnter student grade level: ");
		this.gradeYear=in.nextInt();
	//	System.out.println(firstName+" "+lastName+" "+gradeYear);
		setStudentID();
		//System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentID);
		
	}
	//generate an ID
	private void setStudentID() { 
		//grade level+ID
		id++;
		this.studentID=gradeYear +""+ id;
		
	}
	//enroll an course
	public void enroll() {
		do{
			System.out.println("Enter course to enroll(Q to quit): ");
			Scanner in=new Scanner(System.in);
			String course=in.nextLine();
			if (!course.equals("Q")) {  
				courses=courses+"\n "+course;
				tuitionBalance=tuitionBalance+costOfCourse;
			}else {
				System.out.println("-------------BALANCE-------------");
				break;
			}
			
		}while(1!=0); 
		
		//System.out.println("Enrolled in: "+courses);
		//System.out.println("Tuition balance: "+tuitionBalance);
		
	}
	//view balance
	public void viewBalance() {
		System.out.println("Your balance is: $"+tuitionBalance);
	}
	//pay tuition
	public void payTuition() { 
		viewBalance();
		System.out.println("Enter your payment: $");
		Scanner in=new Scanner(System.in);
		int payment=in.nextInt();
		tuitionBalance=tuitionBalance-payment;
		System.out.println("Thank you for your payment of $"+payment);
		viewBalance();
		System.out.println("---------------------------------");
	}
	//show status
	
	public String showInfo(){
		return "Name: "+firstName+" "+lastName+
				"\nGrade level: "+gradeYear+
				"\nStudent ID: "+studentID+
				"\nCourse Enrolled: "+courses+
				"\nBalance: $"+tuitionBalance;
		
	}
}

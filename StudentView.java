package pkg;

import javax.swing.JOptionPane;

public class StudentView {

	public String vSetRollNo()
	{
		String RollNo = JOptionPane.showInputDialog("Enter your Roll Number");
		return RollNo;
	}
	
	public String vSetName()
	{
		String Name = JOptionPane.showInputDialog("Enter our Name");
		return Name;
	}
	
	public void printStudentDetails(String studentRollNo, String studentName)  // parameters will come from controller class
	{
		System.out.println("- Student Details -");
		System.out.println("Student RollNo: " + studentRollNo);
		System.out.println("Student Name: " + studentName);	
	}
}

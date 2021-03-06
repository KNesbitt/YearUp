import java.util.ArrayList;
import java.util.Scanner;

public class LCRoster 
{
	public static ArrayList<StudentRoster> list = new ArrayList<StudentRoster>();
	static Scanner sc = new Scanner(System.in);

			
	public static void main(String[] args) 
	{
		StudentInformation();
		PrintStudentNames();
	}
	
	public static void StudentInformation()
	{
		System.out.println("What is the student's name?");
		String Name = sc.nextLine();
		System.out.println("What is the student's LC's name?");
		String LcName = sc.nextLine();
		System.out.println("What is the student's ID number?");
		int ID = sc.nextInt();
		sc.nextLine();
		
		StudentRoster nextStudent = new StudentRoster (Name, LcName, ID);
		list.add(nextStudent);
		
		System.out.println("Are you done inputing students? y/n");
		String reply = sc.nextLine();
		
		if (reply.equalsIgnoreCase("n"))
		{
			StudentInformation();
		}
		else
		{
			System.out.println("These are the students.");
		}
	}
	
	public static void PrintStudentNames()
	{
		for (int i = 0; i < list.size(); i++)
			{
				StudentRoster currentStudent = list.get(i);
				System.out.println("Name: " + currentStudent.m_students + " LC Name: " + currentStudent.m_lcName + " Student ID " + currentStudent.m_lcID);
			}
	}
	
}

public class Main {

	public static void main(String[] args) 
	{
		Person Student = new Person ("Kinsler Nesbitt", 19, "678-555-1606", "904 Montauk Pt");
		System.out.println("Students name is " + Student.GetName());
		System.out.println("Students age is " + Student.GetAge());
		System.out.println("Students phone number is " + Student.GetPhoneNumber());
		System.out.println("Students address is " + Student.GetAddress());
		System.out.println("It's June 5,2016 today");
		Student.GrowsOlder();
		System.out.println("Student's age is now " + Student.GetAge());
		
	}

}

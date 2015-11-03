import java.util.ArrayList;
import java.util.Scanner; 
public class ShoppingCart 
{
	public static  ArrayList <Item> shoppingCart = new ArrayList<Item>();
	
	public static void main(String[] args) 
	{
		introduction();
		shoppingCartWork();
		readItems();
	}
	
	public static void introduction()
	{
		// This method prints introduction message
		System.out.println("********************************");
		System.out.println();
		System.out.println("*        Shopping Cart         *");
		System.out.println();
		System.out.println("********************************");
		
	}
	
	public static void shoppingCartWork()
	{
		System.out.println("Do you want to input items? Type y/n");
		Scanner sc = new Scanner(System.in);
		String reply = sc.nextLine();
		
		if (reply.equalsIgnoreCase("y"))
		{
			
		}
		else
		{
			System.out.println("Goodbye!");
		}		
	}
	
	private static void readItems() 
	{	
		System.out.println("Enter next item name or 'quit' to stop:");
		Scanner sc = null;
		String itemName = sc.nextLine();
		
		while(!itemName.equalsIgnoreCase("quit"))
		{			
			System.out.println("Enter next item price:");
			double itemPrice = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter next item quantity:");
			int quantity = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter next item name or 'quit' to stop:");
			itemName = sc.nextLine();
		}		
	}
	
}

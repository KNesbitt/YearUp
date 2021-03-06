
public class ExceptionCentral 
{

	public static void main(String[] args) 
	{
		int[] numbers = {1,3,5,7};
		int[] number = null;
		ArithmeticException();
		NullPointerException(number);
		ArrayIndexOutOfBoundsException(numbers);

	}

	public static void ArithmeticException()
	{
		try
		{
			int num1= 54, num2= 0;
			int total = num1/num2;
			System.out.println ("Difference = " + total);
		}
		catch(ArithmeticException a)
		{
			System.out.println ("Arithmetic Exception: You can't divide an integer by 0");
		}
	}

	public static void NullPointerException(int[] number)
	{
		int sum = 0;
		
		try
		{

			if (number == null)
			{
				System.out.println("The input to add array was a null array");
			}

			for (int i = 0; i <=number.length; i++ )
			{
				sum = sum + number [i];
			}	
		}
			catch(NullPointerException a)
		{
			System.out.println("Sum is " + sum);
		}
	}

	public static void ArrayIndexOutOfBoundsException(int[] numbers)
	{
		int sum = 0;

		if (numbers== null)
		{
			System.out.println("The input to add array was a null array");
			throw new NullPointerException();
		}

		for (int i = 0; i <=numbers.length; i++ )
		{
			sum = sum + numbers [i];
		}

		System.out.println("Sum is " + sum);
	}
}

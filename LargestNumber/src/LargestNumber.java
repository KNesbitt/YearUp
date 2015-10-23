
public class LargestNumber 
{

	public static void main(String[] args) 
	{
	int[] numbersArray = new int[]	{-1, 34, 57, 89, 69, 13, 32};
	FindLargestNumberUsingWhileLoop(numbersArray);
	int[] numbersArray2 = new int [] {2, 4, 6, 8, 10};
	LargestNumberUsingForLoops(numbersArray2);
	
	
	}

	public static void FindLargestNumberUsingWhileLoop(int[] numbers)
	{
		if (numbers != null)
		{
			if (numbers.length > 0)
			{
				int i = 0;
				int largestNumber = numbers[0];
			
				while (i < numbers.length)
				{
					if (largestNumber < numbers[i])
					{
						largestNumber = numbers[i];
					}
					
					i++;
				}
				
				System.out.println("The largest number for While Loop is " + largestNumber); 
			}
		}
	}
	
	public static void LargestNumberUsingForLoops(int[] numbers)
	{
	if (numbers != null)
		{
		if (numbers.length > 0)
			{
				int i;
				int largestNumber = numbers[0];
				for (i = 1; i < numbers.length; i++)
				{
					if ( largestNumber < numbers[i])
					{
						largestNumber = numbers[i];
					}
				}
				System.out.println("The largest number for For Loop is " + largestNumber);
			}
				
		}
	}
}
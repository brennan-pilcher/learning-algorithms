package algo.binarysearch;

public class BinarySearch
{

	public BinarySearch ()
	{
		
	}
	
	public static int search (int targetValue, int[] inputArray)
	{
		int[] input = inputArray;
		
		if (input.length < 1)
		{
			return -1;
		}
		
		int a = 0;
		int b;
		int c = input.length-1;
		
		while (a<=c)
		{
			b = (int) Math.floor((a+c)/2);
			if (input[b]==targetValue) { return b; }
			else if (input[b] > targetValue)
			{
				c = b-1;
			}
			else
			{
				a = b+1;
			}
			
		}
		
		return -1;
	}
	
}

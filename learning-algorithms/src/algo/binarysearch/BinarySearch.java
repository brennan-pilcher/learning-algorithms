package algo.binarysearch;

public class BinarySearch
{

	public BinarySearch ()
	{
		
	}
	
	public static int search (int[] inputArray, int targetValue)
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
	
	public static int recursiveSearch (int[] inputArray, int targetValue, int start, int end)
	{
		int[] input = inputArray;
		
		if (input.length < 1)
		{
			return -1;
		}
		
		int a = start;
		int b;
		int c = end;
		
		if (a<=c)
		{
			b = (int) Math.floor((a+c)/2);
			if (input[b]==targetValue) { return b; }
			else if (input[b] > targetValue)
			{
				return recursiveSearch(input, a, b-1, targetValue);
			}
			else
			{
				return recursiveSearch(input, b+1, c, targetValue);
			}
			
		}
		else
		{
			return -1;
		}
	}
	
}

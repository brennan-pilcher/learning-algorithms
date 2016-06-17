package algo.linearsearch;

public class LinearSearch
{
	
	public LinearSearch ()
	{
		
	}
	
	public static int search(int[] inputArray, int searchTarget)
	{
		int[] input = inputArray;
		
		if (input.length < 1)
		{
			return -1;
		}
		
		
		for (int i = 0; i < input.length; i++)
		{
			if (input[i] == searchTarget)
			{
				return i;
			}
		}
		
		return -1;
	}
	

	public static int recursiveSearch(int[] inputArray, int searchTarget, int i)
	{
		int[] input = inputArray;

		if (input.length < 1 || i >= input.length) { return -1; }
		
		else if (input[i] == searchTarget)
		{
			return i;
		}
		else
		{
			return recursiveSearch(input, searchTarget, i+1);
		}
	}
	
}

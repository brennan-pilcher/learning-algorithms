package algo.linearsearch;

public class LinearSearch
{
	
	public LinearSearch ()
	{
		
	}
	
	public long search(int[] input, int searchTarget)
	{
		int[] inputArray = input;
		
		for (int i = 0; i < inputArray.length; i++)
		{
			if (inputArray[i] == searchTarget)
			{
				return i;
			}
		}
		
		return -1;
	}
	
}

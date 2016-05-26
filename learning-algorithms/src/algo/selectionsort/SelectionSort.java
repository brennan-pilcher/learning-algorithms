package algo.selectionsort;

public class SelectionSort
{

	public SelectionSort ()
	{
		
	}
	
	public int[] sort (int[] inputArray)
	{
		int[] sorted = inputArray;
		for (int i = 0; i < sorted.length; i ++)
		{
			int indexOfMinimum = i;
			for (int j = i + 1; j < sorted.length; j++)
			{
				if (sorted[j] < sorted[indexOfMinimum])
				{
					indexOfMinimum = j;
				}
				int swap = sorted[i];
				sorted[i] = sorted[indexOfMinimum];
				sorted[indexOfMinimum] = swap;
			}
		}
		
		return sorted;
	}
	
}

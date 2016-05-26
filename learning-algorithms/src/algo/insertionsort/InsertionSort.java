package algo.insertionsort;

public class InsertionSort
{

	public InsertionSort ()
	{
		
	}
	
	public static int[] sort (int[] inputArray)
	{
		int[] sorted = inputArray;
		
		for (int i = 1; i < sorted.length; i++)
		{
			int j = i-1;
			int element = sorted[i];
			while (j >= 0 && sorted[j] > element) // while in the range of values to examine AND 'element' is greater than its preceding value
			{
				sorted[j+1] = sorted[j];
				j--;
			}
			sorted[j+1] = element; // this line executes once 'element' is NOT greater than its preceding value OR j < 0
			
			System.out.print(i + ": {");
			for (int q = 0; q < sorted.length; q++)
			{
				System.out.print(sorted[q] + " ");
			}
			System.out.print(" }\n");
		}
		
		return sorted;
	}
	
}

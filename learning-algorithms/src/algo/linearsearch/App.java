package algo.linearsearch;

public class App
{
	
	public static void main (String[] args)
	{
		
		int[] myArray = { 4, 5, 10, 35, 1, 7 };
		
		System.out.println( LinearSearch.search(myArray, 1) );
		

		System.out.println( LinearSearch.recursiveSearch(myArray, 1, 0) );
	}
	
	
}

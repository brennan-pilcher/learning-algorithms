package algo.linearsearch;

public class App
{
	
	public static void main (String[] args)
	{
		LinearSearch linearSearch = new LinearSearch();
		
		int[] myArray = { 4, 5, 10, 35, 1, 7 };
		
		System.out.println( linearSearch.search(myArray, 1) );
	}
	
	
}

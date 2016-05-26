package algo.binarysearch;

public class App {

	public static void main(String[] args)
	{
		
		
		int[] myArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println( BinarySearch.search(myArray, 7) );
		
		System.out.println( BinarySearch.recursiveSearch(myArray, 11, 0, myArray.length-1) );

	}

}

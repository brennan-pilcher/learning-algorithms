package algo.selectionsort;

public class App {

	public static void main(String[] args) 
	{

		SelectionSort selectionSort = new SelectionSort();
		int[] myArray = selectionSort.sort(new int[] {5, 30, 2, 15, 13, 63, 12, 22});
		
		System.out.print("[ ");
		for (int i = 0; i < myArray.length; i ++)
		{
			System.out.print(myArray[i] + " ");
		}
		System.out.print("]");
	}

}

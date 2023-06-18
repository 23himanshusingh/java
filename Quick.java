// Java implementation of QuickSort
import java.io.*;

public class Quick {

	// A utility function to swap two elements
	static void swap(int[] arr, int i, int j)   
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/* This function takes last element as pivot, places
	the pivot element at its correct position in sorted
	array, and places all smaller (smaller than pivot)
	to left of pivot and all greater elements to right
	of pivot */
	public static int partition(int[] arr, int low, int high)
	{

		// pivot
		int pivot = arr[high];

		// Index of smaller element and
		// indicates the right position
		// of pivot found so far
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			// If current element is smaller
			// than the pivot
			if (arr[j] < pivot) {

				// Increment index of
				// smaller element
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	/* The main function that implements QuickSort
			arr[] --> Array to be sorted,
			low --> Starting index,
			high --> Ending index
	*/
	public static void quickSort(int[] arr, int low, int high)
	{
		if (low < high) {

			// pi is partitioning index, arr[p]
			// is now at right place
			int pi = partition(arr, low, high);

			// Separately sort elements before
			// partition and after partition
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	// Function to print an array
	public static void printArray(int[] arr, int size)
	{
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver Code
	public static void main(String[] args)
	{
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;

		quickSort(arr, 0, n - 1);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}
}

// This code is contributed by Ayush Choudhary

// // Java implementation of QuickSort
// // using Hoare's partition scheme
// import java.io.*;

// class GFG {

// 	/* This function takes first element as pivot, and
// 	places all the elements smaller than the pivot on the
// 	left side and all the elements greater than the pivot
// 	on the right side. It returns the index of the last
// 	element on the smaller side*/
// 	static int partition(int[] arr, int low, int high)
// 	{
// 		int pivot = arr[low];
// 		int i = low - 1, j = high + 1;

// 		while (true) {
// 			// Find leftmost element greater
// 			// than or equal to pivot
// 			do {
// 				i++;
// 			} while (arr[i] < pivot);

// 			// Find rightmost element smaller
// 			// than or equal to pivot
// 			do {
// 				j--;
// 			} while (arr[j] > pivot);

// 			// If two pointers met.
// 			if (i >= j)
// 				return j;
// 			int temp = arr[i];
// 			arr[i] = arr[j];
// 			arr[j] = temp;
// 			// swap(arr[i], arr[j]);
// 		}
// 	}

// 	/* The main function that
// 	implements QuickSort
// 	arr[] --> Array to be sorted,
// 	low --> Starting index,
// 	high --> Ending index */
// 	static void quickSort(int[] arr, int low, int high)
// 	{
// 		if (low < high) {
// 			/* pi is partitioning index,
// 			arr[p] is now at right place */
// 			int pi = partition(arr, low, high);

// 			// Separately sort elements before
// 			// partition and after partition
// 			quickSort(arr, low, pi);
// 			quickSort(arr, pi + 1, high);
// 		}
// 	}

// 	/* Function to print an array */
// 	static void printArray(int[] arr, int n)
// 	{
// 		for (int i = 0; i < n; i++)
// 			System.out.print(" " + arr[i]);
// 		System.out.println();
// 	}

// 	// Driver Code
// 	static public void main(String[] args)
// 	{
// 		int[] arr = { 10, 7, 8, 9, 1, 5 };
// 		int n = arr.length;
// 		quickSort(arr, 0, n - 1);
// 		System.out.println("Sorted array: ");
// 		printArray(arr, n);
// 	}
// }
// */

// // This code is contributed by vt_m.


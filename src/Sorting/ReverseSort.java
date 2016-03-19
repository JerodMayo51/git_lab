package Sorting;
public class ReverseSort {
	/**
	 * reverseSort				sorts an array of integers using bubble sort
	 * 							in reverse order.
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] reverseSort(int[] unsortedArray) {
   	boolean changed;

   	do {
   		changed = false;
   		for (int i = 0; i < array.length - 1; i++) {
   			if (array[i] < array[i+1]) {
   				int temp = array[i];
   				array[i] = array[i+1];
   				array[i+1] = temp;
   				changed = true;
   			}
   		}
   	} while (changed);

    return array;
	}
}

package dataStructures.selectionSort;

public class SelectionSort {

	// SelectionSort Complexity - O(n²)
	public static <T extends Comparable<T>> void selectionSort(T[] array) {
		for (int i = 0; i < array.length; i++) {
			int minimumValue = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[minimumValue].compareTo(array[j]) > 0) {
					minimumValue = j;
				}
			}
			if (minimumValue != i) {
				T aux = array[i];
				array[i] = array[minimumValue];
				array[minimumValue] = aux;
			}
		}
	}

}

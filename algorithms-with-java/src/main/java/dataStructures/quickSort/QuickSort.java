package dataStructures.quickSort;

public class QuickSort {

	public static <T extends Comparable<T>> void quickSort(T[] array, Integer first, Integer last) {
		if (first == null)
			first = 0;
		if (last == null)
			last = array.length;

		if (first < last) {
			int partition = partition(array, first, last);
			quickSort(array, first, partition - 1);
			quickSort(array, partition + 1, last);
		}
	}

	private static <T extends Comparable<T>> int partition(T[] array, Integer first, Integer last) {
		T pivot = array[first];
		int i = first + 1;
		int j = last;

		while (i <= j) {
			if (pivot.compareTo(array[i]) >= 1)
				i++;
			else if (array[j].compareTo(pivot) >= 1)
				j--;
			else {
				T aux = array[i];
				array[i] = array[j];
				array[j] = aux;
				i++;
				j--;
			}
		}

		array[first] = array[j];
		array[j] = pivot;

		return j;
	}

}

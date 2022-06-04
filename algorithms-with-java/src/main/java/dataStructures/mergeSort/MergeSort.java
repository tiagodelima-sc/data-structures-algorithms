package dataStructures.mergeSort;

public class MergeSort {

	public static <T extends Comparable<T>> void mergeSort(T[] array, Integer first, Integer last) {
		if (first == null)
			first = 0;
		if (last == null)
			last = array.length;

		if (last - first > 1) {
			int half = (last + first) / 2;
			mergeSort(array, first, half);
			mergeSort(array, half, last);
			merge(array, first, half, last);
		}
	}

	private static <T extends Comparable<T>> void merge(T[] array, Integer first, Integer half, Integer last) {
		T[] leftArray = (T[]) new Comparable[half];
		T[] rightArray = (T[]) new Comparable[last - half];

		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = array[i];
		}

		for (int i = 0; i < rightArray.length; i++) {
			rightArray[i] = array[i + half];
		}

		int startArrayLeft = 0, startArrayRight = 0, currentIndex = 0;
		while (startArrayLeft < leftArray.length && startArrayRight < rightArray.length) {
			if (leftArray[startArrayLeft].compareTo(rightArray[startArrayRight]) >= 1) {
				array[currentIndex] = rightArray[startArrayRight];
				startArrayRight++;
			} else {
				array[currentIndex] = leftArray[startArrayLeft];
				startArrayLeft++;
			}
			currentIndex++;
		}

		while (startArrayLeft < leftArray.length) {
			array[currentIndex] = leftArray[startArrayLeft];
			startArrayLeft++;
			currentIndex++;
		}

		while (startArrayRight < rightArray.length) {
			array[currentIndex] = rightArray[startArrayRight];
			startArrayRight++;
			currentIndex++;
		}
	}

}

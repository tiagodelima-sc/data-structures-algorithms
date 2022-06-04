package dataStructures.quickSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuickSortTest {
	Integer[] array;
	Character[] arrayChar;

	@BeforeEach
	public void init() {
		array = new Integer[] { 5, 3, 1, 2, 4 };
		arrayChar = new Character[] { 'c', 'e', 'a', 'd', 'b' };
	}

	@Test
	public void testSort() {
		Integer[] expected = new Integer[] { 1, 2, 3, 4, 5 };
		Character[] expectedChar = new Character[] { 'a', 'b', 'c', 'd', 'e' };
		QuickSort.quickSort(array, 0, array.length - 1);
		QuickSort.quickSort(arrayChar, 0, array.length - 1);
		assertArrayEquals(expected, array);
		assertArrayEquals(expectedChar, arrayChar);
	}

}

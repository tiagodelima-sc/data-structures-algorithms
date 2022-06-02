package dataStructures.bubbleSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

	Integer[] array;
    Character[] arrayChar;
    String[] arrayString;

    @BeforeEach
    public void init() {
        array = new Integer[]{5, 3, 1, 2, 4};
        arrayChar = new Character[]{'c', 'e', 'a', 'd', 'b'};
        arrayString = new String[] {"bca", "abc", "cad", "bbb"};
    }

    @Test
    public void testSort() {
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5};
        Character[] expectedChar = new Character[]{'a', 'b', 'c', 'd', 'e'};
        String[] expectedString = new String[]{"abc", "bbb", "bca", "cad"};

        BubbleSort.bubbleSort(array);
        BubbleSort.bubbleSort(arrayChar);
        BubbleSort.bubbleSort(arrayString);

        assertArrayEquals(expected, array);
        assertArrayEquals(expectedChar, arrayChar);
        assertArrayEquals(expectedString, arrayString);
    }
}

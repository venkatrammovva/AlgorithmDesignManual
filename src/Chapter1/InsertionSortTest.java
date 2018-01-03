package Chapter1;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {
	private InsertionSort sort = new InsertionSort();

	@Test
	public void testEmptyInput() {
		Assert.assertArrayEquals(new int[0], sort.insertionSort(new int[0]));
	}

	@Test
	public void testArrayOfSingleInput() {
		int[] inputWithOneElement = new int[] { 3 };
		Assert.assertArrayEquals(inputWithOneElement, sort.insertionSort(inputWithOneElement));
	}

	@Test
	public void testArrayWithMoreLength() {
		int[] inputWithOneElement = new int[] { 3, 2, 1 };
		int[] sortedArray = new int[] { 1, 2, 3 };
		Assert.assertArrayEquals(sortedArray, sort.insertionSort(inputWithOneElement));
	}

	@Test
	public void testArrayWithMoreLength2() {
		int[] inputWithOneElement = new int[] { 2, 3, 1 };
		int[] sortedArray = new int[] { 1, 2, 3 };
		Assert.assertArrayEquals(sortedArray, sort.insertionSort(inputWithOneElement));
	}

	@Test
	public void testArrayWithMoreLength3() {
		int[] inputWithOneElement = new int[] { 4, 2, 7, 3, 6, 1, 5 };
		int[] sortedArray = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		Assert.assertArrayEquals(sortedArray, sort.insertionSort(inputWithOneElement));
	}
}

import java.util.Arrays;

import junit.framework.TestCase;


public class SortTest extends TestCase {
	public void testBubbleSort() {
		int[] intArr = {3, 2, 1};
		ISort sort = Sort.create("BubbleSort");
		sort.setIntArr(intArr);
		sort.doSort();
		assertTrue(Arrays.equals(new int[]{1,2,3}, sort.getIntArr()));
	}
	
	public void testQuickSort() {
		int[] intArr = {3, 2, 1};
		ISort sort = Sort.create("QuickSort");
		sort.setIntArr(intArr);
		sort.doSort();
		assertTrue(Arrays.equals(new int[]{1,2,3}, sort.getIntArr()));
	}
}

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

public class QuickSort extends Sort {
	public void doSort() {
		quickSort(0, this.intArr.length - 1);
	}
	
	private void quickSort(int left, int right) {
		int pivot = intArr[left + (right - left)/2];
		int i = left;
		int j = right;
		
		while (i <= j) {
			while (intArr[i] <= pivot) {
				i++;
			}
			
			while (intArr[j] > pivot) {
				j--;
			}
			
			if (i <= j) {
				int temp = intArr[i];
				intArr[i] = intArr[j];
				intArr[j] = temp;
			}
		}
	
		System.out.println("quick");
		
		if (left < j)  quickSort(left, j);
		if (i < right)  quickSort(i, right);
	}
}

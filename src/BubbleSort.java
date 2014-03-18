
public class BubbleSort extends Sort {
	public void doSort() {
		for (int i = 1; i < this.intArr.length; i++) {
			for (int j = 0; j < this.intArr.length - i ; j++) {
				if (intArr[j] > intArr[j+1]) {
					int temp = intArr[j];
					intArr[j] = intArr[j+1];
					intArr[j+1] = temp;
				}
			}
		}
	}
}

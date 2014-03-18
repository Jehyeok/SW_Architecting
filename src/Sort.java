import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

public class Sort implements ISort {
	protected int[] intArr;
	
	@Override
	public int[] getIntArr() {
		return this.intArr;
	}
	
	@Override
	public void setIntArr(int[] intArr) {
		this.intArr = intArr;
	}
	
	@Override
	public void doSort() {
		
	}

	public static ISort create(String string) {
		if ("QuickSort".equals(string)) {
			return new QuickSort();
		} else if ("BubbleSort".equals(string)) {
			return new BubbleSort();
		} else {
			return null;
		}
	}
}

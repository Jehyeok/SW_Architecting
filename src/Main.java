import java.io.File;
import java.util.Scanner;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;


public class Main {

	public static void main(String[] args) {
		Serializer serializer = new Persister();
        File source = new File("sort.xml");
        SortSelector sortSelector = null;
        
        // 입력할 데이터
        int[] intArr = {3, 2, 1};
        ISort sort;
        
        try {
            sortSelector = serializer.read(SortSelector.class, source);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Scanner scanner = new Scanner(System.in);
        
        // 입력에 따라 정렬 방법 다름 
        System.out.print("QuickSort는 0 입력, BubbleSort는 1 입력");
        int number = scanner.nextInt();
        
        sort = Sort.create(sortSelector.getMethods()[number]);
        sort.setIntArr(intArr);
        sort.doSort();
        
        for (int i : sort.getIntArr()) {
			System.out.print(i + " ");
		}
	}
}

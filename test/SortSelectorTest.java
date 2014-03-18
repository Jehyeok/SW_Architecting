import java.io.File;

import junit.framework.TestCase;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;


public class SortSelectorTest extends TestCase {
	public void testReadXML() {
		Serializer serializer = new Persister();
        File source = new File("sort.xml");
        SortSelector sortSelector = null;
        try {
            sortSelector = serializer.read(SortSelector.class, source);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertTrue(sortSelector.getMethods()[0].equals("QuickSort"));
        assertTrue(sortSelector.getMethods()[1].equals("BubbleSort"));
	}
}

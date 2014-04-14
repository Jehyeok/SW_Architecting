import org.simpleframework.xml.ElementArray;
import org.simpleframework.xml.Root;

@Root
public class SortSelector {
	@ElementArray
	private String[] methods;
	
	public SortSelector() {};
	public SortSelector(String[] strings) {
		this.methods = strings;
	}

	public String[] getMethods() {
		return methods;
	}
}

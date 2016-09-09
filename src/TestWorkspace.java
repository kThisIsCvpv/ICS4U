import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestWorkspace {

	public static void main(String[] args) throws Exception {
		List<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList("a", "c", "b"));
		list.stream().forEach(name -> System.out.println(name));
	}
}

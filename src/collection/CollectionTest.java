package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionTest {

	public static void main(String[] args) {
		Collections.emptyMap();
		Collections.unmodifiableList(new ArrayList<String>());
		Collections.singletonList(new Object());
		Collections.synchronizedList(new ArrayList<String>());
	}

}

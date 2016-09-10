import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
public class Generics {
	public <E> E returnTheGenericValue(E value) {
		return value;
	}

	public <E extends Comparable<E>> E returnTheGreaterValue(E value1, E value2) {
		if(value1.compareTo(value2)>0)
			return value1;
		if(value2.compareTo(value1)>0)
			return value2;
		else
			return null;
	}
	@Test
	public void genericClassTestMethod() {
		Generics genclass = new Generics();
		Assert.assertEquals(9, (int) genclass.returnTheGreaterValue(0, 9));
	}

}

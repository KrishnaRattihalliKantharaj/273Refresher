import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;

public class InterfacesTest {

	public interface Interfaces {
		int area(int a,int b,int c);
		int volume(int a,int b,int c);
	}
	public class cube implements Interfaces{
		public int area(int a,int b,int c){
			int ar = 6*a*a;
			System.out.println("Area of cube :"+ar);
			return ar;
		}
		public int volume(int a,int b,int c){
			int vl = a*a*a;
			System.out.println("volume of cube :"+vl);
			return vl;
		}
	}
	public class cuboid implements Interfaces{
		public int area(int a,int b,int c){
			int ar = 2*(a+b+c);
			System.out.println("Area of cuboid :"+ar);
			return ar;
		}
		public int volume(int a,int b,int c){
			int vl = a*b*c;
			System.out.println("Volume of cuboid :"+vl);
			return vl;
		}
	}
	@Test
	public void test(){
		cube obj1 = new cube();
		assertEquals(obj1.area(2,0,0),24);
		assertEquals(obj1.volume(2,0,0),8);
		cuboid obj2 = new cuboid();
		assertEquals(obj2.area(2,2,2),12);
		assertEquals(obj2.volume(2,2,2),8);
	}
}

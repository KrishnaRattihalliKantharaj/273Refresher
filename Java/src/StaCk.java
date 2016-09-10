import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
public class StaCk{
	public void AddElement(String a){
		Stack<String> k= new Stack<String>();
		k.push(a);
		System.out.println("the content of the stack is: "+k);
	}
	@Test
	public void TestStack(){
		Scanner str=new Scanner(System.in);
		System.out.println("please enter your name and also make sure it is less than 10 character: ");
		String s1 = str.nextLine();
		
		System.out.println("string length is: "+s1.length());
		AddElement(s1);
		assertTrue(s1.length()<= 10);
	}
}

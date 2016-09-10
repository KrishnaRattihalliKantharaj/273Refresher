import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
public class IQueue {
	public Queue<Integer> Ele = new LinkedList<Integer>();
	public void AddElement(int x){
			Ele.offer(x);
			}			
	public void RemoveElement(){
		Ele.poll();
	}
	public int peek(){
		if(Ele.size()>0){
			return Ele.peek();
		}
		else{
			return 0;
		}		
	}
	@Test
	public void testStack(){
		AddElement(33);
		AddElement(15);
		RemoveElement();
		AddElement(55);
		assertEquals(peek(),15);
	}
}

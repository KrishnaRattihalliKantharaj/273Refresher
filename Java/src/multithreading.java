import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
public class multithreading {
	class A extends Thread{
		public void show(){
			for(int i=1;i<=5;i++){
				System.out.println("hi");
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		public void run(){
			show();
		}
	}
	public class B extends Thread {
		public void show(){
			for(int i=1;i<=5;i++){
				System.out.println("hello");
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		public void run(){
			show();
		}
	}
	@Test
	public void test(){
		A obj = new A();
		B obj1 = new B();
		obj.start();
		obj1.start();
	}
}
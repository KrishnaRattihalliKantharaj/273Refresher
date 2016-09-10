import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
public class Arrays {
	public int arr[];
	public int Greatest(int array[],int n){
		int greatest=array[0];
		for(int i=0;i<n;i++){
			if(arr[i]>greatest){
				greatest=arr[i];
			}
		}
		System.out.println("greatest element is: "+greatest);
		return greatest;
	}
	@Test
	public void test() {
		System.out.println("enter the number of elements in the array: ");
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		
		arr=new int[n];
		System.out.println("enter the elements :");
		for(int i=0;i<n;i++){
			arr[i]=read.nextInt();
		}
		assertEquals(Greatest(arr,n),34);
	}

}

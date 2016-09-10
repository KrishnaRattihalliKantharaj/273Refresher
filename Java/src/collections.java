import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
public class collections {
    public Set<String> FirstSet;
    public Set<String> SecondSet;
    @Before
    public void setUp() {
        FirstSet = new HashSet<String>();
        Scanner val1=new Scanner(System.in);
        System.out.println("please enter the User name: ");
        String value1 = val1.nextLine();
        FirstSet.add(value1);
        SecondSet = new HashSet<String>();
        Scanner val2=new Scanner(System.in);
        System.out.println("please enter the user name again: ");
        String value2 = val2.nextLine();
        SecondSet.add(value2);
        if(value1.compareTo(value2)==0){
        	System.out.println("The user name mathched");
        }
        else{
        	System.out.println("The username did not match");
        }
    }

    @Test
    public void testEqualSets() {
        assertEquals( FirstSet, SecondSet );
    }
}
package ArrayListRahulShetty;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample 
{ 
	//HashSet,treeset and LinkedHashSet Implements the Set Interface
	// can not accept duplicate values
	//No Guarantee the elements stored in sequential Order and store in Random Order
	
	
	public static void main(String[] args) 
	{ // TODO Auto-generated method stub

		HashSet<String> a=new HashSet<String>(); 
a.add("rahul");
a.add("java");
a.add("java");
System.out.println(a);
a.remove("java");
System.out.println(a.isEmpty());
System.out.println(a.size());

//a.add(0, "student");// //Not Applicable for HashSet
System.out.println(a);
/*a.remove(1); 
 * a.remove("java");
 *  System.out.println(a);*/
//System.out.println(a.get(2));//Not Applicable for HashSet
// testing 
System.out.println(a.contains("java"));
//System.out.println(a.indexOf("rahul"));//Not Applicable for HashSet

Iterator<String> hs=a.iterator();
while(hs.hasNext())
{
System.out.println(hs.next());
} 
}
}

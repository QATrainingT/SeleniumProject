package ArrayListRahulShetty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	// HashSet,treeset and LinkedHashSet Implements the Set Interface
	// can not accept duplicate values
	// No Guarantee the elements stored in sequential Order and store in Random
	// Order

	public static void main(String[] args) { // TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Anil");
		hm.put(2, "Gottipati");
		hm.put(3, "Kumar");
		System.out.println(hm.get(1));
		
		Set sn=hm.entrySet();
		Iterator a=sn.iterator();
		while(a.hasNext())
		{
			Map.Entry mp=(Map.Entry)a.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		

	}
}

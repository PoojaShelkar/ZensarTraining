package HashMapCW;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {
public static void main(String[] args) {
	HashMap<String,Integer> hm=new HashMap<>();
	hm.put("B",90);// object entry
	hm.put("X",91);
	hm.put("M",78);
	hm.put("R",89);
	hm.put("P",90);
	
	//get(key)
	System.out.println(hm.get("P"));
	System.out.println(hm.size());
	System.out.println(hm.isEmpty());
	System.out.println(hm.containsKey("Pooja"));
	System.out.println(hm.containsValue(90));
	
	//to iterate over hashmap using keys
	
	Set<String> kk=hm.keySet();
	System.out.println(kk);
	
	for(String k:kk)
		System.out.println(k+ "->"+hm.get(k));
	
	//2 iterate over entry object
	Set<Entry<String,Integer>> ee=hm.entrySet();
	
	for(Entry<String,Integer> e:ee)
	{
		System.out.println(e.getKey() + "-->"+e.getValue());
	}
	
	//3 iterate over values of hashmap
	Collection<Integer> c=hm.values();
	
	for(Integer i:c)
		System.out.println(i);
	
	}
	}

	
	
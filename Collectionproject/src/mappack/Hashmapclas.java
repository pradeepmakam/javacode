package mappack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmapclas {

	public static void main(String[] args) {
	
		
	//	Hash map stores on basis of key and value pair
		//implements map interface
		//inherits abstract maps class
		//contains only unique elements
		//it maintains no order 
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		//hash set and hashmap uses concept of hashcode so no printing of things in sequence
		
		hm.put(1, "Selenium");
		hm.put(2, "qtp");
		hm.put(3, "testcomplete");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		//to print all values
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		//hm.entryset will store the complete values available in hash map and  m is a reference which iterate through keys 
		
		//to remove methods
		hm.remove(1);
		
		System.out.println(hm);
		//it does not remove like in list concept entire record will be deleted
		
		HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
		
		emp.put(1, new Employee("tom",25,"admin"));
		emp.put(2, new Employee("peter",26,"qa"));
		emp.put(3, new Employee("steve",27,"dev"));
		
		for(Map.Entry<Integer, Employee> aw:emp.entrySet())
			
		{
			
			int i= aw.getKey();
			Employee em=aw.getValue();
			
			System.out.println(em.age+" "+em.dept+" "+em.name);
			
			
		}
	//keyset method
		//keyset gives us set of keys
		Map<Integer,String> hmap=new HashMap<Integer,String>();
		
		
		hmap.put(1, "hi");
		hmap.put(2, "hello");
		hmap.put(3, "goodbye");
		
		
		Set<Integer> key = hmap.keySet();
		//keys cannot be repeated but values can be repeated
		
		for(Integer i:key)
		{
			System.out.println(hmap.get(i)+"  "+i);
		}
	
		
		//or
	for(int i : hmap.keySet())
	{
		System.out.println(hmap.get(i)+ " "+i);
	}
		//in map.entry and entryset u get whole entry that is both key and value
	//entry is a nested interface in map interface
	//in keyset we get only values by giving keys
		
	//entry is interface which used to traverse whole employee list
	//hashmap is non synchronized
	//hashtable is synchronized-not thread safe
	//cocurrent modification exception --
		//when 1 thread is adding or removing value and at same time concurrently other threads also trying to access particular value then it gives concurrent modification exception
	
	
	
	
	
	}

}

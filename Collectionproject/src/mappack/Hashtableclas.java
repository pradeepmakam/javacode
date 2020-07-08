package mappack;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Hashtableclas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//hash map is non synchronised
		//hashtable is synchronized
		//non null object can be used as a 
	//	key-->object-->hashcode
	//	key is stored in form of object and each and every object inside java is having special unique identifier called hashcode
	//hashcode is unique 32 bit code given to each object by jvm
	
		Hashtable h1=new Hashtable();
		
		
		h1.put(1, "tom");
		h1.put(2, "test");
		h1.put(3, "java");
		Hashtable h2=new Hashtable();
		h2=(Hashtable)h1.clone();
		System.out.println("values from h1 "+h1);
		System.out.println("values from h2"+h2);
		h1.clear();
		
		System.out.println("values from h1 "+h1);
		System.out.println("values from h2"+h2);
		
		//contains
		
		Hashtable ST=new Hashtable();
		
		ST.put("a", "naveen");
		ST.put("b", "manager");
		ST.put("c", "selenium");
		if(ST.contains("naveen"))
		{
			System.out.println("value there");
		}
		
		//to access all values --->enumeration
		
		ST.elements();
		//all elements are stored if we use .elements method
		//use enumeration to fetch values sequentially
	Enumeration t=	ST.elements();
	
	System.out.println("print values from ST");
	
	while(t.hasMoreElements())
	{
		System.out.println(t.nextElement());
	}
	
		//get all values by using entry set
	
	
	Set s=ST.entrySet();
	System.out.println(s);
	
	Hashtable ST1=new Hashtable();
	
	ST1.put("a", "naveen");
	ST1.put("b", "manager");
	ST1.put("c", "selenium");
	
	//checking both hashtable objects equal or not
	
	if(ST.equals(ST1))
	{
		System.out.println("print both are equal");
	}
	
	//get the value from a key
	
	System.out.println(ST1.get("a"));
	
	
	//returns hashcode value  of particular hashtable
	
	System.out.println(ST1.hashCode());
	
	//hashtable COntains unique elements no duplicates 
	//cannot have null key or value
	
	//ST1.put(null, "value");-->gives null pointer exception
		
	}

}

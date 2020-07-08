package SetPackag;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetDemo {

	public static void main(String[] args) {
		
		
		Set<Integer> i =new HashSet<Integer>();
	//hashset is a class implements hashset
		
		i.add(6);
		i.add(5);
		i.add(23);
		i.add(43);
		
		System.out.println(i);
//set will only take unique values
		i.add(6);
		
		//and values are not coming in a  sequence 
	//and cannot add duplicate values
		
		
		//if want to get values in order use treeset
		//to import ctrl+shift+o
		Set<Integer> ia =new TreeSet<Integer>();
		
		
		
	}

}

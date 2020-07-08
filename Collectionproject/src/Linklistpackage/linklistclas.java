package Linklistpackage;
import java.awt.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class linklistclas {

	public static void main(String[] args) {
		//dynamic array which stores date in form of
		//1.actual data
		//2.reference of next node
		
//		in link list each and every node divided to 2 parts
//		1.data
//		2.reference to next node
		
		//head refers to first node and last reference node points to nothing 

		//this is called singly linked list
		
		//each and every node stores the reference of next element
		
		
		LinkedList<String>ll=new LinkedList <String>();
		
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("rpa");
		ll.add("rft");
		System.out.println(ll);
		
		//if u want to add something at starting then
		ll.addFirst("pra");
		System.out.println(ll);
	
	//add last
		
		ll.addLast("oiu");
	
		System.out.println(ll);
	
	//how to get and set value
		
		System.out.println(ll.get(0));
	
	System.out.println(ll.get(1));
	//how to add item anywhere we want
	ll.add(2, "liu");
	
	System.out.println(ll + "list");
	
	ll.set(0, "tom");
	System.out.println(ll);
	//oth value gets replaced by tom in place of pra
	
	//remove first and last element
	ll.removeLast();
	
	System.out.println(ll);
	
	ll.remove(2);
	System.out.println(ll);
	//to sort values 
	Collections.sort(ll);
	System.out.println("sorted lsit");
	System.out.println(ll);
	//for loop
	//advanced for loop
	//iterator
	//while loop
	
	//1.for loop
	
	for(int i=0;i<ll.size();i++)
	{
		System.out.println(ll.get(i));
	}
	
	
	//2.advanced for loop
	System.out.println("seperA...............tor");
	for(String ss:ll)
	{
		System.out.println(ss);
	}
	//3.iterator
	System.out.println("ssssssssssssssssssssss");
	Iterator<String> lt=ll.iterator();
	
	while(lt.hasNext())
	{
		String ls=lt.next();
		
		System.out.println(ls);
		
	}
	
	//4.listiterator forward without generics 
	System.out.println("......................................");
ListIterator lt1=	ll.listIterator();
	
	while(lt1.hasNext())
	{
		String sre=(String) lt1.next();
		System.out.println(sre);
		
		
	}
	
	//5.listiterator backwords
	
	System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
	
	ListIterator<String> lt12=	ll.listIterator(ll.size());
	
	while(lt12.hasPrevious())
	{
		String se=lt12.previous();
		
		System.out.println(se);
	}
	
	//linked list vs arraylist
	
	//both are implementing list interface
	
	//we can add values as per req
	//we can expand or shrink size of a arraylist
	//arraylist works on principle of dynamic array
	//linkedlist works on principle of double linked list
	//while assigning values in between linkedlist is fast
	
	
	
	}
}

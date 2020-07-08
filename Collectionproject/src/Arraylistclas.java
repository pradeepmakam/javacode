import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class Arraylistclas {

	
	
           
	
	
	
	public static void main(String[] args) {
		int a[] =new int[6];
		
		
		a[0]=8;
		
		Object value[] =new Object[8];
		
		value[0]=6;
		value[1]="lki";
		//we can have any datatype value if we use object
		
		//since they r fixed to have any size we want we go fr collection
		
		Collection valu=new ArrayList();
		
		//but with collection we cannot get whatever methods we want like adding element at any place we want etc
		
		//so using list interface
		//arraylist
		
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		
		System.out.println(ar);
		System.out.println(ar.size());//size of array 
		ar.add(40);
		ar.add(50);
		System.out.println(ar);
		System.out.println(ar.size());//arraylist is dynamic in nature we can store n number of values 
		System.out.println(ar.get(2));//to get the value frm particular index
		//properties of arraylist
		//1.it can contain duplicate values
		//2.it maintains insertion order
		//3.it is not synchronised
		//4.it allows random access to fetch any element,because it stores values on basis of indexes
		//so to print values we can use for loop and iterator
		
		
		//using for loop
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		//non generic vs generics
		
		//if we parameterise and provide particular datatype  while defining then is called generics
		//here untill now i can add any type of data type
		//example
		ar.add("s");
		ar.add("100");
		ar.add(1.09);
		
		System.out.println(ar);
		
		//so to define with generics and store particular datatype we use generics
		
		//so use wrapper classes
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(800);
		//now we cant add otherdatatype values can add only integers ,this concept is called generics
		
		ArrayList<String> ar12=new ArrayList<String>();
		
		//we can store different types of userdefined class objects as well
		
		//
		
		Employee e1=new Employee("naveen",27,"qa");
		Employee e2=new Employee("tom",21,"dev");
		Employee e3=new Employee("peter",25,"support");
		
		//create arraylist
		ArrayList<Employee> ar123=new ArrayList<Employee>();
		
		ar123.add(e1);
		ar123.add(e2);
		ar123.add(e3);
		//iterator to traverse values
		//employee type i will be storing in iterator
		Iterator<Employee> it=ar123.iterator();
		while(it.hasNext())//boolean value which says weather value is present or not
		{
			Employee emp =it.next();//the moment i use it.next() from employee class which has 3 objects it returns first object values 
	System.out.print(emp.age+" ");
	System.out.print(emp.dept+" ");
	System.out.print(emp.empname+" ");
	System.out.println();
	
		}
		
		//add all
		
		ArrayList <String>ar5=new ArrayList <String>();
		
		
		
		ar5.add("qwerty");
		ar5.add("ytrewq");
		ar5.add("plmokn");
		
ArrayList <String>ar6=new ArrayList <String>();
		

		
		ar5.add("qwerty1");
		ar5.add("ytrewq2");
		ar5.add("plmokn3");
ar5.addAll(ar6);

System.out.println(ar5);

//remove all-->method removes some objects
//retainall->retains common objects

ArrayList<String> tvseries =new ArrayList<String>();

tvseries.add("GOT");
tvseries.add("Walkingdead");
tvseries.add("prisonbreak");
tvseries.add("breakingbad");
tvseries.add("BBT");
//ways to print values in arraylist

//1.FOR EACH LOOP AND LAMBDA EXPRESSION

tvseries.forEach(show->{
	System.out.println(show);
});
	

//2.Iterator

Iterator<String> it1=tvseries.iterator();
System.out.println("/////////////////////////////");
		while(it1.hasNext())
			
		{
			String str=it1.next();
			
			System.out.println(str);
			
		}
		
		
//3.using iterator and foreach remaining
		System.out.println("......................");
		 it1 =tvseries.iterator();	

it1.forEachRemaining(show->{
	
	
	System.out.println(show);
});




//4.iterate using for eachloop

System.out.println("wwwwwwwwwwwwwwwwwwwwwww");
for(String show:tvseries)
{
	System.out.println(show);
}


//5.using for loop

System.out.println("pppppppppppppppppppppp");
for(int i=0;i<tvseries.size();i++)
{
	System.out.println(tvseries.get(i));
}

//listiterator to traverse in both directions

//printed in backword direction
ListIterator<String>tvserieslistiterator =tvseries.listIterator(tvseries.size());
System.out.println("pppppppppppppppppppppp0000000000000000000000");
while(tvserieslistiterator.hasPrevious())
{
	String show=tvserieslistiterator.previous();
	
	System.out.println(show);
}

List<Integer> values =new ArrayList<Integer>();

values.add(123);
values.add(456);
values.add(823);
values.add(289);
values.add(623);



//watch telsuko video lambda expression






	}

}

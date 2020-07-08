package lamdaandinnerclass;

public class Anonymousclas {

	public static void main(String[] args) {
		
		
		NormalInterface nv=new Classimplements()
				{
			public void show(int i) {
				System.out.println("hello");
			}
				};

	//lambda expression
		//method name ,method parameters and method return type all these are important since we mentioned every thing in interface		
			//we neednot write same in method as well
				NormalInterface nv2=(i)-> {
				System.out.println("hello");
					
			};
	
	//or
	
			NormalInterface nv3=(i)-> System.out.println("hello");
					
			//since only 1 statement we can write as above
	
	
	
	}

}

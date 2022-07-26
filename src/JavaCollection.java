import java.util.*;
public class JavaCollection {
	public static void main(String args[]) {
		/*
		ArrayList<String> name =new ArrayList<String>();
		
		name.add("Rahul");
		name.add("Neha");
		name.add("Vijay");
		name.add("Rakesh");
		System.out.println(name);
		name.add("Rohit");
		System.out.println(name);
		name.add(3, "Tanu");
		System.out.println(name);

				 //Traversing list through Iterator  

		Iterator itr=name.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  


		  }*/
		
		
		LinkedList<String> name=new LinkedList<String>();
		
		
		name.add("Rahul");
		name.add("Neha");
		name.add("Vijay");
		name.add("Rakesh");
		System.out.println(name);
		
		name.addFirst("Tanuja");
		name.addLast("Hiral");
		
		System.out.println(name);
		for(String str:name) {
			System.out.println(str);
		}
		
	}

}

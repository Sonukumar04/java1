import java.util.*;

class GSort 
{  
      	public static void main(String args[])
   {  
	ArrayList<String> al=new ArrayList<String>();  
	al.add("Sonu");  
	al.add("Shashank");  
	al.add("Sanjay");
	Collections.sort(al);
 	System.out.println(al);


	ArrayList<Integer> i=new ArrayList<Integer>();

	i.add(11);
	i.add(34);
	i.add(28);
    	Collections.sort(i);
	System.out.println(i);
    }
}


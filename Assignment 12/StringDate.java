package Demo;

import java.util.*;

public class StringDate {
public static void main(String args[]){
	 
	HashMap <Integer,String>hash_map= new HashMap <Integer,String>();
	  hash_map.put(1, "First");
	  hash_map.put(2, "Second");
	  hash_map.put(3, "Third");
	  hash_map.put(4, "Fourth");
	  hash_map.put(5, "Fifth");
	  hash_map.put(6, "Sixth");
	  hash_map.put(7, "Seventh");
	  hash_map.put(8, "Eighth");
	  hash_map.put(9, "Nineth");
	  hash_map.put(10, "Tenth");
	  
	  hash_map.put(11, "Eleventh");
	  hash_map.put(12, "Twelth");
	  hash_map.put(13, "Thirteenth");
	  hash_map.put(14, "Fourteenth");
	  hash_map.put(15, "Fifteenth");
	  hash_map.put(16, "Sixteenth");
	  hash_map.put(17, "Seventeenth");
	  hash_map.put(18, "Eighteenth");
	  hash_map.put(19, "Nineteenth");
	  hash_map.put(20, "Twenteeth");
	  
	  hash_map.put(21, "Twenty First");
	  hash_map.put(22, "Twenty Second");
	  hash_map.put(23, "Twenty Third");
	  hash_map.put(24, "Twenty Fourth");
	  hash_map.put(25, "Twenty Fifth");
	  hash_map.put(26, "Twenty Sixth");
	  hash_map.put(27, "Twenty Seventh");
	  hash_map.put(28, "Twenty Eighth");
	  hash_map.put(29, "Twenty Nineth");
	  hash_map.put(30, "Thirteeth");
	  
	  hash_map.put(31, "Thirty First");
	  
  
		HashMap <Integer,String>hash_ma= new HashMap <Integer,String>();
		  hash_ma.put(1, "January");
		  hash_ma.put(2, "Feburary");
		  hash_ma.put(3, "March");
		  hash_ma.put(4, "April");
		  hash_ma.put(5, "May");
		  hash_ma.put(6, "June");
		  hash_ma.put(7, "July");
		  hash_ma.put(8, "August");
		  hash_ma.put(9, "September");
		  hash_ma.put(10, "October");
		  hash_ma.put(11, "November");
		  hash_ma.put(12, "December");
		  
		  
			HashMap <Integer,String>hash_m= new HashMap <Integer,String>();
			hash_m.put(1990, "Nineteen Ninety");
			hash_m.put(1991, "Nineteen Ninety One");
			hash_m.put(1992, "Nineteen Ninety Two");
			hash_m.put(1993, "Nineteen Ninety Three");
			hash_m.put(1994, "Nineteen Ninety Four");
			hash_m.put(1995, "Nineteen Ninety Five");
			hash_m.put(1996, "Nineteen Ninety Six");
			hash_m.put(1997, "Nineteen Ninety Seven");
			hash_m.put(1998, "Nineteen Ninety Eight");
			hash_m.put(1999, "Nineteen Ninety Nine");
			hash_m.put(2000, "Two Thousand");
			
			hash_m.put(2001, "Two Thousand One");
			hash_m.put(2002, "Two Thousand Two");
			hash_m.put(2003, "Two Thousand Three");
			hash_m.put(2004, "Two Thousand Four");
			hash_m.put(2005, "Two Thousand Five");
			hash_m.put(2006, "Two Thousand Six");
			hash_m.put(2007, "Two Thousand Seven");
			hash_m.put(2008, "Two Thousand Eight");
			hash_m.put(2009, "Two Thousand Nine");
			hash_m.put(2010, "Two Thousand Ten");
			
			hash_m.put(2011, "Two Thousand Eleven");
			hash_m.put(2012, "Two Thousand Tweleve");
			hash_m.put(2013, "Two Thousand Thirteen");
			hash_m.put(2014, "Two Thousand Fourteen");
			hash_m.put(2015, "Two Thousand Fifteen");
			hash_m.put(2016, "Two Thousand Sixteen");
			hash_m.put(2017, "Two Thousand Seventeen");
			hash_m.put(2018, "Two Thousand Eighteen");
			
			
			
			
			
	  
		  System.out.print("Enter the date only:");
		  Scanner sn=new Scanner(System.in);
		  int i=sn.nextInt();
	
		  System.out.print("Enter the Month:");		    
		  int j=sn.nextInt();

		  System.out.print("Enter the Year(1990-2018):");
		  int k=sn.nextInt();
		  sn.close();
		  
		  System.out.print("Date you entered is:"+i+"/"+j+"/"+k);
		  
		  if(hash_map.containsKey(i)){
			  System.out.println(hash_map.get(i));
			  
			  
		  }
		  else
			  System.out.println("Enter a valid date!");
		  
		  if(hash_ma.containsKey(j)){
			  System.out.println(hash_ma.get(j));
			  System.out.print(" of ");
			  
		  }
		  else
			  System.out.println("Enter a valid date!");
		  
		  if(hash_m.containsKey(k)){
			  System.out.println(hash_m.get(k));
			  			  
		  }
		  else
			  System.out.println("Enter a valid date!");
		     
}
}

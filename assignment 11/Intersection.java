import java.util.*;
  class Intersection {
  public static void main(String args[]) {
  
        HashSet<String> h_set1 = new HashSet<String>();

          h_set1.add("one");
          h_set1.add("two");
          h_set1.add("three");
          h_set1.add("four");
          System.out.println("First HashSet content: "+h_set1);
          HashSet<String>h_set2 = new HashSet<String>();
          h_set2.add("one");
          h_set2.add("four");
          h_set2.add("five");
          h_set2.add("two");
          System.out.println("Second HashSet : "+h_set2);
          h_set1.retainAll(h_set2);
          System.out.println("HashSet :");
          System.out.println(h_set1);
     }
}
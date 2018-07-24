import java.util.*;
class Hashsetvalue {
  public static void main(String args[]) {
  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
  hash_map.put(1, "one");
  hash_map.put(2, "two");
  hash_map.put(3, "three");
  hash_map.put(4, "four");
  hash_map.put(5, "five");
  for(Map.Entry x:hash_map.entrySet()){
   System.out.println(x.getKey()+" "+x.getValue());
  }
 }
}
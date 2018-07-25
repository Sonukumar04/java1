package Demo;
import java.util.*;
class Comparator1 
{
private int Age;
private String name;

public Comparator1(String nm, int rt)
{
  this.name = nm;
  this.Age = rt;
  
}


public int getAge() { return Age; }
public String getName()   {  return name; }

}


class AgeCompare implements Comparator<Comparator1>
{
public int compare(Comparator1 c1,Comparator1 c2)
{
  if (c1.getAge() < c2.getAge()) return -1;
  if (c1.getAge() > c2.getAge()) return 1;
  else return 0;
}
}


class NameCompare implements Comparator<Comparator1>
{
public int compare(Comparator1 c1,Comparator1 c2)
{
  return c1.getName().compareTo(c2.getName());
}
}


class Comp
{
public static void main(String[] args)
{
  ArrayList<Comparator1> list = new ArrayList<Comparator1>();
  list.add(new Comparator1("Sanjay", 18));
  list.add(new Comparator1("Shashank", 8));
  list.add(new Comparator1("Gaurav", 28));
  list.add(new Comparator1("Shubhav", 80));

  System.out.println("Sorted by Age");
  AgeCompare AgeCompare = new AgeCompare();
  Collections.sort(list, AgeCompare);
  for (Comparator1 Comparator1: list)
      System.out.println(Comparator1.getAge() + " " +
                         Comparator1.getName() + " ");
                         


  System.out.println("\nSorted by name");
  NameCompare nameCompare = new NameCompare();
  Collections.sort(list, nameCompare);
  for (Comparator1 Comparator1: list)
      System.out.println(Comparator1.getName() + " " +
                         Comparator1.getAge() + " " );
}
}  

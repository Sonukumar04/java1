import java.util.Scanner;

public class rectangle {
  int length;
  int breadth;

  public int calculateArea()
  {
      int l,b;
      b=this.length;
      l=this.breadth;
      return l*b;
  }

  public static void main(String[] args)
  {
      Rectangle obj1=new Rectangle();
      Scanner scan=new Scanner(System.in);

      System.out.println("Enter length and breadth");
      obj1.length=scan.nextInt();
       obj1.breadth=scan.nextInt();

     System.out.println("Area is "+obj1.calculateArea());
  }



}
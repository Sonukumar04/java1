import java.io.*;
public class DynamicFileHandling2 {
public static void main(String args[])
{
	
try{ 
	File f = new File("C:/Users/Sonu/Desktop/Sonu/Sonu2/abc.txt");
	f.createNewFile();
	
    Writer w = new FileWriter("abc.txt");  
    String str = "Assignment 9";  
    w.write(str);  
    w.close();
	
  FileInputStream fin=new FileInputStream("abc.txt");
  FileOutputStream fout=new FileOutputStream("xyz.txt");
  byte b[]=new byte[10];
  int n=fin.read(b);
  System.out.println(n);
  while(n!=-1)
  {
      fout.write(b,0,n); 
      n=fin.read(b);
      }
  System.out.println("we are done");
  fin.close();
  fout.close();
  
  Reader r = new FileReader("xyz.txt");  
  int data = r.read(); 
  
  while (data != -1) {  
      System.out.print((char) data);  
      data = r.read();
   }
  r.close();
}
catch(Exception e)
{
	System.out.println(e);
}
}
}
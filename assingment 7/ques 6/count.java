class Stringcount
{
 public static void main(String...s)
 {
  int word=1;
  String str="Hello World!!";
 
  for(int i=0;i<str.length();++i)
  {
   if(str.charAt(i)==' ')
    word++;
  }
 
  System.out.println("Number of words="+word);
  
 }
}
class ReverseString
{
   public static void main(String[] args)
    {
      String input = "Sonu Kumar";
      String reverse = new StringBuffer(input).reverse().toString();
      System.out.println("before : "+input);
      System.out.println("after : "+reverse);
   }
}
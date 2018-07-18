import java.util.Scanner;

class Vowel
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter string");
         
        String inputString = sc.nextLine();
         
        String newInputString = inputString.replaceAll("[A,E,I,O,U,a,e,i,o,u]", "");
         
        System.out.println("string without vowels");
         
        System.out.println(newInputString);
         
        sc.close();
    }
}
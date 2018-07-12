import java.util.Scanner;

public class arm
{
    public static void main(String args[])
    {
        int n, number, num=0, rem;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter any Positive Number : ");
        n = scan.nextInt();
		
        number = n;
		
        while(number != 0)
        {
            rem = number%10;
            num = num + rem*rem*rem;
            number = number/10;
        }
        if(num == n)
        {
            System.out.print("Armstrong Number");
        }
        else
        {
            System.out.print("Not an Armstrong Number");
        }
    }
}
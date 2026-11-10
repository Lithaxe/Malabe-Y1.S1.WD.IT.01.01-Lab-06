import java.util.Scanner;

public class IT26102638_Lab6Q1
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        float num;
        System.out.println("Enter a number");
        num = input.nextFloat();

        float Squarenum, Rootnum;

        Squarenum = num*num;
        Rootnum = (float)Math.sqrt(num);

        System.out.println("The square of " + num + " is : " + Squarenum);
        System.out.println("The Root of " + num + " is : " + Rootnum);
 }
}


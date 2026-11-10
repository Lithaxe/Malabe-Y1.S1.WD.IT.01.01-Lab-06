import java.util.Scanner;

public class IT26102638_Lab6Q2c{

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Please enter 10 numbers: ");
        
        
        for(int i = 0; i < 10; i++){

            System.out.print("Enter number " + (i+1) + " : ");
            numbers[i] = input.nextInt();
        }

        System.out.println("The numbers you entered are:");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        int sum;
        sum = 0;
        for(int i = 0; i < 10; i++){
            sum += numbers[i];
        }
        System.out.println("\nThe sum of numbers :" + sum);

        float Avg;
        Avg = sum/10;
        System.out.println("The Average of numbers : " + Avg);
      
    }
}
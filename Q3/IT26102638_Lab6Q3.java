import java.util.Scanner;

public class IT26102638_Lab6Q3{

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
       

        System.out.println("Enter positive integers (termiante with -99): ");

        int count,num;
        double rms, sumofsquare;
        count = 0;
        sumofsquare = 0;
        while(true){

            System.out.print("Enter a number: ");
            num = input.nextInt();

            if(num==-99){
                break;
            }

            if(num <= 0){
                System.out.println("Please enter a positive integer or -99 to terminate");
                continue;
            }
            sumofsquare += Math.pow(num,2);
            count++;
        } 
            
            rms = Math.sqrt(sumofsquare / count);

            System.out.println("The Root Mean Square is: " + rms);
    }

}
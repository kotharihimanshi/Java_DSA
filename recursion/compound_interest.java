import java.util.Scanner;

public class compound_interest{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        double amount;
        double principle;
        double rate;
        double n;
        double time;

        System.out.print("enter principle");
        principle = sc.nextDouble();

        System.out.print("enter rate(in %)");
        rate = sc.nextDouble() / 100;   //for rate to be in percent

        System.out.print("enter time");
        time = sc.nextDouble();

        System.out.print("enter n");
        n = sc.nextDouble();

        amount = principle * Math.pow((1 + rate/n) , (n * time));

        System.out.println("compound interest is : " + amount);

        sc.close();

    }
}
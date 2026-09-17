import java.util.Scanner;
public class Compoundinterest{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        double principal;
        double rate;
        int timescompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal= scanner.nextDouble();
        System.out.print("Enter the rate of interest %: ");
        rate =scanner.nextDouble() /100;
        System.out.print("Enter the number of times interest is compounded : ");
        timescompounded= scanner.nextInt();
        System.out.print("Enter the number of years: ");
        years= scanner.nextInt();
         
        amount = principal*Math.pow(1+rate/timescompounded,timescompounded*years);
        System.out.printf("The amount after %d years is %.2f", years, amount);

    }
    
}

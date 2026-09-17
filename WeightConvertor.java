import java.util.Scanner;
public class WeightConvertor {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;
        
        System.out.println("Welcome to weight convertor!");
        System.out.println("1:to convert lbs to kgs");
        System.out.println("2:to convert kgs to lbs");
        System.out.print("Choose your option: ");
        choice = scanner.nextInt();
    if(choice == 1){
        System.out.print("Enter your weight in lbs:");
        weight=scanner.nextDouble();
        newWeight=weight*0.453592;
        System.out.printf("The weight converted from lbs to kgs is: %.2f kgs",newWeight);

    }else if(choice ==2 ){
        System.out.print("Enter your weight in kgs:");
        weight=scanner.nextDouble();
        newWeight=weight*2.20462;
         System.out.printf("The weight converted from kgs to lbs is: %.2f lbs",newWeight);

    }else{
        System.out.println("That is a invalid choice");
    }
scanner.close();
}
}

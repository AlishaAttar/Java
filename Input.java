//inputs

/* import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");

        String name=scanner.nextLine();
        System.out.println("the name is " +name);
        
        System.out.println("enter your age");
         int age =scanner.nextInt();


       

        scanner.close();
        //mad libs game (missing words game)
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
          
        String noun1;
        String adj1;
        String adj2;
        String verb;
        String adj3;

        System.out.print("Enter a noun: ");
        noun1= scanner.nextLine();
        System.out.print("Enter a adjective");
        adj1=scanner.nextLine();
        System.out.print("Enter a adjective");
        adj2=scanner.nextLine();
        System.out.print("Enter a verb");
        verb = scanner.nextLine();
        System.out.print("Enter a adjective");
        adj3 =scanner.nextLine();


        System.out.println("i saw a " +noun1+ " she was very " +adj1);
        System.out.println("she was looking " +adj2+ " while " +verb);
        System.out.println("i was " +adj3+ " to see her");

        scanner.close(); 
    }
}

//shopping cart1
import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
         
        String item;
        double price;
        int quantity;
        double total;
        char currency='$';

        System.out.print("What do you want to buy: ");
        item = scanner.nextLine();
        System.out.print("How much is the price of each: ");
        price =scanner.nextDouble();
        System.out.print("how many do you want?: ");
        quantity = scanner.nextInt();
        total= price*quantity;
        System.out.println("you bought " +quantity+ " " +item+ "/s");
        System.out.println("Your total is "+currency + +total);
        scanner.close();



    }
}
//shopping cart
import java.util.Scanner;
public class Input{
    public static void main(String[] args){
           Scanner scanner= new Scanner(System.in);
 

double price;
int items;
String item_name;
double total;

System.out.print("What do you want to buy? :");
item_name=scanner.nextLine();

System.out.print("how many do you want :");
items =scanner.nextInt();

System.out.print("It is priced at :");
price= scanner.nextDouble();

total = price*items;
System.out.println("You bought "+items+ " " +item_name);
System.out.print("Your total is: $"+total);
scanner.close();


    }
}


//Random numbers generator
import java.util.Random;
public class Input{
    public static void main(String[] args){
        Random random= new Random();
        int number;
        number= random.nextInt(1,7);
        System.out.println(number);
        double num;
        num=random.nextDouble();
        System.out.println(num);

        boolean isHeads;
        isHeads=random.nextBoolean();
        System.out.println(isHeads);
        if(isHeads){
            System.out.println("heads!!!");
        }else{
            System.out.println("Tails!!!");
        }

    }
}
*/
import java.util.Random;
public class Input{
    public static void main(String [] args){
Random random = new Random();
int num;
boolean isCat;
num=random.nextInt(1,10);
isCat=random.nextBoolean();

System.out.println(num);
System.out.println(isCat);

}}






















































    




    




    

    


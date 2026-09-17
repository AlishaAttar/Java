import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args){
        // datatype variable=(condition)? ifTrue(run this code):ifFalse(run this code);
        // can be used as an alternative for the if else statement
        // var= (condition) ? ifTrue:ifFalse;

      /*   int score=23;
        String passOrFail=(score>=60)  ? "PASS":"FAIL";
        System.out.println(passOrFail);

        int num =12;
        String evenOrOdd=(num %2 == 0) ? "Even":"Odd";
        System.out.println(evenOrOdd);

        int hours=19;
         String timeOfDay=(hours>=12)? "P.M":"A.M";
         System.out.println(timeOfDay);
          
    int income = 78000;
    String taxRate =(income>=60000)? "0.25":"0.35";
    System.out.println(taxRate);*/
            // temp convertor 

     double temp;
    double newTemp;
    String unit;
    Scanner scanner=new Scanner(System.in);


    System.out.print("Enter your Temperature: ");
    temp=scanner.nextDouble();

    System.out.print("Enter your unit you want to convert to (C/F):");
    unit=scanner.next().toUpperCase();
    
    newTemp=(unit == "C" )? (temp-32)*5/9 : (temp*9/5)+32;
    System.out.printf("%.1fdegree%s",newTemp,unit);
    scanner.close();


    }} 


    



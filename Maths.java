
import java.util.Scanner;
public class Maths {
    public static void main(String[] args){
       System.out.println(Math.PI);
System.out.println(Math.E);
double result;
//power
 result=Math.pow(2,2);
        System.out.println(result);
        //absolute val
      result=Math.abs(-2);  
      System.out.println(result);
      //sqrt
      result=Math.sqrt(9);
     System.out.println(result);
      //rounding a num 
       result=Math.round(3.11);
       System.out.println(result);
       //round up
       result=Math.ceil(5.12);
       System.out.println(result);
       //round down
       result=Math.floor(4.99);
       System.out.println(result);
       //max
       result=Math.max(10,20);
       System.out.println(result);
       //min
       result=Math.min(12,13);
       System.out.println(result);


       //find hypotenuse (formula hypo=sqrt(a^2+b^2))
Scanner scanner = new Scanner(System.in);
double a;
double b;
double c;

System.out.print("Enter side A: ");
a=scanner.nextDouble();
System.out.print("Enter side B: ");
b=scanner.nextDouble();
c=Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));

System.out.print("The hypotenuse is: "+c+ "cm");

scanner.close();
}
}
    


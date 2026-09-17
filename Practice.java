import java.util.Scanner;
public class Practice {
    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

/*System.out.print("enter your name:");
String name = scanner.nextLine();
System.out.print("Enter your age:");
int age=scanner.nextInt();
System.out.print("enter your cgpa:");
double cgpa = scanner.nextDouble();
System.out.print("are you a student(true/false)");
boolean isStudent = scanner.nextBoolean();
 if(isStudent){
    System.out.println("your are enrolled!");

 }else{
    System.out.println("not eligible");

 }
System.out.println("your name is " +name+ " and age is " +age+ " with cgpa " +cgpa);
System.out.print("Enter the length: ");
double length= scanner.nextDouble();
System.out.print("Enter the width: ");
double width= scanner.nextDouble();
double area = length*width;
System.out.print("the area of rectangle is " +area);

scanner.close();*/
  int age;
  String name;
  boolean isStudent;
  System.out.print("Enter your name:");
  name=scanner.nextLine();

  System.out.print("Enter your age: ");
  age =scanner.nextInt();
  System.out.print("Are you a student(True/false");
  isStudent=scanner.nextBoolean();
if(name.isEmpty()){
    System.out.print("You didnt enter your name!!😾😾");
}else {
    System.out.println("hello "+name+ "🐣");
}


  if (age >= 18 ){
    System.out.println("You r an adult");
  }else if(age <0){
    System.out.println("you havent been born yet");

  }else if(age>100){
    System.out.println("you are ancient");
  }
  
  
  else {
    System.out.println("you are a child");
  }

  if(isStudent){
    System.out.println("you are a student");
  }else
{
    System.out.println("not a student!!!");
}  
scanner.close();


    }
    
}

import java.util.Scanner;
public class StringMethods {
 public static void main(String [] args){
    /*String name="Alisha Attar" ;
    String name1="password";
    String pass= "   Jimin   ";
    // to check length of the string
    int length=name.length();
    System.out.println(length); 
    // charAt= to find a character at the specific index
   char letter=name.charAt(11);
   System.out.println(letter);
   //indexOf= to find index of a character
   int number=name.indexOf("t");
   System.out.println(number);
   //lastIndex = to find last index of a character
   int num=name.lastIndexOf("t");
   System.out.println(num);
   //toUpperCase=turns the whole string into uppercase
   name=name.toUpperCase();
   System.out.println(name);
   //toLowerCase= turns the whole string into lowercase
   name=name.toLowerCase();
   System.out.println(name);
   //trim= to trim all the white space
   pass=pass.trim();
   System.out.println(pass);
   //replace = to replace a ltter with another letter
   name=name.replace(" ", " ");
   System.out.println(name);
   //isEmpty= to check if a string is empty or not
   if(name.isEmpty()){
    System.out.println("You havent entered your name yet");
   }else{
    System.out.println("hello "+name);
 }
 // contains = to check if ur name contains any space,character or anything
 if (name.contains(" ")){
    System.out.println("Your name contains spaces");
 }
   else{
    System.out.println("Your name dosent have any spaces");
   }
   //Equals= checks if strings are equal
if(name.equals("password")){
    System.out.println("you cant have name as your password");
 }else{
    System.out.println("hello "+name);
 }

   //equalsIgnoreCase this isnt case sensitive
   if(name1.equalsIgnoreCase("password")){
    System.out.println("you cant have name as your password");
 }else{
    System.out.println("hello "+name);
 } */
                               //SUB STRING
   /*  String email= "jimin123@gmail.com";
    String username=email.substring(0,8);
    System.out.println(username);
    String domain=(email.substring(9,18));
    System.out.println(domain);
    //same thing but with using string methods
    String username=email.substring(0,email.lastIndexOf("@"));
    System.out.println(username);
    String domain=(email.substring(email.lastIndexOf("@")+1));
    System.out.println(domain);
    */
    Scanner scanner=new Scanner(System.in);
    String email;
    String username;
    String domain;
     System.out.print("Enter your email: ");
     email=scanner.nextLine();
     if(email.contains("@")){

     username=email.substring(0,email.lastIndexOf("@"));
     domain=email.substring(email.lastIndexOf("@")+1);

     System.out.println(username);
     System.out.println(domain);}
     else{
        System.out.println("Your email is not valid, Email has to contain dskf@");
     }

    

 }   
}

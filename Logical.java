import java.util.Scanner;
public class Logical {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        double temp=-25;
        boolean isSunny=false;
    if(temp>=20 && temp<=30)  {
        System.out.println("Its sunny outside");

    }else if(temp <=0 || temp >=100){
        System.out.println("its extreme weather conditions");
    }else if( temp <=0 && !isSunny){
        System.out.println("Its freezing outside");
    }
    String username;
    // username should be in between 4-12 characters 
    // username should not contain any underscore or empty spaces

    System.out.print("Enter your username:");
    username=scanner.nextLine();
    if(username.length()<=4 || username.length()>=12){
        System.out.println("Username should only contain 4-12 charaters");
    }else if (username.contains(" ") || username.contains("_")){
        System.out.println("Username cant contain spaces or underscores");

    }else{
        System.out.print("welcome " +username);
    }

        scanner.close();
    }
}

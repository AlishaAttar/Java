import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        String response=" ";

        while(!response.equals("Q")){
            System.out.println("You are stuck in a loop,press q/Q to get out:");
            response = scanner.next().toUpperCase();
            
        }
        System.out.println("You have quit the game");
scanner.close();
    }
    
}

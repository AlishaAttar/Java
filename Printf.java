public class Printf {
    public static void main(String[] args){
 
        String name="Jimin";
        char FirstLetter='J';
        double Height=5.11;
        int age= 29;
        boolean isSinger=true;

        System.out.printf("Hello %s \n",name );
        System.out.printf("The first letter of your name is %c \n",FirstLetter);
        System.out.printf("You are %f inches tall \n",Height);
        System.out.printf("You are %d years old \n",age);
        System.out.printf("Are you a singer?: %b you are a singer \n",isSinger);

        //flags
        // . = used for taking decimal number u want 
        // + for positive number
        // , = for grouping eg. 10,000
        // ( = for putting negative num into parenthesis
        // space = gives space before positive num and puts - sign before negative num 

        double num1=1022378.122324;
        double num2=5.4;
      double num3= -3;
        System.out.printf("%,.2f \n",num1);
        System.out.printf("+%f \n",num2);
         System.out.printf("%+f \n",num3);
         System.out.printf("% f\n",num3);
         System.out.printf("%(f\n",num3);  
    

         //padding
         // 0 padding = aligns numbers by adding 0
         // positive number = aligns number to the rght side 
         // negative number alings number to the left side

         int n1=2;
         int n2=35;
         int n3=786;
         int n4= 9843;
         System.out.printf("%04d\n",n1);
         System.out.printf("%04d\n",n2);
         System.out.printf("%04d\n",n3);
         System.out.printf("%04d\n",n4);


         System.out.printf("%4d\n",n1);
         System.out.printf("%4d\n",n2);
         System.out.printf("%4d\n",n3);
         System.out.printf("%4d\n",n4);

         System.out.printf("%-4d\n",n1);
         System.out.printf("%-4d\n",n2);
         System.out.printf("%-4d\n",n3);
         System.out.printf("%-4d\n",n4);











    }
    
}

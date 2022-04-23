import java.util.*;

public class Loops{
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number ");
        int n = sc.nextInt();

        //table program
        for(int i=1; i<=10; i++) { 
              System.out.println( n + " * " + i + " = " + (n*i) );
        }

        // for(int i=0; i<11; ++i) {
        //     System.out.println(i);
        // }
    }
}
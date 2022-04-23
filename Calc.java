
import java.util.*;

public class Calc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int input;

    do{
        System.out.println("Enter 1 for Addition (a + b)");
        System.out.println("Enter 2 for Subtraction (a - b)");
        System.out.println("Enter 3 for Multiplication (a*b)");
        System.out.println("Enter 4 for Division (a / b)");
        System.out.println("Enter 5 for Modulo (a % b)");
        input = sc.nextInt();

        switch(input){
            case 1: System.out.println("Addition a+b: "+(a+b));
            break;
            case 2: System.out.println("Diision a-b: "+(a-b));
            break;
            case 3: System.out.println("Multiplication (a*b): "+(a*b));
            break;
            case 4: System.out.println("Division (a/b): "+(a/b));
            break;
            case 5: System.out.println("Modulo (a%b): "+(a%b));
            break;
            default: System.out.println("INVALID INPUT");
        }
    }while(input > 0 && input < 6);  
    }
}

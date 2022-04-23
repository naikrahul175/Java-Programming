import java.util.*;

class Condition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int x = sc.nextInt();

        switch(button) {
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid input");
        }

        // if(a == b) {
        //     System.out.println("Equals");
        // } else if(a > b) {
        //         System.out.println("A is greater");
        // } else {
        //         System.out.println("B is greater");
        // }

        //even and odd program

            // if(x % 2 == 0) {
            //     System.out.println("Even");
            // } else {
            //     System.out.println("Odd");
            // }

    }
 }  
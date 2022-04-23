import java.util.Scanner;

class logicBuilding {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double d = sc.nextDouble();
            // int n1 = sc.nextInt();
         sc.nextLine();    // for taking the string immediately after the integer
         String s = sc.nextLine();

        // System.out.println((n%2==1 || (n>=6 && n<=20)) ? "Wierd" : "Not wierd");
        System.out.println(n +" "+ d + " "+ s);
        // System.out.println(n +" "+ n1 +" "+ s);
    }
}

public class Largest {
    public static void main(String args[]) {
        int a = 10, b = 10, c = 7;

        if(a > b) {
            if(a > c) {
               System.out.println("A is greater"); 
            }else {
                System.out.println("c is greater");
            }
        }else if(b > c) {
            System.out.println("B is greater");
        } else {
            System.out.println("C is greater");
        }
    }
}

//output: 
/*

B is greater

*/


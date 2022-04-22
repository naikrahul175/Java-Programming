
public class AdvancePattern {
    public static void main(String args[]) {
        int n = 4;
            //upper half
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n-i); // for spaces
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(); //new line
        }
            //lower half
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(); //new line
        }

        System.out.println(); //space for next pattern

        for(int i=1; i<=n; i++) {
                for(int j=1; j<=n-i; j++) {
                    System.out.print(" ");
                }
                for(int j=1; j<=n; j++) {
                    System.out.print("*");
                }
            System.out.println(); //new line
        }

        System.out.println(); // space for next pattern
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();  //new line
        }

        System.out.println(); //space for next pattern
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println(); //new line
        }

        System.out.println(); // space for next pattern

        //upper Half
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println(); //new line
        }
                //lower Half
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println(); //new line
        }
    }
}

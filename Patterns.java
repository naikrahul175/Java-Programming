
public class Patterns {
    public static void main(String args[]) { 
        int n = 4;
        int m = 5;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println(); //new line
        }
                 System.out.println();  // space for next pattern

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if( i == 1 || i == n || j == 1  || j == m) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }    
            }
            System.out.println(); //new line
        }

        System.out.println(); // space for next pattern
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
         System.out.println();
        }

        System.out.println(); // space for next pattern
        
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
        System.out.println(); 
        }

        System.out.println(); // space for next pattern
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
        System.out.println(); //new line
        }

        System.out.println(); //space for next pattern

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
        System.out.println(); //new line
        }

        System.out.println(); // space foe next  pattern
        int count =0;

        for(int i=1; i<=n; i++) { 
            for(int j=1; j<=i; j++) {
                System.out.print((count++) +" ");
            }
        System.out.println(); //new line
        }

        System.out.println(); // space for next pattern

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                int sum = i+j;
                if(sum % 2 == 0) { //for finding Even & Odd
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }   
            }
            System.out.println();
        }

        System.out.println(); //space for next pattern
        int counter =1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(counter +" ");
                counter = counter + counter;
            }
            System.out.println();
        }
    }
}
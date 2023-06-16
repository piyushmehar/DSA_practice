
// Input:  n = 7, p = 3
// Output: x = 2
// 32 divides 7! and 2 is the largest such power of 3.

// Input:  n = 10, p = 3
// Output: x = 4
// 34 divides 10! and 4 is the largest such power of 3.

import java.util.Scanner;

public class Legendres {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = sc.nextInt();
    int pow =0;
    
    while (n>0){
        n=n/p;
        pow = pow + n;
    }
    System.out.println(pow);
    
    }
    
}

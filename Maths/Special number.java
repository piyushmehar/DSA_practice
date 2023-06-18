// //a number is said to be special 
// eg:    n = 19
//        s= 1 + 9 = 10
//       p = 1 * 9 = 9
//       s + p = n       So special;

public class Solution {
    public static void main(String[] args) {
        int st= 11;
        int en = 100;
        int s=0;
        int p=0;
        for(int i = st; i<=en;i++){
            int n = i;
            int a= i;
            s = (n/10)+ (n%10);
            p = (n/10) * (n%10);
            if((s+p)==a){
                System.out.println(a + "is a special no.");
            }
          }
    }
}

// output -->
// 19is a special no.
// 29is a special no.
// 39is a special no.
// 49is a special no.
// 59is a special no.
// 69is a special no.
// 79is a special no.
// 89is a special no.
// 99is a special no

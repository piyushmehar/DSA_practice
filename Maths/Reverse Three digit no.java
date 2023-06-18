public class trendyno {
    public static void main(String[] args) {
        int n = 546;
        int fd = n/100;
        int md = (n/10)%10;
        int ld= n%10;
        int ans = ld*100 + md*10 + fd;
        System.out.println(ans);
    }
    
}

// output-->
//   654

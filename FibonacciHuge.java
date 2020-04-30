import java.util.*;

public class FibonacciHuge{
    private static long fib(long n, long m) {
        if(n<=1)
            return n;
        long a=0,b=1;
        long c;
        for(long i=2;i<=n;i++){
            c = (a+b)%m;
            a=b;
            b=c;

        }
        return b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(fib(n, m));
    }
}


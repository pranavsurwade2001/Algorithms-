import java.util.*;
class Fabonicci{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		System.out.println(fib(n));
	}
	static long fib(long n){
		long a=0;
		long b=1;
		long c;
		if(n==0){return a;}
		for(int i=2;i<=n;i++){
			c=(a+b);
			a=b;
			b=c;
		}
		return b;
	}
}
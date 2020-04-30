import java.util.*;
class LargeFN{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(fib(n));
	}
	static int fib(int n){
		int f[] = new int[n+2];
		f[0] = 0;
		f[1] = 1;
		for(int i=2;i<=n;i++){
			f[i] = (f[i-1]+f[i-2])%10;
		}
		return f[n];
	}
}
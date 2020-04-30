import java.util.*;
class LCM{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		System.out.println(lcm(a,b));
	}
	static long gcd(long a, long b){
		if(b==0){return a;}
		return gcd(b,a%b);
	}
	static long lcm(long a ,long b){
		return (a*b)/gcd(a,b);
	}
}
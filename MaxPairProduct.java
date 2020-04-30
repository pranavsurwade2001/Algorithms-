import java.util.*;
class MaxPairProduct{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long a[] = new long[n];
		for(int i=0;i<n;i++){
			a[i] = s.nextLong();
		}
		
		Arrays.sort(a);
		System.out.println(a[n-1]*a[n-2]);
	}
}
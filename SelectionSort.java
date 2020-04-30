import java.util.*;
class SelectionSort{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = s.nextInt();
		for(int i=0;i<n;i++){
			int minI = i;
			for(int j=i+1;j<n;j++)
				if(a[j]<a[minI])
					minI = j;
			int temp = a[minI];
			a[minI] = a[i];
			a[i] = temp;
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
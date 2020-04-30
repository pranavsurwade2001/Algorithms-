import java.util.*;
class MergeSortItr{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = s.nextInt();
		mergesort(a);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	static void mergesort(int a[]){
		int n = a.length;
		if(n>1){
			int m = n/2;
			int left[] = new int [m];
			for(int i=0;i<m;i++)
				left[i] = a[i];
			int right[] = new int[n-m];
			for(int i=m;i<n;i++)
				right[i-m] = a[i];
			mergesort(left);
			mergesort(right);

			int i=0,j=0;
			int k=0;
			int n1 = left.length;
			int n2 = right.length;
			while(i<n1 && j<n2){
				if(left[i]<right[j]){
					a[k] = left[i];
					i++;
				}
				else{
					a[k] = right[j];
					j++;
				}
				k++;
			}
			while(i<n1){
				a[k]=left[i];
				i++;
				k++;
			}
			while(j<n2){
				a[k]=right[j];
				j++;
				k++;
			}
		}
	}	
}
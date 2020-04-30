import java.util.*;
class MergeSort{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = s.nextInt();
		sort(a,0,n-1);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	static void sort(int a[],int l,int r){
		if(l<r){
			int m = (l+r)/2;
			sort(a,l,m);
			sort(a,m+1,r);
			merge(a,l,m,r);
		}
	}
	static void merge(int a[],int l,int m,int r){
		int n1 = m-l+1;
		int n2 = r-m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for(int i=0;i<n1;i++)
			L[i] = a[i+l];
		for(int j=0;j<n2;j++)
			R[j] = a[m+1+j];
		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2){
			if(L[i]<R[j]){
				a[k] = L[i];
				i++;
			}
			else{
				a[k] = R[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2){
			a[k]=R[j];
			j++;
			k++;
		}
	}
}
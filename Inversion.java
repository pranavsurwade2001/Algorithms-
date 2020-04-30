import java.util.*;
class Inversion{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = s.nextInt();
		
		System.out.println(sort(a,0,n-1));
	}
	static int sort(int a[],int l,int r){
		int count =0;
		if(l<r){
			int m = (l+r)/2;
			count += sort(a,l,m);
			count += sort(a,m+1,r);
			count += merge(a,l,m,r);
			
		}
		return count;
	}
	static int merge(int a[],int l,int m,int r){
		int n1 = m-l+1;
		int n2 = r-m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for(int i=0;i<n1;i++)
			L[i] = a[i+l];
		for(int j=0;j<n2;j++)
			R[j] = a[m+1+j];
		int i=0,j=0,swaps=0;
		int k=l;
		while(i<n1 && j<n2){
			if(L[i]<R[j]){
				a[k] = L[i];
				i++;
			}
			else{
				a[k] = R[j];
				j++;
				swaps = (m + 1) - (l + i); 
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
		return swaps;
	}
}
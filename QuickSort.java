import java.util.*;
class QuickSort{
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
	static void sort(int a[],int low,int high){
		if(low < high){
			int pi = partition(a,low,high);
			sort(a,low,pi-1);
			sort(a,pi+1,high);
		}
	}
	static int partition(int a[],int low,int high){
		int pivot = a[high];
		int i = low-1;
		for(int j=low;j<high;j++){
			if(a[j]<pivot){
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i+1];
		a[i+1] = a[high];
		a[high] = temp;
		return i+1;
	}
}
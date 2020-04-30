import java.util.*;

public class LCS2 {

    private static int lcs2(int[] a, int[] b,int m ,int n) {
        //Write your code here
        int [][]longest = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
        	for(int j=0;j<n+1;j++){
        		if(i==0 || j==0)
        			longest[i][j] = 0;
        		else if(a[i-1]==b[j-1])
        			longest[i][j]= longest[i-1][j-1]+1;
        		else
        			longest[i][j] = Math.max(longest[i-1][j],longest[i][j-1]);
        	}
        }      
 	return longest[m][n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  m= scanner.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.println(lcs2(a, b,m,n));
    }
}


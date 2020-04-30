import java.util.*;

public class LCS3 {

    private static int lcs3(int[] a, int[] b, int[] c,int m,int n,int o) {
        //Write your code here
        int [][][]longest = new int[m+1][n+1][o+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                for(int k=0;k<o+1;k++){
                    if(i==0 || j==0 || k==0)
                        longest[i][j][k]=0;
                    else if(a[i-1]==b[j-1] && b[j-1]==c[k-1])
                        longest[i][j][k] = longest[i-1][j-1][k-1]+1;
                    else
                        longest[i][j][k] = Math.max(longest[i][j][k-1],Math.max(longest[i-1][j][k],longest[i][j-1][k]));
                }
            }
        }
        return longest[m][n][o];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int an = scanner.nextInt();
        int[] a = new int[an];
        for (int i = 0; i < an; i++) {
            a[i] = scanner.nextInt();
        }
        int bn = scanner.nextInt();
        int[] b = new int[bn];
        for (int i = 0; i < bn; i++) {
            b[i] = scanner.nextInt();
        }
        int cn = scanner.nextInt();
        int[] c = new int[cn];
        for (int i = 0; i < cn; i++) {
            c[i] = scanner.nextInt();
        }
        System.out.println(lcs3(a, b, c,an,bn,cn));
    }
}


import java.math.BigInteger; 
import java.util.*; 
  
public class LargestNumber 
{ 
    public static String largestNumber(List<Integer> arr) 
    { 
        int n = 
         Collections.max(arr).toString().length(); 
  
        ArrayList<ExtendedNum> en = 
                       new ArrayList<ExtendedNum>(); 
        for (int i = 0 ; i < arr.size(); i++) 
            en.add(new ExtendedNum(arr.get(i), 
                              n)); 
  
        Collections.sort(en, (p1, p2) -> 
         (int)(p2.modifiedValue - p1.modifiedValue)); 
  
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < en.size(); i++) 
            sb.append(new StringBuilder 
            (Long.toString(en.get(i).originalValue))); 
  
  
        BigInteger bi = new BigInteger(sb.toString()); 
  
        return bi.toString(); 
    } 
  
    public static void main(String[] args) 
    { 
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Integer arr[] = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        } 
        List<Integer> l = Arrays.asList(arr); 
  
        System.out.println(largestNumber(l)); 
    } 
} 
  
class ExtendedNum 
{ 
    int originalValue; 
    long modifiedValue; 
  
    public ExtendedNum(int originalValue, int n) 
    { 
        this.originalValue = originalValue; 
        String s = Integer.toString(originalValue); 
        StringBuilder sb = new StringBuilder(s); 
        StringBuilder ans = new StringBuilder(); 
        while (ans.length() <= n + 1) 
            ans.append(sb); 
  
        s = ans.toString().substring(0, n + 1); 
        modifiedValue = Long.parseLong(s); 
    } 
  
    public String toString() 
    { 
        return "[" + modifiedValue + 
                ", " + originalValue + "]"; 
    } 
} 
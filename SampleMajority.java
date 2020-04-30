 
import java.util.HashMap; 
import java.util.*;   
class SampleMajority  
{ 
    private static void findMajority(int[] arr)  
    { 
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>(); 
  
        for(int i = 0; i < arr.length; i++) { 
            if (map.containsKey(arr[i])) { 
                    int count = map.get(arr[i]) +1; 
                    if (count > arr.length /2) { 
                        System.out.println("1"); 
                        return; 
                    } else
                        map.put(arr[i], count); 
  
            } 
            else
                map.put(arr[i],1); 
            } 
            System.out.println("0"); 
    }  

	public static void main (String[] args) { 
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n]; 
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
		} 
	
	findMajority(arr); 
	} 

} 

import java.util.*;
import java.math.*;
public class FractionalKnapsack{
    private static double getOptimalValue(int[] val,int[] wt, int capacity) {
        ItemValue[] iVal = new ItemValue[wt.length];
        for(int i=0;i<wt.length;i++){
        	iVal[i] = new  ItemValue(wt[i],val[i],i);
        } 
        Arrays.sort(iVal,new Comparator<ItemValue>()
        {
        	@Override
        	public int compare(ItemValue o1, ItemValue o2){
        		return o2.cost.compareTo(o1.cost);
        	}
        });
        double totalValue = 0;
        
        for(ItemValue i: iVal){
        	int curwt = (int)i.wt;
        	int curval = (int)i.val;
        	if(capacity-curwt >= 0){
        		capacity = capacity - curwt;
        		totalValue += curval;
        	}
        	else{
        		double fraction = ((double)capacity/(double)curwt);
        		capacity = (int)(capacity - (fraction*curwt));
        		totalValue += fraction*curval;
        	}
        }
        return totalValue;
        }
    

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        double max = getOptimalValue(values,weights,capacity);
        System.out.println((double)Math.round(max * 10000d) / 10000d);
    }
    static class ItemValue{
    	Double cost ;
    	double wt,val,ind;
    	public ItemValue(int wt,int val,int ind){
    		this.wt = wt;
    		this.val = val;
    		this.ind = ind;
    		cost = new Double(val/wt);
    	}
    }
} 

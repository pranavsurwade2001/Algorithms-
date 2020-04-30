import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        int nr=0, cr=0;
        int n = stops.length;
        try{
        while(cr<=n){
          int  lr = cr;
          while(cr<=n && stops[cr+1]-stops[lr]<=tank){
            cr++;
          }
          if(cr==lr){ return -1;}
          if(cr<=n){nr++;} 
        }
      }
      catch(Exception e){
      
    }
    return nr;
    

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        try{
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }
        System.out.println(computeMinRefills(dist, tank, stops));
      }
      catch(Exception e){
        
      }
      }
    }


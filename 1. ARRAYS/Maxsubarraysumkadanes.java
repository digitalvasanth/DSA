import java.util.*;
public class Maxsubarraysumkadanes {
    public static int sum(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
             currsum+=arr[i];

             if(currsum<0)
                 currsum=0;
             maxsum=Math.max(maxsum,currsum);
        }
        return maxsum;
    }
    public static void main(String [] args){
        int arr[]={5,4,-1,7,8};
        System.out.println(sum(arr));
    }
}

import java.util.*;
public class temporary{
    public static int sum(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;




        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+=arr[k];
                }
            }
            maxsum=Math.max(currsum,maxsum);
        }
        return maxsum;
    }
    public static void main(String [] args){
        int arr[]={5,4,-1,7,8};
       int ans= sum(arr);
        System.out.println(ans);
    }
}
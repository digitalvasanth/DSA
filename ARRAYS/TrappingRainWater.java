import java.util.*;
public class TrappingRainWater{
    public static int find(int arr[]){
        int trapped=0;
        
        int n=arr.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        
        
        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);
            
        }

        rightmax[n-1]=arr[n-1];

        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);

        }
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trapped+=waterlevel-arr[i];
        }
        return trapped;
    }
    public static void main(String[] args){
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(find(arr));
    }
}
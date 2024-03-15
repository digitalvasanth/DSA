

import java.util.*;
public class PairSum {

    public static int find(int arr[],int target){
        int n=arr.length;
            int count=0;
        int flag=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==target){
                flag=1;
            count++;
    }
    }
    
}
if(flag==0)
    return -1;
    else
    return count;
    }
    public static void main(String [] args){
        int arr[]= {1,2,3,4,5};
        int target=6;
        System.out.println(find(arr,target));
    }
    
}

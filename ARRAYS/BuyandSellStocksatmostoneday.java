import java.util.*;
public class BuyandSellStocksatmostoneday {
    public static int profit(int arr[]){
        int profitt=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1])
                profitt+=arr[i]-arr[i-1];
        }
        return profitt;
    }
    public static void main(String [] args){
        int arr[]={7,1,5,3,6,4};
        System.out.println(profit(arr));
    }
}

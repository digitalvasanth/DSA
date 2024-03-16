import java.util.*;
public class LargestinArray
 {
    public static void main(String [] args)
    {
        int arr[]={33,15,66,4,2,67,4};
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            largest=arr[i];
        }
        System.out.println(largest);
    }
}

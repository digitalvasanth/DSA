import java.util.*;
public class BinarySearch 
{
    public static int search(int arr[],int key)
    {
     int low=0;
     int high=arr.length-1;
     int mid=(low+high)/2;
     while(low<=high)
     {
        if(arr[mid]==key)
        return mid;
        else if (arr[mid]>key)
        {
            high=mid-1;
        }
        else 
        low=mid+1;

        mid=(low+high)/2;
     }
     return -1;
    }
    public static void main(String[] args)
    {
        int arr[]={10,20,30,40,50};
        int key=40;

        System.out.println(search(arr,key));
    }
}

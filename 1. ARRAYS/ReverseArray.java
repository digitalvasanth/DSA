public class ReverseArray 
{
public static void reverse(int arr[])
{
    int low=0;
    int  high =arr.length-1;
    while(low<high)
    {
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        low++;
            high--;
    }

}
    public static void main(String[] args)
    {
        int arr[]={1,2,4,55,6};
        System.out.println("Elements before Reversing");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        reverse(arr);
        System.out.println("Elements after Reversing");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

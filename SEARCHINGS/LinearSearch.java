public class LinearSearch 
{
    public static int search(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[]={4,31,4,4,5,64,2};
        int key=64;

        System.out.println(search(arr,key));
    }
    
}
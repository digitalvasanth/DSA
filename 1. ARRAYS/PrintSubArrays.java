public class PrintSubArrays 

{
    public static void printSubArrays(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
               for(int k=i;k<=j;k++)
               {
                System.out.print(arr[k]+" ");
               }
               System.out.println();
               System.out.println();
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[]={3,2,4,23,31};
        printSubArrays(arr);
    }
    
}

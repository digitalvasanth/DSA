
// Question 1 : Print the number of 7’s that are in the 2d array. Example :
// Input - int[][] array = { {4,7,8},{8,8,7} }; Output - 2


public class CountNoOf7 
{
    public static int countt(int arr[][])
    {
        int c=0;
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
              if(arr[i][j]==7)
                c=c+1;
            }
        }
       return c;
    }
    public static void main(String [] args)
    {
       int arr[][]= { {4, 7, 8}, {8, 8, 7} };
          System.out.println(countt(arr));
    }
}

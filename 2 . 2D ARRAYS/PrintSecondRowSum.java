public class PrintSecondRowSum {
    public static int print(int arr[][])
    {int sum=0;
        
        
for(int col=0;col<arr.length;col++){
       
            sum+=arr[1][col];

    }
        return sum;
    }
    public static void main(String[] args){
        int arr[][]={ {1,4,9},{11,4,3},{2,2,3} };

       System.out.println(print(arr));
    }
    
}

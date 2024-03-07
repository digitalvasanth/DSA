import java.util.*;



public class diagonalsum {

    public static void sum(int arr[][]){
        int sum=0;






        for(int i=0;i<arr.length;i++){
            //primarydiagonal
            sum+=arr[i][i];

            //secondarydiagonal
            if(i!=arr.length-i-1)
                sum+=arr[i][arr.length-i-1];
        }
        System.out.println("sum is "+sum);
    }











public static void main(String[] args) {
    int arr[][] = {
            {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}
    };

    sum(arr);
}
}

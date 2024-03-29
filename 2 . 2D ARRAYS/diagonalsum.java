


// Given a square matrix mat, return the sum of the matrix diagonals.

// Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

import java.util.*;
public class DiagonalSum{
    public static int sum(int arr[][]){
        int s=0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i][i];

            if(i!=arr.length-1-i)
            s+=arr[i][arr.length-1-i];
        }
        return s;
    }
    public static void main(String[] args)
    {
        int arr[][]={{1,2,3},
            {4,5,6},
            {7,8,9},};
          System.out.println(sum(arr));
    }
}
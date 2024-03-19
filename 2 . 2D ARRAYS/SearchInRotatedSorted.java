

import java.util.*;
public class SearchInRotatedSorted {
    public static void search(int arr[][],int key){
        int flag=0;

        int row=0;
        int col=arr.length-1;

        while(row<arr.length&&col>=0){
            if(arr[row][col]==key){
            flag=1;
            System.out.println("found at row "+row +" and column "+col);
            break;
            }
            else if(key<arr[row][col])
            col--;
            else
            row++;
        }
        if(flag==0)
        System.out.println("Not found");

    }
    public static void main(String[] args){
        int arr[][]={{10,20,30,40},
                {50,60,70,80},
                {90,100,120,130},
                {140,150,160,170}
        };
        search(arr,140);
    }
}

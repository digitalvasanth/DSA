import java.util.*;
public class searchInSorted2dArray {
    public static void search(int arr[][],int key){
        int flag=0;
        int row=0;
        int column=arr[0].length-1;

        while(row<arr.length&&column>=0){
            if(arr[row][column]==key) {
                System.out.print("Found key at " + row + "," + column);
                flag=1;
                break;
            }
            else if(key<arr[row][column])
                column--;
            else
                row++;
        }
if(flag==0)
    System.out.println("not found");
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

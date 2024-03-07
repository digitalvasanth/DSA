import java.util.*;
public class spiralmatrix {
    public static void spiralprint(int arr[][]){

        int startRow=0;
        int endRow=arr.length-1;
        int startColumn=0;
        int endColumn=arr[0].length-1;

        while(startRow<=endRow&&startColumn<=endColumn){

            //top
            for(int i=startColumn;i<=endColumn;i++){
                System.out.print(arr[startRow][i]+" ");
            }

            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endColumn]+ " ");
            }

            //bottom
            for(int i=endColumn-1;i>=startColumn;i--){

                if(startRow==endRow)
                    break;
                System.out.print(arr[endRow][i]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startColumn==endColumn)
                    break;
                System.out.print(arr[i][startColumn]+ " ");
            }

            startRow++;
            startColumn++;
            endRow--;
            endColumn--;



        }







    }
    public static void main(String[] args) {
   int arr[][]={{1,2,3,4},
           {5,6,7,8},
           {9,10,11,12},
           {13,14,15,16}





   };



   spiralprint(arr);
}
}

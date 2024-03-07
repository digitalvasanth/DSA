////import java.util.*;
////public class searchinrotatedandsorted {
////    public static int search(int arr[],int target,int si,int ei){
////        int mid=(si+ei)/2;
////        if(si>ei)
////            return -1;
////        if(arr[mid]==target)
////            return mid;
////
//////mid on L1
////        if(arr[si]<=mid){
////        //case a left
////            if(arr[si]<=target&&target>=arr[mid]){
////                return search(arr,target,si,mid);
////            }
////            //case b
////            else{
////                return search(arr,target,mid+1,ei);
////            }
////        }
////
//////mid on L2
////        else {
////            //case c right
////            if (arr[mid] <= target && target <= arr[ei])
////                return search(arr, target, mid, ei);
////
////            else {
////                return search(arr, target, si, mid - 1);
////            }
////        }
////    }
////
////
////
////    public static void main(String[] args){
////        int arr[]={4,5,6,0,7,2};
////        int target=6;
////
////       int targetidx=search(arr,target,0,arr.length-1);
////        System.out.println(targetidx);
////    }
////}
//
//
//public class searchrotatedsorted{
//
//
//
//
//    public static int cal(int arr[]){
//        int leftmax[]=new int [arr.length];
//        int rightmax[]=new int[arr.length];
//
//        int trapped=0;
//        int n=arr.length;
//        leftmax[0]=arr[0];
//        for(int i=1;i<n;i++){
//            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
//        }
//
//        rightmax[n-1]=arr[n-1];
//        for(int i=n-2;i>=0;i--)
//        {
//            rightmax[i]=Math.max(rightmax[n+1],arr[i]);
//
//        }
//
//
//
//    }
//   public static void main(String[] args){
//       int arr[]={3,0,2,0,4};//7
//       System.out.println(cal(arr));
//
//   }
//
//
//
//
//}


class searchrotatedarray{



    public static void main(String[] args){


        System.out.println(5>>4);




    }
}

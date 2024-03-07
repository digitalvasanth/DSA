import java.util.*;
public class buyandsellestockatmost2 {
    public static int profit(int arr[]){
        int fb=Integer.MIN_VALUE;
        int sb=Integer.MIN_VALUE;
        int fs=0;
        int ss=0;


        for(int i=0;i<arr.length;i++){
            fb=Math.max(fb,-arr[i]);
            fs=Math.max(fs,fb+arr[i]);
            sb=Math.max(sb,fs-arr[i]);
            ss=Math.max(ss,sb+arr[i]);

        }
        return ss;
    }
    public static void main(String[] args) {
        int arr[] = {3,3,5,0,0,3,1,4};

        System.out.println(profit(arr));
    }



}

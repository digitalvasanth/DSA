import java.util.*;
public class checkpowerof2 {
    public static void check(int n){
        if(n==0||n==-1)
            System.out.println("Not a power of 2");

        if((n&(n-1))==0)
            System.out.println(n + " is a power of 2");
        else
            System.out.println(n +" not a power of 2");
    }
    public static void main(String [] args){
        int n=4;
        check(n);
    }



}

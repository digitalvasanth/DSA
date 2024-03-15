import java.util.*;
public class Tiling {
    public static int countways(int n){
        if(n==0||n==1)
            return 1;
        //vertical choice
        int vc=countways(n-1);
        int hc=countways(n-2);

        return vc+hc;
    }
    public static void main(String [] args){
        int n=3;
        int ans=countways(n);
        System.out.println(ans);
    }
}

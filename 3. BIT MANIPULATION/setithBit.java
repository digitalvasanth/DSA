import java.util.*;
public class setithBit {


    public static int setithpos(int num,int i){
        int bitmask=1<<i;

        return num|bitmask;
    }
    public static void main(String[] args){
       int num= setithpos(10,2);
        System.out.println(num);
    }
}

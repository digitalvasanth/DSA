import java.util.*;
public class Clearithbit {
    public static int clear(int num,int i){
        int bitmask=~(1<<i);

        return num&bitmask;
    }
    public static void main(String[] args){
      int num=  clear(10,1);
        System.out.println(num);
    }
}

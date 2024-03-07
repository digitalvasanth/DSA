import java.util.*;
public class GetithBit {

    public static int findithbit(int num,int i){
        int bitmask=1<<i;


        if((num&bitmask)==0)
            return 0;
        else
            return 1;
    }




    public static void main(String [] args){
      int pos=  findithbit(10,1);
        System.out.println(pos);
    }
}

import java.util.*;
public class OddorEven {
    public static void main(String[] args){
        int num=10;
        int bitmask=1;

        if((num&bitmask)==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}

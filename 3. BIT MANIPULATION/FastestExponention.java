import java.util.*;
public class FastestExponention {
    public static int exponent(int number, int power){
        int ans=1;
        while(power!=0){
            if((power&1)!=0)
                ans=ans*number;
            else
                number=number*number;
            power=power>>1;

        }
        return ans;
    }
    public static void main(String[] args){
        int number=3;
        int power=2;
        int ans=exponent(number,power);
        System.out.println(ans);
    }
}

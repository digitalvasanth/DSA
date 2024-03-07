import java.util.*;
public class lengthofastring {
    public static int count(String word){
        if(word.length()==0)
            return 0;

        return count(word.substring(1))+1;
    }
    public static void main(String [] args){
        String word="vasanthkumar";

        int ans=count(word);
        System.out.println(ans);
    }
}

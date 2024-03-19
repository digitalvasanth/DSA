import java.util.*;
public class Anagrams {
    public static void main(String[] args)
    {
        String str1="earth";
        String str2="heart";

        //convert all characters into lowercase

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char new1[]=str1.toCharArray();
        char new2[]=str2.toCharArray();
        Arrays.sort(new1);
        Arrays.sort(new2);
        if(new1.length==new2.length)
        {
            boolean ans=Arrays.equals(new1, new2);
            if(ans)
            System.out.println("Yes both the Strings are Anagrams");
            else
            System.out.println("Strings are not anagrams");
        }
        else
        System.out.println("Strings are not anagrams");

    }
    
}

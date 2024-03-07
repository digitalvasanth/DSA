import java.util.*;
public class DuplicatesinString {
    public static void remove(String word,int idx,StringBuilder sb,boolean arr[]){

        if(idx==word.length()) {
            System.out.println(sb);
            return;
        }

        char currchar=word.charAt(idx);


        if(arr[currchar-'a']==true){
            remove(word,idx+1,sb,arr);
        }
        else{

            arr[currchar-'a']=true;
            remove(word,idx+1,sb.append(currchar),arr);
        }






    }
    public static void main(String [] args){
        String word="vasanthkumar";
        StringBuilder sb=new StringBuilder();
        boolean arr[]=new boolean[26];
       remove(word,0,sb,arr);
    }
}

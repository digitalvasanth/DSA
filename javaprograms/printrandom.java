import java.util.*;
class printrandom{
    public static void find(String str, String ans, int i){

        if(i==str.length()) {
            System.out.println(ans);
            return;
        }
        //yes condition
            find(str,ans+str.charAt(i),i+1);
        //no condition
            find(str,ans,i+1);

        }
//int arr[]=new int[5];
        public static void main(String [] args){
            String str="abc";
            String ans="";
            find(str,ans,0);
        }
    }

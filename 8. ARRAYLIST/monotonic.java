// Question 1 :
// Monotonic ArrayList (EASY)
// An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
// An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
// Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.

import java.util.*;
public class monotonic{
    public static boolean check( ArrayList<Integer>nums){
        int n=nums.size();
boolean inc=true;
boolean dec=true;
        for(int i=0;i<n-1;i++){
            if(nums.get(i)>nums.get(i+1))
            inc=false;
            if(nums.get(i)<nums.get(i+1))
            dec=false;
           
        }
        return inc||dec;

    }
    public static void main(String [] args){
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);

       System.out.println(check(nums));

    }
}
import java.util.*;
public class NextGreater {

public static void main(String [] args)
{
    int arr[]={6,8,0,1,3};
    Stack<Integer>s=new Stack<>();

    int ans[]=new int[arr.length];


    for(int i=arr.length-1;i>=0;i--)
    {
        while(!s.isEmpty()&&arr[s.peek()]<=arr[i])
        {
            s.pop();
        }
        if(s.isEmpty())
        ans[i]=-1;
        else
        ans[i]=arr[s.peek()];


        s.push(i);
    }


    for(int i=0;i<ans.length;i++)
    {
        System.out.println(ans[i]+" ");
    }
    System.out.println();
}


    
}

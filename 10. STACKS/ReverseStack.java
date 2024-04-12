import java.util.*;

public class ReverseStack {
    public static void print(Stack<Integer>s){
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }

    }
    public static void pushatbottom(Stack<Integer>s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushatbottom(s, data);
        s.push(top);
    }
    public static void reverse(Stack<Integer>s)
    {
        if(s.isEmpty())
        return;

        int top=s.pop();
        reverse(s);
        pushatbottom(s, top);
    }

    public static void main(String [] args)
    {
        Stack<Integer>s=new Stack<>();

        s.push(3);
        s.push(2);
        s.push(1);
System.out.println("BEFORE REVERSING");
      print(s);
      reverse(s);
      System.out.println("AFTER REVERSING");
      print(s);

    
}
}
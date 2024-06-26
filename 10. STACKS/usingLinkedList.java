public class usingLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
static class StackA
{
    static Node head=null;

    public static boolean isEmpty()
    {
        return head==null;
    }
//push
    public static void push(int data)
    {
        Node newnode=new Node(data);
        if(isEmpty())
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    //pop
    public static int pop()
    {
        if(isEmpty())
        return -1;
        int top=head.data;
        head=head.next;
        return top;
    }
    //peek
    public static int peek()
    {
        if(isEmpty())
        return -1;
        int top=head.data;
        return top;

    }


}
public static void main(String [] args)
    {
       StackA s=new StackA();
        s.push(3);
        s.push(2);
        s.push(1);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }

    }

}
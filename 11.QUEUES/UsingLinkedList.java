public class UsingLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    static class Queue
    {
public static Node head=null;
public static Node tail =null;

public static boolean isEmpty()
{
    return head==null&&tail==null;

}
public static void add(int data)
{
Node newnode=new Node(data);
if(tail==null)
{
    tail=head=newnode;
    return;
}
tail.next=newnode;
tail=newnode;
}
public static int remove()
{
    if(isEmpty())
    return -1;

    int result=head.data;

    if(head==tail)
    {
        tail=null;
        
    }
    head=head.next;
    return result;
}
public static int peek(){
    if(isEmpty())
    return -1;


    return head.data;
}


    }
    public static void main(String [] args)
    {
        Queue q=new Queue( );
    q.add(4);
    q.add(3);
    q.add(2);
    q.add(1);

    while(!q.isEmpty())
    {
        System.out.println(q.peek());
        q.remove();
    }
    }
}

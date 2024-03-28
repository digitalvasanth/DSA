import java.util.*;
public class RemoveCycle
{
public static class Node
{
int data;
Node next;

public Node(int data)
{
this.data=data;
this.next=null;
}
}
public static Node head;
public static Node tail;



public static boolean iscycle()
{
    Node slow=head;
    Node fast=head;

    while(fast!=null&&fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;


        if(slow==fast)
        return true;
    }
    return false;
}

public static void remove(){

//detect cycle
boolean cycle=false;


Node slow=head;
Node fast=head;

while(fast!=null&&fast.next!=null)
{
    slow=slow.next;
    fast=fast.next.next;

    if(slow==fast)
    {
        cycle=true;
        break;
    }
}



if(cycle==false)
return ;

//check meeting point
slow=head;
Node prev=null;

while(slow!=fast)

{
    slow=slow.next;
    prev=fast;
    fast=fast.next;
}

//remove node
prev.next=null;

}

public static void main(String args[])
{
    head =new Node(1);

    Node temp=new Node(2);
    head.next=temp;
  
    head.next.next=new Node(3);
    head.next.next.next=temp;
    

    System.out.println(iscycle());

    remove();
    System.out.println(iscycle());





}

}



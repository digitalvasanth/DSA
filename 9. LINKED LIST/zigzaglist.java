import java.util.*;
public class zigzaglist
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

public void addfirst(int data)
{

Node newnode = new Node(data);
if(head==null)
{
   head=tail=newnode;
   return;

}


newnode.next=head;
head=newnode;


}

public void addmiddle(int index,int data)
{
    Node newnode=new Node(data);


    if(index==0)
    {
        addfirst(data);
        return;
    }
   int  i=0;
   Node temp=head;
   while(i<index-1){
    temp=temp.next;
    i++;
   }
   newnode.next=temp.next;
   temp.next=newnode;
  


}
public void addlast(int data)
{
    Node newnode=new Node(data);
    if(head==null)
    {
        head=tail=newnode;
        return;
    }

    tail.next=newnode;
    tail=newnode;
}
public static void print()
{
    if(head==null){
    System.out.println("Linked List is empty");
    return ;}

    Node temp=head;
    while(temp!=null)
    {
        System.out.println( temp.data+" ");
        temp=temp.next;
        
    }

    System.out.println();

}

public static void zigzag()
{
Node slow=head;
Node fast=head;

while(fast!=null&&fast.next!=null)
{
    slow=slow.next;
    fast=fast.next.next;
}
Node mid=slow;

Node curr=mid.next;
mid.next=null;

}

public static void main(String args[])
{
    zigzaglist ll=new zigzaglist();

    ll.addlast(5);
    ll.addlast(4);
    ll.addlast(3);
    ll.addlast(2);
    ll.addlast(1);

    
    print();
    zigzag();
    print();


}

}



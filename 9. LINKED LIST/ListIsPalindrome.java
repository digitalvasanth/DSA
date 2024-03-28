import java.util.*;
public class ListIsPalindrome
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
public  Node findMid (Node head ){
    Node slow=head;
    Node fast=head;

    while(fast!=null&&fast.next!=null)
    {
        slow=slow.next;//+1
        fast=fast.next.next;//+2
    }

    return slow;

}
public boolean checkpalindrome( )
{   //if 0 elements or 1 element present in list
    if(head==null||head.next==null)
    return true;

    // STEP 1 finding mid node
    Node mid=findMid(head);


    //step 2 reverse second half
    Node prev=null;
    Node curr=mid;
    Node next;


    while(curr!=null)
    {   next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    //right pointer at starting of reversednodes
    Node right=prev;
    Node left=head;

    while(right!=null)
    {
        if(left.data!=right.data)
        return false;

        left=left.next;
        right=right.next;
    }

    return true;


}
public static void main(String args[])
{
    ListIsPalindrome ll=new ListIsPalindrome();

   ll.addlast(1);
   ll.addlast(2);
   ll.addlast(2);
   ll.addlast(1);
    print();
System.out.println(ll.checkpalindrome());


}

}



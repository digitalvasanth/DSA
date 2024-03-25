import java.util.*;
public class RemoveNodes
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
public static int size;

public void addfirst(int data)
{

Node newnode = new Node(data);
size++;
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
    size++;


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
    size++;
    if(head==null)
    {
        head=tail=newnode;
        return;
    }

    tail.next=newnode;
    tail=newnode;
}

public int removefirst()
{
    if(size==0){
        System.out.println("List is Empty");
    return Integer.MIN_VALUE;
    }
    else if(size==1)
    {
        int val=head.data;
        
        head=tail=null;
        size=0;
        return val;

    }
    
        int val=head.data;
        head=head.next;
        size--;
        return val;
    
  
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
public static void main(String args[])
{
    RemoveNodes ll=new RemoveNodes();

    ll.addfirst(1);
    ll.addfirst(2);
    ll.addlast(23);
    ll.addmiddle(1, 100);
    ll.addlast(44);
    ll.addlast(332);

    print();
    ll.removefirst();
    print();


}

}



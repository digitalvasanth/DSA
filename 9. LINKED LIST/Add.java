import java.util.*;
public class Add
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
public static void main(String args[])
{
    Add ll=new Add();

    ll.addfirst(1);
    ll.addfirst(2);
    ll.addlast(23);
    ll.addlast(44);
    print();


}

}



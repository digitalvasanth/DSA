import java.util.*;public class ReverseDoubleLL {
    public class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
           head=tail=newnode;
           return ;
        }

       newnode.next=head;
       head.prev=newnode;
       head=newnode;
    }
    public static void print()
    {
        Node temp=head;
        while(temp!=null)
        {System.out.println(temp.data+" ");
            temp=temp.next;
        }

    }
    public static void reverse()
    {
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
            
        }
        head=prev;
    }
    
    public static void main(String [] args)
    {
        ReverseDoubleLL dl=new ReverseDoubleLL();
        dl.addfirst(5);
        dl.addfirst(6);
        dl.addfirst(7);
        dl.addfirst(9);
        System.out.println("before reversing");
        print();
        reverse();
        System.out.println("After reversing");
        print();


        
    }
    
}

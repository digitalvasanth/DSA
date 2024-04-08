public class DoubleLinkedList {
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
    public void removeFirst(){
        if(head==null)
        {
            System.out.println("List is Empty");
            return ;
        }

        head=head.next;
        head.prev=null;
    }


    public static void main(String [] args)
    {
        DoubleLinkedList dl=new DoubleLinkedList();
        dl.addfirst(5);
        dl.addfirst(6);
        dl.addfirst(7);
        print();
        System.out.println();
        dl.removeFirst();
        print();
    }
    
}

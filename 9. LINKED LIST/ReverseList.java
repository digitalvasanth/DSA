public class ReverseList
 {
    class Node
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

    public void addFirst(int data)
    {
        Node newnode=new Node(data);

        if(head==null)
        {
           head=tail=newnode;
        }
        else{
       newnode.next=head;
       head=newnode;
        }


    }
    public void print()
    {
        if(head==null){
            System.out.println("List is empty");
            return ;
        }
        else
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.println(temp.data+ " ");
                temp=temp.next;
            }
            System.out.println();
        }

        }
        public void reverse()
        {
            Node prev=null;
            Node curr=head;
            Node next;

            while(curr!=null)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }

    public static void main(String[] args)
    {
        ReverseList list=new ReverseList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);
        list.print();
        list.reverse();
        list.print();
    }

    
}


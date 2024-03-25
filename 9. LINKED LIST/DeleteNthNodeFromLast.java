public class DeleteNthNodeFromLast
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
        else
        {
       newnode.next=head;
       head=newnode;
        }


    }
    public void print()
    {
        if(head==null)
        {
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
        public void deletenth(int n)
        {
            int size=0;
            Node temp=head;
            while(temp!=null)
            {
                temp=temp.next;
                size++;
            }

            
            int i=1;
            int wantedidx=size-n;
                Node prev=head;
            while(i<wantedidx)
            {
                prev=prev.next;
                i++;
                
            }
            if(n==size)
            {
               head=head.next;
               return ;
            }
            
           
            prev.next=prev.next.next;
           
        }
       

    public static void main(String[] args)
    {
        DeleteNthNodeFromLast list=new DeleteNthNodeFromLast();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);
        System.out.println("Before Deletion");
        list.print();
        int n=2;
        list.deletenth(n);
        System.out.println("After Deletion");
        list.print();

    }

    
}


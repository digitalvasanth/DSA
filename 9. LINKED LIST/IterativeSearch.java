public class IterativeSearch
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

    // public static void print()
    // {Node temp=head;
    //     if(head==null){
    //     System.out.println("List is empty");
    //     return;
    //     }

        
    //     while(temp!=null)
    //     {
    //         System.out.println(temp.data+ " ");
    //         temp=temp.next;
    //     }
    //     System.out.println();

    // }

    public static void search(int key)


    {
        if(head==null){
        System.out.println("List is empty");
        return ;
        }
        else{
        int i=0;
        Node temp=head;
       int  flag=0;
        while(temp!=null)
        {
            if(temp.data==key){
            System.out.println("found at "+ i);
            flag=1;
            return;
            }
            i++;
            temp=temp.next;
        }
        if(flag==0)
        System.out.println("Not found");
    }

    }

    public static void main(String[] args)
    {
        IterativeSearch list=new IterativeSearch();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);
        search(0);
    }

    
}


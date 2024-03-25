
public class RecursiveSeaerch
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


    public int helper(int key,Node head)
    {
        if(head==null)
        return -1;
        if(head.data==key)
        return 0;
        int idx=helper(key, head.next);
        if(idx==-1)
        return -1;

        return idx+1;
    }

    public  int  search(int key,Node head)


    {
       return  helper(key,head);
       
    }

    

    public static void main(String[] args)
    {
        RecursiveSeaerch list=new RecursiveSeaerch();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);
        System.out.println(list.search(2, head));
    }

    
}


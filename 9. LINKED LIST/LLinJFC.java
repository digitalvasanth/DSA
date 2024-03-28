import java.util.LinkedList;


public class LLinJFC

{
    public static void main(String [] args)
    {
        LinkedList<Integer>ll=new LinkedList<>();

        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(5);
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);
    }

    
}

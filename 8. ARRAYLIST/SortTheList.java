import java.util.ArrayList;
import java.util.Collections;

public class SortTheList {
    public static void main(String [] args){
        ArrayList<Integer>list=new ArrayList<>();
   

    list.add(8);
    list.add(1);
    list.add(2);
    list.add(2);

    System.out.println("Before Sort");
    System.out.println(list);

    Collections.sort(list);
    System.out.println("After sort");
    System.out.println(list);

    Collections.sort(list,Collections.reverseOrder());
    System.out.println("reverse sort");
    System.out.println(list);

    }
    
}

import java.util.*;
public class multidimenstional
 {

    public static void main(String [] args)
    {
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();


        ArrayList<Integer>list1 =new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        ArrayList<Integer>list2 =new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);


        mainList.add(list1);
        mainList.add(list2);


        System.out.println(mainList);



        

    }
}

import java.util.*;
class findmaximum{
    public static void main(String [] args)
{
    ArrayList<Integer>list=new ArrayList<>();
    int max=Integer.MIN_VALUE;

    list.add(8);
    list.add(1);
    list.add(2);
    list.add(2);

    for(int i=0;i<list.size();i++)
    {
        if(list.get(i)>max)
        max=list.get(i);

    }

System.out.println("Maximum element is "+ max);

}}
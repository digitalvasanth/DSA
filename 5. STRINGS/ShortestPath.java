import java.util.*;
public class ShortestPath {
    public static float shortpath(String s){
        int x=0;
        int y=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='N')
                y++;
            else if(ch=='S')
                y--;
            else if(ch=='W')
                x--;
            else
                x++;

        }
        int X2=x*x;
        int Y2=y*y;
        float distance=(float)Math.sqrt(X2+Y2);

return distance;

    }
    public static void main(String [] args)
    {
      String path="WNEENESENNN";
     float ans= shortpath(path);
        System.out.println(ans);
    }
}

public class ShortestPath {
  
    public static int find(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++)
        {
            char letter=path.charAt(i);
            if(letter=='S')
            x--;
            else if (letter=='N')
            x++;
            else if (letter=='E')
            y++;
            else 
            y--;

        }
        int X2=x*x;
        int Y2=y*y;
        int ans=(int)Math.sqrt(X2+Y2);
        return ans;
    }
public static void main(String args[][])
{
    String path="WNEENESENNN";
    System.out.println(find(path));
}

    
}

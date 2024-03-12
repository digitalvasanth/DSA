import java.util.*;
class nqueens {
    public static boolean isSafe(int row,int col,char[][]board)
    {
        //horizontal
        for(int j=0;j<board.length;j++)
        {
            if(board[row][j]=='Q')
            return false;
            }
    
        //vertical
        for(int i=0;i<board[0].length;i++)
        {
            if(board[i][col]=='Q')
            return false;
    
        }
       
    
        //upper left
        int r=row;
        for(int c=col;c>=0&&r>=0;r--,c--)
        {
            if(board[r][c]=='Q')
            return false;
        }
    
    
        //upper right
        r=row;
        for(int c=col;c<board.length&&r>=0;r--,c++)
        {
            if(board[r][c]=='Q')
            return false;
        }
    
        //lowerleft
        r=row;
        for(int c=col;c>=0&&r<board.length;r++,c--)
        {
            if(board[r][c]=='Q')
            return false;
        }
    
        //lower right
        r=row;
        for(int c=col;c<board.length&&r<board[0].length;r++,c++)
        {
            if(board[r][c]=='Q')
            return false;
        }
    
    return true;
        }
    
    
    
    
        public static void helper(char[][]board,List<List<String>>allBoards,int col)
        {
    
            if(col==board.length)
            {
            save(board,allBoards);
            return;
            }
    
    
            for(int row=0;row<board.length;row++)
            {
                if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board,allBoards,col+1);
                board[row][col]='.';
                }
            }

   
   
        }
    
    
    public static void save(char[][]board,List<List<String>>allBoards){
    List<String>newboard=new ArrayList<>();
    String row="";
        for(int i=0;i<board[0].length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q')
                row+='Q';
                else
                row+='.';
            }
            newboard.add(row);
        }
        allBoards.add(newboard);

    }
    
        public static void main (String[]args)
        {int n=4;
            List<List<String>>allBoards=new ArrayList<>();
    
        char board[][]=new char [n][n];
    
        helper(board,allBoards,0);
            System.out.println(allBoards);

       
        }
    }
class subsets{
    public static void perm(String str,String perm, int idx){
        if(str.length()==0){
        System.out.println(perm);
        return ;
        }
        for(int i=0;i<str.length();i++){
        char curr=str.charAt(i);
        String newstr=str.substring(0,i)+str.substring(i+1);
        perm(newstr,perm+curr,idx+1);
        }

    }
    public static void main(String [] args){
        String str="abc";

        perm(str, "", 0);
    }
}
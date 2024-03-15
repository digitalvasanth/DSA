public class arraydupliaction {
    public static boolean check (int arr[]){
int flag=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) {
                    flag=1;

                }

            }
        }
      if(flag!=0)
          return true;
      else
          return false;

    }
    public static void main(String[] args)
    {
      int arr[]={1,2,3,7};
      boolean ans=check(arr);
        if(ans)
            System.out.println("Dupliacates found");
        else
            System.out.println("All are Distinct");
    }
}

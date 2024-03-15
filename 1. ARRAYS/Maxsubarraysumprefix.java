public class Maxsubarraysumprefix {
    public static int sum(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];

        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                currsum=i==0?prefix[j]:prefix[j]-prefix[i-1];
            }
            maxsum=Math.max(currsum,maxsum);
        }
        return maxsum;
    }
    public static void main(String [] args){
        int arr[]={5,4,-1,7,8};
        System.out.println(sum(arr));
    }
}

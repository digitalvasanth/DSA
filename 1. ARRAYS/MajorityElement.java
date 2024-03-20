class MajorityElement{
    public static void main(String[] args)
    {
        int arr[]={ 1, 1, 2, 1, 3, 5, 1 };
        int maxcount=0;
        int index=-1;



        for(int i=0;i<arr.length;i++)
        {int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                count++;
            }

            if(count>maxcount)
            {
                maxcount=count;
                index=i;
            }

            
        }

        if(maxcount>arr.length/2)
        System.out.println(arr[index]+" is majority element");
        else
        System.out.println("No majority element found");


    }
}
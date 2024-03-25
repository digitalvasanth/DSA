class Fibbonacci{
    public static int fib(int x){
        if(x==0||x==1)
        return 1;

        int fib1=fib(x-1);
        int fib2=fib(x-2);

        return fib1+fib2;
    }
    public static void main(String [] args)
    {
        int n=5;

        System.out.println(fib(n));
    }
}
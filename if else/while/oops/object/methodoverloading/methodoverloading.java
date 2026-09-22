class calculator{
    int add(int a,int b)
    {
         return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
}


public class methodoverloading {
    public static void main(String args[])
    {
        calculator c =new calculator();
        System.out.println(c.add(4,5));
        System.out.println(c.add(4,6,8));
    }
    
}
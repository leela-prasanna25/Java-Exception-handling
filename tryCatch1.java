//Handle Runtime error
public class tryCatch1{
    public static void main(String args[])
    {
        try{
            int a=10/0; //error
            System.out.println(a);
        }catch(ArithmeticException e)
        {
            System.out.println("cannot divide by zero");
        }
        System.out.println("program continues");
    }
}
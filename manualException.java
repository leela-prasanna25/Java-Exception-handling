//create own exception
public class manualException {
   public static void checkAge(int age)
   {
    if(age<18)
    {
        throw new ArithmeticException("Not Eligibile");
    }
    System.out.println("Eligibile");
   }
   public static void main(String args[])
   {
     checkAge(18);
   }
}

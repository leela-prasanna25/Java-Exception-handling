//create your own exception(Advanced)
// import java.io.IOException;
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg)
    {
        super(msg);
    }
}
public class manualException1  {

    static void vote(int age) throws InvalidAgeException{
        if(age<18)
        {
            throw new InvalidAgeException("Under age");
        }
        System.out.println("can vote");
    }
    public static void main(String args[])
    {
        try{
            vote(16);
        }catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

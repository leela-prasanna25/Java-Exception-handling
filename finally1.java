public class finally1 {
    public static void main(String args[])
    {
        try{
            int x=5/0;
        }catch(Exception e)
        {
            System.out.println("Error");
        }
        finally{
            System.out.println("Always run");
        }
    }
    
}

//Handle file error
import java.io.FileReader;
import java.io.IOException;
public class tryCatch2 {
    public static void main(String args[])
    {
        try{
            FileReader fr=new FileReader("test.txt");     
        }catch(IOException e)
        {
            System.out.println("File not Found");
        }
    }
    
}

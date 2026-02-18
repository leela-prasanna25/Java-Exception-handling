import java.io.IOException;
import java.io.FileReader;
public class throws1 {

    static void readFile() throws IOException{
        FileReader fr=new FileReader("test.txt");

    }
    public static void main(String args[])
    {
        try{
            readFile();
        }catch(IOException e){
            System.out.println("Handled in main");
        }

    }
    
}

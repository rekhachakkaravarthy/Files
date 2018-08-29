import java.io.FileReader;

/**
 * Created by sirisha on 29/8/18.
 */
public class FileReaderDemo {
    public static void main(String arg[])
    {
         try {
             FileReader fileReader = new FileReader("/home/sirisha/workspace/Rekha/src/data1");
             int intVal;
             while ((intVal = fileReader.read()) >= 0) {
                 char charVal = (char) intVal;
                 System.out.println(charVal);
             }
         }
        catch(Exception e)
             {
                 e.printStackTrace();
             }
    }
}

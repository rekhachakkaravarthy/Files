import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by sirisha on 29/8/18.
 */
public class BufferedReaderDemo {
    public static void main(String arg[])
    {
        try {
            FileReader fileReader = new FileReader("/home/sirisha/workspace/udemy/Resources/data");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int intVal;
            String line;
            //while((intVal=bufferedReader.read())>=0) {
                //char charVal = (char) intVal;

                //System.out.println(intVal);
                //System.out.println(charVal);
          //  }
            while ((line=bufferedReader.readLine())!=null)
            {
                //System.out.println("Read..");
                System.out.println(line);

            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}

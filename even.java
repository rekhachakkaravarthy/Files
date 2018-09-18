import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Created by sirisha on 13/9/18.
 */
public class even {
    public static void main(String arg[]) throws Exception
    {
        FileWriter fileWriter=new FileWriter("num.txt");
        PrintWriter printWriter=new PrintWriter(fileWriter);
        for(int i=1;i<=20;i++)
            if(i%2==0)
           printWriter.print(i+"\n");
           printWriter.print("\n");
           printWriter.close();

    }
}

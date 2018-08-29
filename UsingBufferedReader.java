import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;



public class FilePractice {
    public static void main(String arg[])
    {
        long startime=System.nanoTime();

        try {


            FileReader fileReader=new FileReader("/home/sirisha/IdeaProjects/practice/src/data");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null)
            {
                System.out.println(line);

            }
            long endtime=System.nanoTime();
            long total=startime-endtime;
            System.out.println(total);

        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


}

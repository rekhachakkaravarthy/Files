import java.io.BufferedReader;
import java.io.FileReader;

public class FilePractice1 {


    public static void main(String arg[]) {
        long startime = System.nanoTime();

        try {


            FileReader fileReader = new FileReader("/home/sirisha/IdeaProjects/practice/src/data");
            //BufferedReader bufferedReader = new BufferedReader(fileReader);
            int line;
            while((line=fileReader.read())!=-1){
                System.out.println((char)line);

            }
            long endtime = System.nanoTime();
            long total = startime - endtime;
            System.out.println(total);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}



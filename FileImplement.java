/**
 * Created by sirisha on 26/8/18.
 */
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Collections;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileImplement {

    public static void UsingBufferedReader() {

        try {
             System.out.println("Using BufferedReader..");
            File file = new File("/home/sirisha/workspace/udemy/Resources/data");

            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void UsingScanner() {
        try {

            System.out.println("Using scanner..");
            File file = new File("/home/sirisha/workspace/udemy/Resources/data");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void UsingFileReader() {
        try {
            System.out.println("Using FileReader..");
            FileReader fr = new FileReader("/home/sirisha/workspace/udemy/Resources/data");
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void UsingPath()
    {
        System.out.println("Using List..");

        try
        {
            Path pathFileToRead=Paths.get("/home/sirisha/workspace/udemy/Resources/data");

            List<String> lines=Files.readAllLines(pathFileToRead);
            System.out.println(lines);
        }

        catch (Exception e)
        {

           e.printStackTrace();
        }

    }






}




















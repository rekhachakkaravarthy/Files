/**
 * Created by sirisha on 26/8/18.
 */
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
public class FilesRunner {
    public static void main(String arg[]) {
       //System.out.println("Enter the way you want to read file..") ;
        FileImplement implement=new FileImplement();
        implement.UsingBufferedReader();
        implement.UsingScanner();
        implement.UsingFileReader();
        implement.UsingPath();



}
}

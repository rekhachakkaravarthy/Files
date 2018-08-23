import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Created by sirisha on 23/8/18.
 */
public class removeDuplicateLines {
    public static void main(String arg[])
    {
        try {
            //FileReader fileReader = new FileReader("/home/sirisha/Pictures/rekha/test1");
            FileInputStream fileInputStream = new FileInputStream("/home/sirisha/Pictures/rekha/test1");
            DataInputStream dataInputStream=new DataInputStream(fileInputStream);
            HashSet<String> hashSet=new HashSet <String>();
            TreeSet<String> treeSet=new TreeSet <String>();
            LinkedHashSet<String> linkedHashSet=new LinkedHashSet <String>();
            String strLine;
            while ((strLine=dataInputStream.readLine())!=null)
            {
                hashSet.add(strLine);
                treeSet.add(strLine);
                linkedHashSet.add(strLine);
            }
            System.out.println(hashSet);
            System.out.println(treeSet);
            System.out.println(linkedHashSet);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

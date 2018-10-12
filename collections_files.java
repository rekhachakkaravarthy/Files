import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

/**
 * Created by sirisha on 11/10/18.
 */
public class collections_files {
    public void storeFileArrayList(String inputpath, String outputpath) {
        File inputfile = new File(inputpath);
        File outputfile = new File(outputpath);
        try {
            FileReader fileReader = new FileReader(inputfile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(outputfile);
            ArrayList <String> arrayList = new ArrayList <>();
            String line;
            while ((line = bufferedReader.readLine()) != null)

            {
                arrayList.add(line);
            }

            System.out.println("Using ArrayList..");

            for(String line1:arrayList)
            {
                fileWriter.write(line1);
                fileWriter.write("\n");

            }
            //System.out.println(arrayList);
            fileWriter.close();

        } catch (Exception e) {
            e.toString();
        }
    }
    public void storeFileLinkedList(String inputpath, String outputpath) {
        File inputfile = new File(inputpath);
        File outputfile = new File(outputpath);
        try {
            FileReader fileReader = new FileReader(inputfile);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            FileWriter fileWriter=new FileWriter(outputfile);
            LinkedList<String> linkedList=new LinkedList <>();
            String line;
            while ((line = bufferedReader.readLine()) != null)

            {
                linkedList.add(line);
            }
            System.out.println("Using LinkedList..");
            for(String line1:linkedList)
            {
                fileWriter.write(line1);
                fileWriter.write("\n");

            }
            fileWriter.close();
        }
        catch (Exception e)
        {
            e.toString();
        }


    }

    public void storeFileHashSet(String inputpath, String outputpath) {
        File inputfile = new File(inputpath);
        File outputfile = new File(outputpath);
        try {
            FileReader fileReader = new FileReader(inputfile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(outputfile);
            HashSet<String> hashSet = new HashSet <>();
            String line;
            while ((line = bufferedReader.readLine()) != null)

            {
                hashSet.add(line);


            }
            System.out.println("Using Hashset..");
            for(String line1:hashSet)
            {
                fileWriter.write(line1);
                fileWriter.write("\n");

            }
            fileWriter.close();
        } catch (Exception e) {
            e.toString();
        }
    }

    public void storeFileTreeSet(String inputpath, String outputpath) {
        File inputfile = new File(inputpath);
        File outputfile = new File(outputpath);
        try {
            FileReader fileReader = new FileReader(inputfile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(outputfile);
            TreeSet<String> treeSet = new TreeSet<>();
            String line;
            while ((line = bufferedReader.readLine()) != null)

            {
                treeSet.add(line);

            }
            System.out.println("Using TreeSet..");
            for(String line1:treeSet)
            {
                fileWriter.write(line1);
                fileWriter.write("\n");

            }
            fileWriter.close();
        } catch (Exception e) {
            e.toString();
        }
    }

    public void storeFileLinkedHashSet(String inputpath, String outputpath) {
        File inputfile = new File(inputpath);
        File outputfile = new File(outputpath);
        try {
            FileReader fileReader = new FileReader(inputfile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(outputfile);
            LinkedHashSet<String> linkedHashSet=new LinkedHashSet <>();
            String line;
            while ((line = bufferedReader.readLine()) != null)

            {
                linkedHashSet.add(line);

            }
            System.out.println("Using LinkedHashSet..");
            for(String line1:linkedHashSet)
            {
                fileWriter.write(line1);
                fileWriter.write("\n");

            }
            fileWriter.close();
        } catch (Exception e) {
            e.toString();
        }
    }



    public static void main(String arg[]) {
        collections_files collectionsFiles=new collections_files();
        collectionsFiles.storeFileArrayList("/home/sirisha/workspace/Practice/src/input.txt","/home/sirisha/workspace/Practice/src/output_usingArrayList.txt");
        collectionsFiles.storeFileLinkedList("/home/sirisha/workspace/Practice/src/input.txt","/home/sirisha/workspace/Practice/src/output_usingLinkedList.txt");
        collectionsFiles.storeFileHashSet("/home/sirisha/workspace/Practice/src/input.txt","/home/sirisha/workspace/Practice/src/output_usingHashset.txt");
        collectionsFiles.storeFileTreeSet("/home/sirisha/workspace/Practice/src/input.txt","/home/sirisha/workspace/Practice/src/output_usingTreeset.txt");
        collectionsFiles.storeFileLinkedHashSet("/home/sirisha/workspace/Practice/src/input.txt","/home/sirisha/workspace/Practice/src/output_usingLinkedHashset.txt");







    }
}

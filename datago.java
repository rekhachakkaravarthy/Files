import java.io.*;
import java.util.Scanner;

public class datago {
    public void readFile_Using_FileReader(String inputpath, String outputpath)
    {

        File file1=new File(inputpath);
        File file2=new File(outputpath);
        try {
            FileReader fileReader = new FileReader(file1);
            FileWriter fileWriter=new FileWriter(file2);
            int st;
            while((st=fileReader.read())!=-1)
            {
                fileWriter.write(st);
            }
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void readFile_Using_FileInputStream(String inputpath, String outputpath)
    {
        File file1=new File(inputpath);
        File file2=new File(outputpath);
        try{
            FileInputStream fileInputStream=new FileInputStream(file1);
            FileOutputStream fileOutputStream=new FileOutputStream(file2);
            int st;
            while((st=fileInputStream.read())!=-1)
            {
                fileOutputStream.write(st);


            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
     public void readFile_Using_Scanner(String inputpath, String outputpath)
     {
         File file3=new File(inputpath);
         File file4=new File(outputpath);
         try{
             Scanner scanner=new Scanner(file3);
             FileWriter fileWriter=new FileWriter(file4);
             while (scanner.hasNextLine())
             {

                 String string=scanner.nextLine();
                 fileWriter.write(string);
                 fileWriter.write('\n');
             }
            }
         catch (Exception e)
         {
             e.printStackTrace();
         }
     }
     public void readFile_Using_BufferedReader(String inputpath, String outputpath)
     {
         File file5=new File(inputpath);
         File file6=new File(outputpath);
         try {
             FileReader fileReader=new FileReader(file5);
             BufferedReader bufferedReader=new BufferedReader(fileReader);
             FileWriter fileWriter=new FileWriter(file6);
             BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
             String str;
             while((str=bufferedReader.readLine())!=null)
             {
                 bufferedWriter.write(str);

             }

         }
         catch (Exception e)
         {
             e.printStackTrace();
         }
     }


    public static void main(String args[])
    {
        long starttime = System.currentTimeMillis();
        datago datago1=new datago();
        datago1.readFile_Using_FileReader("/home/sirisha/IdeaProjects/practice/src/data", "/home/sirisha/IdeaProjects/practice/src/data_file_reader");
        long endtime = System.currentTimeMillis();
        long totaltime = (endtime - starttime);
        System.out.println(totaltime+ " "+ "milli seconds"+ " " + "file reader");
        long starttime1=System.currentTimeMillis();
        datago1.readFile_Using_FileInputStream("/home/sirisha/IdeaProjects/practice/src/data", "/home/sirisha/IdeaProjects/practice/src/data_using_filestream");
        long endtime1=System.currentTimeMillis();
        long totaltime1=endtime1-starttime1;
        System.out.println(totaltime1+ " "+ "milli seconds"+ " "+ "file inputstream");
        long starttime2=System.currentTimeMillis();
        datago1.readFile_Using_Scanner("/home/sirisha/IdeaProjects/practice/src/data", "/home/sirisha/IdeaProjects/practice/src/data_using_scanner");
        long endtime2=System.currentTimeMillis();
        long totaltime2=endtime2-starttime2;
        System.out.println(totaltime2+ " "+ "milli seconds"+ " " + "scanner");
        long starttime3= System.currentTimeMillis();
        datago1.readFile_Using_BufferedReader("/home/sirisha/IdeaProjects/practice/src/data", "/home/sirisha/IdeaProjects/practice/src/data_using_bufferedReader");
        long endtime3=System.currentTimeMillis();
        long totaltime3=endtime3-starttime3;
        System.out.println(totaltime3+ " "+ "milli seconds"+ " " + "Bufferedreader");



    }
}

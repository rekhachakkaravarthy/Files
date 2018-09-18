/**
 * Created by sirisha on 5/9/18.
 */
import java.io.*;
public class fib {
    public static void main(String arg[]) {
        int a1 = 0;
        int a2 = 1;
        int a3 = 0;

            try {

                FileWriter fileWriter=new FileWriter("sample.txt");
                PrintWriter printWriter=new PrintWriter(fileWriter);
                for(int i=0;i<=20;i++) {

                a3=a1+a2;
                a1=a2;
                a2=a3;
                printWriter.print(a3);
                printWriter.print("\n");


                                }
                                printWriter.close();


            }
            catch (Exception e)
            {
                e.toString();
            }

                }


            }




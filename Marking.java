import java.io.*;
import java.FileOutputStream;
import java.io.IOEcception;
import java.nio.channels.FileChannel;
import javax.xml.soap.Text;
package mypack;
import java.io.File;
import java.sql.Array;
import java.util.Arrays;
import static com.sun.tools.classfile.InnerClasses_attribute.Info.length;
import static java.sql.DriverManager.println;
public class ReadLargeTextWithNIO
{
public void main (String args[] )throws IOException
{
FileInputStream fin = new FileInputStream("");
FileChannel fcin = fin.getChannel();}
}


public class Emphasis {

    public static void main(String[] args) {
        Paragraph paragraph = new Paragraph(Collectinos.singletionList(
                new Strong(Array.asList(
                        new Text("1");
                        new Strikeout(Arrays.saList(
                                new text("2");
                                new Emphasis(Array.asList(
                                        new Text("3");
                                        new Text("4");

                                ));
                                new Text("5");
        ));
                        new Text("6")
        ));







                        ))
                ))
        ))


    }
        String text = "";
        long begininTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++)
            text = text + i;
        long endTime = System.currentTimeMillis();
        System.out.println("time" + (endTime - begininTime));
        StringBuilder sb = new StringBuilder("");
        begininTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++)
            sb.append(String.valueOf(i));
        endTime = System.currentTimeMillis();
        System.out.println("execution time" + ());
    }
    public class Strong{
        String str = ""
        str = str.replaceAll("[//pP]","-");
        String[]arr = str.split("-");
        str = "";
        for(int i = 0; i < arr.length;i++){
            String temp = arr[i];
            if("".equals(temp));
            if(i == 0) {
                str += temp.substring(temp.length() - 1.length());
            }else{
                str += temp.substring(0,1)+temp.substring((temp.length()-1,temp.length()));

            }
        }
        System.out.println(str);
}
    public void Strikeout{
            static final int PAGE_LINE = int();
            public static void main(String[] args)
        {
            BufferedReader br;
            try {
                br = new BufferedReader(new FileReader());
                String temp;
                int line = 0;
                int page = 1;
                while ((temp = br.readLine()) != null) {
                    if (line % PAGE_LINE == 0) {
                        System.out.println("");
                        page++;
                    }
                    line++;
                    System.out.println(temp);
                }
                br.close();
            } catch (Exception e)
        }











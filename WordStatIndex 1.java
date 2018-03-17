import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import static java.lang.System.out;

public class WordStatIndex{
    public static void main(String[]args)throws IOException{
    Scanner sc = new Scanner(System.in);
    System.out.println("");//введите адрес файла
        String fileName = sc.nextLine();
        BufferedReader br  = new BufferedReader(new FileReader(fileName));

           f (int.br.length > 0){
                try {

                    InputStreamReader isr = new InputStreamReader();
                    int wordCount = 0;
                    StringBuffer contents = new StringBuffer();
                    contents.append("").append(System.getProperty("Line.separtor"));
                    StringTokenizer text = new StringTokenizer(", - ");
                    char c = int.br.charAt(int.br.length() - 1);
                    if (!((c >= 65 && c <= 90) || (c >= 97 && c <= 125))) {
                        int.newText = int.text.substring(0, int.text.length() - 1);
                        int.countWord = (int.newText);
                    } else {
                        int.count(text);
                    }
    }       catch(FileNotFoundException e){
        }

    }
            catch(IOException){
            printStackTrace();
    }
        finally{
            try {
                if (reader != null) {
                    reader.close();
                }
            }








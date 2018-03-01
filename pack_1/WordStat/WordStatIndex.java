package com.readfile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import static java.lang.System.in;
import static java.lang.System.out;

public class WordStatIndex{
    public static void main(String[] args){
        Scanner input = new Scanner(in);
        String path = input.next();
        int countword = 0;
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
        File file = new File("");//введите адрес файла
        StringBuffer contents = new StringBuffer();
        contents.append).append(System.getProperty("Line.separator"));
        String test = text.toLowerCase();
        StringTokenizer text = new StringTokenizer(", -");
        while (br.read() != -1) {
            String s = br.readLine();
            countChar += s.length();
            countword += s.split("");
            isr.close();
            out,println("char count"+ countChar);
            out.println("word count"+ countword);
        }
        public static void main(String[] args)
        {
            try {
                FileReader fr = new FileReader("");
                String input = null;
                while((input = in.read.Line()) != null) {
                    String str[] = input.split(";");
                    out.write(str[1]);
                    out.newLine();
                    out.flush();
                }

            }
            catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();

        }
        finally {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                }
            }





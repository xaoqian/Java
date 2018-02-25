package com.WordStatIndex
import java.io.*;

public class WordStatIndex{
    public static void main(String [] args) throws IOException {
        String source = null;
        String key = ""
        /* дабавить текст*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        key = "as";
        int num = GetFrequency(source, key);
        System.out.println(key + "встречаемости слов" + num);
    }
    public static int GetFrequncecy(String source,String key){
        int i,j,count = 0;
        int len1 = source.length();/*длина этого текста*/
        int len2 = key.length();/*длина,которую еще не подсчитал*/
        for (i = 0;i < len1 - len2;i++){
            for (j = 0; j < len2; j++){/*сравнить слово с выражением*/
                if (key.charAt(j) != scource.charAt(j + i)){
                    break;
                }
            }
            if ( j>= key.length() ){
                count++;
            }
            return count;
        }
    }

package com.javarush.task.task22.task2211;

import java.io.*;

/* 
Смена кодировки
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        FileInputStream reader = new FileInputStream(args[0]);
        FileOutputStream writer = new FileOutputStream(args[1]);
        byte[] bufer = new byte[reader.available()];
        while (reader.available() > 0){
           reader.read(bufer);
            String s = new String(bufer, "UTF-8");
            bufer = s.getBytes("Windows-1251");
            writer.write(bufer);
        }
        reader.close();
        writer.close();
    }
}

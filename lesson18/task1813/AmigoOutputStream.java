package com.javarush.task.task18.task1813;

import java.io.*;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream original;
    public AmigoOutputStream(FileOutputStream streamName) throws FileNotFoundException {
        super(fileName);
        this.original = streamName;
    }
    public void flush() throws IOException{original.flush();}
    public void write(int b) throws IOException{original.write(b);}
    public void write(byte[] b) throws IOException{original.write(b);}
    public void write(byte[] b, int off, int len) throws IOException{original.write(b,off,len);}

    public void close() throws IOException {
        original.flush();
        StringBuilder sb = new StringBuilder();
        sb.append("JavaRush © All rights reserved.");
        String s = sb.toString();
        original.write(s.getBytes());
        original.close();
    }
    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}

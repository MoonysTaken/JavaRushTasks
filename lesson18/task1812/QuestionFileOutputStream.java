package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream object;
    public QuestionFileOutputStream(AmigoOutputStream hui) {
        this.object = hui;
    }

    @Override
    public void flush() throws IOException {
        object.flush();
    }

    @Override
    public void write(int b) throws IOException {
        object.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        object.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        object.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        String s = reader.readLine();
        if(s.equals("Д"))
            object.close();
        reader.close();
    }
}


package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String fileName = reader.readLine();
            if(fileName.equals("exit"))
                break;
           ReadThread thread = new ReadThread(fileName);
           thread.start();
        }
        for(Map.Entry<String, Integer> pair : resultMap.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }
        public void run() {
            int max = 0;
            int count = 1;
            try {
                FileInputStream inputStream = new FileInputStream(fileName);
                byte[] bytes = new byte[inputStream.available()];
                while (inputStream.available() > 0)
                    inputStream.read(bytes);

                Arrays.sort(bytes);
                for(int i = 0; i < bytes.length - 1; i++){
                    if(bytes[i] == bytes[i + 1]){
                        count++;
                    }
                    else if(count > max){
                        max = count;
                        count = 1;
                    }
                    else count = 1;
                }
                count = 1;

                for (int i = 0; i < bytes.length - 1; i++){
                    if(bytes[i] == bytes[i + 1]){
                        count++;
                        if(count == max)
                            resultMap.put(fileName, (int) bytes[i]);
                    }
                    else count = 1;
                }
                inputStream.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

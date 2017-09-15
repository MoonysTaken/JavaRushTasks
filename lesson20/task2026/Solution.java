package com.javarush.task.task20.task2026;

/*
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");
    }

    public static int getRectangleCount(byte[][] a) {
        byte[][] b = a.clone();
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i].clone();
        }

        int rectCount = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[i][j] == 1) {
                    rectCount++;
                    for (int k = i; k < b.length; k++) {
                        if (b[k][j] == 0) break;
                        for (int l = j; l < b.length; l++) {
                            if (b[k][l] == 1) b[k][l] = 0;
                            else break;
                        }
                    }
                }
            }
            System.out.println();
        }
        return rectCount;
    }
}

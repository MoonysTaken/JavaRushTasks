package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution  {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigInteger result = BigInteger.valueOf(0);
        BigInteger comp = BigInteger.valueOf(1);
        if (n == 0)
            result = BigInteger.valueOf(1);
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                comp = comp.multiply(BigInteger.valueOf(i));
            }
            result = comp;
        }

        String res = String.valueOf(result);
        return res;
    }
}

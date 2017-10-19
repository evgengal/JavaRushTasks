package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(reader.readLine());
            arr[i] = x;
        }

        Arrays.sort(arr);
        maximum = arr[n-1];

        System.out.println(maximum);
    }
}

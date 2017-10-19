package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] massive = new int[20];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = Integer.parseInt(reader.readLine());
        }

        maximum = massive[0];
        minimum = massive[0];

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > maximum) maximum = massive[i];
            if (massive[i] < minimum) minimum = massive[i];
        }

        System.out.print(maximum + " " + minimum);

    }
}

package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] numList = new int[15];
        int right = 0;
        int left = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numList.length; i++) {
            numList[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < numList.length; i++) {
            if (i == 0 || (i % 2) == 0) {
                right += numList[i];
            } else {
                left += numList[i];
            }
        }

        //System.out.println(left);
        //System.out.println(right);
        if (right < left) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}

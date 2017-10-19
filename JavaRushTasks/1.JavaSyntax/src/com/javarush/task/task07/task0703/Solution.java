package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] stringList = new String[10];
        int[] numList = new int[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < stringList.length; i++) {
            stringList[i] = br.readLine();
        }

        for (int i = 0; i < numList.length; i++) {
            numList[i] = stringList[i].length();
        }

        for (int i = 0; i < numList.length; i++) {
            System.out.println(numList[i]);
        }
    }
}

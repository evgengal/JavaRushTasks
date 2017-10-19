package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] numList = new int[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numList.length; i++) {
            numList[i] = Integer.parseInt(br.readLine());
        }

        //sort(numList);

        for (int i = numList.length - 1; i >= 0; i--) {
            System.out.println(numList[i]);
        }
    }
}


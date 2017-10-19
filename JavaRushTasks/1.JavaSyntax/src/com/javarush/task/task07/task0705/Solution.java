package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] numList1 = new int[20];
        int[] numList2 = new int[10];
        int[] numList3 = new int[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numList1.length; i++) {
            numList1[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < numList1.length; i++) {
            if (i < numList1.length/2) {
                numList2[i] = numList1[i];
            } else {
                numList3[i - numList1.length/2] = numList1[i];
            }
        }


        for (int i = 0; i < numList3.length; i++) {
            System.out.println(numList3[i]);
        }
    }
}

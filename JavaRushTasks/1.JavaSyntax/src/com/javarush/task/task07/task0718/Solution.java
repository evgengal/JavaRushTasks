package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(i, br.readLine());
        }

        int x = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < x) {
                System.out.println(i);
            }
            x = list.get(i).length();
        }
    }
}


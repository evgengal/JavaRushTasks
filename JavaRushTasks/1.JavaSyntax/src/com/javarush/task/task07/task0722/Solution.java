package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String end = "end";

        /*while (!Objects.equals(end, reader.readLine())) {
            list.add(reader.readLine());
        }*/

        while (true) {
            String mas = reader.readLine();
            if (Objects.equals(end, mas)) {
                break;
            } else {
                list.add(mas);
            }
        }


        //напишите тут ваш код
        for (String x : list) {
            System.out.println(x);
        }
    }
}
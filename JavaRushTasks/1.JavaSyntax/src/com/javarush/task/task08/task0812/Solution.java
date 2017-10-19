package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int counter1 = 1;
        int counter2 = 1;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) == list.get(i)) {
                counter1++;
                if (counter2 < counter1) counter2 = counter1;
            } else {
                counter1 = 1;
            }
        }
        System.out.println(counter2);

    }
}
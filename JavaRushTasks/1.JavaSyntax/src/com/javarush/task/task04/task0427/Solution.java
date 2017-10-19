package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));

        String s = myReader.readLine();
        int i = Integer.parseInt(s);
        int l = s.length();

        if (l > 0 && l < 999 && i > 0 && i < 1000) {
            if ((i % 2) == 0 && l == 1) {
                System.out.println("четное однозначное число");
            } else if ((i % 2) != 0 && l == 1) {
                System.out.println("нечетное однозначное число");
            } else if ((i % 2) == 0 && l == 2) {
                System.out.println("четное двузначное число");
            } else if ((i % 2) != 0 && l == 2) {
                System.out.println("нечетное двузначное число");
            } else if ((i % 2) == 0 && l == 3) {
                System.out.println("четное трехзначное число");
            } else if ((i % 2) != 0 && l == 3) {
                System.out.println("нечетное трехзначное число");
            }
        }
    }
}

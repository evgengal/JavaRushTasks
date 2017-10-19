package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        while (n!=0) {
            if (n % 2 == 0) {
                even += 1;
            }
            if (n % 2 != 0){
                odd += 1;
            }
            n = n/10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}

package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DateFormatSymbols dfs = new DateFormatSymbols(Locale.ENGLISH);
        String[] months = dfs.getMonths();
        ArrayList<String> monthList = new ArrayList<>();

        Collections.addAll(monthList, months);
        String month = br.readLine();
        int number = monthList.indexOf(month) + 1;


        System.out.println(month + " is " + number + " month");

    }
}

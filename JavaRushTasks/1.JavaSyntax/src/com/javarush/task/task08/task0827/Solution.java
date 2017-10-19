package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MMM d yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(date));

        int daysOfYear = cal.get(Calendar.DAY_OF_YEAR);
        if(daysOfYear % 2 == 0)
            return false;
        else
            return true;
    }
}

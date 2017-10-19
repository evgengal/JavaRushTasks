package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 1 1981"));
        map.put("Stallon2e", new Date("JUNE 1 1982"));
        map.put("Stal3lone", new Date("MAY 1 1983"));
        map.put("Stal3lone", new Date("MAY 1 1984"));
        map.put("Stallo3ne", new Date("MAY 1 1985"));
        map.put("Sta4llone", new Date("MAY 1 1980"));
        map.put("Stallo4ne", new Date("MAY 1 1980"));
        map.put("Stall5one", new Date("MAY 1 1980"));
        map.put("Stal4one", new Date("MAY 1 1980"));
        map.put("Stallo5ne", new Date("MAY 1 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        map.entrySet().removeIf(pair ->
                pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8);

    }

    public static void main(String[] args) {

    }
}

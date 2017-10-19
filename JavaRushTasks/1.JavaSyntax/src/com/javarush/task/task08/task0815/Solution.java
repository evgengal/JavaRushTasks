package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> slov = new HashMap<>();
        String f = "Фамилия";
        String n = "Имя";

        for (int i = 0; i < 10; i++) {
            slov.put(f+i,n+i);
        }
        return slov;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String s : map.values()) {
            if (name == s) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int j = 0;
        if (map.containsKey(lastName)) j = 1;
        return j;
    }

    public static void main(String[] args) {

    }
}

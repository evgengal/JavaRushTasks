package com.javarush.task.task08.task0819;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        for (Cat it: cats ) { cats.remove(it); break; }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        HashSet set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            set.add(new Cat());
        }
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for(Cat cat : cats)
            System.out.println(cat.toString());
    }

    // step 1 - пункт 1
    public static class Cat {

    }
}
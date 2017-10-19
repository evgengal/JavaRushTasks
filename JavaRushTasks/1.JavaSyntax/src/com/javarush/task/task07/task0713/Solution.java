package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        for (Integer x : list) {
            if (x%3==0 && x%2==0) {
                list1.add(x);
                list2.add(x);
            } else if (x%3==0) {
                list1.add(x);
            } else if (x%2==0) {
                list2.add(x);
            } else {
                list3.add(x);
            }
        }

        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}

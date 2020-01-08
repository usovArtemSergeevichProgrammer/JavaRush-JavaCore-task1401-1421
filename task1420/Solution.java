package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(bufferedReader.readLine());
        int num2 = Integer.parseInt(bufferedReader.readLine());

        if (num1 <= 0 || num2 <= 0 ) {
            throw new Exception();
        }
        
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i = 1; i <= num1; i++){
            if(num1%i == 0){
                list1.add(i);
            }
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 1; i <= num2; i++){
            if(num2%i == 0){
                list2.add(i);
            }
        }
        int nod = 1;
        for(int i = 0;i < list1.size();i++){
            for (int z = 0; z < list2.size();z++){
                if(list1.get(i) == list2.get(z)){
                    nod = list1.get(i);
                    continue;
                }
            }
        }

        System.out.println(nod);

    }
}

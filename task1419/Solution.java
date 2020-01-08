package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int a = Integer.parseInt(null);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            File f = new File("D://java/file.txt");
            FileReader fr = new FileReader(f);
        } catch (Exception e) {
            exceptions.add(e);
        }

        int i = 0;
        int[] nArray = new int[5];
        while(true)
        {
            try
            {
                nArray[i] = i;
            }
            catch(Exception ex)
            {
                exceptions.add(ex);
                break;
            }
            i++;
        }

        ArrayList listArray = new ArrayList(5);
        while(true)
        {
            try
            {
                int num = (int) listArray.get(10);
            }
            catch(Exception ex)
            {
                exceptions.add(ex);
                break;
            }

        }

        Object szStr[] = new String[10];
        try
        {
            szStr[0] = new Character('*');
        }
        catch(Exception ex)
        {
            exceptions.add(ex);
        }

        Object ch = new Character('*');
        try
        {
            System.out.println((Byte)ch);
        }
        catch(Exception ex)
        {
            exceptions.add(ex);
        }

        try
        {
            int[] nNegArray = new int[-5];
        }
        catch(Exception ex)
        {
            exceptions.add(ex);
        }

        int[] nNulArray = new int[5];
        nNulArray = null;

        try
        {
            i = nNulArray.length;
        }
        catch(Exception ex)
        {
            exceptions.add(ex);
        }

        String szShortString = "123";
        try
        {
            char chr = szShortString.charAt(10);
        }
        catch(Exception ex)
        {
            exceptions.add(ex);
        }


        //напишите тут ваш код

    }
}

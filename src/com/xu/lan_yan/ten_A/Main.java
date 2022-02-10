package com.xu.lan_yan.ten_A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description Todo
 * Date 2021/11/15 23:23
 * Version 1.0.1
 *
 * @author Wen
 */
public class Main {

    public static void main(String[] args) {
        Long sum = 0L;

        List<Integer> checkList = Arrays.asList(2, 0, 1, 9);

        for (int i = 1; i <= 2019; i++) {
            List<Integer> numberList = numberList(i);
            for(Integer integer : numberList) {
                if (checkList.contains(integer)) {
                    sum += (long) i * i * i;
                    break;
                }
            }
        }

        System.out.println(sum);

    }

    public static List<Integer> numberList(Integer num) {

        List<Integer> numberList = new ArrayList<>();

        while (num != 0) {
            numberList.add(num % 10);
            num /= 10;
        }

        return numberList;
    }

    //public static void main(String[] args) {
    //    long result = 0;
    //    for (int i = 1; i <= 2019; i++) {
    //        String s = "" + i;
    //        if (Judge(s)) {
    //            result += Math.pow(i,3);
    //        }
    //    }
    //    System.out.println(result);
    //}
    //public static boolean Judge(String s) {
    //    boolean flag = false;
    //    if (s.contains("2") || s.contains("0") || s.contains("1") || s.contains("9")) {
    //        flag = true;
    //    }
    //    return flag;
    //}

}

package com.practice;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 世纪末的星期
 */
public class _12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar cl = Calendar.getInstance();
        for(int i=2099;;i+=100){
            cl.set(i,11,31);
            if(cl.get(Calendar.DAY_OF_WEEK)==1){
                System.out.println(i);
                break;
            }
        }
    }

}

package com.practice;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 世纪末的星期
 * Created by CHX on 2019/3/28.
 */
public class _11 {

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

package com.practice;

import java.util.Scanner;

/**
 * 密码发生器
 * Created by CHX on 2019/3/24.
 */
public class _05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int row = 6;
        int list = len/6+1;
        int[] arr = new int[6];
        int temp = 0;
        for(int i=0;i<len;i++){
            arr[temp] += str.charAt(i);
            if(temp==5){
                temp = 0;
            }else {
                temp++;
            }
        }
        //缩位，直到长度为1
        for(int i=0;i<6;i++){
            a(arr[i]);
        }
    }

    public static void a(int a){
        int temp = 0;
        while(a>9){
            temp += a%10;
            a /= 10;
        }
        temp += a%10;
        a /= 10;
        if(temp>9){
            a(temp);
        }else {
            System.out.print(temp);
        }
    }
}

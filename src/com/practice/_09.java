package com.practice;

import java.util.Scanner;

/**
 * 带分数优化  剪枝
 * 原来还可以这样子取，确实是没想到
 */
public class _09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double sum = 0;
        while(true){
            a = sc.nextDouble();
            b = sc.nextDouble();
            sum += a*(b/100);
            System.out.println(sum);
        }
    }
}


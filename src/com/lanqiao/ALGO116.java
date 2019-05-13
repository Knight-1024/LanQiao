package com.lanqiao;

import java.util.Scanner;

/**
 * Created by CHX on 2019/5/13.
 * 最大的算式 unsolved
 */
public class ALGO116 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(getMax(a,0,k));
    }

    /**
     * 获取最大值
     */
    public static long getMax(int[] a, int start, int nul){
        int length = a.length;
        if(nul==0){
            return sum(a,start,length-1);
        }
        long max = 0;
        for(int i=start; i<length; i++){
            //状态转移方程，为啥这样写？这一行是关键
            long temp = sum(a,start,i)*getMax(a,i+1,nul-1);
            max = Math.max(max,temp);
        }
        return max;
    }

    /**
     * 求和
     */
    public static long sum(int[] a, int start, int end){
        int length = a.length;
        int sum = 0;
        for(int i=start;i<=end;i++){
            sum += a[i];
        }
        return sum;
    }

}

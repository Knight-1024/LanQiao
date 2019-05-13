package com.practice;

import java.util.Scanner;

/**
 * 合根问题
 */
public class _17 {
    public static void main(String[] args) {
        //思路：用一维数组保存根如果都没有节点则新建一个，数量加一。
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int[] arr= new int[s];
        for(int i=0;i<s;i++){
            arr[i] = sc.nextInt();
        }

    }
}

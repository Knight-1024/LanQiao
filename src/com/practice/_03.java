package com.practice;

import java.util.Scanner;

public class _03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result1 = a*b/x(a,b);
        int result2 = result1*c/x(result1,c);
        System.out.println(result2);
    }

    //շת�������ȡ�����Լ����a>b,ȡ��������
    public static int x(int a, int b){
        int temp = 0;
        if (a<b){  //��֤�����ǰ
            temp = a;
            a = b;
            b = temp;
        }
        while(a%b!=0){
            temp = a;
            a = b;
            b = temp%a;
        }
        return b==0?1:b;
    }
}

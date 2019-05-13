package com.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ���������ܹ�ʵ�֣��������г�ʱ��������Ҫ�Ż�
 * ȡֵ���Ż�
 int sum(int start,int end)
 {
 int i,sum=0;
 for(i=start;i<end;i++)
 sum=sum*10+a[i+1];
 return sum;
 */
public class _04 {
    public static int total = 9;
    public static int count;
    public static int N;
    public static int[] result;
    public static boolean[] visit;
    public static int[] number = {1,2,3,4,5,6,7,8,9};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        count = 0;
        result = new int[total];
        visit = new boolean[total];
        Arrays.fill(visit,true);
        dfs(0);
        System.out.println(count);
    }

    //dfs����1~9
    public static void dfs(int layer) {  //�������������ѭ��������������
        if(layer==total){
            //1��9������ֱ���±��и��������λ�������ڸ����п��С�����ֱ��תΪ����
            iscan(toString(result));
        }else {
            for(int i=0;i<total;i++){
                if(visit[i]){
                    visit[i] = false;
                    result[layer] = number[i];  //����i���������layer����
                    dfs(layer+1);
                    visit[i] = true;
                }
            }
        }
    }

    //�ж�
    public static void iscan(String str) {
        int a;
        int b;
        int c;

        //ѭ��+��/���ж��Ƿ������
        for(int i=1;i<7;i++){
            for(int j=i+1;j<total;j++){
                a = Integer.parseInt(str.substring(0,i));
                b = Integer.parseInt(str.substring(i,j));
                c = Integer.parseInt(str.substring(j,9));
                if(b==(N-a)*c){
                    System.out.println("a="+a+"  b="+b+"  c="+c);
                    count++;  //��������������������
                }
            }
        }
    }

    public static String toString(int[] result){
        StringBuffer SB = new StringBuffer();
        for (int i=0; i<total;i++){
            SB.append(result[i]);
        }
        return SB.toString();
    }

}
